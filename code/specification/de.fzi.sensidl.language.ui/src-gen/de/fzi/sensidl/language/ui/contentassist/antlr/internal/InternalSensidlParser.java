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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'('", "')'", "'as'", "'Method'", "'in'", "'adjusted'", "'exclude:'", "'value'", "'='", "'exclude'", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'+'", "'-'", "'#'", "'~'", "'setter'", "'getter'", "'constant'"
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
    public static final int RULE_DESCRIPTION=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


    // $ANTLR start "entryRuleMethod"
    // InternalSensidl.g:172:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSensidl.g:173:1: ( ruleMethod EOF )
            // InternalSensidl.g:174:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalSensidl.g:181:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:185:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSensidl.g:186:1: ( ( rule__Method__Group__0 ) )
            {
            // InternalSensidl.g:186:1: ( ( rule__Method__Group__0 ) )
            // InternalSensidl.g:187:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSensidl.g:188:1: ( rule__Method__Group__0 )
            // InternalSensidl.g:188:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodParameter"
    // InternalSensidl.g:200:1: entryRuleMethodParameter : ruleMethodParameter EOF ;
    public final void entryRuleMethodParameter() throws RecognitionException {
        try {
            // InternalSensidl.g:201:1: ( ruleMethodParameter EOF )
            // InternalSensidl.g:202:1: ruleMethodParameter EOF
            {
             before(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodParameter();

            state._fsp--;

             after(grammarAccess.getMethodParameterRule()); 
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
    // $ANTLR end "entryRuleMethodParameter"


    // $ANTLR start "ruleMethodParameter"
    // InternalSensidl.g:209:1: ruleMethodParameter : ( ( rule__MethodParameter__Group__0 ) ) ;
    public final void ruleMethodParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:213:2: ( ( ( rule__MethodParameter__Group__0 ) ) )
            // InternalSensidl.g:214:1: ( ( rule__MethodParameter__Group__0 ) )
            {
            // InternalSensidl.g:214:1: ( ( rule__MethodParameter__Group__0 ) )
            // InternalSensidl.g:215:1: ( rule__MethodParameter__Group__0 )
            {
             before(grammarAccess.getMethodParameterAccess().getGroup()); 
            // InternalSensidl.g:216:1: ( rule__MethodParameter__Group__0 )
            // InternalSensidl.g:216:2: rule__MethodParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodParameter"


    // $ANTLR start "entryRuleData"
    // InternalSensidl.g:228:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalSensidl.g:229:1: ( ruleData EOF )
            // InternalSensidl.g:230:1: ruleData EOF
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
    // InternalSensidl.g:237:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:241:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalSensidl.g:242:1: ( ( rule__Data__Alternatives ) )
            {
            // InternalSensidl.g:242:1: ( ( rule__Data__Alternatives ) )
            // InternalSensidl.g:243:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalSensidl.g:244:1: ( rule__Data__Alternatives )
            // InternalSensidl.g:244:2: rule__Data__Alternatives
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
    // InternalSensidl.g:256:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:257:1: ( ruleMeasurementData EOF )
            // InternalSensidl.g:258:1: ruleMeasurementData EOF
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
    // InternalSensidl.g:265:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:269:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // InternalSensidl.g:270:1: ( ( rule__MeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:270:1: ( ( rule__MeasurementData__Group__0 ) )
            // InternalSensidl.g:271:1: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:272:1: ( rule__MeasurementData__Group__0 )
            // InternalSensidl.g:272:2: rule__MeasurementData__Group__0
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
    // InternalSensidl.g:284:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:285:1: ( ruleNonMeasurementData EOF )
            // InternalSensidl.g:286:1: ruleNonMeasurementData EOF
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
    // InternalSensidl.g:293:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:297:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // InternalSensidl.g:298:1: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:298:1: ( ( rule__NonMeasurementData__Group__0 ) )
            // InternalSensidl.g:299:1: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:300:1: ( rule__NonMeasurementData__Group__0 )
            // InternalSensidl.g:300:2: rule__NonMeasurementData__Group__0
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
    // InternalSensidl.g:312:1: entryRuleMeasurementDataNotAdjustable : ruleMeasurementDataNotAdjustable EOF ;
    public final void entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        try {
            // InternalSensidl.g:313:1: ( ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:314:1: ruleMeasurementDataNotAdjustable EOF
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
    // InternalSensidl.g:321:1: ruleMeasurementDataNotAdjustable : ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) ;
    public final void ruleMeasurementDataNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:325:2: ( ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) )
            // InternalSensidl.g:326:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            {
            // InternalSensidl.g:326:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            // InternalSensidl.g:327:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 
            // InternalSensidl.g:328:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            // InternalSensidl.g:328:2: rule__MeasurementDataNotAdjustable__Group__0
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
    // InternalSensidl.g:340:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // InternalSensidl.g:341:1: ( ruleDataRange EOF )
            // InternalSensidl.g:342:1: ruleDataRange EOF
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
    // InternalSensidl.g:349:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:353:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // InternalSensidl.g:354:1: ( ( rule__DataRange__Group__0 ) )
            {
            // InternalSensidl.g:354:1: ( ( rule__DataRange__Group__0 ) )
            // InternalSensidl.g:355:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // InternalSensidl.g:356:1: ( rule__DataRange__Group__0 )
            // InternalSensidl.g:356:2: rule__DataRange__Group__0
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
    // InternalSensidl.g:368:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:369:1: ( ruleInterval EOF )
            // InternalSensidl.g:370:1: ruleInterval EOF
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
    // InternalSensidl.g:377:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:381:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSensidl.g:382:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSensidl.g:382:1: ( ( rule__Interval__Group__0 ) )
            // InternalSensidl.g:383:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSensidl.g:384:1: ( rule__Interval__Group__0 )
            // InternalSensidl.g:384:2: rule__Interval__Group__0
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
    // InternalSensidl.g:396:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:397:1: ( ruleDataConversion EOF )
            // InternalSensidl.g:398:1: ruleDataConversion EOF
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
    // InternalSensidl.g:405:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:409:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // InternalSensidl.g:410:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // InternalSensidl.g:410:1: ( ( rule__DataConversion__Alternatives ) )
            // InternalSensidl.g:411:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // InternalSensidl.g:412:1: ( rule__DataConversion__Alternatives )
            // InternalSensidl.g:412:2: rule__DataConversion__Alternatives
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
    // InternalSensidl.g:424:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:425:1: ( ruleLinearDataConversion EOF )
            // InternalSensidl.g:426:1: ruleLinearDataConversion EOF
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
    // InternalSensidl.g:433:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:437:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // InternalSensidl.g:438:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // InternalSensidl.g:438:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // InternalSensidl.g:439:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // InternalSensidl.g:440:1: ( rule__LinearDataConversion__Group__0 )
            // InternalSensidl.g:440:2: rule__LinearDataConversion__Group__0
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
    // InternalSensidl.g:452:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:453:1: ( ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:454:1: ruleLinearDataConversionWithInterval EOF
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
    // InternalSensidl.g:461:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:465:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // InternalSensidl.g:466:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // InternalSensidl.g:466:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // InternalSensidl.g:467:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // InternalSensidl.g:468:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // InternalSensidl.g:468:2: rule__LinearDataConversionWithInterval__Group__0
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
    // InternalSensidl.g:480:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalSensidl.g:481:1: ( ruleDOUBLE EOF )
            // InternalSensidl.g:482:1: ruleDOUBLE EOF
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
    // InternalSensidl.g:489:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:493:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalSensidl.g:494:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalSensidl.g:494:1: ( ( rule__DOUBLE__Group__0 ) )
            // InternalSensidl.g:495:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalSensidl.g:496:1: ( rule__DOUBLE__Group__0 )
            // InternalSensidl.g:496:2: rule__DOUBLE__Group__0
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
    // InternalSensidl.g:508:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // InternalSensidl.g:509:1: ( ruleUNIT EOF )
            // InternalSensidl.g:510:1: ruleUNIT EOF
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
    // InternalSensidl.g:517:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:521:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // InternalSensidl.g:522:1: ( ( rule__UNIT__Group__0 ) )
            {
            // InternalSensidl.g:522:1: ( ( rule__UNIT__Group__0 ) )
            // InternalSensidl.g:523:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // InternalSensidl.g:524:1: ( rule__UNIT__Group__0 )
            // InternalSensidl.g:524:2: rule__UNIT__Group__0
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
    // InternalSensidl.g:537:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:541:1: ( ( ( rule__Coding__Alternatives ) ) )
            // InternalSensidl.g:542:1: ( ( rule__Coding__Alternatives ) )
            {
            // InternalSensidl.g:542:1: ( ( rule__Coding__Alternatives ) )
            // InternalSensidl.g:543:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // InternalSensidl.g:544:1: ( rule__Coding__Alternatives )
            // InternalSensidl.g:544:2: rule__Coding__Alternatives
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
    // InternalSensidl.g:556:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:560:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // InternalSensidl.g:561:1: ( ( rule__Endianness__Alternatives ) )
            {
            // InternalSensidl.g:561:1: ( ( rule__Endianness__Alternatives ) )
            // InternalSensidl.g:562:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // InternalSensidl.g:563:1: ( rule__Endianness__Alternatives )
            // InternalSensidl.g:563:2: rule__Endianness__Alternatives
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
    // InternalSensidl.g:575:1: ruleDataTypeNotAdjustable : ( ( rule__DataTypeNotAdjustable__Alternatives ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:579:1: ( ( ( rule__DataTypeNotAdjustable__Alternatives ) ) )
            // InternalSensidl.g:580:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            {
            // InternalSensidl.g:580:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            // InternalSensidl.g:581:1: ( rule__DataTypeNotAdjustable__Alternatives )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 
            // InternalSensidl.g:582:1: ( rule__DataTypeNotAdjustable__Alternatives )
            // InternalSensidl.g:582:2: rule__DataTypeNotAdjustable__Alternatives
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
    // InternalSensidl.g:594:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:598:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSensidl.g:599:1: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSensidl.g:599:1: ( ( rule__DataType__Alternatives ) )
            // InternalSensidl.g:600:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSensidl.g:601:1: ( rule__DataType__Alternatives )
            // InternalSensidl.g:601:2: rule__DataType__Alternatives
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


    // $ANTLR start "rule__DataSet__Alternatives_7"
    // InternalSensidl.g:612:1: rule__DataSet__Alternatives_7 : ( ( ( rule__DataSet__DataAssignment_7_0 ) ) | ( ( rule__DataSet__MethodAssignment_7_1 ) ) );
    public final void rule__DataSet__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:616:1: ( ( ( rule__DataSet__DataAssignment_7_0 ) ) | ( ( rule__DataSet__MethodAssignment_7_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==43) ) {
                    alt1=1;
                }
                else if ( (LA1_1==41) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>=60 && LA1_0<=63)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:617:1: ( ( rule__DataSet__DataAssignment_7_0 ) )
                    {
                    // InternalSensidl.g:617:1: ( ( rule__DataSet__DataAssignment_7_0 ) )
                    // InternalSensidl.g:618:1: ( rule__DataSet__DataAssignment_7_0 )
                    {
                     before(grammarAccess.getDataSetAccess().getDataAssignment_7_0()); 
                    // InternalSensidl.g:619:1: ( rule__DataSet__DataAssignment_7_0 )
                    // InternalSensidl.g:619:2: rule__DataSet__DataAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__DataAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataSetAccess().getDataAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:623:6: ( ( rule__DataSet__MethodAssignment_7_1 ) )
                    {
                    // InternalSensidl.g:623:6: ( ( rule__DataSet__MethodAssignment_7_1 ) )
                    // InternalSensidl.g:624:1: ( rule__DataSet__MethodAssignment_7_1 )
                    {
                     before(grammarAccess.getDataSetAccess().getMethodAssignment_7_1()); 
                    // InternalSensidl.g:625:1: ( rule__DataSet__MethodAssignment_7_1 )
                    // InternalSensidl.g:625:2: rule__DataSet__MethodAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSet__MethodAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataSetAccess().getMethodAssignment_7_1()); 

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
    // $ANTLR end "rule__DataSet__Alternatives_7"


    // $ANTLR start "rule__Method__Alternatives_0"
    // InternalSensidl.g:634:1: rule__Method__Alternatives_0 : ( ( ( rule__Method__VisibilityAssignment_0_0 ) ) | ( ( rule__Method__VisibilityAssignment_0_1 ) ) | ( ( rule__Method__VisibilityAssignment_0_2 ) ) | ( ( rule__Method__VisibilityAssignment_0_3 ) ) );
    public final void rule__Method__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:638:1: ( ( ( rule__Method__VisibilityAssignment_0_0 ) ) | ( ( rule__Method__VisibilityAssignment_0_1 ) ) | ( ( rule__Method__VisibilityAssignment_0_2 ) ) | ( ( rule__Method__VisibilityAssignment_0_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt2=1;
                }
                break;
            case 61:
                {
                alt2=2;
                }
                break;
            case 62:
                {
                alt2=3;
                }
                break;
            case 63:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSensidl.g:639:1: ( ( rule__Method__VisibilityAssignment_0_0 ) )
                    {
                    // InternalSensidl.g:639:1: ( ( rule__Method__VisibilityAssignment_0_0 ) )
                    // InternalSensidl.g:640:1: ( rule__Method__VisibilityAssignment_0_0 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_0()); 
                    // InternalSensidl.g:641:1: ( rule__Method__VisibilityAssignment_0_0 )
                    // InternalSensidl.g:641:2: rule__Method__VisibilityAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__VisibilityAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getVisibilityAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:645:6: ( ( rule__Method__VisibilityAssignment_0_1 ) )
                    {
                    // InternalSensidl.g:645:6: ( ( rule__Method__VisibilityAssignment_0_1 ) )
                    // InternalSensidl.g:646:1: ( rule__Method__VisibilityAssignment_0_1 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_1()); 
                    // InternalSensidl.g:647:1: ( rule__Method__VisibilityAssignment_0_1 )
                    // InternalSensidl.g:647:2: rule__Method__VisibilityAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__VisibilityAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getVisibilityAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:651:6: ( ( rule__Method__VisibilityAssignment_0_2 ) )
                    {
                    // InternalSensidl.g:651:6: ( ( rule__Method__VisibilityAssignment_0_2 ) )
                    // InternalSensidl.g:652:1: ( rule__Method__VisibilityAssignment_0_2 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_2()); 
                    // InternalSensidl.g:653:1: ( rule__Method__VisibilityAssignment_0_2 )
                    // InternalSensidl.g:653:2: rule__Method__VisibilityAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__VisibilityAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getVisibilityAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:657:6: ( ( rule__Method__VisibilityAssignment_0_3 ) )
                    {
                    // InternalSensidl.g:657:6: ( ( rule__Method__VisibilityAssignment_0_3 ) )
                    // InternalSensidl.g:658:1: ( rule__Method__VisibilityAssignment_0_3 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_3()); 
                    // InternalSensidl.g:659:1: ( rule__Method__VisibilityAssignment_0_3 )
                    // InternalSensidl.g:659:2: rule__Method__VisibilityAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__VisibilityAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getVisibilityAssignment_0_3()); 

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
    // $ANTLR end "rule__Method__Alternatives_0"


    // $ANTLR start "rule__Method__Alternatives_6_1"
    // InternalSensidl.g:668:1: rule__Method__Alternatives_6_1 : ( ( ( rule__Method__Alternatives_6_1_0 ) ) | ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) ) );
    public final void rule__Method__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:672:1: ( ( ( rule__Method__Alternatives_6_1_0 ) ) | ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=27)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensidl.g:673:1: ( ( rule__Method__Alternatives_6_1_0 ) )
                    {
                    // InternalSensidl.g:673:1: ( ( rule__Method__Alternatives_6_1_0 ) )
                    // InternalSensidl.g:674:1: ( rule__Method__Alternatives_6_1_0 )
                    {
                     before(grammarAccess.getMethodAccess().getAlternatives_6_1_0()); 
                    // InternalSensidl.g:675:1: ( rule__Method__Alternatives_6_1_0 )
                    // InternalSensidl.g:675:2: rule__Method__Alternatives_6_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Alternatives_6_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getAlternatives_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:679:6: ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) )
                    {
                    // InternalSensidl.g:679:6: ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) )
                    // InternalSensidl.g:680:1: ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeDataSetAssignment_6_1_1()); 
                    // InternalSensidl.g:681:1: ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 )
                    // InternalSensidl.g:681:2: rule__Method__ReturnTypeDataSetAssignment_6_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ReturnTypeDataSetAssignment_6_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getReturnTypeDataSetAssignment_6_1_1()); 

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
    // $ANTLR end "rule__Method__Alternatives_6_1"


    // $ANTLR start "rule__Method__Alternatives_6_1_0"
    // InternalSensidl.g:690:1: rule__Method__Alternatives_6_1_0 : ( ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) ) | ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) ) );
    public final void rule__Method__Alternatives_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:694:1: ( ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) ) | ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) ) )
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
                    // InternalSensidl.g:695:1: ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) )
                    {
                    // InternalSensidl.g:695:1: ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) )
                    // InternalSensidl.g:696:1: ( rule__Method__ReturnTypeAssignment_6_1_0_0 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_0()); 
                    // InternalSensidl.g:697:1: ( rule__Method__ReturnTypeAssignment_6_1_0_0 )
                    // InternalSensidl.g:697:2: rule__Method__ReturnTypeAssignment_6_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ReturnTypeAssignment_6_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:701:6: ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) )
                    {
                    // InternalSensidl.g:701:6: ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) )
                    // InternalSensidl.g:702:1: ( rule__Method__ReturnTypeAssignment_6_1_0_1 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_1()); 
                    // InternalSensidl.g:703:1: ( rule__Method__ReturnTypeAssignment_6_1_0_1 )
                    // InternalSensidl.g:703:2: rule__Method__ReturnTypeAssignment_6_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ReturnTypeAssignment_6_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_1()); 

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
    // $ANTLR end "rule__Method__Alternatives_6_1_0"


    // $ANTLR start "rule__MethodParameter__Alternatives_0"
    // InternalSensidl.g:712:1: rule__MethodParameter__Alternatives_0 : ( ( ( rule__MethodParameter__Alternatives_0_0 ) ) | ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) ) );
    public final void rule__MethodParameter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:716:1: ( ( ( rule__MethodParameter__Alternatives_0_0 ) ) | ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=27)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSensidl.g:717:1: ( ( rule__MethodParameter__Alternatives_0_0 ) )
                    {
                    // InternalSensidl.g:717:1: ( ( rule__MethodParameter__Alternatives_0_0 ) )
                    // InternalSensidl.g:718:1: ( rule__MethodParameter__Alternatives_0_0 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getAlternatives_0_0()); 
                    // InternalSensidl.g:719:1: ( rule__MethodParameter__Alternatives_0_0 )
                    // InternalSensidl.g:719:2: rule__MethodParameter__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodParameter__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodParameterAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:723:6: ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) )
                    {
                    // InternalSensidl.g:723:6: ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) )
                    // InternalSensidl.g:724:1: ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetAssignment_0_1()); 
                    // InternalSensidl.g:725:1: ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 )
                    // InternalSensidl.g:725:2: rule__MethodParameter__DataTypeDataSetAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodParameter__DataTypeDataSetAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodParameterAccess().getDataTypeDataSetAssignment_0_1()); 

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
    // $ANTLR end "rule__MethodParameter__Alternatives_0"


    // $ANTLR start "rule__MethodParameter__Alternatives_0_0"
    // InternalSensidl.g:734:1: rule__MethodParameter__Alternatives_0_0 : ( ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) ) | ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) ) );
    public final void rule__MethodParameter__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:738:1: ( ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) ) | ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=18 && LA6_0<=27)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensidl.g:739:1: ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) )
                    {
                    // InternalSensidl.g:739:1: ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) )
                    // InternalSensidl.g:740:1: ( rule__MethodParameter__DataTypeAssignment_0_0_0 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_0()); 
                    // InternalSensidl.g:741:1: ( rule__MethodParameter__DataTypeAssignment_0_0_0 )
                    // InternalSensidl.g:741:2: rule__MethodParameter__DataTypeAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodParameter__DataTypeAssignment_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:745:6: ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) )
                    {
                    // InternalSensidl.g:745:6: ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) )
                    // InternalSensidl.g:746:1: ( rule__MethodParameter__DataTypeAssignment_0_0_1 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_1()); 
                    // InternalSensidl.g:747:1: ( rule__MethodParameter__DataTypeAssignment_0_0_1 )
                    // InternalSensidl.g:747:2: rule__MethodParameter__DataTypeAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodParameter__DataTypeAssignment_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_1()); 

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
    // $ANTLR end "rule__MethodParameter__Alternatives_0_0"


    // $ANTLR start "rule__Data__Alternatives"
    // InternalSensidl.g:756:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:760:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSensidl.g:761:1: ( ruleMeasurementData )
                    {
                    // InternalSensidl.g:761:1: ( ruleMeasurementData )
                    // InternalSensidl.g:762:1: ruleMeasurementData
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
                    // InternalSensidl.g:767:6: ( ruleNonMeasurementData )
                    {
                    // InternalSensidl.g:767:6: ( ruleNonMeasurementData )
                    // InternalSensidl.g:768:1: ruleNonMeasurementData
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
                    // InternalSensidl.g:773:6: ( ruleMeasurementDataNotAdjustable )
                    {
                    // InternalSensidl.g:773:6: ( ruleMeasurementDataNotAdjustable )
                    // InternalSensidl.g:774:1: ruleMeasurementDataNotAdjustable
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
    // InternalSensidl.g:784:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );
    public final void rule__MeasurementData__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:788:1: ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:789:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    {
                    // InternalSensidl.g:789:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    // InternalSensidl.g:790:1: ( rule__MeasurementData__Group_6_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 
                    // InternalSensidl.g:791:1: ( rule__MeasurementData__Group_6_0__0 )
                    // InternalSensidl.g:791:2: rule__MeasurementData__Group_6_0__0
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
                    // InternalSensidl.g:795:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    {
                    // InternalSensidl.g:795:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    // InternalSensidl.g:796:1: ( rule__MeasurementData__Group_6_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 
                    // InternalSensidl.g:797:1: ( rule__MeasurementData__Group_6_1__0 )
                    // InternalSensidl.g:797:2: rule__MeasurementData__Group_6_1__0
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
                    // InternalSensidl.g:801:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    {
                    // InternalSensidl.g:801:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    // InternalSensidl.g:802:1: ( rule__MeasurementData__Group_6_2__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
                    // InternalSensidl.g:803:1: ( rule__MeasurementData__Group_6_2__0 )
                    // InternalSensidl.g:803:2: rule__MeasurementData__Group_6_2__0
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
    // InternalSensidl.g:812:1: rule__MeasurementData__Alternatives_7_1 : ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) );
    public final void rule__MeasurementData__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:816:1: ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==64) ) {
                alt9=1;
            }
            else if ( (LA9_0==65) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:817:1: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    {
                    // InternalSensidl.g:817:1: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    // InternalSensidl.g:818:1: ( rule__MeasurementData__Group_7_1_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0()); 
                    // InternalSensidl.g:819:1: ( rule__MeasurementData__Group_7_1_0__0 )
                    // InternalSensidl.g:819:2: rule__MeasurementData__Group_7_1_0__0
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
                    // InternalSensidl.g:823:6: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    {
                    // InternalSensidl.g:823:6: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    // InternalSensidl.g:824:1: ( rule__MeasurementData__Group_7_1_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1()); 
                    // InternalSensidl.g:825:1: ( rule__MeasurementData__Group_7_1_1__0 )
                    // InternalSensidl.g:825:2: rule__MeasurementData__Group_7_1_1__0
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
    // InternalSensidl.g:834:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:838:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=18 && LA10_0<=27)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSensidl.g:839:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // InternalSensidl.g:839:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // InternalSensidl.g:840:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // InternalSensidl.g:841:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // InternalSensidl.g:841:2: rule__NonMeasurementData__DataTypeAssignment_2_0
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
                    // InternalSensidl.g:845:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // InternalSensidl.g:845:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // InternalSensidl.g:846:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // InternalSensidl.g:847:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // InternalSensidl.g:847:2: rule__NonMeasurementData__DataTypeAssignment_2_1
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
    // InternalSensidl.g:856:1: rule__NonMeasurementData__Alternatives_6_1 : ( ( ( rule__NonMeasurementData__Group_6_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_6_1_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:860:1: ( ( ( rule__NonMeasurementData__Group_6_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_6_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==64) ) {
                alt11=1;
            }
            else if ( (LA11_0==65) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:861:1: ( ( rule__NonMeasurementData__Group_6_1_0__0 ) )
                    {
                    // InternalSensidl.g:861:1: ( ( rule__NonMeasurementData__Group_6_1_0__0 ) )
                    // InternalSensidl.g:862:1: ( rule__NonMeasurementData__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0()); 
                    // InternalSensidl.g:863:1: ( rule__NonMeasurementData__Group_6_1_0__0 )
                    // InternalSensidl.g:863:2: rule__NonMeasurementData__Group_6_1_0__0
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
                    // InternalSensidl.g:867:6: ( ( rule__NonMeasurementData__Group_6_1_1__0 ) )
                    {
                    // InternalSensidl.g:867:6: ( ( rule__NonMeasurementData__Group_6_1_1__0 ) )
                    // InternalSensidl.g:868:1: ( rule__NonMeasurementData__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1()); 
                    // InternalSensidl.g:869:1: ( rule__NonMeasurementData__Group_6_1_1__0 )
                    // InternalSensidl.g:869:2: rule__NonMeasurementData__Group_6_1_1__0
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
    // InternalSensidl.g:878:1: rule__MeasurementDataNotAdjustable__Alternatives_6_2 : ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) );
    public final void rule__MeasurementDataNotAdjustable__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:882:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==64) ) {
                alt12=1;
            }
            else if ( (LA12_0==65) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:883:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    {
                    // InternalSensidl.g:883:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    // InternalSensidl.g:884:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0()); 
                    // InternalSensidl.g:885:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    // InternalSensidl.g:885:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0
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
                    // InternalSensidl.g:889:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    {
                    // InternalSensidl.g:889:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    // InternalSensidl.g:890:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1()); 
                    // InternalSensidl.g:891:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    // InternalSensidl.g:891:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0
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
    // InternalSensidl.g:900:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:904:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            else if ( (LA13_0==57) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSensidl.g:905:1: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:905:1: ( ruleLinearDataConversion )
                    // InternalSensidl.g:906:1: ruleLinearDataConversion
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
                    // InternalSensidl.g:911:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:911:6: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:912:1: ruleLinearDataConversionWithInterval
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
    // InternalSensidl.g:922:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:926:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==13) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSensidl.g:927:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:927:1: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:928:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:929:1: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:929:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:934:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:934:6: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:935:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:936:1: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:936:3: 'SENSIDL_JSON'
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
    // InternalSensidl.g:946:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:950:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            else if ( (LA15_0==15) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSensidl.g:951:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:951:1: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:952:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:953:1: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:953:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:958:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:958:6: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:959:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:960:1: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:960:3: 'LITTLE_ENDIAN'
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
    // InternalSensidl.g:970:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:974:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSensidl.g:975:1: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:975:1: ( ( 'STRING' ) )
                    // InternalSensidl.g:976:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:977:1: ( 'STRING' )
                    // InternalSensidl.g:977:3: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:982:6: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:982:6: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:983:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:984:1: ( 'BOOLEAN' )
                    // InternalSensidl.g:984:3: 'BOOLEAN'
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
    // InternalSensidl.g:994:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:998:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt17=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt17=1;
                }
                break;
            case 19:
                {
                alt17=2;
                }
                break;
            case 20:
                {
                alt17=3;
                }
                break;
            case 21:
                {
                alt17=4;
                }
                break;
            case 22:
                {
                alt17=5;
                }
                break;
            case 23:
                {
                alt17=6;
                }
                break;
            case 24:
                {
                alt17=7;
                }
                break;
            case 25:
                {
                alt17=8;
                }
                break;
            case 26:
                {
                alt17=9;
                }
                break;
            case 27:
                {
                alt17=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:999:1: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:999:1: ( ( 'INT8' ) )
                    // InternalSensidl.g:1000:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1001:1: ( 'INT8' )
                    // InternalSensidl.g:1001:3: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1006:6: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:1006:6: ( ( 'UINT8' ) )
                    // InternalSensidl.g:1007:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1008:1: ( 'UINT8' )
                    // InternalSensidl.g:1008:3: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:1013:6: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:1013:6: ( ( 'INT16' ) )
                    // InternalSensidl.g:1014:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:1015:1: ( 'INT16' )
                    // InternalSensidl.g:1015:3: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:1020:6: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:1020:6: ( ( 'UINT16' ) )
                    // InternalSensidl.g:1021:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:1022:1: ( 'UINT16' )
                    // InternalSensidl.g:1022:3: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:1027:6: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:1027:6: ( ( 'INT32' ) )
                    // InternalSensidl.g:1028:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:1029:1: ( 'INT32' )
                    // InternalSensidl.g:1029:3: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:1034:6: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:1034:6: ( ( 'UINT32' ) )
                    // InternalSensidl.g:1035:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:1036:1: ( 'UINT32' )
                    // InternalSensidl.g:1036:3: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:1041:6: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:1041:6: ( ( 'INT64' ) )
                    // InternalSensidl.g:1042:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:1043:1: ( 'INT64' )
                    // InternalSensidl.g:1043:3: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:1048:6: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:1048:6: ( ( 'UINT64' ) )
                    // InternalSensidl.g:1049:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:1050:1: ( 'UINT64' )
                    // InternalSensidl.g:1050:3: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:1055:6: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:1055:6: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:1056:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:1057:1: ( 'FLOAT' )
                    // InternalSensidl.g:1057:3: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:1062:6: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:1062:6: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:1063:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:1064:1: ( 'DOUBLE' )
                    // InternalSensidl.g:1064:3: 'DOUBLE'
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
    // InternalSensidl.g:1076:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1080:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:1081:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
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
    // InternalSensidl.g:1088:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1092:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:1093:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:1093:1: ( 'sensorInterface' )
            // InternalSensidl.g:1094:1: 'sensorInterface'
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
    // InternalSensidl.g:1107:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1111:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:1112:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
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
    // InternalSensidl.g:1119:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1123:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:1124:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:1124:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:1125:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:1126:1: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:1126:2: rule__SensorInterface__NameAssignment_1
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
    // InternalSensidl.g:1136:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1140:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:1141:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
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
    // InternalSensidl.g:1148:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1152:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:1153:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:1153:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:1154:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:1155:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DESCRIPTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSensidl.g:1155:2: rule__SensorInterface__DescriptionAssignment_2
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
    // InternalSensidl.g:1165:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1169:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:1170:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
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
    // InternalSensidl.g:1177:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1181:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:1182:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:1182:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:1183:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:1184:1: ( rule__SensorInterface__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:1184:2: rule__SensorInterface__Group_3__0
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
    // InternalSensidl.g:1194:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1198:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:1199:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
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
    // InternalSensidl.g:1206:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1210:1: ( ( '{' ) )
            // InternalSensidl.g:1211:1: ( '{' )
            {
            // InternalSensidl.g:1211:1: ( '{' )
            // InternalSensidl.g:1212:1: '{'
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
    // InternalSensidl.g:1225:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1229:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:1230:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
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
    // InternalSensidl.g:1237:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1241:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:1242:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:1242:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:1243:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:1244:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:1244:2: rule__SensorInterface__EncodingSettingsAssignment_5
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
    // InternalSensidl.g:1254:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1258:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:1259:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
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
    // InternalSensidl.g:1266:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1270:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1271:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1271:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1272:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1273:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1273:2: rule__SensorInterface__DataDescriptionAssignment_6
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
    // InternalSensidl.g:1283:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1287:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1288:2: rule__SensorInterface__Group__7__Impl
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
    // InternalSensidl.g:1294:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1298:1: ( ( '}' ) )
            // InternalSensidl.g:1299:1: ( '}' )
            {
            // InternalSensidl.g:1299:1: ( '}' )
            // InternalSensidl.g:1300:1: '}'
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
    // InternalSensidl.g:1329:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1333:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1334:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
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
    // InternalSensidl.g:1341:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1345:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1346:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1346:1: ( 'with identifier' )
            // InternalSensidl.g:1347:1: 'with identifier'
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
    // InternalSensidl.g:1360:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1364:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1365:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
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
    // InternalSensidl.g:1372:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1376:1: ( ( ':' ) )
            // InternalSensidl.g:1377:1: ( ':' )
            {
            // InternalSensidl.g:1377:1: ( ':' )
            // InternalSensidl.g:1378:1: ':'
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
    // InternalSensidl.g:1391:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1395:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1396:2: rule__SensorInterface__Group_3__2__Impl
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
    // InternalSensidl.g:1402:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1406:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1407:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1407:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1408:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1409:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1409:2: rule__SensorInterface__IDAssignment_3_2
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
    // InternalSensidl.g:1425:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1429:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1430:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
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
    // InternalSensidl.g:1437:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1441:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1442:1: ( 'encoding' )
            {
            // InternalSensidl.g:1442:1: ( 'encoding' )
            // InternalSensidl.g:1443:1: 'encoding'
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
    // InternalSensidl.g:1456:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1460:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1461:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
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
    // InternalSensidl.g:1468:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1472:1: ( ( ':' ) )
            // InternalSensidl.g:1473:1: ( ':' )
            {
            // InternalSensidl.g:1473:1: ( ':' )
            // InternalSensidl.g:1474:1: ':'
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
    // InternalSensidl.g:1487:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1491:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1492:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
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
    // InternalSensidl.g:1499:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1503:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1504:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1504:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1505:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1506:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1506:2: rule__EncodingSettings__CodingAssignment_2
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
    // InternalSensidl.g:1516:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1520:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1521:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
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
    // InternalSensidl.g:1528:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1532:1: ( ( ',' ) )
            // InternalSensidl.g:1533:1: ( ',' )
            {
            // InternalSensidl.g:1533:1: ( ',' )
            // InternalSensidl.g:1534:1: ','
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
    // InternalSensidl.g:1547:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1551:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1552:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
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
    // InternalSensidl.g:1559:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1563:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1564:1: ( 'endianness' )
            {
            // InternalSensidl.g:1564:1: ( 'endianness' )
            // InternalSensidl.g:1565:1: 'endianness'
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
    // InternalSensidl.g:1578:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1582:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1583:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
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
    // InternalSensidl.g:1590:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1594:1: ( ( ':' ) )
            // InternalSensidl.g:1595:1: ( ':' )
            {
            // InternalSensidl.g:1595:1: ( ':' )
            // InternalSensidl.g:1596:1: ':'
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
    // InternalSensidl.g:1609:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1613:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1614:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
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
    // InternalSensidl.g:1621:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1625:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1626:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1626:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1627:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1628:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1628:2: rule__EncodingSettings__EndiannessAssignment_6
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
    // InternalSensidl.g:1638:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1642:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1643:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
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
    // InternalSensidl.g:1650:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1654:1: ( ( ',' ) )
            // InternalSensidl.g:1655:1: ( ',' )
            {
            // InternalSensidl.g:1655:1: ( ',' )
            // InternalSensidl.g:1656:1: ','
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
    // InternalSensidl.g:1669:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1673:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1674:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
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
    // InternalSensidl.g:1681:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1685:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1686:1: ( 'alignment' )
            {
            // InternalSensidl.g:1686:1: ( 'alignment' )
            // InternalSensidl.g:1687:1: 'alignment'
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
    // InternalSensidl.g:1700:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1704:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1705:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
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
    // InternalSensidl.g:1712:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1716:1: ( ( ':' ) )
            // InternalSensidl.g:1717:1: ( ':' )
            {
            // InternalSensidl.g:1717:1: ( ':' )
            // InternalSensidl.g:1718:1: ':'
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
    // InternalSensidl.g:1731:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1735:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1736:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
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
    // InternalSensidl.g:1743:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1747:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1748:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1748:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1749:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1750:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1750:2: rule__EncodingSettings__AlignmentAssignment_10
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
    // InternalSensidl.g:1760:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1764:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1765:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
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
    // InternalSensidl.g:1772:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1776:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1777:1: ( 'BIT' )
            {
            // InternalSensidl.g:1777:1: ( 'BIT' )
            // InternalSensidl.g:1778:1: 'BIT'
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
    // InternalSensidl.g:1791:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1795:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1796:2: rule__EncodingSettings__Group__12__Impl
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
    // InternalSensidl.g:1802:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1806:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1807:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1807:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1808:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1809:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:1809:2: rule__EncodingSettings__Group_12__0
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
    // InternalSensidl.g:1845:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1849:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1850:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
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
    // InternalSensidl.g:1857:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1861:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1862:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1862:1: ( 'with identifier' )
            // InternalSensidl.g:1863:1: 'with identifier'
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
    // InternalSensidl.g:1876:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1880:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1881:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
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
    // InternalSensidl.g:1888:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1892:1: ( ( ':' ) )
            // InternalSensidl.g:1893:1: ( ':' )
            {
            // InternalSensidl.g:1893:1: ( ':' )
            // InternalSensidl.g:1894:1: ':'
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
    // InternalSensidl.g:1907:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1911:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1912:2: rule__EncodingSettings__Group_12__2__Impl
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
    // InternalSensidl.g:1918:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1922:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:1923:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:1923:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:1924:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:1925:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:1925:2: rule__EncodingSettings__IDAssignment_12_2
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
    // InternalSensidl.g:1941:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1945:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:1946:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
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
    // InternalSensidl.g:1953:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1957:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:1958:1: ( 'sensorData' )
            {
            // InternalSensidl.g:1958:1: ( 'sensorData' )
            // InternalSensidl.g:1959:1: 'sensorData'
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
    // InternalSensidl.g:1972:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1976:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:1977:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
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
    // InternalSensidl.g:1984:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1988:1: ( ( () ) )
            // InternalSensidl.g:1989:1: ( () )
            {
            // InternalSensidl.g:1989:1: ( () )
            // InternalSensidl.g:1990:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:1991:1: ()
            // InternalSensidl.g:1993:1: 
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
    // InternalSensidl.g:2003:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2007:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:2008:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
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
    // InternalSensidl.g:2015:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2019:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:2020:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:2020:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:2021:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:2022:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:2022:2: rule__SensorDataDescription__Group_2__0
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
    // InternalSensidl.g:2032:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2036:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:2037:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
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
    // InternalSensidl.g:2044:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2048:1: ( ( '{' ) )
            // InternalSensidl.g:2049:1: ( '{' )
            {
            // InternalSensidl.g:2049:1: ( '{' )
            // InternalSensidl.g:2050:1: '{'
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
    // InternalSensidl.g:2063:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2067:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:2068:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
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
    // InternalSensidl.g:2075:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2079:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:2080:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:2080:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:2081:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:2082:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSensidl.g:2082:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSensidl.g:2092:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2096:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:2097:2: rule__SensorDataDescription__Group__5__Impl
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
    // InternalSensidl.g:2103:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2107:1: ( ( '}' ) )
            // InternalSensidl.g:2108:1: ( '}' )
            {
            // InternalSensidl.g:2108:1: ( '}' )
            // InternalSensidl.g:2109:1: '}'
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
    // InternalSensidl.g:2134:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2138:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // InternalSensidl.g:2139:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
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
    // InternalSensidl.g:2146:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2150:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2151:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2151:1: ( 'with identifier' )
            // InternalSensidl.g:2152:1: 'with identifier'
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
    // InternalSensidl.g:2165:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2169:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:2170:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
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
    // InternalSensidl.g:2177:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2181:1: ( ( ':' ) )
            // InternalSensidl.g:2182:1: ( ':' )
            {
            // InternalSensidl.g:2182:1: ( ':' )
            // InternalSensidl.g:2183:1: ':'
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
    // InternalSensidl.g:2196:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2200:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:2201:2: rule__SensorDataDescription__Group_2__2__Impl
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
    // InternalSensidl.g:2207:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2211:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:2212:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:2212:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:2213:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:2214:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:2214:2: rule__SensorDataDescription__IDAssignment_2_2
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
    // InternalSensidl.g:2230:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2234:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:2235:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
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
    // InternalSensidl.g:2242:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2246:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:2247:1: ( 'dataSet' )
            {
            // InternalSensidl.g:2247:1: ( 'dataSet' )
            // InternalSensidl.g:2248:1: 'dataSet'
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
    // InternalSensidl.g:2261:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2265:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2266:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
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
    // InternalSensidl.g:2273:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2277:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2278:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2278:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2279:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2280:1: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2280:2: rule__DataSet__NameAssignment_1
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
    // InternalSensidl.g:2290:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2294:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2295:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
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
    // InternalSensidl.g:2302:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2306:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2307:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2307:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2308:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2309:1: ( rule__DataSet__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:2309:2: rule__DataSet__Group_2__0
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
    // InternalSensidl.g:2319:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2323:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2324:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
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
    // InternalSensidl.g:2331:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )* ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2335:1: ( ( ( rule__DataSet__Group_3__0 )* ) )
            // InternalSensidl.g:2336:1: ( ( rule__DataSet__Group_3__0 )* )
            {
            // InternalSensidl.g:2336:1: ( ( rule__DataSet__Group_3__0 )* )
            // InternalSensidl.g:2337:1: ( rule__DataSet__Group_3__0 )*
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2338:1: ( rule__DataSet__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSensidl.g:2338:2: rule__DataSet__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DataSet__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSensidl.g:2348:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2352:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2353:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
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
    // InternalSensidl.g:2360:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__Group_4__0 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2364:1: ( ( ( rule__DataSet__Group_4__0 )? ) )
            // InternalSensidl.g:2365:1: ( ( rule__DataSet__Group_4__0 )? )
            {
            // InternalSensidl.g:2365:1: ( ( rule__DataSet__Group_4__0 )? )
            // InternalSensidl.g:2366:1: ( rule__DataSet__Group_4__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_4()); 
            // InternalSensidl.g:2367:1: ( rule__DataSet__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSensidl.g:2367:2: rule__DataSet__Group_4__0
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
    // InternalSensidl.g:2377:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2381:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2382:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
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
    // InternalSensidl.g:2389:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__DescriptionAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2393:1: ( ( ( rule__DataSet__DescriptionAssignment_5 )? ) )
            // InternalSensidl.g:2394:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            {
            // InternalSensidl.g:2394:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            // InternalSensidl.g:2395:1: ( rule__DataSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 
            // InternalSensidl.g:2396:1: ( rule__DataSet__DescriptionAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DESCRIPTION) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSensidl.g:2396:2: rule__DataSet__DescriptionAssignment_5
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
    // InternalSensidl.g:2406:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2410:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2411:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
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
    // InternalSensidl.g:2418:1: rule__DataSet__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2422:1: ( ( '{' ) )
            // InternalSensidl.g:2423:1: ( '{' )
            {
            // InternalSensidl.g:2423:1: ( '{' )
            // InternalSensidl.g:2424:1: '{'
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
    // InternalSensidl.g:2437:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2441:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // InternalSensidl.g:2442:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
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
    // InternalSensidl.g:2449:1: rule__DataSet__Group__7__Impl : ( ( rule__DataSet__Alternatives_7 )* ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2453:1: ( ( ( rule__DataSet__Alternatives_7 )* ) )
            // InternalSensidl.g:2454:1: ( ( rule__DataSet__Alternatives_7 )* )
            {
            // InternalSensidl.g:2454:1: ( ( rule__DataSet__Alternatives_7 )* )
            // InternalSensidl.g:2455:1: ( rule__DataSet__Alternatives_7 )*
            {
             before(grammarAccess.getDataSetAccess().getAlternatives_7()); 
            // InternalSensidl.g:2456:1: ( rule__DataSet__Alternatives_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=60 && LA27_0<=63)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSensidl.g:2456:2: rule__DataSet__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DataSet__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDataSetAccess().getAlternatives_7()); 

            }


            }

        }
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
    // InternalSensidl.g:2466:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2470:1: ( rule__DataSet__Group__8__Impl )
            // InternalSensidl.g:2471:2: rule__DataSet__Group__8__Impl
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
    // InternalSensidl.g:2477:1: rule__DataSet__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2481:1: ( ( '}' ) )
            // InternalSensidl.g:2482:1: ( '}' )
            {
            // InternalSensidl.g:2482:1: ( '}' )
            // InternalSensidl.g:2483:1: '}'
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
    // InternalSensidl.g:2514:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2518:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2519:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
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
    // InternalSensidl.g:2526:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2530:1: ( ( 'uses' ) )
            // InternalSensidl.g:2531:1: ( 'uses' )
            {
            // InternalSensidl.g:2531:1: ( 'uses' )
            // InternalSensidl.g:2532:1: 'uses'
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
    // InternalSensidl.g:2545:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2549:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2550:2: rule__DataSet__Group_2__1__Impl
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
    // InternalSensidl.g:2556:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2560:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // InternalSensidl.g:2561:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // InternalSensidl.g:2561:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // InternalSensidl.g:2562:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // InternalSensidl.g:2563:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // InternalSensidl.g:2563:2: rule__DataSet__ParentDataSetAssignment_2_1
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
    // InternalSensidl.g:2577:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2581:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2582:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
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
    // InternalSensidl.g:2589:1: rule__DataSet__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2593:1: ( ( ',' ) )
            // InternalSensidl.g:2594:1: ( ',' )
            {
            // InternalSensidl.g:2594:1: ( ',' )
            // InternalSensidl.g:2595:1: ','
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
    // InternalSensidl.g:2608:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2612:1: ( rule__DataSet__Group_3__1__Impl )
            // InternalSensidl.g:2613:2: rule__DataSet__Group_3__1__Impl
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
    // InternalSensidl.g:2619:1: rule__DataSet__Group_3__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2623:1: ( ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) )
            // InternalSensidl.g:2624:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            {
            // InternalSensidl.g:2624:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            // InternalSensidl.g:2625:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_3_1()); 
            // InternalSensidl.g:2626:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            // InternalSensidl.g:2626:2: rule__DataSet__ParentDataSetAssignment_3_1
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
    // InternalSensidl.g:2640:1: rule__DataSet__Group_4__0 : rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 ;
    public final void rule__DataSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2644:1: ( rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 )
            // InternalSensidl.g:2645:2: rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1
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
    // InternalSensidl.g:2652:1: rule__DataSet__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2656:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2657:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2657:1: ( 'with identifier' )
            // InternalSensidl.g:2658:1: 'with identifier'
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
    // InternalSensidl.g:2671:1: rule__DataSet__Group_4__1 : rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 ;
    public final void rule__DataSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2675:1: ( rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 )
            // InternalSensidl.g:2676:2: rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2
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
    // InternalSensidl.g:2683:1: rule__DataSet__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2687:1: ( ( ':' ) )
            // InternalSensidl.g:2688:1: ( ':' )
            {
            // InternalSensidl.g:2688:1: ( ':' )
            // InternalSensidl.g:2689:1: ':'
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
    // InternalSensidl.g:2702:1: rule__DataSet__Group_4__2 : rule__DataSet__Group_4__2__Impl ;
    public final void rule__DataSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2706:1: ( rule__DataSet__Group_4__2__Impl )
            // InternalSensidl.g:2707:2: rule__DataSet__Group_4__2__Impl
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
    // InternalSensidl.g:2713:1: rule__DataSet__Group_4__2__Impl : ( ( rule__DataSet__IDAssignment_4_2 ) ) ;
    public final void rule__DataSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2717:1: ( ( ( rule__DataSet__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:2718:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:2718:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            // InternalSensidl.g:2719:1: ( rule__DataSet__IDAssignment_4_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:2720:1: ( rule__DataSet__IDAssignment_4_2 )
            // InternalSensidl.g:2720:2: rule__DataSet__IDAssignment_4_2
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


    // $ANTLR start "rule__Method__Group__0"
    // InternalSensidl.g:2736:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2740:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSensidl.g:2741:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalSensidl.g:2748:1: rule__Method__Group__0__Impl : ( ( rule__Method__Alternatives_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2752:1: ( ( ( rule__Method__Alternatives_0 )? ) )
            // InternalSensidl.g:2753:1: ( ( rule__Method__Alternatives_0 )? )
            {
            // InternalSensidl.g:2753:1: ( ( rule__Method__Alternatives_0 )? )
            // InternalSensidl.g:2754:1: ( rule__Method__Alternatives_0 )?
            {
             before(grammarAccess.getMethodAccess().getAlternatives_0()); 
            // InternalSensidl.g:2755:1: ( rule__Method__Alternatives_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=60 && LA28_0<=63)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:2755:2: rule__Method__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalSensidl.g:2765:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2769:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSensidl.g:2770:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalSensidl.g:2777:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2781:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalSensidl.g:2782:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2782:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalSensidl.g:2783:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2784:1: ( rule__Method__NameAssignment_1 )
            // InternalSensidl.g:2784:2: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalSensidl.g:2794:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2798:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSensidl.g:2799:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalSensidl.g:2806:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2810:1: ( ( '(' ) )
            // InternalSensidl.g:2811:1: ( '(' )
            {
            // InternalSensidl.g:2811:1: ( '(' )
            // InternalSensidl.g:2812:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalSensidl.g:2825:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2829:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSensidl.g:2830:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalSensidl.g:2837:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParameterAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2841:1: ( ( ( rule__Method__ParameterAssignment_3 )? ) )
            // InternalSensidl.g:2842:1: ( ( rule__Method__ParameterAssignment_3 )? )
            {
            // InternalSensidl.g:2842:1: ( ( rule__Method__ParameterAssignment_3 )? )
            // InternalSensidl.g:2843:1: ( rule__Method__ParameterAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_3()); 
            // InternalSensidl.g:2844:1: ( rule__Method__ParameterAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=16 && LA29_0<=27)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSensidl.g:2844:2: rule__Method__ParameterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ParameterAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalSensidl.g:2854:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2858:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSensidl.g:2859:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalSensidl.g:2866:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2870:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // InternalSensidl.g:2871:1: ( ( rule__Method__Group_4__0 )* )
            {
            // InternalSensidl.g:2871:1: ( ( rule__Method__Group_4__0 )* )
            // InternalSensidl.g:2872:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSensidl.g:2873:1: ( rule__Method__Group_4__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSensidl.g:2873:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalSensidl.g:2883:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2887:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSensidl.g:2888:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalSensidl.g:2895:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2899:1: ( ( ')' ) )
            // InternalSensidl.g:2900:1: ( ')' )
            {
            // InternalSensidl.g:2900:1: ( ')' )
            // InternalSensidl.g:2901:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalSensidl.g:2914:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2918:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalSensidl.g:2919:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalSensidl.g:2926:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2930:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalSensidl.g:2931:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalSensidl.g:2931:1: ( ( rule__Method__Group_6__0 )? )
            // InternalSensidl.g:2932:1: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalSensidl.g:2933:1: ( rule__Method__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSensidl.g:2933:2: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalSensidl.g:2943:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2947:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalSensidl.g:2948:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Method__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalSensidl.g:2955:1: rule__Method__Group__7__Impl : ( 'as' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2959:1: ( ( 'as' ) )
            // InternalSensidl.g:2960:1: ( 'as' )
            {
            // InternalSensidl.g:2960:1: ( 'as' )
            // InternalSensidl.g:2961:1: 'as'
            {
             before(grammarAccess.getMethodAccess().getAsKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getAsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // InternalSensidl.g:2974:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2978:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalSensidl.g:2979:2: rule__Method__Group__8__Impl rule__Method__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Method__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // InternalSensidl.g:2986:1: rule__Method__Group__8__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2990:1: ( ( 'Method' ) )
            // InternalSensidl.g:2991:1: ( 'Method' )
            {
            // InternalSensidl.g:2991:1: ( 'Method' )
            // InternalSensidl.g:2992:1: 'Method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group__9"
    // InternalSensidl.g:3005:1: rule__Method__Group__9 : rule__Method__Group__9__Impl rule__Method__Group__10 ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3009:1: ( rule__Method__Group__9__Impl rule__Method__Group__10 )
            // InternalSensidl.g:3010:2: rule__Method__Group__9__Impl rule__Method__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__Method__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__9"


    // $ANTLR start "rule__Method__Group__9__Impl"
    // InternalSensidl.g:3017:1: rule__Method__Group__9__Impl : ( ( rule__Method__Group_9__0 )? ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3021:1: ( ( ( rule__Method__Group_9__0 )? ) )
            // InternalSensidl.g:3022:1: ( ( rule__Method__Group_9__0 )? )
            {
            // InternalSensidl.g:3022:1: ( ( rule__Method__Group_9__0 )? )
            // InternalSensidl.g:3023:1: ( rule__Method__Group_9__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_9()); 
            // InternalSensidl.g:3024:1: ( rule__Method__Group_9__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSensidl.g:3024:2: rule__Method__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__9__Impl"


    // $ANTLR start "rule__Method__Group__10"
    // InternalSensidl.g:3034:1: rule__Method__Group__10 : rule__Method__Group__10__Impl ;
    public final void rule__Method__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3038:1: ( rule__Method__Group__10__Impl )
            // InternalSensidl.g:3039:2: rule__Method__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__10"


    // $ANTLR start "rule__Method__Group__10__Impl"
    // InternalSensidl.g:3045:1: rule__Method__Group__10__Impl : ( ( rule__Method__DescriptionAssignment_10 )? ) ;
    public final void rule__Method__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3049:1: ( ( ( rule__Method__DescriptionAssignment_10 )? ) )
            // InternalSensidl.g:3050:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            {
            // InternalSensidl.g:3050:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            // InternalSensidl.g:3051:1: ( rule__Method__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getMethodAccess().getDescriptionAssignment_10()); 
            // InternalSensidl.g:3052:1: ( rule__Method__DescriptionAssignment_10 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_DESCRIPTION) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSensidl.g:3052:2: rule__Method__DescriptionAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__DescriptionAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getDescriptionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__10__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // InternalSensidl.g:3084:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3088:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSensidl.g:3089:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // InternalSensidl.g:3096:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3100:1: ( ( ',' ) )
            // InternalSensidl.g:3101:1: ( ',' )
            {
            // InternalSensidl.g:3101:1: ( ',' )
            // InternalSensidl.g:3102:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // InternalSensidl.g:3115:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3119:1: ( rule__Method__Group_4__1__Impl )
            // InternalSensidl.g:3120:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // InternalSensidl.g:3126:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParameterAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3130:1: ( ( ( rule__Method__ParameterAssignment_4_1 ) ) )
            // InternalSensidl.g:3131:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            {
            // InternalSensidl.g:3131:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            // InternalSensidl.g:3132:1: ( rule__Method__ParameterAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_1()); 
            // InternalSensidl.g:3133:1: ( rule__Method__ParameterAssignment_4_1 )
            // InternalSensidl.g:3133:2: rule__Method__ParameterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParameterAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParameterAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalSensidl.g:3147:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3151:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalSensidl.g:3152:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_31);
            rule__Method__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalSensidl.g:3159:1: rule__Method__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3163:1: ( ( ':' ) )
            // InternalSensidl.g:3164:1: ( ':' )
            {
            // InternalSensidl.g:3164:1: ( ':' )
            // InternalSensidl.g:3165:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalSensidl.g:3178:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3182:1: ( rule__Method__Group_6__1__Impl )
            // InternalSensidl.g:3183:2: rule__Method__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalSensidl.g:3189:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Alternatives_6_1 ) ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3193:1: ( ( ( rule__Method__Alternatives_6_1 ) ) )
            // InternalSensidl.g:3194:1: ( ( rule__Method__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:3194:1: ( ( rule__Method__Alternatives_6_1 ) )
            // InternalSensidl.g:3195:1: ( rule__Method__Alternatives_6_1 )
            {
             before(grammarAccess.getMethodAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:3196:1: ( rule__Method__Alternatives_6_1 )
            // InternalSensidl.g:3196:2: rule__Method__Alternatives_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__Alternatives_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getAlternatives_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_9__0"
    // InternalSensidl.g:3210:1: rule__Method__Group_9__0 : rule__Method__Group_9__0__Impl rule__Method__Group_9__1 ;
    public final void rule__Method__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3214:1: ( rule__Method__Group_9__0__Impl rule__Method__Group_9__1 )
            // InternalSensidl.g:3215:2: rule__Method__Group_9__0__Impl rule__Method__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Method__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_9__0"


    // $ANTLR start "rule__Method__Group_9__0__Impl"
    // InternalSensidl.g:3222:1: rule__Method__Group_9__0__Impl : ( 'with identifier' ) ;
    public final void rule__Method__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3226:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3227:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3227:1: ( 'with identifier' )
            // InternalSensidl.g:3228:1: 'with identifier'
            {
             before(grammarAccess.getMethodAccess().getWithIdentifierKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getWithIdentifierKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_9__0__Impl"


    // $ANTLR start "rule__Method__Group_9__1"
    // InternalSensidl.g:3241:1: rule__Method__Group_9__1 : rule__Method__Group_9__1__Impl rule__Method__Group_9__2 ;
    public final void rule__Method__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3245:1: ( rule__Method__Group_9__1__Impl rule__Method__Group_9__2 )
            // InternalSensidl.g:3246:2: rule__Method__Group_9__1__Impl rule__Method__Group_9__2
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_9__1"


    // $ANTLR start "rule__Method__Group_9__1__Impl"
    // InternalSensidl.g:3253:1: rule__Method__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Method__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3257:1: ( ( ':' ) )
            // InternalSensidl.g:3258:1: ( ':' )
            {
            // InternalSensidl.g:3258:1: ( ':' )
            // InternalSensidl.g:3259:1: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_9_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_9__1__Impl"


    // $ANTLR start "rule__Method__Group_9__2"
    // InternalSensidl.g:3272:1: rule__Method__Group_9__2 : rule__Method__Group_9__2__Impl ;
    public final void rule__Method__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3276:1: ( rule__Method__Group_9__2__Impl )
            // InternalSensidl.g:3277:2: rule__Method__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_9__2"


    // $ANTLR start "rule__Method__Group_9__2__Impl"
    // InternalSensidl.g:3283:1: rule__Method__Group_9__2__Impl : ( ( rule__Method__IDAssignment_9_2 ) ) ;
    public final void rule__Method__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3287:1: ( ( ( rule__Method__IDAssignment_9_2 ) ) )
            // InternalSensidl.g:3288:1: ( ( rule__Method__IDAssignment_9_2 ) )
            {
            // InternalSensidl.g:3288:1: ( ( rule__Method__IDAssignment_9_2 ) )
            // InternalSensidl.g:3289:1: ( rule__Method__IDAssignment_9_2 )
            {
             before(grammarAccess.getMethodAccess().getIDAssignment_9_2()); 
            // InternalSensidl.g:3290:1: ( rule__Method__IDAssignment_9_2 )
            // InternalSensidl.g:3290:2: rule__Method__IDAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__IDAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getIDAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_9__2__Impl"


    // $ANTLR start "rule__MethodParameter__Group__0"
    // InternalSensidl.g:3306:1: rule__MethodParameter__Group__0 : rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 ;
    public final void rule__MethodParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3310:1: ( rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 )
            // InternalSensidl.g:3311:2: rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MethodParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__Group__0"


    // $ANTLR start "rule__MethodParameter__Group__0__Impl"
    // InternalSensidl.g:3318:1: rule__MethodParameter__Group__0__Impl : ( ( rule__MethodParameter__Alternatives_0 ) ) ;
    public final void rule__MethodParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3322:1: ( ( ( rule__MethodParameter__Alternatives_0 ) ) )
            // InternalSensidl.g:3323:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            {
            // InternalSensidl.g:3323:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            // InternalSensidl.g:3324:1: ( rule__MethodParameter__Alternatives_0 )
            {
             before(grammarAccess.getMethodParameterAccess().getAlternatives_0()); 
            // InternalSensidl.g:3325:1: ( rule__MethodParameter__Alternatives_0 )
            // InternalSensidl.g:3325:2: rule__MethodParameter__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodParameter__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodParameterAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__Group__0__Impl"


    // $ANTLR start "rule__MethodParameter__Group__1"
    // InternalSensidl.g:3335:1: rule__MethodParameter__Group__1 : rule__MethodParameter__Group__1__Impl ;
    public final void rule__MethodParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3339:1: ( rule__MethodParameter__Group__1__Impl )
            // InternalSensidl.g:3340:2: rule__MethodParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodParameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__Group__1"


    // $ANTLR start "rule__MethodParameter__Group__1__Impl"
    // InternalSensidl.g:3346:1: rule__MethodParameter__Group__1__Impl : ( ( rule__MethodParameter__NameAssignment_1 ) ) ;
    public final void rule__MethodParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3350:1: ( ( ( rule__MethodParameter__NameAssignment_1 ) ) )
            // InternalSensidl.g:3351:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            {
            // InternalSensidl.g:3351:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            // InternalSensidl.g:3352:1: ( rule__MethodParameter__NameAssignment_1 )
            {
             before(grammarAccess.getMethodParameterAccess().getNameAssignment_1()); 
            // InternalSensidl.g:3353:1: ( rule__MethodParameter__NameAssignment_1 )
            // InternalSensidl.g:3353:2: rule__MethodParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__Group__1__Impl"


    // $ANTLR start "rule__MeasurementData__Group__0"
    // InternalSensidl.g:3367:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3371:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:3372:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:3379:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3383:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3384:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3384:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3385:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3386:1: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3386:2: rule__MeasurementData__NameAssignment_0
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
    // InternalSensidl.g:3396:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3400:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:3401:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSensidl.g:3408:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3412:1: ( ( 'as' ) )
            // InternalSensidl.g:3413:1: ( 'as' )
            {
            // InternalSensidl.g:3413:1: ( 'as' )
            // InternalSensidl.g:3414:1: 'as'
            {
             before(grammarAccess.getMeasurementDataAccess().getAsKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSensidl.g:3427:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3431:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:3432:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalSensidl.g:3439:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3443:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:3444:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:3444:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:3445:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:3446:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:3446:2: rule__MeasurementData__DataTypeAssignment_2
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
    // InternalSensidl.g:3456:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3460:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:3461:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalSensidl.g:3468:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3472:1: ( ( 'in' ) )
            // InternalSensidl.g:3473:1: ( 'in' )
            {
            // InternalSensidl.g:3473:1: ( 'in' )
            // InternalSensidl.g:3474:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSensidl.g:3487:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3491:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:3492:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:3499:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3503:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:3504:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:3504:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:3505:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:3506:1: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:3506:2: rule__MeasurementData__UnitAssignment_4
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
    // InternalSensidl.g:3516:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3520:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:3521:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:3528:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3532:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3533:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3533:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3534:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3535:1: ( rule__MeasurementData__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSensidl.g:3535:2: rule__MeasurementData__Group_5__0
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
    // InternalSensidl.g:3545:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3549:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:3550:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:3557:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Alternatives_6 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3561:1: ( ( ( rule__MeasurementData__Alternatives_6 )? ) )
            // InternalSensidl.g:3562:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            {
            // InternalSensidl.g:3562:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            // InternalSensidl.g:3563:1: ( rule__MeasurementData__Alternatives_6 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 
            // InternalSensidl.g:3564:1: ( rule__MeasurementData__Alternatives_6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSensidl.g:3564:2: rule__MeasurementData__Alternatives_6
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
    // InternalSensidl.g:3574:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3578:1: ( rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 )
            // InternalSensidl.g:3579:2: rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:3586:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__Group_7__0 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3590:1: ( ( ( rule__MeasurementData__Group_7__0 )? ) )
            // InternalSensidl.g:3591:1: ( ( rule__MeasurementData__Group_7__0 )? )
            {
            // InternalSensidl.g:3591:1: ( ( rule__MeasurementData__Group_7__0 )? )
            // InternalSensidl.g:3592:1: ( rule__MeasurementData__Group_7__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7()); 
            // InternalSensidl.g:3593:1: ( rule__MeasurementData__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSensidl.g:3593:2: rule__MeasurementData__Group_7__0
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
    // InternalSensidl.g:3603:1: rule__MeasurementData__Group__8 : rule__MeasurementData__Group__8__Impl ;
    public final void rule__MeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3607:1: ( rule__MeasurementData__Group__8__Impl )
            // InternalSensidl.g:3608:2: rule__MeasurementData__Group__8__Impl
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
    // InternalSensidl.g:3614:1: rule__MeasurementData__Group__8__Impl : ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) ;
    public final void rule__MeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3618:1: ( ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) )
            // InternalSensidl.g:3619:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            {
            // InternalSensidl.g:3619:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            // InternalSensidl.g:3620:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_8()); 
            // InternalSensidl.g:3621:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DESCRIPTION) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSensidl.g:3621:2: rule__MeasurementData__DescriptionAssignment_8
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
    // InternalSensidl.g:3649:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3653:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:3654:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
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
    // InternalSensidl.g:3661:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3665:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3666:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3666:1: ( 'with identifier' )
            // InternalSensidl.g:3667:1: 'with identifier'
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
    // InternalSensidl.g:3680:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3684:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:3685:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
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
    // InternalSensidl.g:3692:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3696:1: ( ( ':' ) )
            // InternalSensidl.g:3697:1: ( ':' )
            {
            // InternalSensidl.g:3697:1: ( ':' )
            // InternalSensidl.g:3698:1: ':'
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
    // InternalSensidl.g:3711:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3715:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3716:2: rule__MeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:3722:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3726:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3727:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3727:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3728:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3729:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3729:2: rule__MeasurementData__IDAssignment_5_2
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
    // InternalSensidl.g:3745:1: rule__MeasurementData__Group_6_0__0 : rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 ;
    public final void rule__MeasurementData__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3749:1: ( rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 )
            // InternalSensidl.g:3750:2: rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSensidl.g:3757:1: rule__MeasurementData__Group_6_0__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3761:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3762:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3762:1: ( 'adjusted' )
            // InternalSensidl.g:3763:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSensidl.g:3776:1: rule__MeasurementData__Group_6_0__1 : rule__MeasurementData__Group_6_0__1__Impl ;
    public final void rule__MeasurementData__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3780:1: ( rule__MeasurementData__Group_6_0__1__Impl )
            // InternalSensidl.g:3781:2: rule__MeasurementData__Group_6_0__1__Impl
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
    // InternalSensidl.g:3787:1: rule__MeasurementData__Group_6_0__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) ;
    public final void rule__MeasurementData__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3791:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) )
            // InternalSensidl.g:3792:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            {
            // InternalSensidl.g:3792:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            // InternalSensidl.g:3793:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 
            // InternalSensidl.g:3794:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            // InternalSensidl.g:3794:2: rule__MeasurementData__AdjustmentsAssignment_6_0_1
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
    // InternalSensidl.g:3808:1: rule__MeasurementData__Group_6_1__0 : rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 ;
    public final void rule__MeasurementData__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3812:1: ( rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 )
            // InternalSensidl.g:3813:2: rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSensidl.g:3820:1: rule__MeasurementData__Group_6_1__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3824:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3825:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3825:1: ( 'adjusted' )
            // InternalSensidl.g:3826:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSensidl.g:3839:1: rule__MeasurementData__Group_6_1__1 : rule__MeasurementData__Group_6_1__1__Impl ;
    public final void rule__MeasurementData__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3843:1: ( rule__MeasurementData__Group_6_1__1__Impl )
            // InternalSensidl.g:3844:2: rule__MeasurementData__Group_6_1__1__Impl
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
    // InternalSensidl.g:3850:1: rule__MeasurementData__Group_6_1__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) ;
    public final void rule__MeasurementData__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3854:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) )
            // InternalSensidl.g:3855:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            {
            // InternalSensidl.g:3855:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            // InternalSensidl.g:3856:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 
            // InternalSensidl.g:3857:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            // InternalSensidl.g:3857:2: rule__MeasurementData__AdjustmentsAssignment_6_1_1
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
    // InternalSensidl.g:3871:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3875:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:3876:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSensidl.g:3883:1: rule__MeasurementData__Group_6_2__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3887:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3888:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3888:1: ( 'adjusted' )
            // InternalSensidl.g:3889:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSensidl.g:3902:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3906:1: ( rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 )
            // InternalSensidl.g:3907:2: rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2
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
    // InternalSensidl.g:3914:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3918:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:3919:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:3919:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:3920:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:3921:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:3921:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
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
    // InternalSensidl.g:3931:1: rule__MeasurementData__Group_6_2__2 : rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 ;
    public final void rule__MeasurementData__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3935:1: ( rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 )
            // InternalSensidl.g:3936:2: rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSensidl.g:3943:1: rule__MeasurementData__Group_6_2__2__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3947:1: ( ( ',' ) )
            // InternalSensidl.g:3948:1: ( ',' )
            {
            // InternalSensidl.g:3948:1: ( ',' )
            // InternalSensidl.g:3949:1: ','
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
    // InternalSensidl.g:3962:1: rule__MeasurementData__Group_6_2__3 : rule__MeasurementData__Group_6_2__3__Impl ;
    public final void rule__MeasurementData__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3966:1: ( rule__MeasurementData__Group_6_2__3__Impl )
            // InternalSensidl.g:3967:2: rule__MeasurementData__Group_6_2__3__Impl
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
    // InternalSensidl.g:3973:1: rule__MeasurementData__Group_6_2__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) ;
    public final void rule__MeasurementData__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3977:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) )
            // InternalSensidl.g:3978:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            {
            // InternalSensidl.g:3978:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            // InternalSensidl.g:3979:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 
            // InternalSensidl.g:3980:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            // InternalSensidl.g:3980:2: rule__MeasurementData__AdjustmentsAssignment_6_2_3
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
    // InternalSensidl.g:3998:1: rule__MeasurementData__Group_7__0 : rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 ;
    public final void rule__MeasurementData__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4002:1: ( rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 )
            // InternalSensidl.g:4003:2: rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:4010:1: rule__MeasurementData__Group_7__0__Impl : ( 'exclude:' ) ;
    public final void rule__MeasurementData__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4014:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:4015:1: ( 'exclude:' )
            {
            // InternalSensidl.g:4015:1: ( 'exclude:' )
            // InternalSensidl.g:4016:1: 'exclude:'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSensidl.g:4029:1: rule__MeasurementData__Group_7__1 : rule__MeasurementData__Group_7__1__Impl ;
    public final void rule__MeasurementData__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4033:1: ( rule__MeasurementData__Group_7__1__Impl )
            // InternalSensidl.g:4034:2: rule__MeasurementData__Group_7__1__Impl
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
    // InternalSensidl.g:4040:1: rule__MeasurementData__Group_7__1__Impl : ( ( rule__MeasurementData__Alternatives_7_1 ) ) ;
    public final void rule__MeasurementData__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4044:1: ( ( ( rule__MeasurementData__Alternatives_7_1 ) ) )
            // InternalSensidl.g:4045:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            {
            // InternalSensidl.g:4045:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            // InternalSensidl.g:4046:1: ( rule__MeasurementData__Alternatives_7_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_7_1()); 
            // InternalSensidl.g:4047:1: ( rule__MeasurementData__Alternatives_7_1 )
            // InternalSensidl.g:4047:2: rule__MeasurementData__Alternatives_7_1
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
    // InternalSensidl.g:4061:1: rule__MeasurementData__Group_7_1_0__0 : rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 ;
    public final void rule__MeasurementData__Group_7_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4065:1: ( rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 )
            // InternalSensidl.g:4066:2: rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1
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
    // InternalSensidl.g:4073:1: rule__MeasurementData__Group_7_1_0__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4077:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) )
            // InternalSensidl.g:4078:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            {
            // InternalSensidl.g:4078:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            // InternalSensidl.g:4079:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_0()); 
            // InternalSensidl.g:4080:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            // InternalSensidl.g:4080:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0
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
    // InternalSensidl.g:4090:1: rule__MeasurementData__Group_7_1_0__1 : rule__MeasurementData__Group_7_1_0__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4094:1: ( rule__MeasurementData__Group_7_1_0__1__Impl )
            // InternalSensidl.g:4095:2: rule__MeasurementData__Group_7_1_0__1__Impl
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
    // InternalSensidl.g:4101:1: rule__MeasurementData__Group_7_1_0__1__Impl : ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4105:1: ( ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) )
            // InternalSensidl.g:4106:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            {
            // InternalSensidl.g:4106:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            // InternalSensidl.g:4107:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0_1()); 
            // InternalSensidl.g:4108:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSensidl.g:4108:2: rule__MeasurementData__Group_7_1_0_1__0
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
    // InternalSensidl.g:4122:1: rule__MeasurementData__Group_7_1_0_1__0 : rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 ;
    public final void rule__MeasurementData__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4126:1: ( rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 )
            // InternalSensidl.g:4127:2: rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSensidl.g:4134:1: rule__MeasurementData__Group_7_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4138:1: ( ( ',' ) )
            // InternalSensidl.g:4139:1: ( ',' )
            {
            // InternalSensidl.g:4139:1: ( ',' )
            // InternalSensidl.g:4140:1: ','
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
    // InternalSensidl.g:4153:1: rule__MeasurementData__Group_7_1_0_1__1 : rule__MeasurementData__Group_7_1_0_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4157:1: ( rule__MeasurementData__Group_7_1_0_1__1__Impl )
            // InternalSensidl.g:4158:2: rule__MeasurementData__Group_7_1_0_1__1__Impl
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
    // InternalSensidl.g:4164:1: rule__MeasurementData__Group_7_1_0_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4168:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) )
            // InternalSensidl.g:4169:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            {
            // InternalSensidl.g:4169:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            // InternalSensidl.g:4170:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_1_1()); 
            // InternalSensidl.g:4171:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            // InternalSensidl.g:4171:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1
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
    // InternalSensidl.g:4185:1: rule__MeasurementData__Group_7_1_1__0 : rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4189:1: ( rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 )
            // InternalSensidl.g:4190:2: rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1
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
    // InternalSensidl.g:4197:1: rule__MeasurementData__Group_7_1_1__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4201:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) )
            // InternalSensidl.g:4202:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            {
            // InternalSensidl.g:4202:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            // InternalSensidl.g:4203:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_0()); 
            // InternalSensidl.g:4204:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            // InternalSensidl.g:4204:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0
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
    // InternalSensidl.g:4214:1: rule__MeasurementData__Group_7_1_1__1 : rule__MeasurementData__Group_7_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4218:1: ( rule__MeasurementData__Group_7_1_1__1__Impl )
            // InternalSensidl.g:4219:2: rule__MeasurementData__Group_7_1_1__1__Impl
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
    // InternalSensidl.g:4225:1: rule__MeasurementData__Group_7_1_1__1__Impl : ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4229:1: ( ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) )
            // InternalSensidl.g:4230:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            {
            // InternalSensidl.g:4230:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            // InternalSensidl.g:4231:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1_1()); 
            // InternalSensidl.g:4232:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSensidl.g:4232:2: rule__MeasurementData__Group_7_1_1_1__0
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
    // InternalSensidl.g:4246:1: rule__MeasurementData__Group_7_1_1_1__0 : rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4250:1: ( rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 )
            // InternalSensidl.g:4251:2: rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSensidl.g:4258:1: rule__MeasurementData__Group_7_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4262:1: ( ( ',' ) )
            // InternalSensidl.g:4263:1: ( ',' )
            {
            // InternalSensidl.g:4263:1: ( ',' )
            // InternalSensidl.g:4264:1: ','
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
    // InternalSensidl.g:4277:1: rule__MeasurementData__Group_7_1_1_1__1 : rule__MeasurementData__Group_7_1_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4281:1: ( rule__MeasurementData__Group_7_1_1_1__1__Impl )
            // InternalSensidl.g:4282:2: rule__MeasurementData__Group_7_1_1_1__1__Impl
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
    // InternalSensidl.g:4288:1: rule__MeasurementData__Group_7_1_1_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4292:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) )
            // InternalSensidl.g:4293:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            {
            // InternalSensidl.g:4293:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            // InternalSensidl.g:4294:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_1_1()); 
            // InternalSensidl.g:4295:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            // InternalSensidl.g:4295:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1
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
    // InternalSensidl.g:4309:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4313:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:4314:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:4321:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4325:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:4326:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:4326:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:4327:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:4328:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:4328:2: rule__NonMeasurementData__NameAssignment_0
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
    // InternalSensidl.g:4338:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4342:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:4343:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSensidl.g:4350:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4354:1: ( ( 'as' ) )
            // InternalSensidl.g:4355:1: ( 'as' )
            {
            // InternalSensidl.g:4355:1: ( 'as' )
            // InternalSensidl.g:4356:1: 'as'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAsKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSensidl.g:4369:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4373:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:4374:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:4381:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4385:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:4386:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:4386:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:4387:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:4388:1: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:4388:2: rule__NonMeasurementData__Alternatives_2
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
    // InternalSensidl.g:4398:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4402:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:4403:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:4410:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4414:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // InternalSensidl.g:4415:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // InternalSensidl.g:4415:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // InternalSensidl.g:4416:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // InternalSensidl.g:4417:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==66) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSensidl.g:4417:2: rule__NonMeasurementData__ConstantAssignment_3
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
    // InternalSensidl.g:4427:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4431:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:4432:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:4439:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4443:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:4444:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:4444:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:4445:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:4446:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSensidl.g:4446:2: rule__NonMeasurementData__Group_4__0
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
    // InternalSensidl.g:4456:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4460:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:4461:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:4468:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4472:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:4473:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:4473:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:4474:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:4475:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSensidl.g:4475:2: rule__NonMeasurementData__Group_5__0
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
    // InternalSensidl.g:4485:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4489:1: ( rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 )
            // InternalSensidl.g:4490:2: rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:4497:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__Group_6__0 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4501:1: ( ( ( rule__NonMeasurementData__Group_6__0 )? ) )
            // InternalSensidl.g:4502:1: ( ( rule__NonMeasurementData__Group_6__0 )? )
            {
            // InternalSensidl.g:4502:1: ( ( rule__NonMeasurementData__Group_6__0 )? )
            // InternalSensidl.g:4503:1: ( rule__NonMeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6()); 
            // InternalSensidl.g:4504:1: ( rule__NonMeasurementData__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSensidl.g:4504:2: rule__NonMeasurementData__Group_6__0
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
    // InternalSensidl.g:4514:1: rule__NonMeasurementData__Group__7 : rule__NonMeasurementData__Group__7__Impl ;
    public final void rule__NonMeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4518:1: ( rule__NonMeasurementData__Group__7__Impl )
            // InternalSensidl.g:4519:2: rule__NonMeasurementData__Group__7__Impl
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
    // InternalSensidl.g:4525:1: rule__NonMeasurementData__Group__7__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__NonMeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4529:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:4530:1: ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:4530:1: ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? )
            // InternalSensidl.g:4531:1: ( rule__NonMeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:4532:1: ( rule__NonMeasurementData__DescriptionAssignment_7 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DESCRIPTION) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSensidl.g:4532:2: rule__NonMeasurementData__DescriptionAssignment_7
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
    // InternalSensidl.g:4558:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4562:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:4563:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSensidl.g:4570:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4574:1: ( ( 'value' ) )
            // InternalSensidl.g:4575:1: ( 'value' )
            {
            // InternalSensidl.g:4575:1: ( 'value' )
            // InternalSensidl.g:4576:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSensidl.g:4589:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4593:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:4594:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
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
    // InternalSensidl.g:4601:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4605:1: ( ( '=' ) )
            // InternalSensidl.g:4606:1: ( '=' )
            {
            // InternalSensidl.g:4606:1: ( '=' )
            // InternalSensidl.g:4607:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSensidl.g:4620:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4624:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:4625:2: rule__NonMeasurementData__Group_4__2__Impl
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
    // InternalSensidl.g:4631:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4635:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // InternalSensidl.g:4636:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // InternalSensidl.g:4636:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // InternalSensidl.g:4637:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // InternalSensidl.g:4638:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // InternalSensidl.g:4638:2: rule__NonMeasurementData__ValueAssignment_4_2
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
    // InternalSensidl.g:4654:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4658:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:4659:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
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
    // InternalSensidl.g:4666:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4670:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:4671:1: ( 'with identifier' )
            {
            // InternalSensidl.g:4671:1: ( 'with identifier' )
            // InternalSensidl.g:4672:1: 'with identifier'
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
    // InternalSensidl.g:4685:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4689:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // InternalSensidl.g:4690:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
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
    // InternalSensidl.g:4697:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4701:1: ( ( ':' ) )
            // InternalSensidl.g:4702:1: ( ':' )
            {
            // InternalSensidl.g:4702:1: ( ':' )
            // InternalSensidl.g:4703:1: ':'
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
    // InternalSensidl.g:4716:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4720:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:4721:2: rule__NonMeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:4727:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4731:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:4732:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:4732:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:4733:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:4734:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:4734:2: rule__NonMeasurementData__IDAssignment_5_2
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
    // InternalSensidl.g:4750:1: rule__NonMeasurementData__Group_6__0 : rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1 ;
    public final void rule__NonMeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4754:1: ( rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1 )
            // InternalSensidl.g:4755:2: rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:4762:1: rule__NonMeasurementData__Group_6__0__Impl : ( 'exclude:' ) ;
    public final void rule__NonMeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4766:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:4767:1: ( 'exclude:' )
            {
            // InternalSensidl.g:4767:1: ( 'exclude:' )
            // InternalSensidl.g:4768:1: 'exclude:'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSensidl.g:4781:1: rule__NonMeasurementData__Group_6__1 : rule__NonMeasurementData__Group_6__1__Impl ;
    public final void rule__NonMeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4785:1: ( rule__NonMeasurementData__Group_6__1__Impl )
            // InternalSensidl.g:4786:2: rule__NonMeasurementData__Group_6__1__Impl
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
    // InternalSensidl.g:4792:1: rule__NonMeasurementData__Group_6__1__Impl : ( ( rule__NonMeasurementData__Alternatives_6_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4796:1: ( ( ( rule__NonMeasurementData__Alternatives_6_1 ) ) )
            // InternalSensidl.g:4797:1: ( ( rule__NonMeasurementData__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:4797:1: ( ( rule__NonMeasurementData__Alternatives_6_1 ) )
            // InternalSensidl.g:4798:1: ( rule__NonMeasurementData__Alternatives_6_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:4799:1: ( rule__NonMeasurementData__Alternatives_6_1 )
            // InternalSensidl.g:4799:2: rule__NonMeasurementData__Alternatives_6_1
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
    // InternalSensidl.g:4813:1: rule__NonMeasurementData__Group_6_1_0__0 : rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1 ;
    public final void rule__NonMeasurementData__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4817:1: ( rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1 )
            // InternalSensidl.g:4818:2: rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1
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
    // InternalSensidl.g:4825:1: rule__NonMeasurementData__Group_6_1_0__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4829:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) ) )
            // InternalSensidl.g:4830:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) )
            {
            // InternalSensidl.g:4830:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) )
            // InternalSensidl.g:4831:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_0()); 
            // InternalSensidl.g:4832:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 )
            // InternalSensidl.g:4832:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0
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
    // InternalSensidl.g:4842:1: rule__NonMeasurementData__Group_6_1_0__1 : rule__NonMeasurementData__Group_6_1_0__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4846:1: ( rule__NonMeasurementData__Group_6_1_0__1__Impl )
            // InternalSensidl.g:4847:2: rule__NonMeasurementData__Group_6_1_0__1__Impl
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
    // InternalSensidl.g:4853:1: rule__NonMeasurementData__Group_6_1_0__1__Impl : ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4857:1: ( ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? ) )
            // InternalSensidl.g:4858:1: ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? )
            {
            // InternalSensidl.g:4858:1: ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? )
            // InternalSensidl.g:4859:1: ( rule__NonMeasurementData__Group_6_1_0_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0_1()); 
            // InternalSensidl.g:4860:1: ( rule__NonMeasurementData__Group_6_1_0_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSensidl.g:4860:2: rule__NonMeasurementData__Group_6_1_0_1__0
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
    // InternalSensidl.g:4874:1: rule__NonMeasurementData__Group_6_1_0_1__0 : rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4878:1: ( rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1 )
            // InternalSensidl.g:4879:2: rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSensidl.g:4886:1: rule__NonMeasurementData__Group_6_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4890:1: ( ( ',' ) )
            // InternalSensidl.g:4891:1: ( ',' )
            {
            // InternalSensidl.g:4891:1: ( ',' )
            // InternalSensidl.g:4892:1: ','
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
    // InternalSensidl.g:4905:1: rule__NonMeasurementData__Group_6_1_0_1__1 : rule__NonMeasurementData__Group_6_1_0_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4909:1: ( rule__NonMeasurementData__Group_6_1_0_1__1__Impl )
            // InternalSensidl.g:4910:2: rule__NonMeasurementData__Group_6_1_0_1__1__Impl
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
    // InternalSensidl.g:4916:1: rule__NonMeasurementData__Group_6_1_0_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4920:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) ) )
            // InternalSensidl.g:4921:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) )
            {
            // InternalSensidl.g:4921:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) )
            // InternalSensidl.g:4922:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_1_1()); 
            // InternalSensidl.g:4923:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 )
            // InternalSensidl.g:4923:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1
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
    // InternalSensidl.g:4937:1: rule__NonMeasurementData__Group_6_1_1__0 : rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4941:1: ( rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1 )
            // InternalSensidl.g:4942:2: rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1
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
    // InternalSensidl.g:4949:1: rule__NonMeasurementData__Group_6_1_1__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4953:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) ) )
            // InternalSensidl.g:4954:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) )
            {
            // InternalSensidl.g:4954:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) )
            // InternalSensidl.g:4955:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_0()); 
            // InternalSensidl.g:4956:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 )
            // InternalSensidl.g:4956:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0
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
    // InternalSensidl.g:4966:1: rule__NonMeasurementData__Group_6_1_1__1 : rule__NonMeasurementData__Group_6_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4970:1: ( rule__NonMeasurementData__Group_6_1_1__1__Impl )
            // InternalSensidl.g:4971:2: rule__NonMeasurementData__Group_6_1_1__1__Impl
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
    // InternalSensidl.g:4977:1: rule__NonMeasurementData__Group_6_1_1__1__Impl : ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4981:1: ( ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? ) )
            // InternalSensidl.g:4982:1: ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? )
            {
            // InternalSensidl.g:4982:1: ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? )
            // InternalSensidl.g:4983:1: ( rule__NonMeasurementData__Group_6_1_1_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1_1()); 
            // InternalSensidl.g:4984:1: ( rule__NonMeasurementData__Group_6_1_1_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSensidl.g:4984:2: rule__NonMeasurementData__Group_6_1_1_1__0
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
    // InternalSensidl.g:4998:1: rule__NonMeasurementData__Group_6_1_1_1__0 : rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5002:1: ( rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1 )
            // InternalSensidl.g:5003:2: rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSensidl.g:5010:1: rule__NonMeasurementData__Group_6_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5014:1: ( ( ',' ) )
            // InternalSensidl.g:5015:1: ( ',' )
            {
            // InternalSensidl.g:5015:1: ( ',' )
            // InternalSensidl.g:5016:1: ','
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
    // InternalSensidl.g:5029:1: rule__NonMeasurementData__Group_6_1_1_1__1 : rule__NonMeasurementData__Group_6_1_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5033:1: ( rule__NonMeasurementData__Group_6_1_1_1__1__Impl )
            // InternalSensidl.g:5034:2: rule__NonMeasurementData__Group_6_1_1_1__1__Impl
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
    // InternalSensidl.g:5040:1: rule__NonMeasurementData__Group_6_1_1_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5044:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) ) )
            // InternalSensidl.g:5045:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) )
            {
            // InternalSensidl.g:5045:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) )
            // InternalSensidl.g:5046:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_1_1()); 
            // InternalSensidl.g:5047:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 )
            // InternalSensidl.g:5047:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1
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
    // InternalSensidl.g:5061:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5065:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:5066:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:5073:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5077:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:5078:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:5078:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:5079:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:5080:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:5080:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
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
    // InternalSensidl.g:5090:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5094:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:5095:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSensidl.g:5102:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5106:1: ( ( 'as' ) )
            // InternalSensidl.g:5107:1: ( 'as' )
            {
            // InternalSensidl.g:5107:1: ( 'as' )
            // InternalSensidl.g:5108:1: 'as'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAsKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSensidl.g:5121:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5125:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:5126:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalSensidl.g:5133:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5137:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:5138:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:5138:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:5139:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:5140:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:5140:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
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
    // InternalSensidl.g:5150:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5154:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:5155:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalSensidl.g:5162:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5166:1: ( ( 'in' ) )
            // InternalSensidl.g:5167:1: ( 'in' )
            {
            // InternalSensidl.g:5167:1: ( 'in' )
            // InternalSensidl.g:5168:1: 'in'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSensidl.g:5181:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5185:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:5186:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalSensidl.g:5193:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5197:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:5198:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:5198:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:5199:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:5200:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:5200:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
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
    // InternalSensidl.g:5210:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5214:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:5215:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalSensidl.g:5222:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5226:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:5227:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:5227:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:5228:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:5229:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSensidl.g:5229:2: rule__MeasurementDataNotAdjustable__Group_5__0
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
    // InternalSensidl.g:5239:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5243:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 )
            // InternalSensidl.g:5244:2: rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7
            {
            pushFollow(FOLLOW_45);
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
    // InternalSensidl.g:5251:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5255:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) )
            // InternalSensidl.g:5256:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            {
            // InternalSensidl.g:5256:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            // InternalSensidl.g:5257:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6()); 
            // InternalSensidl.g:5258:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSensidl.g:5258:2: rule__MeasurementDataNotAdjustable__Group_6__0
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
    // InternalSensidl.g:5268:1: rule__MeasurementDataNotAdjustable__Group__7 : rule__MeasurementDataNotAdjustable__Group__7__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5272:1: ( rule__MeasurementDataNotAdjustable__Group__7__Impl )
            // InternalSensidl.g:5273:2: rule__MeasurementDataNotAdjustable__Group__7__Impl
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
    // InternalSensidl.g:5279:1: rule__MeasurementDataNotAdjustable__Group__7__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5283:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:5284:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:5284:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            // InternalSensidl.g:5285:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:5286:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DESCRIPTION) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSensidl.g:5286:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7
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
    // InternalSensidl.g:5312:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5316:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:5317:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
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
    // InternalSensidl.g:5324:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5328:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:5329:1: ( 'with identifier' )
            {
            // InternalSensidl.g:5329:1: ( 'with identifier' )
            // InternalSensidl.g:5330:1: 'with identifier'
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
    // InternalSensidl.g:5343:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5347:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:5348:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
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
    // InternalSensidl.g:5355:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5359:1: ( ( ':' ) )
            // InternalSensidl.g:5360:1: ( ':' )
            {
            // InternalSensidl.g:5360:1: ( ':' )
            // InternalSensidl.g:5361:1: ':'
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
    // InternalSensidl.g:5374:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5378:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:5379:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
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
    // InternalSensidl.g:5385:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5389:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:5390:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:5390:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:5391:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:5392:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:5392:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
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
    // InternalSensidl.g:5408:1: rule__MeasurementDataNotAdjustable__Group_6__0 : rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5412:1: ( rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 )
            // InternalSensidl.g:5413:2: rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1
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
    // InternalSensidl.g:5420:1: rule__MeasurementDataNotAdjustable__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5424:1: ( ( 'exclude' ) )
            // InternalSensidl.g:5425:1: ( 'exclude' )
            {
            // InternalSensidl.g:5425:1: ( 'exclude' )
            // InternalSensidl.g:5426:1: 'exclude'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSensidl.g:5439:1: rule__MeasurementDataNotAdjustable__Group_6__1 : rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5443:1: ( rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 )
            // InternalSensidl.g:5444:2: rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:5451:1: rule__MeasurementDataNotAdjustable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5455:1: ( ( ':' ) )
            // InternalSensidl.g:5456:1: ( ':' )
            {
            // InternalSensidl.g:5456:1: ( ':' )
            // InternalSensidl.g:5457:1: ':'
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
    // InternalSensidl.g:5470:1: rule__MeasurementDataNotAdjustable__Group_6__2 : rule__MeasurementDataNotAdjustable__Group_6__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5474:1: ( rule__MeasurementDataNotAdjustable__Group_6__2__Impl )
            // InternalSensidl.g:5475:2: rule__MeasurementDataNotAdjustable__Group_6__2__Impl
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
    // InternalSensidl.g:5481:1: rule__MeasurementDataNotAdjustable__Group_6__2__Impl : ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5485:1: ( ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) )
            // InternalSensidl.g:5486:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            {
            // InternalSensidl.g:5486:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            // InternalSensidl.g:5487:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAlternatives_6_2()); 
            // InternalSensidl.g:5488:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            // InternalSensidl.g:5488:2: rule__MeasurementDataNotAdjustable__Alternatives_6_2
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
    // InternalSensidl.g:5504:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5508:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 )
            // InternalSensidl.g:5509:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1
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
    // InternalSensidl.g:5516:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5520:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) )
            // InternalSensidl.g:5521:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            {
            // InternalSensidl.g:5521:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            // InternalSensidl.g:5522:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_0()); 
            // InternalSensidl.g:5523:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            // InternalSensidl.g:5523:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0
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
    // InternalSensidl.g:5533:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5537:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl )
            // InternalSensidl.g:5538:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl
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
    // InternalSensidl.g:5544:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5548:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) )
            // InternalSensidl.g:5549:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            {
            // InternalSensidl.g:5549:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            // InternalSensidl.g:5550:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0_1()); 
            // InternalSensidl.g:5551:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==34) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSensidl.g:5551:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0
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
    // InternalSensidl.g:5565:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5569:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 )
            // InternalSensidl.g:5570:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSensidl.g:5577:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5581:1: ( ( ',' ) )
            // InternalSensidl.g:5582:1: ( ',' )
            {
            // InternalSensidl.g:5582:1: ( ',' )
            // InternalSensidl.g:5583:1: ','
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
    // InternalSensidl.g:5596:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5600:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl )
            // InternalSensidl.g:5601:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl
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
    // InternalSensidl.g:5607:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5611:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) )
            // InternalSensidl.g:5612:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            {
            // InternalSensidl.g:5612:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            // InternalSensidl.g:5613:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_1_1()); 
            // InternalSensidl.g:5614:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            // InternalSensidl.g:5614:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1
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
    // InternalSensidl.g:5628:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5632:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 )
            // InternalSensidl.g:5633:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1
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
    // InternalSensidl.g:5640:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5644:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) )
            // InternalSensidl.g:5645:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            {
            // InternalSensidl.g:5645:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            // InternalSensidl.g:5646:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_0()); 
            // InternalSensidl.g:5647:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            // InternalSensidl.g:5647:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0
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
    // InternalSensidl.g:5657:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5661:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl )
            // InternalSensidl.g:5662:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl
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
    // InternalSensidl.g:5668:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5672:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) )
            // InternalSensidl.g:5673:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            {
            // InternalSensidl.g:5673:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            // InternalSensidl.g:5674:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1_1()); 
            // InternalSensidl.g:5675:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSensidl.g:5675:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0
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
    // InternalSensidl.g:5689:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5693:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 )
            // InternalSensidl.g:5694:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSensidl.g:5701:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5705:1: ( ( ',' ) )
            // InternalSensidl.g:5706:1: ( ',' )
            {
            // InternalSensidl.g:5706:1: ( ',' )
            // InternalSensidl.g:5707:1: ','
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
    // InternalSensidl.g:5720:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5724:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl )
            // InternalSensidl.g:5725:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl
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
    // InternalSensidl.g:5731:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5735:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) )
            // InternalSensidl.g:5736:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            {
            // InternalSensidl.g:5736:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            // InternalSensidl.g:5737:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_1_1()); 
            // InternalSensidl.g:5738:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            // InternalSensidl.g:5738:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1
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
    // InternalSensidl.g:5752:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5756:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:5757:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:5764:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5768:1: ( ( 'with range' ) )
            // InternalSensidl.g:5769:1: ( 'with range' )
            {
            // InternalSensidl.g:5769:1: ( 'with range' )
            // InternalSensidl.g:5770:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSensidl.g:5783:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5787:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:5788:2: rule__DataRange__Group__1__Impl
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
    // InternalSensidl.g:5794:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5798:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:5799:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:5799:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:5800:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:5801:1: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:5801:2: rule__DataRange__RangeAssignment_1
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
    // InternalSensidl.g:5815:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5819:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:5820:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
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
    // InternalSensidl.g:5827:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5831:1: ( ( '[' ) )
            // InternalSensidl.g:5832:1: ( '[' )
            {
            // InternalSensidl.g:5832:1: ( '[' )
            // InternalSensidl.g:5833:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSensidl.g:5846:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5850:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:5851:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalSensidl.g:5858:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5862:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:5863:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:5863:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:5864:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:5865:1: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:5865:2: rule__Interval__LowerBoundAssignment_1
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
    // InternalSensidl.g:5875:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5879:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:5880:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
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
    // InternalSensidl.g:5887:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5891:1: ( ( ';' ) )
            // InternalSensidl.g:5892:1: ( ';' )
            {
            // InternalSensidl.g:5892:1: ( ';' )
            // InternalSensidl.g:5893:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSensidl.g:5906:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5910:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:5911:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalSensidl.g:5918:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5922:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:5923:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:5923:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:5924:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:5925:1: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:5925:2: rule__Interval__UpperBoundAssignment_3
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
    // InternalSensidl.g:5935:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5939:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:5940:2: rule__Interval__Group__4__Impl
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
    // InternalSensidl.g:5946:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5950:1: ( ( ']' ) )
            // InternalSensidl.g:5951:1: ( ']' )
            {
            // InternalSensidl.g:5951:1: ( ']' )
            // InternalSensidl.g:5952:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSensidl.g:5975:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5979:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:5980:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
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
    // InternalSensidl.g:5987:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5991:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:5992:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:5992:1: ( 'with scaling factor' )
            // InternalSensidl.g:5993:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSensidl.g:6006:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6010:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:6011:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
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
    // InternalSensidl.g:6018:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6022:1: ( ( ':' ) )
            // InternalSensidl.g:6023:1: ( ':' )
            {
            // InternalSensidl.g:6023:1: ( ':' )
            // InternalSensidl.g:6024:1: ':'
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
    // InternalSensidl.g:6037:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6041:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:6042:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:6049:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6053:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:6054:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:6054:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:6055:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:6056:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:6056:2: rule__LinearDataConversion__ScalingFactorAssignment_2
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
    // InternalSensidl.g:6066:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6070:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:6071:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
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
    // InternalSensidl.g:6078:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6082:1: ( ( 'and offset' ) )
            // InternalSensidl.g:6083:1: ( 'and offset' )
            {
            // InternalSensidl.g:6083:1: ( 'and offset' )
            // InternalSensidl.g:6084:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSensidl.g:6097:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6101:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:6102:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
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
    // InternalSensidl.g:6109:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6113:1: ( ( ':' ) )
            // InternalSensidl.g:6114:1: ( ':' )
            {
            // InternalSensidl.g:6114:1: ( ':' )
            // InternalSensidl.g:6115:1: ':'
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
    // InternalSensidl.g:6128:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6132:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:6133:2: rule__LinearDataConversion__Group__5__Impl
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
    // InternalSensidl.g:6139:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6143:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:6144:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:6144:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:6145:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:6146:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:6146:2: rule__LinearDataConversion__OffsetAssignment_5
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
    // InternalSensidl.g:6168:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6172:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:6173:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:6180:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6184:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:6185:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:6185:1: ( 'by linear mapping' )
            // InternalSensidl.g:6186:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSensidl.g:6199:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6203:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:6204:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalSensidl.g:6211:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6215:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:6216:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:6216:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:6217:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:6218:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:6218:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
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
    // InternalSensidl.g:6228:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6232:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:6233:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:6240:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6244:1: ( ( '=>' ) )
            // InternalSensidl.g:6245:1: ( '=>' )
            {
            // InternalSensidl.g:6245:1: ( '=>' )
            // InternalSensidl.g:6246:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSensidl.g:6259:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6263:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:6264:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalSensidl.g:6271:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6275:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:6276:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:6276:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:6277:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:6278:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:6278:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
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
    // InternalSensidl.g:6288:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6292:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:6293:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalSensidl.g:6300:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6304:1: ( ( 'as' ) )
            // InternalSensidl.g:6305:1: ( 'as' )
            {
            // InternalSensidl.g:6305:1: ( 'as' )
            // InternalSensidl.g:6306:1: 'as'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getAsKeyword_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSensidl.g:6319:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6323:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:6324:2: rule__LinearDataConversionWithInterval__Group__5__Impl
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
    // InternalSensidl.g:6330:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6334:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:6335:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:6335:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:6336:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:6337:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:6337:2: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
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
    // InternalSensidl.g:6359:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6363:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:6364:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSensidl.g:6371:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6375:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6376:1: ( RULE_INT )
            {
            // InternalSensidl.g:6376:1: ( RULE_INT )
            // InternalSensidl.g:6377:1: RULE_INT
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
    // InternalSensidl.g:6388:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6392:1: ( rule__DOUBLE__Group__1__Impl )
            // InternalSensidl.g:6393:2: rule__DOUBLE__Group__1__Impl
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
    // InternalSensidl.g:6399:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6403:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // InternalSensidl.g:6404:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // InternalSensidl.g:6404:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // InternalSensidl.g:6405:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // InternalSensidl.g:6406:1: ( rule__DOUBLE__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==59) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSensidl.g:6406:2: rule__DOUBLE__Group_1__0
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
    // InternalSensidl.g:6420:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6424:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalSensidl.g:6425:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
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
    // InternalSensidl.g:6432:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6436:1: ( ( '.' ) )
            // InternalSensidl.g:6437:1: ( '.' )
            {
            // InternalSensidl.g:6437:1: ( '.' )
            // InternalSensidl.g:6438:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSensidl.g:6451:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6455:1: ( rule__DOUBLE__Group_1__1__Impl )
            // InternalSensidl.g:6456:2: rule__DOUBLE__Group_1__1__Impl
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
    // InternalSensidl.g:6462:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6466:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6467:1: ( RULE_INT )
            {
            // InternalSensidl.g:6467:1: ( RULE_INT )
            // InternalSensidl.g:6468:1: RULE_INT
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
    // InternalSensidl.g:6483:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6487:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:6488:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSensidl.g:6495:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6499:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6500:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6500:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6501:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:6502:1: ( RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==EOF||(LA53_2>=RULE_ID && LA53_2<=RULE_DESCRIPTION)||(LA53_2>=30 && LA53_2<=31)||(LA53_2>=46 && LA53_2<=47)||LA53_2==50||(LA53_2>=60 && LA53_2<=63)) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalSensidl.g:6502:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_52); 

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalSensidl.g:6512:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6516:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:6517:2: rule__UNIT__Group__1__Impl
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
    // InternalSensidl.g:6523:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6527:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:6528:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:6528:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:6529:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:6530:1: ( rule__UNIT__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ANY_OTHER) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalSensidl.g:6530:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalSensidl.g:6544:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6548:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:6549:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
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
    // InternalSensidl.g:6556:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6560:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:6561:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:6561:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:6562:1: RULE_ANY_OTHER
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
    // InternalSensidl.g:6573:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6577:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:6578:2: rule__UNIT__Group_1__1__Impl
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
    // InternalSensidl.g:6584:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6588:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6589:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6589:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6590:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:6591:1: ( RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==EOF||(LA55_2>=RULE_ID && LA55_2<=RULE_DESCRIPTION)||(LA55_2>=30 && LA55_2<=31)||(LA55_2>=46 && LA55_2<=47)||LA55_2==50||(LA55_2>=60 && LA55_2<=63)) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalSensidl.g:6591:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_52); 

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalSensidl.g:6606:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6610:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6611:1: ( RULE_ID )
            {
            // InternalSensidl.g:6611:1: ( RULE_ID )
            // InternalSensidl.g:6612:1: RULE_ID
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
    // InternalSensidl.g:6621:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6625:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6626:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6626:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6627:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:6636:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6640:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6641:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6641:1: ( RULE_STRING )
            // InternalSensidl.g:6642:1: RULE_STRING
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
    // InternalSensidl.g:6651:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6655:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:6656:1: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:6656:1: ( ruleEncodingSettings )
            // InternalSensidl.g:6657:1: ruleEncodingSettings
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
    // InternalSensidl.g:6666:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6670:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:6671:1: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:6671:1: ( ruleSensorDataDescription )
            // InternalSensidl.g:6672:1: ruleSensorDataDescription
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
    // InternalSensidl.g:6681:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6685:1: ( ( ruleCoding ) )
            // InternalSensidl.g:6686:1: ( ruleCoding )
            {
            // InternalSensidl.g:6686:1: ( ruleCoding )
            // InternalSensidl.g:6687:1: ruleCoding
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
    // InternalSensidl.g:6696:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6700:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:6701:1: ( ruleEndianness )
            {
            // InternalSensidl.g:6701:1: ( ruleEndianness )
            // InternalSensidl.g:6702:1: ruleEndianness
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
    // InternalSensidl.g:6711:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6715:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6716:1: ( RULE_INT )
            {
            // InternalSensidl.g:6716:1: ( RULE_INT )
            // InternalSensidl.g:6717:1: RULE_INT
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
    // InternalSensidl.g:6726:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6730:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6731:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6731:1: ( RULE_STRING )
            // InternalSensidl.g:6732:1: RULE_STRING
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
    // InternalSensidl.g:6741:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6745:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6746:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6746:1: ( RULE_STRING )
            // InternalSensidl.g:6747:1: RULE_STRING
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
    // InternalSensidl.g:6756:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6760:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:6761:1: ( ruleDataSet )
            {
            // InternalSensidl.g:6761:1: ( ruleDataSet )
            // InternalSensidl.g:6762:1: ruleDataSet
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
    // InternalSensidl.g:6771:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6775:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6776:1: ( RULE_ID )
            {
            // InternalSensidl.g:6776:1: ( RULE_ID )
            // InternalSensidl.g:6777:1: RULE_ID
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
    // InternalSensidl.g:6786:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6790:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6791:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6791:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6792:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:6793:1: ( RULE_ID )
            // InternalSensidl.g:6794:1: RULE_ID
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
    // InternalSensidl.g:6805:1: rule__DataSet__ParentDataSetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6809:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6810:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6810:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6811:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 
            // InternalSensidl.g:6812:1: ( RULE_ID )
            // InternalSensidl.g:6813:1: RULE_ID
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
    // InternalSensidl.g:6824:1: rule__DataSet__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6828:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6829:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6829:1: ( RULE_STRING )
            // InternalSensidl.g:6830:1: RULE_STRING
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
    // InternalSensidl.g:6839:1: rule__DataSet__DescriptionAssignment_5 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6843:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6844:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6844:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6845:1: RULE_DESCRIPTION
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


    // $ANTLR start "rule__DataSet__DataAssignment_7_0"
    // InternalSensidl.g:6854:1: rule__DataSet__DataAssignment_7_0 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6858:1: ( ( ruleData ) )
            // InternalSensidl.g:6859:1: ( ruleData )
            {
            // InternalSensidl.g:6859:1: ( ruleData )
            // InternalSensidl.g:6860:1: ruleData
            {
             before(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataSetAccess().getDataDataParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__DataAssignment_7_0"


    // $ANTLR start "rule__DataSet__MethodAssignment_7_1"
    // InternalSensidl.g:6869:1: rule__DataSet__MethodAssignment_7_1 : ( ruleMethod ) ;
    public final void rule__DataSet__MethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6873:1: ( ( ruleMethod ) )
            // InternalSensidl.g:6874:1: ( ruleMethod )
            {
            // InternalSensidl.g:6874:1: ( ruleMethod )
            // InternalSensidl.g:6875:1: ruleMethod
            {
             before(grammarAccess.getDataSetAccess().getMethodMethodParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getDataSetAccess().getMethodMethodParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__MethodAssignment_7_1"


    // $ANTLR start "rule__Method__VisibilityAssignment_0_0"
    // InternalSensidl.g:6884:1: rule__Method__VisibilityAssignment_0_0 : ( ( '+' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6888:1: ( ( ( '+' ) ) )
            // InternalSensidl.g:6889:1: ( ( '+' ) )
            {
            // InternalSensidl.g:6889:1: ( ( '+' ) )
            // InternalSensidl.g:6890:1: ( '+' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            // InternalSensidl.g:6891:1: ( '+' )
            // InternalSensidl.g:6892:1: '+'
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 

            }

             after(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VisibilityAssignment_0_0"


    // $ANTLR start "rule__Method__VisibilityAssignment_0_1"
    // InternalSensidl.g:6907:1: rule__Method__VisibilityAssignment_0_1 : ( ( '-' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6911:1: ( ( ( '-' ) ) )
            // InternalSensidl.g:6912:1: ( ( '-' ) )
            {
            // InternalSensidl.g:6912:1: ( ( '-' ) )
            // InternalSensidl.g:6913:1: ( '-' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 
            // InternalSensidl.g:6914:1: ( '-' )
            // InternalSensidl.g:6915:1: '-'
            {
             before(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 

            }

             after(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VisibilityAssignment_0_1"


    // $ANTLR start "rule__Method__VisibilityAssignment_0_2"
    // InternalSensidl.g:6930:1: rule__Method__VisibilityAssignment_0_2 : ( ( '#' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6934:1: ( ( ( '#' ) ) )
            // InternalSensidl.g:6935:1: ( ( '#' ) )
            {
            // InternalSensidl.g:6935:1: ( ( '#' ) )
            // InternalSensidl.g:6936:1: ( '#' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 
            // InternalSensidl.g:6937:1: ( '#' )
            // InternalSensidl.g:6938:1: '#'
            {
             before(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 

            }

             after(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VisibilityAssignment_0_2"


    // $ANTLR start "rule__Method__VisibilityAssignment_0_3"
    // InternalSensidl.g:6953:1: rule__Method__VisibilityAssignment_0_3 : ( ( '~' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6957:1: ( ( ( '~' ) ) )
            // InternalSensidl.g:6958:1: ( ( '~' ) )
            {
            // InternalSensidl.g:6958:1: ( ( '~' ) )
            // InternalSensidl.g:6959:1: ( '~' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 
            // InternalSensidl.g:6960:1: ( '~' )
            // InternalSensidl.g:6961:1: '~'
            {
             before(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 

            }

             after(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VisibilityAssignment_0_3"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalSensidl.g:6976:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6980:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6981:1: ( RULE_ID )
            {
            // InternalSensidl.g:6981:1: ( RULE_ID )
            // InternalSensidl.g:6982:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ParameterAssignment_3"
    // InternalSensidl.g:6991:1: rule__Method__ParameterAssignment_3 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6995:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:6996:1: ( ruleMethodParameter )
            {
            // InternalSensidl.g:6996:1: ( ruleMethodParameter )
            // InternalSensidl.g:6997:1: ruleMethodParameter
            {
             before(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_3"


    // $ANTLR start "rule__Method__ParameterAssignment_4_1"
    // InternalSensidl.g:7006:1: rule__Method__ParameterAssignment_4_1 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7010:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:7011:1: ( ruleMethodParameter )
            {
            // InternalSensidl.g:7011:1: ( ruleMethodParameter )
            // InternalSensidl.g:7012:1: ruleMethodParameter
            {
             before(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParameterMethodParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParameterAssignment_4_1"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_6_1_0_0"
    // InternalSensidl.g:7021:1: rule__Method__ReturnTypeAssignment_6_1_0_0 : ( ruleDataType ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7025:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7026:1: ( ruleDataType )
            {
            // InternalSensidl.g:7026:1: ( ruleDataType )
            // InternalSensidl.g:7027:1: ruleDataType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataTypeEnumRuleCall_6_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeDataTypeEnumRuleCall_6_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_6_1_0_0"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_6_1_0_1"
    // InternalSensidl.g:7036:1: rule__Method__ReturnTypeAssignment_6_1_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7040:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7041:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7041:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7042:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataTypeNotAdjustableEnumRuleCall_6_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeDataTypeNotAdjustableEnumRuleCall_6_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_6_1_0_1"


    // $ANTLR start "rule__Method__ReturnTypeDataSetAssignment_6_1_1"
    // InternalSensidl.g:7051:1: rule__Method__ReturnTypeDataSetAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypeDataSetAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7055:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7056:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7056:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7057:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0()); 
            // InternalSensidl.g:7058:1: ( RULE_ID )
            // InternalSensidl.g:7059:1: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetIDTerminalRuleCall_6_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetIDTerminalRuleCall_6_1_1_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeDataSetAssignment_6_1_1"


    // $ANTLR start "rule__Method__IDAssignment_9_2"
    // InternalSensidl.g:7070:1: rule__Method__IDAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Method__IDAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7074:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7075:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7075:1: ( RULE_STRING )
            // InternalSensidl.g:7076:1: RULE_STRING
            {
             before(grammarAccess.getMethodAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getIDSTRINGTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__IDAssignment_9_2"


    // $ANTLR start "rule__Method__DescriptionAssignment_10"
    // InternalSensidl.g:7085:1: rule__Method__DescriptionAssignment_10 : ( RULE_DESCRIPTION ) ;
    public final void rule__Method__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7089:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7090:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7090:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7091:1: RULE_DESCRIPTION
            {
             before(grammarAccess.getMethodAccess().getDescriptionDESCRIPTIONTerminalRuleCall_10_0()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getDescriptionDESCRIPTIONTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__DescriptionAssignment_10"


    // $ANTLR start "rule__MethodParameter__DataTypeAssignment_0_0_0"
    // InternalSensidl.g:7100:1: rule__MethodParameter__DataTypeAssignment_0_0_0 : ( ruleDataType ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7104:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7105:1: ( ruleDataType )
            {
            // InternalSensidl.g:7105:1: ( ruleDataType )
            // InternalSensidl.g:7106:1: ruleDataType
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeEnumRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeEnumRuleCall_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__DataTypeAssignment_0_0_0"


    // $ANTLR start "rule__MethodParameter__DataTypeAssignment_0_0_1"
    // InternalSensidl.g:7115:1: rule__MethodParameter__DataTypeAssignment_0_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7119:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7120:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7120:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7121:1: ruleDataTypeNotAdjustable
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeNotAdjustable();

            state._fsp--;

             after(grammarAccess.getMethodParameterAccess().getDataTypeDataTypeNotAdjustableEnumRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__DataTypeAssignment_0_0_1"


    // $ANTLR start "rule__MethodParameter__DataTypeDataSetAssignment_0_1"
    // InternalSensidl.g:7130:1: rule__MethodParameter__DataTypeDataSetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodParameter__DataTypeDataSetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7134:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7135:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7135:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7136:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0()); 
            // InternalSensidl.g:7137:1: ( RULE_ID )
            // InternalSensidl.g:7138:1: RULE_ID
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__DataTypeDataSetAssignment_0_1"


    // $ANTLR start "rule__MethodParameter__NameAssignment_1"
    // InternalSensidl.g:7149:1: rule__MethodParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7153:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7154:1: ( RULE_ID )
            {
            // InternalSensidl.g:7154:1: ( RULE_ID )
            // InternalSensidl.g:7155:1: RULE_ID
            {
             before(grammarAccess.getMethodParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParameter__NameAssignment_1"


    // $ANTLR start "rule__MeasurementData__NameAssignment_0"
    // InternalSensidl.g:7164:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7168:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7169:1: ( RULE_ID )
            {
            // InternalSensidl.g:7169:1: ( RULE_ID )
            // InternalSensidl.g:7170:1: RULE_ID
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
    // InternalSensidl.g:7179:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7183:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7184:1: ( ruleDataType )
            {
            // InternalSensidl.g:7184:1: ( ruleDataType )
            // InternalSensidl.g:7185:1: ruleDataType
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
    // InternalSensidl.g:7194:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7198:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:7199:1: ( ruleUNIT )
            {
            // InternalSensidl.g:7199:1: ( ruleUNIT )
            // InternalSensidl.g:7200:1: ruleUNIT
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
    // InternalSensidl.g:7209:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7213:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7214:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7214:1: ( RULE_STRING )
            // InternalSensidl.g:7215:1: RULE_STRING
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
    // InternalSensidl.g:7224:1: rule__MeasurementData__AdjustmentsAssignment_6_0_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7228:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:7229:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:7229:1: ( ruleDataConversion )
            // InternalSensidl.g:7230:1: ruleDataConversion
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
    // InternalSensidl.g:7239:1: rule__MeasurementData__AdjustmentsAssignment_6_1_1 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7243:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:7244:1: ( ruleDataRange )
            {
            // InternalSensidl.g:7244:1: ( ruleDataRange )
            // InternalSensidl.g:7245:1: ruleDataRange
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
    // InternalSensidl.g:7254:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7258:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:7259:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:7259:1: ( ruleDataConversion )
            // InternalSensidl.g:7260:1: ruleDataConversion
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
    // InternalSensidl.g:7269:1: rule__MeasurementData__AdjustmentsAssignment_6_2_3 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7273:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:7274:1: ( ruleDataRange )
            {
            // InternalSensidl.g:7274:1: ( ruleDataRange )
            // InternalSensidl.g:7275:1: ruleDataRange
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
    // InternalSensidl.g:7284:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7288:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7289:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7289:1: ( ( 'setter' ) )
            // InternalSensidl.g:7290:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            // InternalSensidl.g:7291:1: ( 'setter' )
            // InternalSensidl.g:7292:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7307:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7311:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7312:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7312:1: ( ( 'getter' ) )
            // InternalSensidl.g:7313:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            // InternalSensidl.g:7314:1: ( 'getter' )
            // InternalSensidl.g:7315:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7330:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7334:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7335:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7335:1: ( ( 'getter' ) )
            // InternalSensidl.g:7336:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            // InternalSensidl.g:7337:1: ( 'getter' )
            // InternalSensidl.g:7338:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7353:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7357:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7358:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7358:1: ( ( 'setter' ) )
            // InternalSensidl.g:7359:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            // InternalSensidl.g:7360:1: ( 'setter' )
            // InternalSensidl.g:7361:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7376:1: rule__MeasurementData__DescriptionAssignment_8 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7380:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7381:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7381:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7382:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7391:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7395:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7396:1: ( RULE_ID )
            {
            // InternalSensidl.g:7396:1: ( RULE_ID )
            // InternalSensidl.g:7397:1: RULE_ID
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
    // InternalSensidl.g:7406:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7410:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7411:1: ( ruleDataType )
            {
            // InternalSensidl.g:7411:1: ( ruleDataType )
            // InternalSensidl.g:7412:1: ruleDataType
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
    // InternalSensidl.g:7421:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7425:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7426:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7426:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7427:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7436:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7440:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:7441:1: ( ( 'constant' ) )
            {
            // InternalSensidl.g:7441:1: ( ( 'constant' ) )
            // InternalSensidl.g:7442:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // InternalSensidl.g:7443:1: ( 'constant' )
            // InternalSensidl.g:7444:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:7459:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7463:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7464:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7464:1: ( RULE_STRING )
            // InternalSensidl.g:7465:1: RULE_STRING
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
    // InternalSensidl.g:7474:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7478:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7479:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7479:1: ( RULE_STRING )
            // InternalSensidl.g:7480:1: RULE_STRING
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
    // InternalSensidl.g:7489:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7493:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7494:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7494:1: ( ( 'setter' ) )
            // InternalSensidl.g:7495:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 
            // InternalSensidl.g:7496:1: ( 'setter' )
            // InternalSensidl.g:7497:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7512:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7516:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7517:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7517:1: ( ( 'getter' ) )
            // InternalSensidl.g:7518:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 
            // InternalSensidl.g:7519:1: ( 'getter' )
            // InternalSensidl.g:7520:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7535:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7539:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7540:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7540:1: ( ( 'getter' ) )
            // InternalSensidl.g:7541:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 
            // InternalSensidl.g:7542:1: ( 'getter' )
            // InternalSensidl.g:7543:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7558:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7562:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7563:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7563:1: ( ( 'setter' ) )
            // InternalSensidl.g:7564:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 
            // InternalSensidl.g:7565:1: ( 'setter' )
            // InternalSensidl.g:7566:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7581:1: rule__NonMeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7585:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7586:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7586:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7587:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7596:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7600:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7601:1: ( RULE_ID )
            {
            // InternalSensidl.g:7601:1: ( RULE_ID )
            // InternalSensidl.g:7602:1: RULE_ID
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
    // InternalSensidl.g:7611:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7615:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7616:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7616:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7617:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7626:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7630:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:7631:1: ( ruleUNIT )
            {
            // InternalSensidl.g:7631:1: ( ruleUNIT )
            // InternalSensidl.g:7632:1: ruleUNIT
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
    // InternalSensidl.g:7641:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7645:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7646:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7646:1: ( RULE_STRING )
            // InternalSensidl.g:7647:1: RULE_STRING
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
    // InternalSensidl.g:7656:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7660:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7661:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7661:1: ( ( 'setter' ) )
            // InternalSensidl.g:7662:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            // InternalSensidl.g:7663:1: ( 'setter' )
            // InternalSensidl.g:7664:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7679:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7683:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7684:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7684:1: ( ( 'getter' ) )
            // InternalSensidl.g:7685:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            // InternalSensidl.g:7686:1: ( 'getter' )
            // InternalSensidl.g:7687:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7702:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7706:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7707:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7707:1: ( ( 'getter' ) )
            // InternalSensidl.g:7708:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            // InternalSensidl.g:7709:1: ( 'getter' )
            // InternalSensidl.g:7710:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7725:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7729:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7730:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7730:1: ( ( 'setter' ) )
            // InternalSensidl.g:7731:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            // InternalSensidl.g:7732:1: ( 'setter' )
            // InternalSensidl.g:7733:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7748:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7752:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7753:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7753:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7754:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7763:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7767:1: ( ( ruleInterval ) )
            // InternalSensidl.g:7768:1: ( ruleInterval )
            {
            // InternalSensidl.g:7768:1: ( ruleInterval )
            // InternalSensidl.g:7769:1: ruleInterval
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
    // InternalSensidl.g:7778:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7782:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7783:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7783:1: ( ruleDOUBLE )
            // InternalSensidl.g:7784:1: ruleDOUBLE
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
    // InternalSensidl.g:7793:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7797:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7798:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7798:1: ( ruleDOUBLE )
            // InternalSensidl.g:7799:1: ruleDOUBLE
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
    // InternalSensidl.g:7808:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7812:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7813:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7813:1: ( ruleDOUBLE )
            // InternalSensidl.g:7814:1: ruleDOUBLE
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
    // InternalSensidl.g:7823:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7827:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7828:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7828:1: ( ruleDOUBLE )
            // InternalSensidl.g:7829:1: ruleDOUBLE
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
    // InternalSensidl.g:7838:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7842:1: ( ( ruleInterval ) )
            // InternalSensidl.g:7843:1: ( ruleInterval )
            {
            // InternalSensidl.g:7843:1: ( ruleInterval )
            // InternalSensidl.g:7844:1: ruleInterval
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
    // InternalSensidl.g:7853:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7857:1: ( ( ruleInterval ) )
            // InternalSensidl.g:7858:1: ( ruleInterval )
            {
            // InternalSensidl.g:7858:1: ( ruleInterval )
            // InternalSensidl.g:7859:1: ruleInterval
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
    // InternalSensidl.g:7868:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7872:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7873:1: ( ruleDataType )
            {
            // InternalSensidl.g:7873:1: ( ruleDataType )
            // InternalSensidl.g:7874:1: ruleDataType
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\3\uffff\14\20\3\uffff";
    static final String dfa_3s = "\1\5\1\53\1\20\14\5\3\uffff";
    static final String dfa_4s = "\1\5\1\53\1\33\14\102\3\uffff";
    static final String dfa_5s = "\17\uffff\1\3\1\2\1\1";
    static final String dfa_6s = "\22\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\17\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\17\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\15\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "756:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) );";
        }
    }
    static final String dfa_8s = "\56\uffff";
    static final String dfa_9s = "\21\uffff\1\26\7\uffff\1\26\12\uffff\12\26";
    static final String dfa_10s = "\1\56\1\63\1\40\1\64\1\uffff\2\4\1\70\1\65\1\4\1\40\2\4\1\70\1\4\1\65\1\66\1\5\1\4\1\72\1\4\2\uffff\1\66\1\64\1\5\1\4\1\65\2\4\1\65\1\66\1\4\1\53\1\66\1\22\12\5";
    static final String dfa_11s = "\1\56\1\71\1\40\1\64\1\uffff\2\4\2\73\1\4\1\40\2\4\1\70\1\4\1\65\1\73\1\77\1\4\1\72\1\4\2\uffff\1\66\1\64\1\77\1\4\1\73\2\4\1\65\1\73\1\4\1\53\1\66\1\33\12\77";
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
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\13\uffff\1\24\4\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\23",
            "\1\32",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
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
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\14\uffff\1\26\14\uffff\4\26"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "784:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );";
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xF000000040000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xF000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xF000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000004040FFF0020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000FFF0020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00080000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001800080000080L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000080000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000042L});

}