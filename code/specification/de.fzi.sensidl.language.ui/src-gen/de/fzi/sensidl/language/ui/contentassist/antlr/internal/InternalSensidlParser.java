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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'('", "')'", "'as'", "'Method'", "'list'", "'of'", "'in'", "'adjusted'", "'exclude:'", "'value'", "'='", "'exclude'", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'-'", "'.'", "'+'", "'#'", "'~'", "'setter'", "'getter'", "'constant'"
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
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


    // $ANTLR start "entryRuleListData"
    // InternalSensidl.g:256:1: entryRuleListData : ruleListData EOF ;
    public final void entryRuleListData() throws RecognitionException {
        try {
            // InternalSensidl.g:257:1: ( ruleListData EOF )
            // InternalSensidl.g:258:1: ruleListData EOF
            {
             before(grammarAccess.getListDataRule()); 
            pushFollow(FOLLOW_1);
            ruleListData();

            state._fsp--;

             after(grammarAccess.getListDataRule()); 
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
    // $ANTLR end "entryRuleListData"


    // $ANTLR start "ruleListData"
    // InternalSensidl.g:265:1: ruleListData : ( ( rule__ListData__Group__0 ) ) ;
    public final void ruleListData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:269:2: ( ( ( rule__ListData__Group__0 ) ) )
            // InternalSensidl.g:270:1: ( ( rule__ListData__Group__0 ) )
            {
            // InternalSensidl.g:270:1: ( ( rule__ListData__Group__0 ) )
            // InternalSensidl.g:271:1: ( rule__ListData__Group__0 )
            {
             before(grammarAccess.getListDataAccess().getGroup()); 
            // InternalSensidl.g:272:1: ( rule__ListData__Group__0 )
            // InternalSensidl.g:272:2: rule__ListData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListData"


    // $ANTLR start "entryRuleMeasurementData"
    // InternalSensidl.g:284:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:285:1: ( ruleMeasurementData EOF )
            // InternalSensidl.g:286:1: ruleMeasurementData EOF
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
    // InternalSensidl.g:293:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:297:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // InternalSensidl.g:298:1: ( ( rule__MeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:298:1: ( ( rule__MeasurementData__Group__0 ) )
            // InternalSensidl.g:299:1: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:300:1: ( rule__MeasurementData__Group__0 )
            // InternalSensidl.g:300:2: rule__MeasurementData__Group__0
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
    // InternalSensidl.g:312:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:313:1: ( ruleNonMeasurementData EOF )
            // InternalSensidl.g:314:1: ruleNonMeasurementData EOF
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
    // InternalSensidl.g:321:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:325:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // InternalSensidl.g:326:1: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:326:1: ( ( rule__NonMeasurementData__Group__0 ) )
            // InternalSensidl.g:327:1: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:328:1: ( rule__NonMeasurementData__Group__0 )
            // InternalSensidl.g:328:2: rule__NonMeasurementData__Group__0
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
    // InternalSensidl.g:340:1: entryRuleMeasurementDataNotAdjustable : ruleMeasurementDataNotAdjustable EOF ;
    public final void entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        try {
            // InternalSensidl.g:341:1: ( ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:342:1: ruleMeasurementDataNotAdjustable EOF
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
    // InternalSensidl.g:349:1: ruleMeasurementDataNotAdjustable : ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) ;
    public final void ruleMeasurementDataNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:353:2: ( ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) )
            // InternalSensidl.g:354:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            {
            // InternalSensidl.g:354:1: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            // InternalSensidl.g:355:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 
            // InternalSensidl.g:356:1: ( rule__MeasurementDataNotAdjustable__Group__0 )
            // InternalSensidl.g:356:2: rule__MeasurementDataNotAdjustable__Group__0
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
    // InternalSensidl.g:368:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // InternalSensidl.g:369:1: ( ruleDataRange EOF )
            // InternalSensidl.g:370:1: ruleDataRange EOF
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
    // InternalSensidl.g:377:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:381:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // InternalSensidl.g:382:1: ( ( rule__DataRange__Group__0 ) )
            {
            // InternalSensidl.g:382:1: ( ( rule__DataRange__Group__0 ) )
            // InternalSensidl.g:383:1: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // InternalSensidl.g:384:1: ( rule__DataRange__Group__0 )
            // InternalSensidl.g:384:2: rule__DataRange__Group__0
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
    // InternalSensidl.g:396:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:397:1: ( ruleInterval EOF )
            // InternalSensidl.g:398:1: ruleInterval EOF
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
    // InternalSensidl.g:405:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:409:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSensidl.g:410:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSensidl.g:410:1: ( ( rule__Interval__Group__0 ) )
            // InternalSensidl.g:411:1: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSensidl.g:412:1: ( rule__Interval__Group__0 )
            // InternalSensidl.g:412:2: rule__Interval__Group__0
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
    // InternalSensidl.g:424:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:425:1: ( ruleDataConversion EOF )
            // InternalSensidl.g:426:1: ruleDataConversion EOF
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
    // InternalSensidl.g:433:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:437:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // InternalSensidl.g:438:1: ( ( rule__DataConversion__Alternatives ) )
            {
            // InternalSensidl.g:438:1: ( ( rule__DataConversion__Alternatives ) )
            // InternalSensidl.g:439:1: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // InternalSensidl.g:440:1: ( rule__DataConversion__Alternatives )
            // InternalSensidl.g:440:2: rule__DataConversion__Alternatives
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
    // InternalSensidl.g:452:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:453:1: ( ruleLinearDataConversion EOF )
            // InternalSensidl.g:454:1: ruleLinearDataConversion EOF
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
    // InternalSensidl.g:461:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:465:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // InternalSensidl.g:466:1: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // InternalSensidl.g:466:1: ( ( rule__LinearDataConversion__Group__0 ) )
            // InternalSensidl.g:467:1: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // InternalSensidl.g:468:1: ( rule__LinearDataConversion__Group__0 )
            // InternalSensidl.g:468:2: rule__LinearDataConversion__Group__0
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
    // InternalSensidl.g:480:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:481:1: ( ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:482:1: ruleLinearDataConversionWithInterval EOF
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
    // InternalSensidl.g:489:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:493:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // InternalSensidl.g:494:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // InternalSensidl.g:494:1: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // InternalSensidl.g:495:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // InternalSensidl.g:496:1: ( rule__LinearDataConversionWithInterval__Group__0 )
            // InternalSensidl.g:496:2: rule__LinearDataConversionWithInterval__Group__0
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
    // InternalSensidl.g:508:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalSensidl.g:509:1: ( ruleDOUBLE EOF )
            // InternalSensidl.g:510:1: ruleDOUBLE EOF
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
    // InternalSensidl.g:517:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:521:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalSensidl.g:522:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalSensidl.g:522:1: ( ( rule__DOUBLE__Group__0 ) )
            // InternalSensidl.g:523:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalSensidl.g:524:1: ( rule__DOUBLE__Group__0 )
            // InternalSensidl.g:524:2: rule__DOUBLE__Group__0
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
    // InternalSensidl.g:536:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // InternalSensidl.g:537:1: ( ruleUNIT EOF )
            // InternalSensidl.g:538:1: ruleUNIT EOF
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
    // InternalSensidl.g:545:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:549:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // InternalSensidl.g:550:1: ( ( rule__UNIT__Group__0 ) )
            {
            // InternalSensidl.g:550:1: ( ( rule__UNIT__Group__0 ) )
            // InternalSensidl.g:551:1: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // InternalSensidl.g:552:1: ( rule__UNIT__Group__0 )
            // InternalSensidl.g:552:2: rule__UNIT__Group__0
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
    // InternalSensidl.g:565:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:569:1: ( ( ( rule__Coding__Alternatives ) ) )
            // InternalSensidl.g:570:1: ( ( rule__Coding__Alternatives ) )
            {
            // InternalSensidl.g:570:1: ( ( rule__Coding__Alternatives ) )
            // InternalSensidl.g:571:1: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // InternalSensidl.g:572:1: ( rule__Coding__Alternatives )
            // InternalSensidl.g:572:2: rule__Coding__Alternatives
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
    // InternalSensidl.g:584:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:588:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // InternalSensidl.g:589:1: ( ( rule__Endianness__Alternatives ) )
            {
            // InternalSensidl.g:589:1: ( ( rule__Endianness__Alternatives ) )
            // InternalSensidl.g:590:1: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // InternalSensidl.g:591:1: ( rule__Endianness__Alternatives )
            // InternalSensidl.g:591:2: rule__Endianness__Alternatives
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
    // InternalSensidl.g:603:1: ruleDataTypeNotAdjustable : ( ( rule__DataTypeNotAdjustable__Alternatives ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:607:1: ( ( ( rule__DataTypeNotAdjustable__Alternatives ) ) )
            // InternalSensidl.g:608:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            {
            // InternalSensidl.g:608:1: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            // InternalSensidl.g:609:1: ( rule__DataTypeNotAdjustable__Alternatives )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 
            // InternalSensidl.g:610:1: ( rule__DataTypeNotAdjustable__Alternatives )
            // InternalSensidl.g:610:2: rule__DataTypeNotAdjustable__Alternatives
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
    // InternalSensidl.g:622:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:626:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSensidl.g:627:1: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSensidl.g:627:1: ( ( rule__DataType__Alternatives ) )
            // InternalSensidl.g:628:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSensidl.g:629:1: ( rule__DataType__Alternatives )
            // InternalSensidl.g:629:2: rule__DataType__Alternatives
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
    // InternalSensidl.g:640:1: rule__DataSet__Alternatives_7 : ( ( ( rule__DataSet__DataAssignment_7_0 ) ) | ( ( rule__DataSet__MethodAssignment_7_1 ) ) );
    public final void rule__DataSet__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:644:1: ( ( ( rule__DataSet__DataAssignment_7_0 ) ) | ( ( rule__DataSet__MethodAssignment_7_1 ) ) )
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
            else if ( (LA1_0==61||(LA1_0>=63 && LA1_0<=65)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSensidl.g:645:1: ( ( rule__DataSet__DataAssignment_7_0 ) )
                    {
                    // InternalSensidl.g:645:1: ( ( rule__DataSet__DataAssignment_7_0 ) )
                    // InternalSensidl.g:646:1: ( rule__DataSet__DataAssignment_7_0 )
                    {
                     before(grammarAccess.getDataSetAccess().getDataAssignment_7_0()); 
                    // InternalSensidl.g:647:1: ( rule__DataSet__DataAssignment_7_0 )
                    // InternalSensidl.g:647:2: rule__DataSet__DataAssignment_7_0
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
                    // InternalSensidl.g:651:6: ( ( rule__DataSet__MethodAssignment_7_1 ) )
                    {
                    // InternalSensidl.g:651:6: ( ( rule__DataSet__MethodAssignment_7_1 ) )
                    // InternalSensidl.g:652:1: ( rule__DataSet__MethodAssignment_7_1 )
                    {
                     before(grammarAccess.getDataSetAccess().getMethodAssignment_7_1()); 
                    // InternalSensidl.g:653:1: ( rule__DataSet__MethodAssignment_7_1 )
                    // InternalSensidl.g:653:2: rule__DataSet__MethodAssignment_7_1
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
    // InternalSensidl.g:662:1: rule__Method__Alternatives_0 : ( ( ( rule__Method__VisibilityAssignment_0_0 ) ) | ( ( rule__Method__VisibilityAssignment_0_1 ) ) | ( ( rule__Method__VisibilityAssignment_0_2 ) ) | ( ( rule__Method__VisibilityAssignment_0_3 ) ) );
    public final void rule__Method__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:666:1: ( ( ( rule__Method__VisibilityAssignment_0_0 ) ) | ( ( rule__Method__VisibilityAssignment_0_1 ) ) | ( ( rule__Method__VisibilityAssignment_0_2 ) ) | ( ( rule__Method__VisibilityAssignment_0_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt2=1;
                }
                break;
            case 61:
                {
                alt2=2;
                }
                break;
            case 64:
                {
                alt2=3;
                }
                break;
            case 65:
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
                    // InternalSensidl.g:667:1: ( ( rule__Method__VisibilityAssignment_0_0 ) )
                    {
                    // InternalSensidl.g:667:1: ( ( rule__Method__VisibilityAssignment_0_0 ) )
                    // InternalSensidl.g:668:1: ( rule__Method__VisibilityAssignment_0_0 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_0()); 
                    // InternalSensidl.g:669:1: ( rule__Method__VisibilityAssignment_0_0 )
                    // InternalSensidl.g:669:2: rule__Method__VisibilityAssignment_0_0
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
                    // InternalSensidl.g:673:6: ( ( rule__Method__VisibilityAssignment_0_1 ) )
                    {
                    // InternalSensidl.g:673:6: ( ( rule__Method__VisibilityAssignment_0_1 ) )
                    // InternalSensidl.g:674:1: ( rule__Method__VisibilityAssignment_0_1 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_1()); 
                    // InternalSensidl.g:675:1: ( rule__Method__VisibilityAssignment_0_1 )
                    // InternalSensidl.g:675:2: rule__Method__VisibilityAssignment_0_1
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
                    // InternalSensidl.g:679:6: ( ( rule__Method__VisibilityAssignment_0_2 ) )
                    {
                    // InternalSensidl.g:679:6: ( ( rule__Method__VisibilityAssignment_0_2 ) )
                    // InternalSensidl.g:680:1: ( rule__Method__VisibilityAssignment_0_2 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_2()); 
                    // InternalSensidl.g:681:1: ( rule__Method__VisibilityAssignment_0_2 )
                    // InternalSensidl.g:681:2: rule__Method__VisibilityAssignment_0_2
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
                    // InternalSensidl.g:685:6: ( ( rule__Method__VisibilityAssignment_0_3 ) )
                    {
                    // InternalSensidl.g:685:6: ( ( rule__Method__VisibilityAssignment_0_3 ) )
                    // InternalSensidl.g:686:1: ( rule__Method__VisibilityAssignment_0_3 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_3()); 
                    // InternalSensidl.g:687:1: ( rule__Method__VisibilityAssignment_0_3 )
                    // InternalSensidl.g:687:2: rule__Method__VisibilityAssignment_0_3
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
    // InternalSensidl.g:696:1: rule__Method__Alternatives_6_1 : ( ( ( rule__Method__Alternatives_6_1_0 ) ) | ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) ) );
    public final void rule__Method__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:700:1: ( ( ( rule__Method__Alternatives_6_1_0 ) ) | ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) ) )
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
                    // InternalSensidl.g:701:1: ( ( rule__Method__Alternatives_6_1_0 ) )
                    {
                    // InternalSensidl.g:701:1: ( ( rule__Method__Alternatives_6_1_0 ) )
                    // InternalSensidl.g:702:1: ( rule__Method__Alternatives_6_1_0 )
                    {
                     before(grammarAccess.getMethodAccess().getAlternatives_6_1_0()); 
                    // InternalSensidl.g:703:1: ( rule__Method__Alternatives_6_1_0 )
                    // InternalSensidl.g:703:2: rule__Method__Alternatives_6_1_0
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
                    // InternalSensidl.g:707:6: ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) )
                    {
                    // InternalSensidl.g:707:6: ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) )
                    // InternalSensidl.g:708:1: ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeDataSetAssignment_6_1_1()); 
                    // InternalSensidl.g:709:1: ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 )
                    // InternalSensidl.g:709:2: rule__Method__ReturnTypeDataSetAssignment_6_1_1
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
    // InternalSensidl.g:718:1: rule__Method__Alternatives_6_1_0 : ( ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) ) | ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) ) );
    public final void rule__Method__Alternatives_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:722:1: ( ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) ) | ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) ) )
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
                    // InternalSensidl.g:723:1: ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) )
                    {
                    // InternalSensidl.g:723:1: ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) )
                    // InternalSensidl.g:724:1: ( rule__Method__ReturnTypeAssignment_6_1_0_0 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_0()); 
                    // InternalSensidl.g:725:1: ( rule__Method__ReturnTypeAssignment_6_1_0_0 )
                    // InternalSensidl.g:725:2: rule__Method__ReturnTypeAssignment_6_1_0_0
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
                    // InternalSensidl.g:729:6: ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) )
                    {
                    // InternalSensidl.g:729:6: ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) )
                    // InternalSensidl.g:730:1: ( rule__Method__ReturnTypeAssignment_6_1_0_1 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_1()); 
                    // InternalSensidl.g:731:1: ( rule__Method__ReturnTypeAssignment_6_1_0_1 )
                    // InternalSensidl.g:731:2: rule__Method__ReturnTypeAssignment_6_1_0_1
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
    // InternalSensidl.g:740:1: rule__MethodParameter__Alternatives_0 : ( ( ( rule__MethodParameter__Alternatives_0_0 ) ) | ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) ) );
    public final void rule__MethodParameter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:744:1: ( ( ( rule__MethodParameter__Alternatives_0_0 ) ) | ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) ) )
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
                    // InternalSensidl.g:745:1: ( ( rule__MethodParameter__Alternatives_0_0 ) )
                    {
                    // InternalSensidl.g:745:1: ( ( rule__MethodParameter__Alternatives_0_0 ) )
                    // InternalSensidl.g:746:1: ( rule__MethodParameter__Alternatives_0_0 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getAlternatives_0_0()); 
                    // InternalSensidl.g:747:1: ( rule__MethodParameter__Alternatives_0_0 )
                    // InternalSensidl.g:747:2: rule__MethodParameter__Alternatives_0_0
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
                    // InternalSensidl.g:751:6: ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) )
                    {
                    // InternalSensidl.g:751:6: ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) )
                    // InternalSensidl.g:752:1: ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetAssignment_0_1()); 
                    // InternalSensidl.g:753:1: ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 )
                    // InternalSensidl.g:753:2: rule__MethodParameter__DataTypeDataSetAssignment_0_1
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
    // InternalSensidl.g:762:1: rule__MethodParameter__Alternatives_0_0 : ( ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) ) | ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) ) );
    public final void rule__MethodParameter__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:766:1: ( ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) ) | ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) ) )
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
                    // InternalSensidl.g:767:1: ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) )
                    {
                    // InternalSensidl.g:767:1: ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) )
                    // InternalSensidl.g:768:1: ( rule__MethodParameter__DataTypeAssignment_0_0_0 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_0()); 
                    // InternalSensidl.g:769:1: ( rule__MethodParameter__DataTypeAssignment_0_0_0 )
                    // InternalSensidl.g:769:2: rule__MethodParameter__DataTypeAssignment_0_0_0
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
                    // InternalSensidl.g:773:6: ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) )
                    {
                    // InternalSensidl.g:773:6: ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) )
                    // InternalSensidl.g:774:1: ( rule__MethodParameter__DataTypeAssignment_0_0_1 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_1()); 
                    // InternalSensidl.g:775:1: ( rule__MethodParameter__DataTypeAssignment_0_0_1 )
                    // InternalSensidl.g:775:2: rule__MethodParameter__DataTypeAssignment_0_0_1
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
    // InternalSensidl.g:784:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) | ( ruleListData ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:788:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) | ( ruleListData ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSensidl.g:789:1: ( ruleMeasurementData )
                    {
                    // InternalSensidl.g:789:1: ( ruleMeasurementData )
                    // InternalSensidl.g:790:1: ruleMeasurementData
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
                    // InternalSensidl.g:795:6: ( ruleNonMeasurementData )
                    {
                    // InternalSensidl.g:795:6: ( ruleNonMeasurementData )
                    // InternalSensidl.g:796:1: ruleNonMeasurementData
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
                    // InternalSensidl.g:801:6: ( ruleMeasurementDataNotAdjustable )
                    {
                    // InternalSensidl.g:801:6: ( ruleMeasurementDataNotAdjustable )
                    // InternalSensidl.g:802:1: ruleMeasurementDataNotAdjustable
                    {
                     before(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurementDataNotAdjustable();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getMeasurementDataNotAdjustableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:807:6: ( ruleListData )
                    {
                    // InternalSensidl.g:807:6: ( ruleListData )
                    // InternalSensidl.g:808:1: ruleListData
                    {
                     before(grammarAccess.getDataAccess().getListDataParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleListData();

                    state._fsp--;

                     after(grammarAccess.getDataAccess().getListDataParserRuleCall_3()); 

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


    // $ANTLR start "rule__ListData__Alternatives_4"
    // InternalSensidl.g:818:1: rule__ListData__Alternatives_4 : ( ( ( rule__ListData__DataTypeAssignment_4_0 ) ) | ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) ) );
    public final void rule__ListData__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:822:1: ( ( ( rule__ListData__DataTypeAssignment_4_0 ) ) | ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=18 && LA8_0<=27)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSensidl.g:823:1: ( ( rule__ListData__DataTypeAssignment_4_0 ) )
                    {
                    // InternalSensidl.g:823:1: ( ( rule__ListData__DataTypeAssignment_4_0 ) )
                    // InternalSensidl.g:824:1: ( rule__ListData__DataTypeAssignment_4_0 )
                    {
                     before(grammarAccess.getListDataAccess().getDataTypeAssignment_4_0()); 
                    // InternalSensidl.g:825:1: ( rule__ListData__DataTypeAssignment_4_0 )
                    // InternalSensidl.g:825:2: rule__ListData__DataTypeAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListData__DataTypeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListDataAccess().getDataTypeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:829:6: ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) )
                    {
                    // InternalSensidl.g:829:6: ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) )
                    // InternalSensidl.g:830:1: ( rule__ListData__DataTypeDataSetAssignment_4_1 )
                    {
                     before(grammarAccess.getListDataAccess().getDataTypeDataSetAssignment_4_1()); 
                    // InternalSensidl.g:831:1: ( rule__ListData__DataTypeDataSetAssignment_4_1 )
                    // InternalSensidl.g:831:2: rule__ListData__DataTypeDataSetAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListData__DataTypeDataSetAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getListDataAccess().getDataTypeDataSetAssignment_4_1()); 

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
    // $ANTLR end "rule__ListData__Alternatives_4"


    // $ANTLR start "rule__MeasurementData__Alternatives_6"
    // InternalSensidl.g:840:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );
    public final void rule__MeasurementData__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:844:1: ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:845:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    {
                    // InternalSensidl.g:845:1: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    // InternalSensidl.g:846:1: ( rule__MeasurementData__Group_6_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 
                    // InternalSensidl.g:847:1: ( rule__MeasurementData__Group_6_0__0 )
                    // InternalSensidl.g:847:2: rule__MeasurementData__Group_6_0__0
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
                    // InternalSensidl.g:851:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    {
                    // InternalSensidl.g:851:6: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    // InternalSensidl.g:852:1: ( rule__MeasurementData__Group_6_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 
                    // InternalSensidl.g:853:1: ( rule__MeasurementData__Group_6_1__0 )
                    // InternalSensidl.g:853:2: rule__MeasurementData__Group_6_1__0
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
                    // InternalSensidl.g:857:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    {
                    // InternalSensidl.g:857:6: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    // InternalSensidl.g:858:1: ( rule__MeasurementData__Group_6_2__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
                    // InternalSensidl.g:859:1: ( rule__MeasurementData__Group_6_2__0 )
                    // InternalSensidl.g:859:2: rule__MeasurementData__Group_6_2__0
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
    // InternalSensidl.g:868:1: rule__MeasurementData__Alternatives_7_1 : ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) );
    public final void rule__MeasurementData__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:872:1: ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==66) ) {
                alt10=1;
            }
            else if ( (LA10_0==67) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSensidl.g:873:1: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    {
                    // InternalSensidl.g:873:1: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    // InternalSensidl.g:874:1: ( rule__MeasurementData__Group_7_1_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0()); 
                    // InternalSensidl.g:875:1: ( rule__MeasurementData__Group_7_1_0__0 )
                    // InternalSensidl.g:875:2: rule__MeasurementData__Group_7_1_0__0
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
                    // InternalSensidl.g:879:6: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    {
                    // InternalSensidl.g:879:6: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    // InternalSensidl.g:880:1: ( rule__MeasurementData__Group_7_1_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1()); 
                    // InternalSensidl.g:881:1: ( rule__MeasurementData__Group_7_1_1__0 )
                    // InternalSensidl.g:881:2: rule__MeasurementData__Group_7_1_1__0
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
    // InternalSensidl.g:890:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:894:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=18 && LA11_0<=27)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=16 && LA11_0<=17)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:895:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // InternalSensidl.g:895:1: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // InternalSensidl.g:896:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // InternalSensidl.g:897:1: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // InternalSensidl.g:897:2: rule__NonMeasurementData__DataTypeAssignment_2_0
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
                    // InternalSensidl.g:901:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // InternalSensidl.g:901:6: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // InternalSensidl.g:902:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // InternalSensidl.g:903:1: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // InternalSensidl.g:903:2: rule__NonMeasurementData__DataTypeAssignment_2_1
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


    // $ANTLR start "rule__NonMeasurementData__Alternatives_3"
    // InternalSensidl.g:912:1: rule__NonMeasurementData__Alternatives_3 : ( ( ( rule__NonMeasurementData__Group_3_0__0 ) ) | ( ( rule__NonMeasurementData__Group_3_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:916:1: ( ( ( rule__NonMeasurementData__Group_3_0__0 ) ) | ( ( rule__NonMeasurementData__Group_3_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==68) ) {
                alt12=1;
            }
            else if ( (LA12_0==50) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:917:1: ( ( rule__NonMeasurementData__Group_3_0__0 ) )
                    {
                    // InternalSensidl.g:917:1: ( ( rule__NonMeasurementData__Group_3_0__0 ) )
                    // InternalSensidl.g:918:1: ( rule__NonMeasurementData__Group_3_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_3_0()); 
                    // InternalSensidl.g:919:1: ( rule__NonMeasurementData__Group_3_0__0 )
                    // InternalSensidl.g:919:2: rule__NonMeasurementData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:923:6: ( ( rule__NonMeasurementData__Group_3_1__0 ) )
                    {
                    // InternalSensidl.g:923:6: ( ( rule__NonMeasurementData__Group_3_1__0 ) )
                    // InternalSensidl.g:924:1: ( rule__NonMeasurementData__Group_3_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_3_1()); 
                    // InternalSensidl.g:925:1: ( rule__NonMeasurementData__Group_3_1__0 )
                    // InternalSensidl.g:925:2: rule__NonMeasurementData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__NonMeasurementData__Alternatives_3"


    // $ANTLR start "rule__NonMeasurementData__Alternatives_5_1"
    // InternalSensidl.g:934:1: rule__NonMeasurementData__Alternatives_5_1 : ( ( ( rule__NonMeasurementData__Group_5_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_5_1_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:938:1: ( ( ( rule__NonMeasurementData__Group_5_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_5_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==66) ) {
                alt13=1;
            }
            else if ( (LA13_0==67) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSensidl.g:939:1: ( ( rule__NonMeasurementData__Group_5_1_0__0 ) )
                    {
                    // InternalSensidl.g:939:1: ( ( rule__NonMeasurementData__Group_5_1_0__0 ) )
                    // InternalSensidl.g:940:1: ( rule__NonMeasurementData__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_0()); 
                    // InternalSensidl.g:941:1: ( rule__NonMeasurementData__Group_5_1_0__0 )
                    // InternalSensidl.g:941:2: rule__NonMeasurementData__Group_5_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_5_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:945:6: ( ( rule__NonMeasurementData__Group_5_1_1__0 ) )
                    {
                    // InternalSensidl.g:945:6: ( ( rule__NonMeasurementData__Group_5_1_1__0 ) )
                    // InternalSensidl.g:946:1: ( rule__NonMeasurementData__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_1()); 
                    // InternalSensidl.g:947:1: ( rule__NonMeasurementData__Group_5_1_1__0 )
                    // InternalSensidl.g:947:2: rule__NonMeasurementData__Group_5_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_5_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_1()); 

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
    // $ANTLR end "rule__NonMeasurementData__Alternatives_5_1"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Alternatives_6_2"
    // InternalSensidl.g:956:1: rule__MeasurementDataNotAdjustable__Alternatives_6_2 : ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) );
    public final void rule__MeasurementDataNotAdjustable__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:960:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==66) ) {
                alt14=1;
            }
            else if ( (LA14_0==67) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSensidl.g:961:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    {
                    // InternalSensidl.g:961:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    // InternalSensidl.g:962:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0()); 
                    // InternalSensidl.g:963:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    // InternalSensidl.g:963:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0
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
                    // InternalSensidl.g:967:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    {
                    // InternalSensidl.g:967:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    // InternalSensidl.g:968:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1()); 
                    // InternalSensidl.g:969:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    // InternalSensidl.g:969:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0
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
    // InternalSensidl.g:978:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:982:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==57) ) {
                alt15=1;
            }
            else if ( (LA15_0==59) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSensidl.g:983:1: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:983:1: ( ruleLinearDataConversion )
                    // InternalSensidl.g:984:1: ruleLinearDataConversion
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
                    // InternalSensidl.g:989:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:989:6: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:990:1: ruleLinearDataConversionWithInterval
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
    // InternalSensidl.g:1000:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1004:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==13) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSensidl.g:1005:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:1005:1: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:1006:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1007:1: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:1007:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1012:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:1012:6: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:1013:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1014:1: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:1014:3: 'SENSIDL_JSON'
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
    // InternalSensidl.g:1024:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1028:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            else if ( (LA17_0==15) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:1029:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:1029:1: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:1030:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1031:1: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:1031:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1036:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:1036:6: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:1037:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1038:1: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:1038:3: 'LITTLE_ENDIAN'
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
    // InternalSensidl.g:1048:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1052:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==17) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSensidl.g:1053:1: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:1053:1: ( ( 'STRING' ) )
                    // InternalSensidl.g:1054:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1055:1: ( 'STRING' )
                    // InternalSensidl.g:1055:3: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1060:6: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:1060:6: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:1061:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1062:1: ( 'BOOLEAN' )
                    // InternalSensidl.g:1062:3: 'BOOLEAN'
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
    // InternalSensidl.g:1072:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1076:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt19=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt19=1;
                }
                break;
            case 19:
                {
                alt19=2;
                }
                break;
            case 20:
                {
                alt19=3;
                }
                break;
            case 21:
                {
                alt19=4;
                }
                break;
            case 22:
                {
                alt19=5;
                }
                break;
            case 23:
                {
                alt19=6;
                }
                break;
            case 24:
                {
                alt19=7;
                }
                break;
            case 25:
                {
                alt19=8;
                }
                break;
            case 26:
                {
                alt19=9;
                }
                break;
            case 27:
                {
                alt19=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:1077:1: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:1077:1: ( ( 'INT8' ) )
                    // InternalSensidl.g:1078:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1079:1: ( 'INT8' )
                    // InternalSensidl.g:1079:3: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1084:6: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:1084:6: ( ( 'UINT8' ) )
                    // InternalSensidl.g:1085:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1086:1: ( 'UINT8' )
                    // InternalSensidl.g:1086:3: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:1091:6: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:1091:6: ( ( 'INT16' ) )
                    // InternalSensidl.g:1092:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:1093:1: ( 'INT16' )
                    // InternalSensidl.g:1093:3: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:1098:6: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:1098:6: ( ( 'UINT16' ) )
                    // InternalSensidl.g:1099:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:1100:1: ( 'UINT16' )
                    // InternalSensidl.g:1100:3: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:1105:6: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:1105:6: ( ( 'INT32' ) )
                    // InternalSensidl.g:1106:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:1107:1: ( 'INT32' )
                    // InternalSensidl.g:1107:3: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:1112:6: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:1112:6: ( ( 'UINT32' ) )
                    // InternalSensidl.g:1113:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:1114:1: ( 'UINT32' )
                    // InternalSensidl.g:1114:3: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:1119:6: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:1119:6: ( ( 'INT64' ) )
                    // InternalSensidl.g:1120:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:1121:1: ( 'INT64' )
                    // InternalSensidl.g:1121:3: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:1126:6: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:1126:6: ( ( 'UINT64' ) )
                    // InternalSensidl.g:1127:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:1128:1: ( 'UINT64' )
                    // InternalSensidl.g:1128:3: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:1133:6: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:1133:6: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:1134:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:1135:1: ( 'FLOAT' )
                    // InternalSensidl.g:1135:3: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:1140:6: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:1140:6: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:1141:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:1142:1: ( 'DOUBLE' )
                    // InternalSensidl.g:1142:3: 'DOUBLE'
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
    // InternalSensidl.g:1154:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1158:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:1159:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
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
    // InternalSensidl.g:1166:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1170:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:1171:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:1171:1: ( 'sensorInterface' )
            // InternalSensidl.g:1172:1: 'sensorInterface'
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
    // InternalSensidl.g:1185:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1189:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:1190:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
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
    // InternalSensidl.g:1197:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1201:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:1202:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:1202:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:1203:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:1204:1: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:1204:2: rule__SensorInterface__NameAssignment_1
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
    // InternalSensidl.g:1214:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1218:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:1219:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
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
    // InternalSensidl.g:1226:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1230:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:1231:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:1231:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:1232:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:1233:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DESCRIPTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:1233:2: rule__SensorInterface__DescriptionAssignment_2
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
    // InternalSensidl.g:1243:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1247:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:1248:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
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
    // InternalSensidl.g:1255:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1259:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:1260:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:1260:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:1261:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:1262:1: ( rule__SensorInterface__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:1262:2: rule__SensorInterface__Group_3__0
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
    // InternalSensidl.g:1272:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1276:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:1277:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
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
    // InternalSensidl.g:1284:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1288:1: ( ( '{' ) )
            // InternalSensidl.g:1289:1: ( '{' )
            {
            // InternalSensidl.g:1289:1: ( '{' )
            // InternalSensidl.g:1290:1: '{'
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
    // InternalSensidl.g:1303:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1307:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:1308:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
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
    // InternalSensidl.g:1315:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1319:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:1320:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:1320:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:1321:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:1322:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:1322:2: rule__SensorInterface__EncodingSettingsAssignment_5
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
    // InternalSensidl.g:1332:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1336:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:1337:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
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
    // InternalSensidl.g:1344:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1348:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1349:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1349:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1350:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1351:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1351:2: rule__SensorInterface__DataDescriptionAssignment_6
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
    // InternalSensidl.g:1361:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1365:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1366:2: rule__SensorInterface__Group__7__Impl
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
    // InternalSensidl.g:1372:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1376:1: ( ( '}' ) )
            // InternalSensidl.g:1377:1: ( '}' )
            {
            // InternalSensidl.g:1377:1: ( '}' )
            // InternalSensidl.g:1378:1: '}'
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
    // InternalSensidl.g:1407:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1411:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1412:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
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
    // InternalSensidl.g:1419:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1423:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1424:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1424:1: ( 'with identifier' )
            // InternalSensidl.g:1425:1: 'with identifier'
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
    // InternalSensidl.g:1438:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1442:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1443:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
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
    // InternalSensidl.g:1450:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1454:1: ( ( ':' ) )
            // InternalSensidl.g:1455:1: ( ':' )
            {
            // InternalSensidl.g:1455:1: ( ':' )
            // InternalSensidl.g:1456:1: ':'
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
    // InternalSensidl.g:1469:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1473:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1474:2: rule__SensorInterface__Group_3__2__Impl
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
    // InternalSensidl.g:1480:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1484:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1485:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1485:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1486:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1487:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1487:2: rule__SensorInterface__IDAssignment_3_2
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
    // InternalSensidl.g:1503:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1507:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1508:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
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
    // InternalSensidl.g:1515:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1519:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1520:1: ( 'encoding' )
            {
            // InternalSensidl.g:1520:1: ( 'encoding' )
            // InternalSensidl.g:1521:1: 'encoding'
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
    // InternalSensidl.g:1534:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1538:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1539:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
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
    // InternalSensidl.g:1546:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1550:1: ( ( ':' ) )
            // InternalSensidl.g:1551:1: ( ':' )
            {
            // InternalSensidl.g:1551:1: ( ':' )
            // InternalSensidl.g:1552:1: ':'
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
    // InternalSensidl.g:1565:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1569:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1570:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
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
    // InternalSensidl.g:1577:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1581:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1582:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1582:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1583:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1584:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1584:2: rule__EncodingSettings__CodingAssignment_2
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
    // InternalSensidl.g:1594:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1598:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1599:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
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
    // InternalSensidl.g:1606:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1610:1: ( ( ',' ) )
            // InternalSensidl.g:1611:1: ( ',' )
            {
            // InternalSensidl.g:1611:1: ( ',' )
            // InternalSensidl.g:1612:1: ','
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
    // InternalSensidl.g:1625:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1629:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1630:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
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
    // InternalSensidl.g:1637:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1641:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1642:1: ( 'endianness' )
            {
            // InternalSensidl.g:1642:1: ( 'endianness' )
            // InternalSensidl.g:1643:1: 'endianness'
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
    // InternalSensidl.g:1656:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1660:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1661:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
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
    // InternalSensidl.g:1668:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1672:1: ( ( ':' ) )
            // InternalSensidl.g:1673:1: ( ':' )
            {
            // InternalSensidl.g:1673:1: ( ':' )
            // InternalSensidl.g:1674:1: ':'
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
    // InternalSensidl.g:1687:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1691:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1692:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
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
    // InternalSensidl.g:1699:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1703:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1704:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1704:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1705:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1706:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1706:2: rule__EncodingSettings__EndiannessAssignment_6
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
    // InternalSensidl.g:1716:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1720:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1721:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
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
    // InternalSensidl.g:1728:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1732:1: ( ( ',' ) )
            // InternalSensidl.g:1733:1: ( ',' )
            {
            // InternalSensidl.g:1733:1: ( ',' )
            // InternalSensidl.g:1734:1: ','
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
    // InternalSensidl.g:1747:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1751:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1752:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
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
    // InternalSensidl.g:1759:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1763:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1764:1: ( 'alignment' )
            {
            // InternalSensidl.g:1764:1: ( 'alignment' )
            // InternalSensidl.g:1765:1: 'alignment'
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
    // InternalSensidl.g:1778:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1782:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1783:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
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
    // InternalSensidl.g:1790:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1794:1: ( ( ':' ) )
            // InternalSensidl.g:1795:1: ( ':' )
            {
            // InternalSensidl.g:1795:1: ( ':' )
            // InternalSensidl.g:1796:1: ':'
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
    // InternalSensidl.g:1809:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1813:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1814:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
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
    // InternalSensidl.g:1821:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1825:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1826:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1826:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1827:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1828:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1828:2: rule__EncodingSettings__AlignmentAssignment_10
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
    // InternalSensidl.g:1838:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1842:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1843:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
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
    // InternalSensidl.g:1850:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1854:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1855:1: ( 'BIT' )
            {
            // InternalSensidl.g:1855:1: ( 'BIT' )
            // InternalSensidl.g:1856:1: 'BIT'
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
    // InternalSensidl.g:1869:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1873:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1874:2: rule__EncodingSettings__Group__12__Impl
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
    // InternalSensidl.g:1880:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1884:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1885:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1885:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1886:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1887:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:1887:2: rule__EncodingSettings__Group_12__0
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
    // InternalSensidl.g:1923:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1927:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1928:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
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
    // InternalSensidl.g:1935:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1939:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1940:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1940:1: ( 'with identifier' )
            // InternalSensidl.g:1941:1: 'with identifier'
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
    // InternalSensidl.g:1954:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1958:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1959:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
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
    // InternalSensidl.g:1966:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1970:1: ( ( ':' ) )
            // InternalSensidl.g:1971:1: ( ':' )
            {
            // InternalSensidl.g:1971:1: ( ':' )
            // InternalSensidl.g:1972:1: ':'
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
    // InternalSensidl.g:1985:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1989:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1990:2: rule__EncodingSettings__Group_12__2__Impl
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
    // InternalSensidl.g:1996:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2000:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:2001:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:2001:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:2002:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:2003:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:2003:2: rule__EncodingSettings__IDAssignment_12_2
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
    // InternalSensidl.g:2019:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2023:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:2024:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
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
    // InternalSensidl.g:2031:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2035:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:2036:1: ( 'sensorData' )
            {
            // InternalSensidl.g:2036:1: ( 'sensorData' )
            // InternalSensidl.g:2037:1: 'sensorData'
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
    // InternalSensidl.g:2050:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2054:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:2055:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
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
    // InternalSensidl.g:2062:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2066:1: ( ( () ) )
            // InternalSensidl.g:2067:1: ( () )
            {
            // InternalSensidl.g:2067:1: ( () )
            // InternalSensidl.g:2068:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:2069:1: ()
            // InternalSensidl.g:2071:1: 
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
    // InternalSensidl.g:2081:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2085:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:2086:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
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
    // InternalSensidl.g:2093:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2097:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:2098:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:2098:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:2099:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:2100:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:2100:2: rule__SensorDataDescription__Group_2__0
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
    // InternalSensidl.g:2110:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2114:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:2115:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
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
    // InternalSensidl.g:2122:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2126:1: ( ( '{' ) )
            // InternalSensidl.g:2127:1: ( '{' )
            {
            // InternalSensidl.g:2127:1: ( '{' )
            // InternalSensidl.g:2128:1: '{'
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
    // InternalSensidl.g:2141:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2145:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:2146:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
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
    // InternalSensidl.g:2153:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2157:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:2158:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:2158:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:2159:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:2160:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSensidl.g:2160:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSensidl.g:2170:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2174:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:2175:2: rule__SensorDataDescription__Group__5__Impl
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
    // InternalSensidl.g:2181:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2185:1: ( ( '}' ) )
            // InternalSensidl.g:2186:1: ( '}' )
            {
            // InternalSensidl.g:2186:1: ( '}' )
            // InternalSensidl.g:2187:1: '}'
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
    // InternalSensidl.g:2212:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2216:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // InternalSensidl.g:2217:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
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
    // InternalSensidl.g:2224:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2228:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2229:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2229:1: ( 'with identifier' )
            // InternalSensidl.g:2230:1: 'with identifier'
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
    // InternalSensidl.g:2243:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2247:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:2248:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
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
    // InternalSensidl.g:2255:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2259:1: ( ( ':' ) )
            // InternalSensidl.g:2260:1: ( ':' )
            {
            // InternalSensidl.g:2260:1: ( ':' )
            // InternalSensidl.g:2261:1: ':'
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
    // InternalSensidl.g:2274:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2278:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:2279:2: rule__SensorDataDescription__Group_2__2__Impl
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
    // InternalSensidl.g:2285:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2289:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:2290:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:2290:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:2291:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:2292:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:2292:2: rule__SensorDataDescription__IDAssignment_2_2
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
    // InternalSensidl.g:2308:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2312:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:2313:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
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
    // InternalSensidl.g:2320:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2324:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:2325:1: ( 'dataSet' )
            {
            // InternalSensidl.g:2325:1: ( 'dataSet' )
            // InternalSensidl.g:2326:1: 'dataSet'
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
    // InternalSensidl.g:2339:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2343:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2344:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
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
    // InternalSensidl.g:2351:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2355:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2356:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2356:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2357:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2358:1: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2358:2: rule__DataSet__NameAssignment_1
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
    // InternalSensidl.g:2368:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2372:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2373:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
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
    // InternalSensidl.g:2380:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2384:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2385:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2385:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2386:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2387:1: ( rule__DataSet__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSensidl.g:2387:2: rule__DataSet__Group_2__0
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
    // InternalSensidl.g:2397:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2401:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2402:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
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
    // InternalSensidl.g:2409:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )* ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2413:1: ( ( ( rule__DataSet__Group_3__0 )* ) )
            // InternalSensidl.g:2414:1: ( ( rule__DataSet__Group_3__0 )* )
            {
            // InternalSensidl.g:2414:1: ( ( rule__DataSet__Group_3__0 )* )
            // InternalSensidl.g:2415:1: ( rule__DataSet__Group_3__0 )*
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2416:1: ( rule__DataSet__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSensidl.g:2416:2: rule__DataSet__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DataSet__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSensidl.g:2426:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2430:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2431:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
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
    // InternalSensidl.g:2438:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__Group_4__0 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2442:1: ( ( ( rule__DataSet__Group_4__0 )? ) )
            // InternalSensidl.g:2443:1: ( ( rule__DataSet__Group_4__0 )? )
            {
            // InternalSensidl.g:2443:1: ( ( rule__DataSet__Group_4__0 )? )
            // InternalSensidl.g:2444:1: ( rule__DataSet__Group_4__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_4()); 
            // InternalSensidl.g:2445:1: ( rule__DataSet__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:2445:2: rule__DataSet__Group_4__0
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
    // InternalSensidl.g:2455:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2459:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2460:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
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
    // InternalSensidl.g:2467:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__DescriptionAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2471:1: ( ( ( rule__DataSet__DescriptionAssignment_5 )? ) )
            // InternalSensidl.g:2472:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            {
            // InternalSensidl.g:2472:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            // InternalSensidl.g:2473:1: ( rule__DataSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 
            // InternalSensidl.g:2474:1: ( rule__DataSet__DescriptionAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DESCRIPTION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:2474:2: rule__DataSet__DescriptionAssignment_5
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
    // InternalSensidl.g:2484:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2488:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2489:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
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
    // InternalSensidl.g:2496:1: rule__DataSet__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2500:1: ( ( '{' ) )
            // InternalSensidl.g:2501:1: ( '{' )
            {
            // InternalSensidl.g:2501:1: ( '{' )
            // InternalSensidl.g:2502:1: '{'
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
    // InternalSensidl.g:2515:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2519:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // InternalSensidl.g:2520:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
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
    // InternalSensidl.g:2527:1: rule__DataSet__Group__7__Impl : ( ( rule__DataSet__Alternatives_7 )* ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2531:1: ( ( ( rule__DataSet__Alternatives_7 )* ) )
            // InternalSensidl.g:2532:1: ( ( rule__DataSet__Alternatives_7 )* )
            {
            // InternalSensidl.g:2532:1: ( ( rule__DataSet__Alternatives_7 )* )
            // InternalSensidl.g:2533:1: ( rule__DataSet__Alternatives_7 )*
            {
             before(grammarAccess.getDataSetAccess().getAlternatives_7()); 
            // InternalSensidl.g:2534:1: ( rule__DataSet__Alternatives_7 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==61||(LA29_0>=63 && LA29_0<=65)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSensidl.g:2534:2: rule__DataSet__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DataSet__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSensidl.g:2544:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2548:1: ( rule__DataSet__Group__8__Impl )
            // InternalSensidl.g:2549:2: rule__DataSet__Group__8__Impl
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
    // InternalSensidl.g:2555:1: rule__DataSet__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2559:1: ( ( '}' ) )
            // InternalSensidl.g:2560:1: ( '}' )
            {
            // InternalSensidl.g:2560:1: ( '}' )
            // InternalSensidl.g:2561:1: '}'
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
    // InternalSensidl.g:2592:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2596:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2597:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
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
    // InternalSensidl.g:2604:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2608:1: ( ( 'uses' ) )
            // InternalSensidl.g:2609:1: ( 'uses' )
            {
            // InternalSensidl.g:2609:1: ( 'uses' )
            // InternalSensidl.g:2610:1: 'uses'
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
    // InternalSensidl.g:2623:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2627:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2628:2: rule__DataSet__Group_2__1__Impl
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
    // InternalSensidl.g:2634:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2638:1: ( ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) ) )
            // InternalSensidl.g:2639:1: ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) )
            {
            // InternalSensidl.g:2639:1: ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) )
            // InternalSensidl.g:2640:1: ( rule__DataSet__UsedDataSetsAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsAssignment_2_1()); 
            // InternalSensidl.g:2641:1: ( rule__DataSet__UsedDataSetsAssignment_2_1 )
            // InternalSensidl.g:2641:2: rule__DataSet__UsedDataSetsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__UsedDataSetsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getUsedDataSetsAssignment_2_1()); 

            }


            }

        }
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
    // InternalSensidl.g:2655:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2659:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2660:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
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
    // InternalSensidl.g:2667:1: rule__DataSet__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2671:1: ( ( ',' ) )
            // InternalSensidl.g:2672:1: ( ',' )
            {
            // InternalSensidl.g:2672:1: ( ',' )
            // InternalSensidl.g:2673:1: ','
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
    // InternalSensidl.g:2686:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2690:1: ( rule__DataSet__Group_3__1__Impl )
            // InternalSensidl.g:2691:2: rule__DataSet__Group_3__1__Impl
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
    // InternalSensidl.g:2697:1: rule__DataSet__Group_3__1__Impl : ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2701:1: ( ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) ) )
            // InternalSensidl.g:2702:1: ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) )
            {
            // InternalSensidl.g:2702:1: ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) )
            // InternalSensidl.g:2703:1: ( rule__DataSet__UsedDataSetsAssignment_3_1 )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsAssignment_3_1()); 
            // InternalSensidl.g:2704:1: ( rule__DataSet__UsedDataSetsAssignment_3_1 )
            // InternalSensidl.g:2704:2: rule__DataSet__UsedDataSetsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSet__UsedDataSetsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSetAccess().getUsedDataSetsAssignment_3_1()); 

            }


            }

        }
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
    // InternalSensidl.g:2718:1: rule__DataSet__Group_4__0 : rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 ;
    public final void rule__DataSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2722:1: ( rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 )
            // InternalSensidl.g:2723:2: rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1
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
    // InternalSensidl.g:2730:1: rule__DataSet__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2734:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2735:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2735:1: ( 'with identifier' )
            // InternalSensidl.g:2736:1: 'with identifier'
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
    // InternalSensidl.g:2749:1: rule__DataSet__Group_4__1 : rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 ;
    public final void rule__DataSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2753:1: ( rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 )
            // InternalSensidl.g:2754:2: rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2
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
    // InternalSensidl.g:2761:1: rule__DataSet__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2765:1: ( ( ':' ) )
            // InternalSensidl.g:2766:1: ( ':' )
            {
            // InternalSensidl.g:2766:1: ( ':' )
            // InternalSensidl.g:2767:1: ':'
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
    // InternalSensidl.g:2780:1: rule__DataSet__Group_4__2 : rule__DataSet__Group_4__2__Impl ;
    public final void rule__DataSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2784:1: ( rule__DataSet__Group_4__2__Impl )
            // InternalSensidl.g:2785:2: rule__DataSet__Group_4__2__Impl
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
    // InternalSensidl.g:2791:1: rule__DataSet__Group_4__2__Impl : ( ( rule__DataSet__IDAssignment_4_2 ) ) ;
    public final void rule__DataSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2795:1: ( ( ( rule__DataSet__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:2796:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:2796:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            // InternalSensidl.g:2797:1: ( rule__DataSet__IDAssignment_4_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:2798:1: ( rule__DataSet__IDAssignment_4_2 )
            // InternalSensidl.g:2798:2: rule__DataSet__IDAssignment_4_2
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
    // InternalSensidl.g:2814:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2818:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSensidl.g:2819:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalSensidl.g:2826:1: rule__Method__Group__0__Impl : ( ( rule__Method__Alternatives_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2830:1: ( ( ( rule__Method__Alternatives_0 )? ) )
            // InternalSensidl.g:2831:1: ( ( rule__Method__Alternatives_0 )? )
            {
            // InternalSensidl.g:2831:1: ( ( rule__Method__Alternatives_0 )? )
            // InternalSensidl.g:2832:1: ( rule__Method__Alternatives_0 )?
            {
             before(grammarAccess.getMethodAccess().getAlternatives_0()); 
            // InternalSensidl.g:2833:1: ( rule__Method__Alternatives_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61||(LA30_0>=63 && LA30_0<=65)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSensidl.g:2833:2: rule__Method__Alternatives_0
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
    // InternalSensidl.g:2843:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2847:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSensidl.g:2848:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalSensidl.g:2855:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2859:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalSensidl.g:2860:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2860:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalSensidl.g:2861:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2862:1: ( rule__Method__NameAssignment_1 )
            // InternalSensidl.g:2862:2: rule__Method__NameAssignment_1
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
    // InternalSensidl.g:2872:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2876:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSensidl.g:2877:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalSensidl.g:2884:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2888:1: ( ( '(' ) )
            // InternalSensidl.g:2889:1: ( '(' )
            {
            // InternalSensidl.g:2889:1: ( '(' )
            // InternalSensidl.g:2890:1: '('
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
    // InternalSensidl.g:2903:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2907:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSensidl.g:2908:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalSensidl.g:2915:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParameterAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2919:1: ( ( ( rule__Method__ParameterAssignment_3 )? ) )
            // InternalSensidl.g:2920:1: ( ( rule__Method__ParameterAssignment_3 )? )
            {
            // InternalSensidl.g:2920:1: ( ( rule__Method__ParameterAssignment_3 )? )
            // InternalSensidl.g:2921:1: ( rule__Method__ParameterAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_3()); 
            // InternalSensidl.g:2922:1: ( rule__Method__ParameterAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=16 && LA31_0<=27)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSensidl.g:2922:2: rule__Method__ParameterAssignment_3
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
    // InternalSensidl.g:2932:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2936:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSensidl.g:2937:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalSensidl.g:2944:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2948:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // InternalSensidl.g:2949:1: ( ( rule__Method__Group_4__0 )* )
            {
            // InternalSensidl.g:2949:1: ( ( rule__Method__Group_4__0 )* )
            // InternalSensidl.g:2950:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSensidl.g:2951:1: ( rule__Method__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSensidl.g:2951:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSensidl.g:2961:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2965:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSensidl.g:2966:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalSensidl.g:2973:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2977:1: ( ( ')' ) )
            // InternalSensidl.g:2978:1: ( ')' )
            {
            // InternalSensidl.g:2978:1: ( ')' )
            // InternalSensidl.g:2979:1: ')'
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
    // InternalSensidl.g:2992:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2996:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalSensidl.g:2997:2: rule__Method__Group__6__Impl rule__Method__Group__7
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
    // InternalSensidl.g:3004:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3008:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalSensidl.g:3009:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalSensidl.g:3009:1: ( ( rule__Method__Group_6__0 )? )
            // InternalSensidl.g:3010:1: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalSensidl.g:3011:1: ( rule__Method__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSensidl.g:3011:2: rule__Method__Group_6__0
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
    // InternalSensidl.g:3021:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3025:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalSensidl.g:3026:2: rule__Method__Group__7__Impl rule__Method__Group__8
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
    // InternalSensidl.g:3033:1: rule__Method__Group__7__Impl : ( 'as' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3037:1: ( ( 'as' ) )
            // InternalSensidl.g:3038:1: ( 'as' )
            {
            // InternalSensidl.g:3038:1: ( 'as' )
            // InternalSensidl.g:3039:1: 'as'
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
    // InternalSensidl.g:3052:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3056:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalSensidl.g:3057:2: rule__Method__Group__8__Impl rule__Method__Group__9
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
    // InternalSensidl.g:3064:1: rule__Method__Group__8__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3068:1: ( ( 'Method' ) )
            // InternalSensidl.g:3069:1: ( 'Method' )
            {
            // InternalSensidl.g:3069:1: ( 'Method' )
            // InternalSensidl.g:3070:1: 'Method'
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
    // InternalSensidl.g:3083:1: rule__Method__Group__9 : rule__Method__Group__9__Impl rule__Method__Group__10 ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3087:1: ( rule__Method__Group__9__Impl rule__Method__Group__10 )
            // InternalSensidl.g:3088:2: rule__Method__Group__9__Impl rule__Method__Group__10
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
    // InternalSensidl.g:3095:1: rule__Method__Group__9__Impl : ( ( rule__Method__Group_9__0 )? ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3099:1: ( ( ( rule__Method__Group_9__0 )? ) )
            // InternalSensidl.g:3100:1: ( ( rule__Method__Group_9__0 )? )
            {
            // InternalSensidl.g:3100:1: ( ( rule__Method__Group_9__0 )? )
            // InternalSensidl.g:3101:1: ( rule__Method__Group_9__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_9()); 
            // InternalSensidl.g:3102:1: ( rule__Method__Group_9__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSensidl.g:3102:2: rule__Method__Group_9__0
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
    // InternalSensidl.g:3112:1: rule__Method__Group__10 : rule__Method__Group__10__Impl ;
    public final void rule__Method__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3116:1: ( rule__Method__Group__10__Impl )
            // InternalSensidl.g:3117:2: rule__Method__Group__10__Impl
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
    // InternalSensidl.g:3123:1: rule__Method__Group__10__Impl : ( ( rule__Method__DescriptionAssignment_10 )? ) ;
    public final void rule__Method__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3127:1: ( ( ( rule__Method__DescriptionAssignment_10 )? ) )
            // InternalSensidl.g:3128:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            {
            // InternalSensidl.g:3128:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            // InternalSensidl.g:3129:1: ( rule__Method__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getMethodAccess().getDescriptionAssignment_10()); 
            // InternalSensidl.g:3130:1: ( rule__Method__DescriptionAssignment_10 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DESCRIPTION) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSensidl.g:3130:2: rule__Method__DescriptionAssignment_10
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
    // InternalSensidl.g:3162:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3166:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSensidl.g:3167:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
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
    // InternalSensidl.g:3174:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3178:1: ( ( ',' ) )
            // InternalSensidl.g:3179:1: ( ',' )
            {
            // InternalSensidl.g:3179:1: ( ',' )
            // InternalSensidl.g:3180:1: ','
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
    // InternalSensidl.g:3193:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3197:1: ( rule__Method__Group_4__1__Impl )
            // InternalSensidl.g:3198:2: rule__Method__Group_4__1__Impl
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
    // InternalSensidl.g:3204:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParameterAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3208:1: ( ( ( rule__Method__ParameterAssignment_4_1 ) ) )
            // InternalSensidl.g:3209:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            {
            // InternalSensidl.g:3209:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            // InternalSensidl.g:3210:1: ( rule__Method__ParameterAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_1()); 
            // InternalSensidl.g:3211:1: ( rule__Method__ParameterAssignment_4_1 )
            // InternalSensidl.g:3211:2: rule__Method__ParameterAssignment_4_1
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
    // InternalSensidl.g:3225:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3229:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalSensidl.g:3230:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
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
    // InternalSensidl.g:3237:1: rule__Method__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3241:1: ( ( ':' ) )
            // InternalSensidl.g:3242:1: ( ':' )
            {
            // InternalSensidl.g:3242:1: ( ':' )
            // InternalSensidl.g:3243:1: ':'
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
    // InternalSensidl.g:3256:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3260:1: ( rule__Method__Group_6__1__Impl )
            // InternalSensidl.g:3261:2: rule__Method__Group_6__1__Impl
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
    // InternalSensidl.g:3267:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Alternatives_6_1 ) ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3271:1: ( ( ( rule__Method__Alternatives_6_1 ) ) )
            // InternalSensidl.g:3272:1: ( ( rule__Method__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:3272:1: ( ( rule__Method__Alternatives_6_1 ) )
            // InternalSensidl.g:3273:1: ( rule__Method__Alternatives_6_1 )
            {
             before(grammarAccess.getMethodAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:3274:1: ( rule__Method__Alternatives_6_1 )
            // InternalSensidl.g:3274:2: rule__Method__Alternatives_6_1
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
    // InternalSensidl.g:3288:1: rule__Method__Group_9__0 : rule__Method__Group_9__0__Impl rule__Method__Group_9__1 ;
    public final void rule__Method__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3292:1: ( rule__Method__Group_9__0__Impl rule__Method__Group_9__1 )
            // InternalSensidl.g:3293:2: rule__Method__Group_9__0__Impl rule__Method__Group_9__1
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
    // InternalSensidl.g:3300:1: rule__Method__Group_9__0__Impl : ( 'with identifier' ) ;
    public final void rule__Method__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3304:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3305:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3305:1: ( 'with identifier' )
            // InternalSensidl.g:3306:1: 'with identifier'
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
    // InternalSensidl.g:3319:1: rule__Method__Group_9__1 : rule__Method__Group_9__1__Impl rule__Method__Group_9__2 ;
    public final void rule__Method__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3323:1: ( rule__Method__Group_9__1__Impl rule__Method__Group_9__2 )
            // InternalSensidl.g:3324:2: rule__Method__Group_9__1__Impl rule__Method__Group_9__2
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
    // InternalSensidl.g:3331:1: rule__Method__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Method__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3335:1: ( ( ':' ) )
            // InternalSensidl.g:3336:1: ( ':' )
            {
            // InternalSensidl.g:3336:1: ( ':' )
            // InternalSensidl.g:3337:1: ':'
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
    // InternalSensidl.g:3350:1: rule__Method__Group_9__2 : rule__Method__Group_9__2__Impl ;
    public final void rule__Method__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3354:1: ( rule__Method__Group_9__2__Impl )
            // InternalSensidl.g:3355:2: rule__Method__Group_9__2__Impl
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
    // InternalSensidl.g:3361:1: rule__Method__Group_9__2__Impl : ( ( rule__Method__IDAssignment_9_2 ) ) ;
    public final void rule__Method__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3365:1: ( ( ( rule__Method__IDAssignment_9_2 ) ) )
            // InternalSensidl.g:3366:1: ( ( rule__Method__IDAssignment_9_2 ) )
            {
            // InternalSensidl.g:3366:1: ( ( rule__Method__IDAssignment_9_2 ) )
            // InternalSensidl.g:3367:1: ( rule__Method__IDAssignment_9_2 )
            {
             before(grammarAccess.getMethodAccess().getIDAssignment_9_2()); 
            // InternalSensidl.g:3368:1: ( rule__Method__IDAssignment_9_2 )
            // InternalSensidl.g:3368:2: rule__Method__IDAssignment_9_2
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
    // InternalSensidl.g:3384:1: rule__MethodParameter__Group__0 : rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 ;
    public final void rule__MethodParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3388:1: ( rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 )
            // InternalSensidl.g:3389:2: rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1
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
    // InternalSensidl.g:3396:1: rule__MethodParameter__Group__0__Impl : ( ( rule__MethodParameter__Alternatives_0 ) ) ;
    public final void rule__MethodParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3400:1: ( ( ( rule__MethodParameter__Alternatives_0 ) ) )
            // InternalSensidl.g:3401:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            {
            // InternalSensidl.g:3401:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            // InternalSensidl.g:3402:1: ( rule__MethodParameter__Alternatives_0 )
            {
             before(grammarAccess.getMethodParameterAccess().getAlternatives_0()); 
            // InternalSensidl.g:3403:1: ( rule__MethodParameter__Alternatives_0 )
            // InternalSensidl.g:3403:2: rule__MethodParameter__Alternatives_0
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
    // InternalSensidl.g:3413:1: rule__MethodParameter__Group__1 : rule__MethodParameter__Group__1__Impl ;
    public final void rule__MethodParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3417:1: ( rule__MethodParameter__Group__1__Impl )
            // InternalSensidl.g:3418:2: rule__MethodParameter__Group__1__Impl
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
    // InternalSensidl.g:3424:1: rule__MethodParameter__Group__1__Impl : ( ( rule__MethodParameter__NameAssignment_1 ) ) ;
    public final void rule__MethodParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3428:1: ( ( ( rule__MethodParameter__NameAssignment_1 ) ) )
            // InternalSensidl.g:3429:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            {
            // InternalSensidl.g:3429:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            // InternalSensidl.g:3430:1: ( rule__MethodParameter__NameAssignment_1 )
            {
             before(grammarAccess.getMethodParameterAccess().getNameAssignment_1()); 
            // InternalSensidl.g:3431:1: ( rule__MethodParameter__NameAssignment_1 )
            // InternalSensidl.g:3431:2: rule__MethodParameter__NameAssignment_1
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


    // $ANTLR start "rule__ListData__Group__0"
    // InternalSensidl.g:3445:1: rule__ListData__Group__0 : rule__ListData__Group__0__Impl rule__ListData__Group__1 ;
    public final void rule__ListData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3449:1: ( rule__ListData__Group__0__Impl rule__ListData__Group__1 )
            // InternalSensidl.g:3450:2: rule__ListData__Group__0__Impl rule__ListData__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ListData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__0"


    // $ANTLR start "rule__ListData__Group__0__Impl"
    // InternalSensidl.g:3457:1: rule__ListData__Group__0__Impl : ( ( rule__ListData__NameAssignment_0 ) ) ;
    public final void rule__ListData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3461:1: ( ( ( rule__ListData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3462:1: ( ( rule__ListData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3462:1: ( ( rule__ListData__NameAssignment_0 ) )
            // InternalSensidl.g:3463:1: ( rule__ListData__NameAssignment_0 )
            {
             before(grammarAccess.getListDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3464:1: ( rule__ListData__NameAssignment_0 )
            // InternalSensidl.g:3464:2: rule__ListData__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListData__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListDataAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__0__Impl"


    // $ANTLR start "rule__ListData__Group__1"
    // InternalSensidl.g:3474:1: rule__ListData__Group__1 : rule__ListData__Group__1__Impl rule__ListData__Group__2 ;
    public final void rule__ListData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3478:1: ( rule__ListData__Group__1__Impl rule__ListData__Group__2 )
            // InternalSensidl.g:3479:2: rule__ListData__Group__1__Impl rule__ListData__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ListData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__1"


    // $ANTLR start "rule__ListData__Group__1__Impl"
    // InternalSensidl.g:3486:1: rule__ListData__Group__1__Impl : ( 'as' ) ;
    public final void rule__ListData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3490:1: ( ( 'as' ) )
            // InternalSensidl.g:3491:1: ( 'as' )
            {
            // InternalSensidl.g:3491:1: ( 'as' )
            // InternalSensidl.g:3492:1: 'as'
            {
             before(grammarAccess.getListDataAccess().getAsKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getListDataAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__1__Impl"


    // $ANTLR start "rule__ListData__Group__2"
    // InternalSensidl.g:3505:1: rule__ListData__Group__2 : rule__ListData__Group__2__Impl rule__ListData__Group__3 ;
    public final void rule__ListData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3509:1: ( rule__ListData__Group__2__Impl rule__ListData__Group__3 )
            // InternalSensidl.g:3510:2: rule__ListData__Group__2__Impl rule__ListData__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ListData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__2"


    // $ANTLR start "rule__ListData__Group__2__Impl"
    // InternalSensidl.g:3517:1: rule__ListData__Group__2__Impl : ( 'list' ) ;
    public final void rule__ListData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3521:1: ( ( 'list' ) )
            // InternalSensidl.g:3522:1: ( 'list' )
            {
            // InternalSensidl.g:3522:1: ( 'list' )
            // InternalSensidl.g:3523:1: 'list'
            {
             before(grammarAccess.getListDataAccess().getListKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getListDataAccess().getListKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__2__Impl"


    // $ANTLR start "rule__ListData__Group__3"
    // InternalSensidl.g:3536:1: rule__ListData__Group__3 : rule__ListData__Group__3__Impl rule__ListData__Group__4 ;
    public final void rule__ListData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3540:1: ( rule__ListData__Group__3__Impl rule__ListData__Group__4 )
            // InternalSensidl.g:3541:2: rule__ListData__Group__3__Impl rule__ListData__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ListData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__3"


    // $ANTLR start "rule__ListData__Group__3__Impl"
    // InternalSensidl.g:3548:1: rule__ListData__Group__3__Impl : ( 'of' ) ;
    public final void rule__ListData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3552:1: ( ( 'of' ) )
            // InternalSensidl.g:3553:1: ( 'of' )
            {
            // InternalSensidl.g:3553:1: ( 'of' )
            // InternalSensidl.g:3554:1: 'of'
            {
             before(grammarAccess.getListDataAccess().getOfKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getListDataAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__3__Impl"


    // $ANTLR start "rule__ListData__Group__4"
    // InternalSensidl.g:3567:1: rule__ListData__Group__4 : rule__ListData__Group__4__Impl ;
    public final void rule__ListData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3571:1: ( rule__ListData__Group__4__Impl )
            // InternalSensidl.g:3572:2: rule__ListData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListData__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__4"


    // $ANTLR start "rule__ListData__Group__4__Impl"
    // InternalSensidl.g:3578:1: rule__ListData__Group__4__Impl : ( ( rule__ListData__Alternatives_4 ) ) ;
    public final void rule__ListData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3582:1: ( ( ( rule__ListData__Alternatives_4 ) ) )
            // InternalSensidl.g:3583:1: ( ( rule__ListData__Alternatives_4 ) )
            {
            // InternalSensidl.g:3583:1: ( ( rule__ListData__Alternatives_4 ) )
            // InternalSensidl.g:3584:1: ( rule__ListData__Alternatives_4 )
            {
             before(grammarAccess.getListDataAccess().getAlternatives_4()); 
            // InternalSensidl.g:3585:1: ( rule__ListData__Alternatives_4 )
            // InternalSensidl.g:3585:2: rule__ListData__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__ListData__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getListDataAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__Group__4__Impl"


    // $ANTLR start "rule__MeasurementData__Group__0"
    // InternalSensidl.g:3605:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3609:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:3610:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
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
    // InternalSensidl.g:3617:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3621:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3622:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3622:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3623:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3624:1: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3624:2: rule__MeasurementData__NameAssignment_0
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
    // InternalSensidl.g:3634:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3638:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:3639:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:3646:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3650:1: ( ( 'as' ) )
            // InternalSensidl.g:3651:1: ( 'as' )
            {
            // InternalSensidl.g:3651:1: ( 'as' )
            // InternalSensidl.g:3652:1: 'as'
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
    // InternalSensidl.g:3665:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3669:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:3670:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSensidl.g:3677:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3681:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:3682:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:3682:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:3683:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:3684:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:3684:2: rule__MeasurementData__DataTypeAssignment_2
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
    // InternalSensidl.g:3694:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3698:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:3699:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalSensidl.g:3706:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3710:1: ( ( 'in' ) )
            // InternalSensidl.g:3711:1: ( 'in' )
            {
            // InternalSensidl.g:3711:1: ( 'in' )
            // InternalSensidl.g:3712:1: 'in'
            {
             before(grammarAccess.getMeasurementDataAccess().getInKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSensidl.g:3725:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3729:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:3730:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:3737:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3741:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:3742:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:3742:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:3743:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:3744:1: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:3744:2: rule__MeasurementData__UnitAssignment_4
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
    // InternalSensidl.g:3754:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3758:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:3759:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:3766:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3770:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3771:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3771:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3772:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3773:1: ( rule__MeasurementData__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSensidl.g:3773:2: rule__MeasurementData__Group_5__0
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
    // InternalSensidl.g:3783:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3787:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:3788:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:3795:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Alternatives_6 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3799:1: ( ( ( rule__MeasurementData__Alternatives_6 )? ) )
            // InternalSensidl.g:3800:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            {
            // InternalSensidl.g:3800:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            // InternalSensidl.g:3801:1: ( rule__MeasurementData__Alternatives_6 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 
            // InternalSensidl.g:3802:1: ( rule__MeasurementData__Alternatives_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSensidl.g:3802:2: rule__MeasurementData__Alternatives_6
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
    // InternalSensidl.g:3812:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3816:1: ( rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 )
            // InternalSensidl.g:3817:2: rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalSensidl.g:3824:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__Group_7__0 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3828:1: ( ( ( rule__MeasurementData__Group_7__0 )? ) )
            // InternalSensidl.g:3829:1: ( ( rule__MeasurementData__Group_7__0 )? )
            {
            // InternalSensidl.g:3829:1: ( ( rule__MeasurementData__Group_7__0 )? )
            // InternalSensidl.g:3830:1: ( rule__MeasurementData__Group_7__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7()); 
            // InternalSensidl.g:3831:1: ( rule__MeasurementData__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSensidl.g:3831:2: rule__MeasurementData__Group_7__0
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
    // InternalSensidl.g:3841:1: rule__MeasurementData__Group__8 : rule__MeasurementData__Group__8__Impl ;
    public final void rule__MeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3845:1: ( rule__MeasurementData__Group__8__Impl )
            // InternalSensidl.g:3846:2: rule__MeasurementData__Group__8__Impl
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
    // InternalSensidl.g:3852:1: rule__MeasurementData__Group__8__Impl : ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) ;
    public final void rule__MeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3856:1: ( ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) )
            // InternalSensidl.g:3857:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            {
            // InternalSensidl.g:3857:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            // InternalSensidl.g:3858:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_8()); 
            // InternalSensidl.g:3859:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DESCRIPTION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSensidl.g:3859:2: rule__MeasurementData__DescriptionAssignment_8
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
    // InternalSensidl.g:3887:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3891:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:3892:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
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
    // InternalSensidl.g:3899:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3903:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3904:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3904:1: ( 'with identifier' )
            // InternalSensidl.g:3905:1: 'with identifier'
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
    // InternalSensidl.g:3918:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3922:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:3923:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
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
    // InternalSensidl.g:3930:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3934:1: ( ( ':' ) )
            // InternalSensidl.g:3935:1: ( ':' )
            {
            // InternalSensidl.g:3935:1: ( ':' )
            // InternalSensidl.g:3936:1: ':'
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
    // InternalSensidl.g:3949:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3953:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3954:2: rule__MeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:3960:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3964:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3965:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3965:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3966:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3967:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3967:2: rule__MeasurementData__IDAssignment_5_2
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
    // InternalSensidl.g:3983:1: rule__MeasurementData__Group_6_0__0 : rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 ;
    public final void rule__MeasurementData__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3987:1: ( rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 )
            // InternalSensidl.g:3988:2: rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSensidl.g:3995:1: rule__MeasurementData__Group_6_0__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3999:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:4000:1: ( 'adjusted' )
            {
            // InternalSensidl.g:4000:1: ( 'adjusted' )
            // InternalSensidl.g:4001:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSensidl.g:4014:1: rule__MeasurementData__Group_6_0__1 : rule__MeasurementData__Group_6_0__1__Impl ;
    public final void rule__MeasurementData__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4018:1: ( rule__MeasurementData__Group_6_0__1__Impl )
            // InternalSensidl.g:4019:2: rule__MeasurementData__Group_6_0__1__Impl
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
    // InternalSensidl.g:4025:1: rule__MeasurementData__Group_6_0__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) ;
    public final void rule__MeasurementData__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4029:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) )
            // InternalSensidl.g:4030:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            {
            // InternalSensidl.g:4030:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            // InternalSensidl.g:4031:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 
            // InternalSensidl.g:4032:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            // InternalSensidl.g:4032:2: rule__MeasurementData__AdjustmentsAssignment_6_0_1
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
    // InternalSensidl.g:4046:1: rule__MeasurementData__Group_6_1__0 : rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 ;
    public final void rule__MeasurementData__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4050:1: ( rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 )
            // InternalSensidl.g:4051:2: rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSensidl.g:4058:1: rule__MeasurementData__Group_6_1__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4062:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:4063:1: ( 'adjusted' )
            {
            // InternalSensidl.g:4063:1: ( 'adjusted' )
            // InternalSensidl.g:4064:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSensidl.g:4077:1: rule__MeasurementData__Group_6_1__1 : rule__MeasurementData__Group_6_1__1__Impl ;
    public final void rule__MeasurementData__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4081:1: ( rule__MeasurementData__Group_6_1__1__Impl )
            // InternalSensidl.g:4082:2: rule__MeasurementData__Group_6_1__1__Impl
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
    // InternalSensidl.g:4088:1: rule__MeasurementData__Group_6_1__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) ;
    public final void rule__MeasurementData__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4092:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) )
            // InternalSensidl.g:4093:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            {
            // InternalSensidl.g:4093:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            // InternalSensidl.g:4094:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 
            // InternalSensidl.g:4095:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            // InternalSensidl.g:4095:2: rule__MeasurementData__AdjustmentsAssignment_6_1_1
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
    // InternalSensidl.g:4109:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4113:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:4114:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSensidl.g:4121:1: rule__MeasurementData__Group_6_2__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4125:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:4126:1: ( 'adjusted' )
            {
            // InternalSensidl.g:4126:1: ( 'adjusted' )
            // InternalSensidl.g:4127:1: 'adjusted'
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustedKeyword_6_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSensidl.g:4140:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4144:1: ( rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 )
            // InternalSensidl.g:4145:2: rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2
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
    // InternalSensidl.g:4152:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4156:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:4157:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:4157:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:4158:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:4159:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:4159:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
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
    // InternalSensidl.g:4169:1: rule__MeasurementData__Group_6_2__2 : rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 ;
    public final void rule__MeasurementData__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4173:1: ( rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 )
            // InternalSensidl.g:4174:2: rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalSensidl.g:4181:1: rule__MeasurementData__Group_6_2__2__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4185:1: ( ( ',' ) )
            // InternalSensidl.g:4186:1: ( ',' )
            {
            // InternalSensidl.g:4186:1: ( ',' )
            // InternalSensidl.g:4187:1: ','
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
    // InternalSensidl.g:4200:1: rule__MeasurementData__Group_6_2__3 : rule__MeasurementData__Group_6_2__3__Impl ;
    public final void rule__MeasurementData__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4204:1: ( rule__MeasurementData__Group_6_2__3__Impl )
            // InternalSensidl.g:4205:2: rule__MeasurementData__Group_6_2__3__Impl
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
    // InternalSensidl.g:4211:1: rule__MeasurementData__Group_6_2__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) ;
    public final void rule__MeasurementData__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4215:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) )
            // InternalSensidl.g:4216:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            {
            // InternalSensidl.g:4216:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            // InternalSensidl.g:4217:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 
            // InternalSensidl.g:4218:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            // InternalSensidl.g:4218:2: rule__MeasurementData__AdjustmentsAssignment_6_2_3
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
    // InternalSensidl.g:4236:1: rule__MeasurementData__Group_7__0 : rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 ;
    public final void rule__MeasurementData__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4240:1: ( rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 )
            // InternalSensidl.g:4241:2: rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSensidl.g:4248:1: rule__MeasurementData__Group_7__0__Impl : ( 'exclude:' ) ;
    public final void rule__MeasurementData__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4252:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:4253:1: ( 'exclude:' )
            {
            // InternalSensidl.g:4253:1: ( 'exclude:' )
            // InternalSensidl.g:4254:1: 'exclude:'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludeKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSensidl.g:4267:1: rule__MeasurementData__Group_7__1 : rule__MeasurementData__Group_7__1__Impl ;
    public final void rule__MeasurementData__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4271:1: ( rule__MeasurementData__Group_7__1__Impl )
            // InternalSensidl.g:4272:2: rule__MeasurementData__Group_7__1__Impl
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
    // InternalSensidl.g:4278:1: rule__MeasurementData__Group_7__1__Impl : ( ( rule__MeasurementData__Alternatives_7_1 ) ) ;
    public final void rule__MeasurementData__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4282:1: ( ( ( rule__MeasurementData__Alternatives_7_1 ) ) )
            // InternalSensidl.g:4283:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            {
            // InternalSensidl.g:4283:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            // InternalSensidl.g:4284:1: ( rule__MeasurementData__Alternatives_7_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_7_1()); 
            // InternalSensidl.g:4285:1: ( rule__MeasurementData__Alternatives_7_1 )
            // InternalSensidl.g:4285:2: rule__MeasurementData__Alternatives_7_1
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
    // InternalSensidl.g:4299:1: rule__MeasurementData__Group_7_1_0__0 : rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 ;
    public final void rule__MeasurementData__Group_7_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4303:1: ( rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 )
            // InternalSensidl.g:4304:2: rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1
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
    // InternalSensidl.g:4311:1: rule__MeasurementData__Group_7_1_0__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4315:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) )
            // InternalSensidl.g:4316:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            {
            // InternalSensidl.g:4316:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            // InternalSensidl.g:4317:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_0()); 
            // InternalSensidl.g:4318:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            // InternalSensidl.g:4318:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0
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
    // InternalSensidl.g:4328:1: rule__MeasurementData__Group_7_1_0__1 : rule__MeasurementData__Group_7_1_0__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4332:1: ( rule__MeasurementData__Group_7_1_0__1__Impl )
            // InternalSensidl.g:4333:2: rule__MeasurementData__Group_7_1_0__1__Impl
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
    // InternalSensidl.g:4339:1: rule__MeasurementData__Group_7_1_0__1__Impl : ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4343:1: ( ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) )
            // InternalSensidl.g:4344:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            {
            // InternalSensidl.g:4344:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            // InternalSensidl.g:4345:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0_1()); 
            // InternalSensidl.g:4346:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSensidl.g:4346:2: rule__MeasurementData__Group_7_1_0_1__0
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
    // InternalSensidl.g:4360:1: rule__MeasurementData__Group_7_1_0_1__0 : rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 ;
    public final void rule__MeasurementData__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4364:1: ( rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 )
            // InternalSensidl.g:4365:2: rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:4372:1: rule__MeasurementData__Group_7_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4376:1: ( ( ',' ) )
            // InternalSensidl.g:4377:1: ( ',' )
            {
            // InternalSensidl.g:4377:1: ( ',' )
            // InternalSensidl.g:4378:1: ','
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
    // InternalSensidl.g:4391:1: rule__MeasurementData__Group_7_1_0_1__1 : rule__MeasurementData__Group_7_1_0_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4395:1: ( rule__MeasurementData__Group_7_1_0_1__1__Impl )
            // InternalSensidl.g:4396:2: rule__MeasurementData__Group_7_1_0_1__1__Impl
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
    // InternalSensidl.g:4402:1: rule__MeasurementData__Group_7_1_0_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4406:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) )
            // InternalSensidl.g:4407:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            {
            // InternalSensidl.g:4407:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            // InternalSensidl.g:4408:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_1_1()); 
            // InternalSensidl.g:4409:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            // InternalSensidl.g:4409:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1
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
    // InternalSensidl.g:4423:1: rule__MeasurementData__Group_7_1_1__0 : rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4427:1: ( rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 )
            // InternalSensidl.g:4428:2: rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1
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
    // InternalSensidl.g:4435:1: rule__MeasurementData__Group_7_1_1__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4439:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) )
            // InternalSensidl.g:4440:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            {
            // InternalSensidl.g:4440:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            // InternalSensidl.g:4441:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_0()); 
            // InternalSensidl.g:4442:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            // InternalSensidl.g:4442:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0
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
    // InternalSensidl.g:4452:1: rule__MeasurementData__Group_7_1_1__1 : rule__MeasurementData__Group_7_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4456:1: ( rule__MeasurementData__Group_7_1_1__1__Impl )
            // InternalSensidl.g:4457:2: rule__MeasurementData__Group_7_1_1__1__Impl
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
    // InternalSensidl.g:4463:1: rule__MeasurementData__Group_7_1_1__1__Impl : ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4467:1: ( ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) )
            // InternalSensidl.g:4468:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            {
            // InternalSensidl.g:4468:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            // InternalSensidl.g:4469:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1_1()); 
            // InternalSensidl.g:4470:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==34) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSensidl.g:4470:2: rule__MeasurementData__Group_7_1_1_1__0
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
    // InternalSensidl.g:4484:1: rule__MeasurementData__Group_7_1_1_1__0 : rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4488:1: ( rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 )
            // InternalSensidl.g:4489:2: rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSensidl.g:4496:1: rule__MeasurementData__Group_7_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4500:1: ( ( ',' ) )
            // InternalSensidl.g:4501:1: ( ',' )
            {
            // InternalSensidl.g:4501:1: ( ',' )
            // InternalSensidl.g:4502:1: ','
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
    // InternalSensidl.g:4515:1: rule__MeasurementData__Group_7_1_1_1__1 : rule__MeasurementData__Group_7_1_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4519:1: ( rule__MeasurementData__Group_7_1_1_1__1__Impl )
            // InternalSensidl.g:4520:2: rule__MeasurementData__Group_7_1_1_1__1__Impl
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
    // InternalSensidl.g:4526:1: rule__MeasurementData__Group_7_1_1_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4530:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) )
            // InternalSensidl.g:4531:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            {
            // InternalSensidl.g:4531:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            // InternalSensidl.g:4532:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_1_1()); 
            // InternalSensidl.g:4533:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            // InternalSensidl.g:4533:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1
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
    // InternalSensidl.g:4547:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4551:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:4552:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
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
    // InternalSensidl.g:4559:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4563:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:4564:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:4564:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:4565:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:4566:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:4566:2: rule__NonMeasurementData__NameAssignment_0
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
    // InternalSensidl.g:4576:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4580:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:4581:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSensidl.g:4588:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4592:1: ( ( 'as' ) )
            // InternalSensidl.g:4593:1: ( 'as' )
            {
            // InternalSensidl.g:4593:1: ( 'as' )
            // InternalSensidl.g:4594:1: 'as'
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
    // InternalSensidl.g:4607:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4611:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:4612:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:4619:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4623:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:4624:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:4624:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:4625:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:4626:1: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:4626:2: rule__NonMeasurementData__Alternatives_2
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
    // InternalSensidl.g:4636:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4640:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:4641:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:4648:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__Alternatives_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4652:1: ( ( ( rule__NonMeasurementData__Alternatives_3 )? ) )
            // InternalSensidl.g:4653:1: ( ( rule__NonMeasurementData__Alternatives_3 )? )
            {
            // InternalSensidl.g:4653:1: ( ( rule__NonMeasurementData__Alternatives_3 )? )
            // InternalSensidl.g:4654:1: ( rule__NonMeasurementData__Alternatives_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_3()); 
            // InternalSensidl.g:4655:1: ( rule__NonMeasurementData__Alternatives_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50||LA42_0==68) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSensidl.g:4655:2: rule__NonMeasurementData__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalSensidl.g:4665:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4669:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:4670:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:4677:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4681:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:4682:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:4682:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:4683:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:4684:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSensidl.g:4684:2: rule__NonMeasurementData__Group_4__0
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
    // InternalSensidl.g:4694:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4698:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:4699:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:4706:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4710:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:4711:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:4711:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:4712:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:4713:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSensidl.g:4713:2: rule__NonMeasurementData__Group_5__0
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
    // InternalSensidl.g:4723:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4727:1: ( rule__NonMeasurementData__Group__6__Impl )
            // InternalSensidl.g:4728:2: rule__NonMeasurementData__Group__6__Impl
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
    // InternalSensidl.g:4734:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4738:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) )
            // InternalSensidl.g:4739:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            {
            // InternalSensidl.g:4739:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            // InternalSensidl.g:4740:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 
            // InternalSensidl.g:4741:1: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DESCRIPTION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSensidl.g:4741:2: rule__NonMeasurementData__DescriptionAssignment_6
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


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__0"
    // InternalSensidl.g:4765:1: rule__NonMeasurementData__Group_3_0__0 : rule__NonMeasurementData__Group_3_0__0__Impl rule__NonMeasurementData__Group_3_0__1 ;
    public final void rule__NonMeasurementData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4769:1: ( rule__NonMeasurementData__Group_3_0__0__Impl rule__NonMeasurementData__Group_3_0__1 )
            // InternalSensidl.g:4770:2: rule__NonMeasurementData__Group_3_0__0__Impl rule__NonMeasurementData__Group_3_0__1
            {
            pushFollow(FOLLOW_47);
            rule__NonMeasurementData__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__0"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__0__Impl"
    // InternalSensidl.g:4777:1: rule__NonMeasurementData__Group_3_0__0__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4781:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) ) )
            // InternalSensidl.g:4782:1: ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) )
            {
            // InternalSensidl.g:4782:1: ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) )
            // InternalSensidl.g:4783:1: ( rule__NonMeasurementData__ConstantAssignment_3_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3_0_0()); 
            // InternalSensidl.g:4784:1: ( rule__NonMeasurementData__ConstantAssignment_3_0_0 )
            // InternalSensidl.g:4784:2: rule__NonMeasurementData__ConstantAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ConstantAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__1"
    // InternalSensidl.g:4794:1: rule__NonMeasurementData__Group_3_0__1 : rule__NonMeasurementData__Group_3_0__1__Impl rule__NonMeasurementData__Group_3_0__2 ;
    public final void rule__NonMeasurementData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4798:1: ( rule__NonMeasurementData__Group_3_0__1__Impl rule__NonMeasurementData__Group_3_0__2 )
            // InternalSensidl.g:4799:2: rule__NonMeasurementData__Group_3_0__1__Impl rule__NonMeasurementData__Group_3_0__2
            {
            pushFollow(FOLLOW_48);
            rule__NonMeasurementData__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__1"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__1__Impl"
    // InternalSensidl.g:4806:1: rule__NonMeasurementData__Group_3_0__1__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4810:1: ( ( 'value' ) )
            // InternalSensidl.g:4811:1: ( 'value' )
            {
            // InternalSensidl.g:4811:1: ( 'value' )
            // InternalSensidl.g:4812:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_0_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__2"
    // InternalSensidl.g:4825:1: rule__NonMeasurementData__Group_3_0__2 : rule__NonMeasurementData__Group_3_0__2__Impl rule__NonMeasurementData__Group_3_0__3 ;
    public final void rule__NonMeasurementData__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4829:1: ( rule__NonMeasurementData__Group_3_0__2__Impl rule__NonMeasurementData__Group_3_0__3 )
            // InternalSensidl.g:4830:2: rule__NonMeasurementData__Group_3_0__2__Impl rule__NonMeasurementData__Group_3_0__3
            {
            pushFollow(FOLLOW_9);
            rule__NonMeasurementData__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__2"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__2__Impl"
    // InternalSensidl.g:4837:1: rule__NonMeasurementData__Group_3_0__2__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4841:1: ( ( '=' ) )
            // InternalSensidl.g:4842:1: ( '=' )
            {
            // InternalSensidl.g:4842:1: ( '=' )
            // InternalSensidl.g:4843:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_0_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__2__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__3"
    // InternalSensidl.g:4856:1: rule__NonMeasurementData__Group_3_0__3 : rule__NonMeasurementData__Group_3_0__3__Impl ;
    public final void rule__NonMeasurementData__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4860:1: ( rule__NonMeasurementData__Group_3_0__3__Impl )
            // InternalSensidl.g:4861:2: rule__NonMeasurementData__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__3"


    // $ANTLR start "rule__NonMeasurementData__Group_3_0__3__Impl"
    // InternalSensidl.g:4867:1: rule__NonMeasurementData__Group_3_0__3__Impl : ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) ) ;
    public final void rule__NonMeasurementData__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4871:1: ( ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) ) )
            // InternalSensidl.g:4872:1: ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) )
            {
            // InternalSensidl.g:4872:1: ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) )
            // InternalSensidl.g:4873:1: ( rule__NonMeasurementData__ValueAssignment_3_0_3 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_3_0_3()); 
            // InternalSensidl.g:4874:1: ( rule__NonMeasurementData__ValueAssignment_3_0_3 )
            // InternalSensidl.g:4874:2: rule__NonMeasurementData__ValueAssignment_3_0_3
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ValueAssignment_3_0_3();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_0__3__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_3_1__0"
    // InternalSensidl.g:4892:1: rule__NonMeasurementData__Group_3_1__0 : rule__NonMeasurementData__Group_3_1__0__Impl rule__NonMeasurementData__Group_3_1__1 ;
    public final void rule__NonMeasurementData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4896:1: ( rule__NonMeasurementData__Group_3_1__0__Impl rule__NonMeasurementData__Group_3_1__1 )
            // InternalSensidl.g:4897:2: rule__NonMeasurementData__Group_3_1__0__Impl rule__NonMeasurementData__Group_3_1__1
            {
            pushFollow(FOLLOW_48);
            rule__NonMeasurementData__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_3_1__0__Impl"
    // InternalSensidl.g:4904:1: rule__NonMeasurementData__Group_3_1__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4908:1: ( ( 'value' ) )
            // InternalSensidl.g:4909:1: ( 'value' )
            {
            // InternalSensidl.g:4909:1: ( 'value' )
            // InternalSensidl.g:4910:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_3_1__1"
    // InternalSensidl.g:4923:1: rule__NonMeasurementData__Group_3_1__1 : rule__NonMeasurementData__Group_3_1__1__Impl rule__NonMeasurementData__Group_3_1__2 ;
    public final void rule__NonMeasurementData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4927:1: ( rule__NonMeasurementData__Group_3_1__1__Impl rule__NonMeasurementData__Group_3_1__2 )
            // InternalSensidl.g:4928:2: rule__NonMeasurementData__Group_3_1__1__Impl rule__NonMeasurementData__Group_3_1__2
            {
            pushFollow(FOLLOW_9);
            rule__NonMeasurementData__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_3_1__1__Impl"
    // InternalSensidl.g:4935:1: rule__NonMeasurementData__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4939:1: ( ( '=' ) )
            // InternalSensidl.g:4940:1: ( '=' )
            {
            // InternalSensidl.g:4940:1: ( '=' )
            // InternalSensidl.g:4941:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_1__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_3_1__2"
    // InternalSensidl.g:4954:1: rule__NonMeasurementData__Group_3_1__2 : rule__NonMeasurementData__Group_3_1__2__Impl ;
    public final void rule__NonMeasurementData__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4958:1: ( rule__NonMeasurementData__Group_3_1__2__Impl )
            // InternalSensidl.g:4959:2: rule__NonMeasurementData__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_1__2"


    // $ANTLR start "rule__NonMeasurementData__Group_3_1__2__Impl"
    // InternalSensidl.g:4965:1: rule__NonMeasurementData__Group_3_1__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) ) ;
    public final void rule__NonMeasurementData__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4969:1: ( ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) ) )
            // InternalSensidl.g:4970:1: ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) )
            {
            // InternalSensidl.g:4970:1: ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) )
            // InternalSensidl.g:4971:1: ( rule__NonMeasurementData__ValueAssignment_3_1_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_3_1_2()); 
            // InternalSensidl.g:4972:1: ( rule__NonMeasurementData__ValueAssignment_3_1_2 )
            // InternalSensidl.g:4972:2: rule__NonMeasurementData__ValueAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ValueAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_3_1__2__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_4__0"
    // InternalSensidl.g:4988:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4992:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:4993:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSensidl.g:5000:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5004:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:5005:1: ( 'with identifier' )
            {
            // InternalSensidl.g:5005:1: ( 'with identifier' )
            // InternalSensidl.g:5006:1: 'with identifier'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getWithIdentifierKeyword_4_0()); 

            }


            }

        }
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
    // InternalSensidl.g:5019:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5023:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:5024:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
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
    // InternalSensidl.g:5031:1: rule__NonMeasurementData__Group_4__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5035:1: ( ( ':' ) )
            // InternalSensidl.g:5036:1: ( ':' )
            {
            // InternalSensidl.g:5036:1: ( ':' )
            // InternalSensidl.g:5037:1: ':'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getColonKeyword_4_1()); 

            }


            }

        }
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
    // InternalSensidl.g:5050:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5054:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:5055:2: rule__NonMeasurementData__Group_4__2__Impl
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
    // InternalSensidl.g:5061:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5065:1: ( ( ( rule__NonMeasurementData__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:5066:1: ( ( rule__NonMeasurementData__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:5066:1: ( ( rule__NonMeasurementData__IDAssignment_4_2 ) )
            // InternalSensidl.g:5067:1: ( rule__NonMeasurementData__IDAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:5068:1: ( rule__NonMeasurementData__IDAssignment_4_2 )
            // InternalSensidl.g:5068:2: rule__NonMeasurementData__IDAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__IDAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_4_2()); 

            }


            }

        }
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
    // InternalSensidl.g:5084:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5088:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:5089:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSensidl.g:5096:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'exclude:' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5100:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:5101:1: ( 'exclude:' )
            {
            // InternalSensidl.g:5101:1: ( 'exclude:' )
            // InternalSensidl.g:5102:1: 'exclude:'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_5_0()); 

            }


            }

        }
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
    // InternalSensidl.g:5115:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5119:1: ( rule__NonMeasurementData__Group_5__1__Impl )
            // InternalSensidl.g:5120:2: rule__NonMeasurementData__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:5126:1: rule__NonMeasurementData__Group_5__1__Impl : ( ( rule__NonMeasurementData__Alternatives_5_1 ) ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5130:1: ( ( ( rule__NonMeasurementData__Alternatives_5_1 ) ) )
            // InternalSensidl.g:5131:1: ( ( rule__NonMeasurementData__Alternatives_5_1 ) )
            {
            // InternalSensidl.g:5131:1: ( ( rule__NonMeasurementData__Alternatives_5_1 ) )
            // InternalSensidl.g:5132:1: ( rule__NonMeasurementData__Alternatives_5_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_5_1()); 
            // InternalSensidl.g:5133:1: ( rule__NonMeasurementData__Alternatives_5_1 )
            // InternalSensidl.g:5133:2: rule__NonMeasurementData__Alternatives_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Alternatives_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getAlternatives_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0__0"
    // InternalSensidl.g:5147:1: rule__NonMeasurementData__Group_5_1_0__0 : rule__NonMeasurementData__Group_5_1_0__0__Impl rule__NonMeasurementData__Group_5_1_0__1 ;
    public final void rule__NonMeasurementData__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5151:1: ( rule__NonMeasurementData__Group_5_1_0__0__Impl rule__NonMeasurementData__Group_5_1_0__1 )
            // InternalSensidl.g:5152:2: rule__NonMeasurementData__Group_5_1_0__0__Impl rule__NonMeasurementData__Group_5_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__NonMeasurementData__Group_5_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0__0"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0__0__Impl"
    // InternalSensidl.g:5159:1: rule__NonMeasurementData__Group_5_1_0__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5163:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) ) )
            // InternalSensidl.g:5164:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) )
            {
            // InternalSensidl.g:5164:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) )
            // InternalSensidl.g:5165:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_0_0()); 
            // InternalSensidl.g:5166:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 )
            // InternalSensidl.g:5166:2: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0__1"
    // InternalSensidl.g:5176:1: rule__NonMeasurementData__Group_5_1_0__1 : rule__NonMeasurementData__Group_5_1_0__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5180:1: ( rule__NonMeasurementData__Group_5_1_0__1__Impl )
            // InternalSensidl.g:5181:2: rule__NonMeasurementData__Group_5_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0__1"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0__1__Impl"
    // InternalSensidl.g:5187:1: rule__NonMeasurementData__Group_5_1_0__1__Impl : ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5191:1: ( ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? ) )
            // InternalSensidl.g:5192:1: ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? )
            {
            // InternalSensidl.g:5192:1: ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? )
            // InternalSensidl.g:5193:1: ( rule__NonMeasurementData__Group_5_1_0_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_0_1()); 
            // InternalSensidl.g:5194:1: ( rule__NonMeasurementData__Group_5_1_0_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSensidl.g:5194:2: rule__NonMeasurementData__Group_5_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_5_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0_1__0"
    // InternalSensidl.g:5208:1: rule__NonMeasurementData__Group_5_1_0_1__0 : rule__NonMeasurementData__Group_5_1_0_1__0__Impl rule__NonMeasurementData__Group_5_1_0_1__1 ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5212:1: ( rule__NonMeasurementData__Group_5_1_0_1__0__Impl rule__NonMeasurementData__Group_5_1_0_1__1 )
            // InternalSensidl.g:5213:2: rule__NonMeasurementData__Group_5_1_0_1__0__Impl rule__NonMeasurementData__Group_5_1_0_1__1
            {
            pushFollow(FOLLOW_43);
            rule__NonMeasurementData__Group_5_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0_1__0__Impl"
    // InternalSensidl.g:5220:1: rule__NonMeasurementData__Group_5_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5224:1: ( ( ',' ) )
            // InternalSensidl.g:5225:1: ( ',' )
            {
            // InternalSensidl.g:5225:1: ( ',' )
            // InternalSensidl.g:5226:1: ','
            {
             before(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_0_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0_1__1"
    // InternalSensidl.g:5239:1: rule__NonMeasurementData__Group_5_1_0_1__1 : rule__NonMeasurementData__Group_5_1_0_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5243:1: ( rule__NonMeasurementData__Group_5_1_0_1__1__Impl )
            // InternalSensidl.g:5244:2: rule__NonMeasurementData__Group_5_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_0_1__1__Impl"
    // InternalSensidl.g:5250:1: rule__NonMeasurementData__Group_5_1_0_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5254:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) ) )
            // InternalSensidl.g:5255:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) )
            {
            // InternalSensidl.g:5255:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) )
            // InternalSensidl.g:5256:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_0_1_1()); 
            // InternalSensidl.g:5257:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 )
            // InternalSensidl.g:5257:2: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_0_1__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1__0"
    // InternalSensidl.g:5271:1: rule__NonMeasurementData__Group_5_1_1__0 : rule__NonMeasurementData__Group_5_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1__1 ;
    public final void rule__NonMeasurementData__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5275:1: ( rule__NonMeasurementData__Group_5_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1__1 )
            // InternalSensidl.g:5276:2: rule__NonMeasurementData__Group_5_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__NonMeasurementData__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1__0__Impl"
    // InternalSensidl.g:5283:1: rule__NonMeasurementData__Group_5_1_1__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5287:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) ) )
            // InternalSensidl.g:5288:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) )
            {
            // InternalSensidl.g:5288:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) )
            // InternalSensidl.g:5289:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_1_0()); 
            // InternalSensidl.g:5290:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 )
            // InternalSensidl.g:5290:2: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1__1"
    // InternalSensidl.g:5300:1: rule__NonMeasurementData__Group_5_1_1__1 : rule__NonMeasurementData__Group_5_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5304:1: ( rule__NonMeasurementData__Group_5_1_1__1__Impl )
            // InternalSensidl.g:5305:2: rule__NonMeasurementData__Group_5_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1__1__Impl"
    // InternalSensidl.g:5311:1: rule__NonMeasurementData__Group_5_1_1__1__Impl : ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5315:1: ( ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? ) )
            // InternalSensidl.g:5316:1: ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? )
            {
            // InternalSensidl.g:5316:1: ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? )
            // InternalSensidl.g:5317:1: ( rule__NonMeasurementData__Group_5_1_1_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_1_1()); 
            // InternalSensidl.g:5318:1: ( rule__NonMeasurementData__Group_5_1_1_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSensidl.g:5318:2: rule__NonMeasurementData__Group_5_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonMeasurementData__Group_5_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1_1__0"
    // InternalSensidl.g:5332:1: rule__NonMeasurementData__Group_5_1_1_1__0 : rule__NonMeasurementData__Group_5_1_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1_1__1 ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5336:1: ( rule__NonMeasurementData__Group_5_1_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1_1__1 )
            // InternalSensidl.g:5337:2: rule__NonMeasurementData__Group_5_1_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1_1__1
            {
            pushFollow(FOLLOW_44);
            rule__NonMeasurementData__Group_5_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1_1__0"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1_1__0__Impl"
    // InternalSensidl.g:5344:1: rule__NonMeasurementData__Group_5_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5348:1: ( ( ',' ) )
            // InternalSensidl.g:5349:1: ( ',' )
            {
            // InternalSensidl.g:5349:1: ( ',' )
            // InternalSensidl.g:5350:1: ','
            {
             before(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getCommaKeyword_5_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1_1__0__Impl"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1_1__1"
    // InternalSensidl.g:5363:1: rule__NonMeasurementData__Group_5_1_1_1__1 : rule__NonMeasurementData__Group_5_1_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5367:1: ( rule__NonMeasurementData__Group_5_1_1_1__1__Impl )
            // InternalSensidl.g:5368:2: rule__NonMeasurementData__Group_5_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__Group_5_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1_1__1"


    // $ANTLR start "rule__NonMeasurementData__Group_5_1_1_1__1__Impl"
    // InternalSensidl.g:5374:1: rule__NonMeasurementData__Group_5_1_1_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5378:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) ) )
            // InternalSensidl.g:5379:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) )
            {
            // InternalSensidl.g:5379:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) )
            // InternalSensidl.g:5380:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_1_1_1()); 
            // InternalSensidl.g:5381:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 )
            // InternalSensidl.g:5381:2: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__Group_5_1_1_1__1__Impl"


    // $ANTLR start "rule__MeasurementDataNotAdjustable__Group__0"
    // InternalSensidl.g:5395:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5399:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:5400:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
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
    // InternalSensidl.g:5407:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5411:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:5412:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:5412:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:5413:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:5414:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:5414:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
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
    // InternalSensidl.g:5424:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5428:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:5429:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSensidl.g:5436:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5440:1: ( ( 'as' ) )
            // InternalSensidl.g:5441:1: ( 'as' )
            {
            // InternalSensidl.g:5441:1: ( 'as' )
            // InternalSensidl.g:5442:1: 'as'
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
    // InternalSensidl.g:5455:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5459:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:5460:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSensidl.g:5467:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5471:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:5472:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:5472:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:5473:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:5474:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:5474:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
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
    // InternalSensidl.g:5484:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5488:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:5489:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalSensidl.g:5496:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5500:1: ( ( 'in' ) )
            // InternalSensidl.g:5501:1: ( 'in' )
            {
            // InternalSensidl.g:5501:1: ( 'in' )
            // InternalSensidl.g:5502:1: 'in'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getInKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSensidl.g:5515:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5519:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:5520:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:5527:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5531:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:5532:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:5532:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:5533:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:5534:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:5534:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
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
    // InternalSensidl.g:5544:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5548:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:5549:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:5556:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5560:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:5561:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:5561:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:5562:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:5563:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSensidl.g:5563:2: rule__MeasurementDataNotAdjustable__Group_5__0
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
    // InternalSensidl.g:5573:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5577:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 )
            // InternalSensidl.g:5578:2: rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:5585:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5589:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) )
            // InternalSensidl.g:5590:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            {
            // InternalSensidl.g:5590:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            // InternalSensidl.g:5591:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6()); 
            // InternalSensidl.g:5592:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSensidl.g:5592:2: rule__MeasurementDataNotAdjustable__Group_6__0
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
    // InternalSensidl.g:5602:1: rule__MeasurementDataNotAdjustable__Group__7 : rule__MeasurementDataNotAdjustable__Group__7__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5606:1: ( rule__MeasurementDataNotAdjustable__Group__7__Impl )
            // InternalSensidl.g:5607:2: rule__MeasurementDataNotAdjustable__Group__7__Impl
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
    // InternalSensidl.g:5613:1: rule__MeasurementDataNotAdjustable__Group__7__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5617:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:5618:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:5618:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            // InternalSensidl.g:5619:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:5620:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DESCRIPTION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSensidl.g:5620:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7
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
    // InternalSensidl.g:5646:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5650:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:5651:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
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
    // InternalSensidl.g:5658:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5662:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:5663:1: ( 'with identifier' )
            {
            // InternalSensidl.g:5663:1: ( 'with identifier' )
            // InternalSensidl.g:5664:1: 'with identifier'
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
    // InternalSensidl.g:5677:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5681:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:5682:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
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
    // InternalSensidl.g:5689:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5693:1: ( ( ':' ) )
            // InternalSensidl.g:5694:1: ( ':' )
            {
            // InternalSensidl.g:5694:1: ( ':' )
            // InternalSensidl.g:5695:1: ':'
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
    // InternalSensidl.g:5708:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5712:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:5713:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
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
    // InternalSensidl.g:5719:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5723:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:5724:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:5724:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:5725:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:5726:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:5726:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
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
    // InternalSensidl.g:5742:1: rule__MeasurementDataNotAdjustable__Group_6__0 : rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5746:1: ( rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 )
            // InternalSensidl.g:5747:2: rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1
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
    // InternalSensidl.g:5754:1: rule__MeasurementDataNotAdjustable__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5758:1: ( ( 'exclude' ) )
            // InternalSensidl.g:5759:1: ( 'exclude' )
            {
            // InternalSensidl.g:5759:1: ( 'exclude' )
            // InternalSensidl.g:5760:1: 'exclude'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludeKeyword_6_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSensidl.g:5773:1: rule__MeasurementDataNotAdjustable__Group_6__1 : rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5777:1: ( rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 )
            // InternalSensidl.g:5778:2: rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSensidl.g:5785:1: rule__MeasurementDataNotAdjustable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5789:1: ( ( ':' ) )
            // InternalSensidl.g:5790:1: ( ':' )
            {
            // InternalSensidl.g:5790:1: ( ':' )
            // InternalSensidl.g:5791:1: ':'
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
    // InternalSensidl.g:5804:1: rule__MeasurementDataNotAdjustable__Group_6__2 : rule__MeasurementDataNotAdjustable__Group_6__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5808:1: ( rule__MeasurementDataNotAdjustable__Group_6__2__Impl )
            // InternalSensidl.g:5809:2: rule__MeasurementDataNotAdjustable__Group_6__2__Impl
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
    // InternalSensidl.g:5815:1: rule__MeasurementDataNotAdjustable__Group_6__2__Impl : ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5819:1: ( ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) )
            // InternalSensidl.g:5820:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            {
            // InternalSensidl.g:5820:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            // InternalSensidl.g:5821:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAlternatives_6_2()); 
            // InternalSensidl.g:5822:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            // InternalSensidl.g:5822:2: rule__MeasurementDataNotAdjustable__Alternatives_6_2
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
    // InternalSensidl.g:5838:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5842:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 )
            // InternalSensidl.g:5843:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1
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
    // InternalSensidl.g:5850:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5854:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) )
            // InternalSensidl.g:5855:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            {
            // InternalSensidl.g:5855:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            // InternalSensidl.g:5856:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_0()); 
            // InternalSensidl.g:5857:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            // InternalSensidl.g:5857:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0
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
    // InternalSensidl.g:5867:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5871:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl )
            // InternalSensidl.g:5872:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl
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
    // InternalSensidl.g:5878:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5882:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) )
            // InternalSensidl.g:5883:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            {
            // InternalSensidl.g:5883:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            // InternalSensidl.g:5884:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0_1()); 
            // InternalSensidl.g:5885:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSensidl.g:5885:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0
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
    // InternalSensidl.g:5899:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5903:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 )
            // InternalSensidl.g:5904:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:5911:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5915:1: ( ( ',' ) )
            // InternalSensidl.g:5916:1: ( ',' )
            {
            // InternalSensidl.g:5916:1: ( ',' )
            // InternalSensidl.g:5917:1: ','
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
    // InternalSensidl.g:5930:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5934:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl )
            // InternalSensidl.g:5935:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl
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
    // InternalSensidl.g:5941:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5945:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) )
            // InternalSensidl.g:5946:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            {
            // InternalSensidl.g:5946:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            // InternalSensidl.g:5947:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_1_1()); 
            // InternalSensidl.g:5948:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            // InternalSensidl.g:5948:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1
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
    // InternalSensidl.g:5962:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5966:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 )
            // InternalSensidl.g:5967:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1
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
    // InternalSensidl.g:5974:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5978:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) )
            // InternalSensidl.g:5979:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            {
            // InternalSensidl.g:5979:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            // InternalSensidl.g:5980:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_0()); 
            // InternalSensidl.g:5981:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            // InternalSensidl.g:5981:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0
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
    // InternalSensidl.g:5991:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5995:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl )
            // InternalSensidl.g:5996:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl
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
    // InternalSensidl.g:6002:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6006:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) )
            // InternalSensidl.g:6007:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            {
            // InternalSensidl.g:6007:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            // InternalSensidl.g:6008:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1_1()); 
            // InternalSensidl.g:6009:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSensidl.g:6009:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0
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
    // InternalSensidl.g:6023:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6027:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 )
            // InternalSensidl.g:6028:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSensidl.g:6035:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6039:1: ( ( ',' ) )
            // InternalSensidl.g:6040:1: ( ',' )
            {
            // InternalSensidl.g:6040:1: ( ',' )
            // InternalSensidl.g:6041:1: ','
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
    // InternalSensidl.g:6054:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6058:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl )
            // InternalSensidl.g:6059:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl
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
    // InternalSensidl.g:6065:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6069:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) )
            // InternalSensidl.g:6070:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            {
            // InternalSensidl.g:6070:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            // InternalSensidl.g:6071:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_1_1()); 
            // InternalSensidl.g:6072:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            // InternalSensidl.g:6072:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1
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
    // InternalSensidl.g:6086:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6090:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:6091:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalSensidl.g:6098:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6102:1: ( ( 'with range' ) )
            // InternalSensidl.g:6103:1: ( 'with range' )
            {
            // InternalSensidl.g:6103:1: ( 'with range' )
            // InternalSensidl.g:6104:1: 'with range'
            {
             before(grammarAccess.getDataRangeAccess().getWithRangeKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSensidl.g:6117:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6121:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:6122:2: rule__DataRange__Group__1__Impl
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
    // InternalSensidl.g:6128:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6132:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:6133:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:6133:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:6134:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:6135:1: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:6135:2: rule__DataRange__RangeAssignment_1
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
    // InternalSensidl.g:6149:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6153:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:6154:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSensidl.g:6161:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6165:1: ( ( '[' ) )
            // InternalSensidl.g:6166:1: ( '[' )
            {
            // InternalSensidl.g:6166:1: ( '[' )
            // InternalSensidl.g:6167:1: '['
            {
             before(grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSensidl.g:6180:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6184:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:6185:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalSensidl.g:6192:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6196:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:6197:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:6197:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:6198:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:6199:1: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:6199:2: rule__Interval__LowerBoundAssignment_1
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
    // InternalSensidl.g:6209:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6213:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:6214:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalSensidl.g:6221:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6225:1: ( ( ';' ) )
            // InternalSensidl.g:6226:1: ( ';' )
            {
            // InternalSensidl.g:6226:1: ( ';' )
            // InternalSensidl.g:6227:1: ';'
            {
             before(grammarAccess.getIntervalAccess().getSemicolonKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSensidl.g:6240:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6244:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:6245:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalSensidl.g:6252:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6256:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:6257:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:6257:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:6258:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:6259:1: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:6259:2: rule__Interval__UpperBoundAssignment_3
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
    // InternalSensidl.g:6269:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6273:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:6274:2: rule__Interval__Group__4__Impl
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
    // InternalSensidl.g:6280:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6284:1: ( ( ']' ) )
            // InternalSensidl.g:6285:1: ( ']' )
            {
            // InternalSensidl.g:6285:1: ( ']' )
            // InternalSensidl.g:6286:1: ']'
            {
             before(grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSensidl.g:6309:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6313:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:6314:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
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
    // InternalSensidl.g:6321:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6325:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:6326:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:6326:1: ( 'with scaling factor' )
            // InternalSensidl.g:6327:1: 'with scaling factor'
            {
             before(grammarAccess.getLinearDataConversionAccess().getWithScalingFactorKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalSensidl.g:6340:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6344:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:6345:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalSensidl.g:6352:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6356:1: ( ( ':' ) )
            // InternalSensidl.g:6357:1: ( ':' )
            {
            // InternalSensidl.g:6357:1: ( ':' )
            // InternalSensidl.g:6358:1: ':'
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
    // InternalSensidl.g:6371:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6375:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:6376:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalSensidl.g:6383:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6387:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:6388:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:6388:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:6389:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:6390:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:6390:2: rule__LinearDataConversion__ScalingFactorAssignment_2
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
    // InternalSensidl.g:6400:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6404:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:6405:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
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
    // InternalSensidl.g:6412:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6416:1: ( ( 'and offset' ) )
            // InternalSensidl.g:6417:1: ( 'and offset' )
            {
            // InternalSensidl.g:6417:1: ( 'and offset' )
            // InternalSensidl.g:6418:1: 'and offset'
            {
             before(grammarAccess.getLinearDataConversionAccess().getAndOffsetKeyword_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalSensidl.g:6431:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6435:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:6436:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
            {
            pushFollow(FOLLOW_51);
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
    // InternalSensidl.g:6443:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6447:1: ( ( ':' ) )
            // InternalSensidl.g:6448:1: ( ':' )
            {
            // InternalSensidl.g:6448:1: ( ':' )
            // InternalSensidl.g:6449:1: ':'
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
    // InternalSensidl.g:6462:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6466:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:6467:2: rule__LinearDataConversion__Group__5__Impl
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
    // InternalSensidl.g:6473:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6477:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:6478:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:6478:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:6479:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:6480:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:6480:2: rule__LinearDataConversion__OffsetAssignment_5
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
    // InternalSensidl.g:6502:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6506:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:6507:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalSensidl.g:6514:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6518:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:6519:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:6519:1: ( 'by linear mapping' )
            // InternalSensidl.g:6520:1: 'by linear mapping'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getByLinearMappingKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalSensidl.g:6533:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6537:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:6538:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalSensidl.g:6545:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6549:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:6550:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:6550:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:6551:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:6552:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:6552:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
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
    // InternalSensidl.g:6562:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6566:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:6567:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalSensidl.g:6574:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6578:1: ( ( '=>' ) )
            // InternalSensidl.g:6579:1: ( '=>' )
            {
            // InternalSensidl.g:6579:1: ( '=>' )
            // InternalSensidl.g:6580:1: '=>'
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalSensidl.g:6593:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6597:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:6598:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
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
    // InternalSensidl.g:6605:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6609:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:6610:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:6610:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:6611:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:6612:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:6612:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
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
    // InternalSensidl.g:6622:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6626:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:6627:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalSensidl.g:6634:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6638:1: ( ( 'as' ) )
            // InternalSensidl.g:6639:1: ( 'as' )
            {
            // InternalSensidl.g:6639:1: ( 'as' )
            // InternalSensidl.g:6640:1: 'as'
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
    // InternalSensidl.g:6653:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6657:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:6658:2: rule__LinearDataConversionWithInterval__Group__5__Impl
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
    // InternalSensidl.g:6664:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6668:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:6669:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:6669:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:6670:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:6671:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:6671:2: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
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
    // InternalSensidl.g:6693:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6697:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:6698:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
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
    // InternalSensidl.g:6705:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6709:1: ( ( ( '-' )? ) )
            // InternalSensidl.g:6710:1: ( ( '-' )? )
            {
            // InternalSensidl.g:6710:1: ( ( '-' )? )
            // InternalSensidl.g:6711:1: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // InternalSensidl.g:6712:1: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==61) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSensidl.g:6713:2: '-'
                    {
                    match(input,61,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalSensidl.g:6724:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6728:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalSensidl.g:6729:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSensidl.g:6736:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6740:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6741:1: ( RULE_INT )
            {
            // InternalSensidl.g:6741:1: ( RULE_INT )
            // InternalSensidl.g:6742:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalSensidl.g:6753:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6757:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalSensidl.g:6758:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalSensidl.g:6764:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6768:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // InternalSensidl.g:6769:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // InternalSensidl.g:6769:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // InternalSensidl.g:6770:1: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // InternalSensidl.g:6771:1: ( rule__DOUBLE__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSensidl.g:6771:2: rule__DOUBLE__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__0"
    // InternalSensidl.g:6787:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6791:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // InternalSensidl.g:6792:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__DOUBLE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__0"


    // $ANTLR start "rule__DOUBLE__Group_2__0__Impl"
    // InternalSensidl.g:6799:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6803:1: ( ( '.' ) )
            // InternalSensidl.g:6804:1: ( '.' )
            {
            // InternalSensidl.g:6804:1: ( '.' )
            // InternalSensidl.g:6805:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__1"
    // InternalSensidl.g:6818:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6822:1: ( rule__DOUBLE__Group_2__1__Impl )
            // InternalSensidl.g:6823:2: rule__DOUBLE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__1"


    // $ANTLR start "rule__DOUBLE__Group_2__1__Impl"
    // InternalSensidl.g:6829:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6833:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6834:1: ( RULE_INT )
            {
            // InternalSensidl.g:6834:1: ( RULE_INT )
            // InternalSensidl.g:6835:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__1__Impl"


    // $ANTLR start "rule__UNIT__Group__0"
    // InternalSensidl.g:6850:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6854:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:6855:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSensidl.g:6862:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6866:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6867:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6867:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6868:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:6869:1: ( RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==EOF||(LA55_2>=RULE_ID && LA55_2<=RULE_DESCRIPTION)||(LA55_2>=30 && LA55_2<=31)||(LA55_2>=48 && LA55_2<=49)||LA55_2==52||LA55_2==61||(LA55_2>=63 && LA55_2<=65)) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalSensidl.g:6869:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_57); 

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalSensidl.g:6879:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6883:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:6884:2: rule__UNIT__Group__1__Impl
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
    // InternalSensidl.g:6890:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6894:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:6895:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:6895:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:6896:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:6897:1: ( rule__UNIT__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ANY_OTHER) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSensidl.g:6897:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalSensidl.g:6911:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6915:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:6916:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
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
    // InternalSensidl.g:6923:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6927:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:6928:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:6928:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:6929:1: RULE_ANY_OTHER
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
    // InternalSensidl.g:6940:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6944:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:6945:2: rule__UNIT__Group_1__1__Impl
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
    // InternalSensidl.g:6951:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6955:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6956:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6956:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6957:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:6958:1: ( RULE_ID )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    int LA57_2 = input.LA(2);

                    if ( (LA57_2==EOF||(LA57_2>=RULE_ID && LA57_2<=RULE_DESCRIPTION)||(LA57_2>=30 && LA57_2<=31)||(LA57_2>=48 && LA57_2<=49)||LA57_2==52||LA57_2==61||(LA57_2>=63 && LA57_2<=65)) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // InternalSensidl.g:6958:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_57); 

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalSensidl.g:6973:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6977:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6978:1: ( RULE_ID )
            {
            // InternalSensidl.g:6978:1: ( RULE_ID )
            // InternalSensidl.g:6979:1: RULE_ID
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
    // InternalSensidl.g:6988:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6992:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6993:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6993:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6994:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7003:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7007:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7008:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7008:1: ( RULE_STRING )
            // InternalSensidl.g:7009:1: RULE_STRING
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
    // InternalSensidl.g:7018:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7022:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:7023:1: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:7023:1: ( ruleEncodingSettings )
            // InternalSensidl.g:7024:1: ruleEncodingSettings
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
    // InternalSensidl.g:7033:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7037:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:7038:1: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:7038:1: ( ruleSensorDataDescription )
            // InternalSensidl.g:7039:1: ruleSensorDataDescription
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
    // InternalSensidl.g:7048:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7052:1: ( ( ruleCoding ) )
            // InternalSensidl.g:7053:1: ( ruleCoding )
            {
            // InternalSensidl.g:7053:1: ( ruleCoding )
            // InternalSensidl.g:7054:1: ruleCoding
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
    // InternalSensidl.g:7063:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7067:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:7068:1: ( ruleEndianness )
            {
            // InternalSensidl.g:7068:1: ( ruleEndianness )
            // InternalSensidl.g:7069:1: ruleEndianness
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
    // InternalSensidl.g:7078:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7082:1: ( ( RULE_INT ) )
            // InternalSensidl.g:7083:1: ( RULE_INT )
            {
            // InternalSensidl.g:7083:1: ( RULE_INT )
            // InternalSensidl.g:7084:1: RULE_INT
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
    // InternalSensidl.g:7093:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7097:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7098:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7098:1: ( RULE_STRING )
            // InternalSensidl.g:7099:1: RULE_STRING
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
    // InternalSensidl.g:7108:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7112:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7113:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7113:1: ( RULE_STRING )
            // InternalSensidl.g:7114:1: RULE_STRING
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
    // InternalSensidl.g:7123:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7127:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:7128:1: ( ruleDataSet )
            {
            // InternalSensidl.g:7128:1: ( ruleDataSet )
            // InternalSensidl.g:7129:1: ruleDataSet
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
    // InternalSensidl.g:7138:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7142:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7143:1: ( RULE_ID )
            {
            // InternalSensidl.g:7143:1: ( RULE_ID )
            // InternalSensidl.g:7144:1: RULE_ID
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


    // $ANTLR start "rule__DataSet__UsedDataSetsAssignment_2_1"
    // InternalSensidl.g:7153:1: rule__DataSet__UsedDataSetsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__UsedDataSetsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7157:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7158:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7158:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7159:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:7160:1: ( RULE_ID )
            // InternalSensidl.g:7161:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__UsedDataSetsAssignment_2_1"


    // $ANTLR start "rule__DataSet__UsedDataSetsAssignment_3_1"
    // InternalSensidl.g:7172:1: rule__DataSet__UsedDataSetsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__UsedDataSetsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7176:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7177:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7177:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7178:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_3_1_0()); 
            // InternalSensidl.g:7179:1: ( RULE_ID )
            // InternalSensidl.g:7180:1: RULE_ID
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSet__UsedDataSetsAssignment_3_1"


    // $ANTLR start "rule__DataSet__IDAssignment_4_2"
    // InternalSensidl.g:7191:1: rule__DataSet__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7195:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7196:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7196:1: ( RULE_STRING )
            // InternalSensidl.g:7197:1: RULE_STRING
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
    // InternalSensidl.g:7206:1: rule__DataSet__DescriptionAssignment_5 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7210:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7211:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7211:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7212:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7221:1: rule__DataSet__DataAssignment_7_0 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7225:1: ( ( ruleData ) )
            // InternalSensidl.g:7226:1: ( ruleData )
            {
            // InternalSensidl.g:7226:1: ( ruleData )
            // InternalSensidl.g:7227:1: ruleData
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
    // InternalSensidl.g:7236:1: rule__DataSet__MethodAssignment_7_1 : ( ruleMethod ) ;
    public final void rule__DataSet__MethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7240:1: ( ( ruleMethod ) )
            // InternalSensidl.g:7241:1: ( ruleMethod )
            {
            // InternalSensidl.g:7241:1: ( ruleMethod )
            // InternalSensidl.g:7242:1: ruleMethod
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
    // InternalSensidl.g:7251:1: rule__Method__VisibilityAssignment_0_0 : ( ( '+' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7255:1: ( ( ( '+' ) ) )
            // InternalSensidl.g:7256:1: ( ( '+' ) )
            {
            // InternalSensidl.g:7256:1: ( ( '+' ) )
            // InternalSensidl.g:7257:1: ( '+' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            // InternalSensidl.g:7258:1: ( '+' )
            // InternalSensidl.g:7259:1: '+'
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSensidl.g:7274:1: rule__Method__VisibilityAssignment_0_1 : ( ( '-' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7278:1: ( ( ( '-' ) ) )
            // InternalSensidl.g:7279:1: ( ( '-' ) )
            {
            // InternalSensidl.g:7279:1: ( ( '-' ) )
            // InternalSensidl.g:7280:1: ( '-' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 
            // InternalSensidl.g:7281:1: ( '-' )
            // InternalSensidl.g:7282:1: '-'
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
    // InternalSensidl.g:7297:1: rule__Method__VisibilityAssignment_0_2 : ( ( '#' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7301:1: ( ( ( '#' ) ) )
            // InternalSensidl.g:7302:1: ( ( '#' ) )
            {
            // InternalSensidl.g:7302:1: ( ( '#' ) )
            // InternalSensidl.g:7303:1: ( '#' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 
            // InternalSensidl.g:7304:1: ( '#' )
            // InternalSensidl.g:7305:1: '#'
            {
             before(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalSensidl.g:7320:1: rule__Method__VisibilityAssignment_0_3 : ( ( '~' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7324:1: ( ( ( '~' ) ) )
            // InternalSensidl.g:7325:1: ( ( '~' ) )
            {
            // InternalSensidl.g:7325:1: ( ( '~' ) )
            // InternalSensidl.g:7326:1: ( '~' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 
            // InternalSensidl.g:7327:1: ( '~' )
            // InternalSensidl.g:7328:1: '~'
            {
             before(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalSensidl.g:7343:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7347:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7348:1: ( RULE_ID )
            {
            // InternalSensidl.g:7348:1: ( RULE_ID )
            // InternalSensidl.g:7349:1: RULE_ID
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
    // InternalSensidl.g:7358:1: rule__Method__ParameterAssignment_3 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7362:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:7363:1: ( ruleMethodParameter )
            {
            // InternalSensidl.g:7363:1: ( ruleMethodParameter )
            // InternalSensidl.g:7364:1: ruleMethodParameter
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
    // InternalSensidl.g:7373:1: rule__Method__ParameterAssignment_4_1 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7377:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:7378:1: ( ruleMethodParameter )
            {
            // InternalSensidl.g:7378:1: ( ruleMethodParameter )
            // InternalSensidl.g:7379:1: ruleMethodParameter
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
    // InternalSensidl.g:7388:1: rule__Method__ReturnTypeAssignment_6_1_0_0 : ( ruleDataType ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7392:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7393:1: ( ruleDataType )
            {
            // InternalSensidl.g:7393:1: ( ruleDataType )
            // InternalSensidl.g:7394:1: ruleDataType
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
    // InternalSensidl.g:7403:1: rule__Method__ReturnTypeAssignment_6_1_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7407:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7408:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7408:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7409:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7418:1: rule__Method__ReturnTypeDataSetAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypeDataSetAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7422:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7423:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7423:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7424:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0()); 
            // InternalSensidl.g:7425:1: ( RULE_ID )
            // InternalSensidl.g:7426:1: RULE_ID
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
    // InternalSensidl.g:7437:1: rule__Method__IDAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Method__IDAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7441:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7442:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7442:1: ( RULE_STRING )
            // InternalSensidl.g:7443:1: RULE_STRING
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
    // InternalSensidl.g:7452:1: rule__Method__DescriptionAssignment_10 : ( RULE_DESCRIPTION ) ;
    public final void rule__Method__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7456:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7457:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7457:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7458:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7467:1: rule__MethodParameter__DataTypeAssignment_0_0_0 : ( ruleDataType ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7471:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7472:1: ( ruleDataType )
            {
            // InternalSensidl.g:7472:1: ( ruleDataType )
            // InternalSensidl.g:7473:1: ruleDataType
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
    // InternalSensidl.g:7482:1: rule__MethodParameter__DataTypeAssignment_0_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7486:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7487:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7487:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7488:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7497:1: rule__MethodParameter__DataTypeDataSetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodParameter__DataTypeDataSetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7501:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7502:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7502:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7503:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0()); 
            // InternalSensidl.g:7504:1: ( RULE_ID )
            // InternalSensidl.g:7505:1: RULE_ID
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
    // InternalSensidl.g:7516:1: rule__MethodParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7520:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7521:1: ( RULE_ID )
            {
            // InternalSensidl.g:7521:1: ( RULE_ID )
            // InternalSensidl.g:7522:1: RULE_ID
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


    // $ANTLR start "rule__ListData__NameAssignment_0"
    // InternalSensidl.g:7531:1: rule__ListData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7535:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7536:1: ( RULE_ID )
            {
            // InternalSensidl.g:7536:1: ( RULE_ID )
            // InternalSensidl.g:7537:1: RULE_ID
            {
             before(grammarAccess.getListDataAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListDataAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__NameAssignment_0"


    // $ANTLR start "rule__ListData__DataTypeAssignment_4_0"
    // InternalSensidl.g:7546:1: rule__ListData__DataTypeAssignment_4_0 : ( ruleDataType ) ;
    public final void rule__ListData__DataTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7550:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7551:1: ( ruleDataType )
            {
            // InternalSensidl.g:7551:1: ( ruleDataType )
            // InternalSensidl.g:7552:1: ruleDataType
            {
             before(grammarAccess.getListDataAccess().getDataTypeDataTypeEnumRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getListDataAccess().getDataTypeDataTypeEnumRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__DataTypeAssignment_4_0"


    // $ANTLR start "rule__ListData__DataTypeDataSetAssignment_4_1"
    // InternalSensidl.g:7561:1: rule__ListData__DataTypeDataSetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListData__DataTypeDataSetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7565:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7566:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7566:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7567:1: ( RULE_ID )
            {
             before(grammarAccess.getListDataAccess().getDataTypeDataSetDataSetCrossReference_4_1_0()); 
            // InternalSensidl.g:7568:1: ( RULE_ID )
            // InternalSensidl.g:7569:1: RULE_ID
            {
             before(grammarAccess.getListDataAccess().getDataTypeDataSetDataSetIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListDataAccess().getDataTypeDataSetDataSetIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getListDataAccess().getDataTypeDataSetDataSetCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListData__DataTypeDataSetAssignment_4_1"


    // $ANTLR start "rule__MeasurementData__NameAssignment_0"
    // InternalSensidl.g:7580:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7584:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7585:1: ( RULE_ID )
            {
            // InternalSensidl.g:7585:1: ( RULE_ID )
            // InternalSensidl.g:7586:1: RULE_ID
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
    // InternalSensidl.g:7595:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7599:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7600:1: ( ruleDataType )
            {
            // InternalSensidl.g:7600:1: ( ruleDataType )
            // InternalSensidl.g:7601:1: ruleDataType
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
    // InternalSensidl.g:7610:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7614:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:7615:1: ( ruleUNIT )
            {
            // InternalSensidl.g:7615:1: ( ruleUNIT )
            // InternalSensidl.g:7616:1: ruleUNIT
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
    // InternalSensidl.g:7625:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7629:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7630:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7630:1: ( RULE_STRING )
            // InternalSensidl.g:7631:1: RULE_STRING
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
    // InternalSensidl.g:7640:1: rule__MeasurementData__AdjustmentsAssignment_6_0_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7644:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:7645:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:7645:1: ( ruleDataConversion )
            // InternalSensidl.g:7646:1: ruleDataConversion
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
    // InternalSensidl.g:7655:1: rule__MeasurementData__AdjustmentsAssignment_6_1_1 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7659:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:7660:1: ( ruleDataRange )
            {
            // InternalSensidl.g:7660:1: ( ruleDataRange )
            // InternalSensidl.g:7661:1: ruleDataRange
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
    // InternalSensidl.g:7670:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7674:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:7675:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:7675:1: ( ruleDataConversion )
            // InternalSensidl.g:7676:1: ruleDataConversion
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
    // InternalSensidl.g:7685:1: rule__MeasurementData__AdjustmentsAssignment_6_2_3 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7689:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:7690:1: ( ruleDataRange )
            {
            // InternalSensidl.g:7690:1: ( ruleDataRange )
            // InternalSensidl.g:7691:1: ruleDataRange
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
    // InternalSensidl.g:7700:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7704:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7705:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7705:1: ( ( 'setter' ) )
            // InternalSensidl.g:7706:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            // InternalSensidl.g:7707:1: ( 'setter' )
            // InternalSensidl.g:7708:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:7723:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7727:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7728:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7728:1: ( ( 'getter' ) )
            // InternalSensidl.g:7729:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            // InternalSensidl.g:7730:1: ( 'getter' )
            // InternalSensidl.g:7731:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSensidl.g:7746:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7750:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7751:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7751:1: ( ( 'getter' ) )
            // InternalSensidl.g:7752:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            // InternalSensidl.g:7753:1: ( 'getter' )
            // InternalSensidl.g:7754:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSensidl.g:7769:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7773:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7774:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7774:1: ( ( 'setter' ) )
            // InternalSensidl.g:7775:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            // InternalSensidl.g:7776:1: ( 'setter' )
            // InternalSensidl.g:7777:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:7792:1: rule__MeasurementData__DescriptionAssignment_8 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7796:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7797:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7797:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7798:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7807:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7811:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7812:1: ( RULE_ID )
            {
            // InternalSensidl.g:7812:1: ( RULE_ID )
            // InternalSensidl.g:7813:1: RULE_ID
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
    // InternalSensidl.g:7822:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7826:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7827:1: ( ruleDataType )
            {
            // InternalSensidl.g:7827:1: ( ruleDataType )
            // InternalSensidl.g:7828:1: ruleDataType
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
    // InternalSensidl.g:7837:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7841:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7842:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7842:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7843:1: ruleDataTypeNotAdjustable
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


    // $ANTLR start "rule__NonMeasurementData__ConstantAssignment_3_0_0"
    // InternalSensidl.g:7852:1: rule__NonMeasurementData__ConstantAssignment_3_0_0 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7856:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:7857:1: ( ( 'constant' ) )
            {
            // InternalSensidl.g:7857:1: ( ( 'constant' ) )
            // InternalSensidl.g:7858:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0()); 
            // InternalSensidl.g:7859:1: ( 'constant' )
            // InternalSensidl.g:7860:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ConstantAssignment_3_0_0"


    // $ANTLR start "rule__NonMeasurementData__ValueAssignment_3_0_3"
    // InternalSensidl.g:7875:1: rule__NonMeasurementData__ValueAssignment_3_0_3 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_3_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7879:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7880:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7880:1: ( RULE_STRING )
            // InternalSensidl.g:7881:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ValueAssignment_3_0_3"


    // $ANTLR start "rule__NonMeasurementData__ValueAssignment_3_1_2"
    // InternalSensidl.g:7890:1: rule__NonMeasurementData__ValueAssignment_3_1_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7894:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7895:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7895:1: ( RULE_STRING )
            // InternalSensidl.g:7896:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getValueSTRINGTerminalRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ValueAssignment_3_1_2"


    // $ANTLR start "rule__NonMeasurementData__IDAssignment_4_2"
    // InternalSensidl.g:7905:1: rule__NonMeasurementData__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7909:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7910:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7910:1: ( RULE_STRING )
            // InternalSensidl.g:7911:1: RULE_STRING
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getIDSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__IDAssignment_4_2"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0"
    // InternalSensidl.g:7920:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7924:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7925:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7925:1: ( ( 'setter' ) )
            // InternalSensidl.g:7926:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0()); 
            // InternalSensidl.g:7927:1: ( 'setter' )
            // InternalSensidl.g:7928:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1"
    // InternalSensidl.g:7943:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7947:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7948:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7948:1: ( ( 'getter' ) )
            // InternalSensidl.g:7949:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_0_1_1_0()); 
            // InternalSensidl.g:7950:1: ( 'getter' )
            // InternalSensidl.g:7951:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_0_1_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_0_1_1_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0"
    // InternalSensidl.g:7966:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7970:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7971:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7971:1: ( ( 'getter' ) )
            // InternalSensidl.g:7972:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0()); 
            // InternalSensidl.g:7973:1: ( 'getter' )
            // InternalSensidl.g:7974:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0"


    // $ANTLR start "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1"
    // InternalSensidl.g:7989:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7993:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7994:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7994:1: ( ( 'setter' ) )
            // InternalSensidl.g:7995:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_1_1_1_0()); 
            // InternalSensidl.g:7996:1: ( 'setter' )
            // InternalSensidl.g:7997:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_1_1_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_1_1_1_0()); 

            }

             after(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1"


    // $ANTLR start "rule__NonMeasurementData__DescriptionAssignment_6"
    // InternalSensidl.g:8012:1: rule__NonMeasurementData__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8016:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:8017:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:8017:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:8018:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:8027:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8031:1: ( ( RULE_ID ) )
            // InternalSensidl.g:8032:1: ( RULE_ID )
            {
            // InternalSensidl.g:8032:1: ( RULE_ID )
            // InternalSensidl.g:8033:1: RULE_ID
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
    // InternalSensidl.g:8042:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8046:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:8047:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:8047:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:8048:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:8057:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8061:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:8062:1: ( ruleUNIT )
            {
            // InternalSensidl.g:8062:1: ( ruleUNIT )
            // InternalSensidl.g:8063:1: ruleUNIT
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
    // InternalSensidl.g:8072:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8076:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:8077:1: ( RULE_STRING )
            {
            // InternalSensidl.g:8077:1: ( RULE_STRING )
            // InternalSensidl.g:8078:1: RULE_STRING
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
    // InternalSensidl.g:8087:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8091:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:8092:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:8092:1: ( ( 'setter' ) )
            // InternalSensidl.g:8093:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            // InternalSensidl.g:8094:1: ( 'setter' )
            // InternalSensidl.g:8095:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:8110:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8114:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:8115:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:8115:1: ( ( 'getter' ) )
            // InternalSensidl.g:8116:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            // InternalSensidl.g:8117:1: ( 'getter' )
            // InternalSensidl.g:8118:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSensidl.g:8133:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8137:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:8138:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:8138:1: ( ( 'getter' ) )
            // InternalSensidl.g:8139:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            // InternalSensidl.g:8140:1: ( 'getter' )
            // InternalSensidl.g:8141:1: 'getter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSensidl.g:8156:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8160:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:8161:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:8161:1: ( ( 'setter' ) )
            // InternalSensidl.g:8162:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            // InternalSensidl.g:8163:1: ( 'setter' )
            // InternalSensidl.g:8164:1: 'setter'
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:8179:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8183:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:8184:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:8184:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:8185:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:8194:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8198:1: ( ( ruleInterval ) )
            // InternalSensidl.g:8199:1: ( ruleInterval )
            {
            // InternalSensidl.g:8199:1: ( ruleInterval )
            // InternalSensidl.g:8200:1: ruleInterval
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
    // InternalSensidl.g:8209:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8213:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8214:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8214:1: ( ruleDOUBLE )
            // InternalSensidl.g:8215:1: ruleDOUBLE
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
    // InternalSensidl.g:8224:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8228:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8229:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8229:1: ( ruleDOUBLE )
            // InternalSensidl.g:8230:1: ruleDOUBLE
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
    // InternalSensidl.g:8239:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8243:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8244:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8244:1: ( ruleDOUBLE )
            // InternalSensidl.g:8245:1: ruleDOUBLE
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
    // InternalSensidl.g:8254:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8258:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8259:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8259:1: ( ruleDOUBLE )
            // InternalSensidl.g:8260:1: ruleDOUBLE
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
    // InternalSensidl.g:8269:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8273:1: ( ( ruleInterval ) )
            // InternalSensidl.g:8274:1: ( ruleInterval )
            {
            // InternalSensidl.g:8274:1: ( ruleInterval )
            // InternalSensidl.g:8275:1: ruleInterval
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
    // InternalSensidl.g:8284:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8288:1: ( ( ruleInterval ) )
            // InternalSensidl.g:8289:1: ( ruleInterval )
            {
            // InternalSensidl.g:8289:1: ( ruleInterval )
            // InternalSensidl.g:8290:1: ruleInterval
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
    // InternalSensidl.g:8299:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8303:1: ( ( ruleDataType ) )
            // InternalSensidl.g:8304:1: ( ruleDataType )
            {
            // InternalSensidl.g:8304:1: ( ruleDataType )
            // InternalSensidl.g:8305:1: ruleDataType
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
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\4\uffff\14\20\3\uffff";
    static final String dfa_3s = "\1\5\1\53\1\20\1\uffff\14\5\3\uffff";
    static final String dfa_4s = "\1\5\1\53\1\55\1\uffff\14\104\3\uffff";
    static final String dfa_5s = "\3\uffff\1\4\14\uffff\1\2\1\3\1\1";
    static final String dfa_6s = "\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\21\uffff\1\3",
            "",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\21\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\21\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\12\uffff\1\20\1\uffff\3\20\2\uffff\1\20",
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
            return "784:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) | ( ruleListData ) );";
        }
    }
    static final String dfa_8s = "\64\uffff";
    static final String dfa_9s = "\25\uffff\1\32\7\uffff\1\32\14\uffff\12\32";
    static final String dfa_10s = "\1\60\1\65\1\40\1\66\1\uffff\3\4\1\72\1\4\1\67\1\4\1\40\2\4\1\72\1\4\1\67\1\4\1\70\1\4\1\5\1\4\1\74\1\4\2\uffff\1\70\1\66\1\5\2\4\1\67\2\4\1\67\1\4\1\70\1\4\1\53\1\70\1\22\12\5";
    static final String dfa_11s = "\1\60\1\73\1\40\1\66\1\uffff\2\75\1\4\1\76\1\4\1\76\1\4\1\40\1\4\1\75\1\72\1\75\1\67\1\4\1\76\1\4\1\101\1\4\1\74\1\4\2\uffff\1\70\1\66\1\101\1\75\1\4\1\76\1\4\1\75\1\67\1\4\1\76\1\4\1\53\1\70\1\33\12\101";
    static final String dfa_12s = "\4\uffff\1\2\24\uffff\1\3\1\1\31\uffff";
    static final String dfa_13s = "\64\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\3\uffff\1\2\1\uffff\1\3",
            "\1\5",
            "\1\6",
            "",
            "\1\10\70\uffff\1\7",
            "\1\12\70\uffff\1\11",
            "\1\10",
            "\1\14\3\uffff\1\13",
            "\1\12",
            "\1\16\6\uffff\1\15",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\23\70\uffff\1\22",
            "\1\14",
            "\1\25\70\uffff\1\24",
            "\1\16",
            "\1\23",
            "\1\27\5\uffff\1\26",
            "\1\25",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\30\3\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\27",
            "\1\36",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\40\70\uffff\1\37",
            "\1\40",
            "\1\42\6\uffff\1\41",
            "\1\43",
            "\1\45\70\uffff\1\44",
            "\1\42",
            "\1\45",
            "\1\47\5\uffff\1\46",
            "\1\50",
            "\1\51",
            "\1\47",
            "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32",
            "\1\32\1\uffff\1\32\26\uffff\1\32\3\uffff\1\31\16\uffff\1\32\13\uffff\1\32\1\uffff\3\32"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "840:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );";
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xA000000040000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xA000000000000022L,0x0000000000000003L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xA000000000000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000004040FFF0020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000FFF0020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000FFC0020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000FFC0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003000080000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0006000080000080L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000080000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000042L});

}