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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_ANY_OTHER", "RULE_DESCRIPTION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'SENSIDL_BINARY'", "'SENSIDL_JSON'", "'BIG_ENDIAN'", "'LITTLE_ENDIAN'", "'STRING'", "'BOOLEAN'", "'INT8'", "'UINT8'", "'INT16'", "'UINT16'", "'INT32'", "'UINT32'", "'INT64'", "'UINT64'", "'FLOAT'", "'DOUBLE'", "'sensorInterface'", "'{'", "'}'", "'with identifier'", "':'", "'encoding'", "','", "'endianness'", "'alignment'", "'BIT'", "'sensorData'", "'dataSet'", "'uses'", "'('", "')'", "'as'", "'Method'", "'list'", "'of'", "'in'", "'adjusted'", "'exclude:'", "'value'", "'='", "'exclude'", "'with range'", "'['", "';'", "']'", "'with scaling factor'", "'and offset'", "'by linear mapping'", "'=>'", "'.'", "'+'", "'-'", "'#'", "'~'", "'setter'", "'getter'", "'constant'"
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
            else if ( ((LA1_0>=62 && LA1_0<=65)) ) {
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
            case 62:
                {
                alt2=1;
                }
                break;
            case 63:
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


    // $ANTLR start "rule__NonMeasurementData__Alternatives_6_1"
    // InternalSensidl.g:912:1: rule__NonMeasurementData__Alternatives_6_1 : ( ( ( rule__NonMeasurementData__Group_6_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_6_1_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:916:1: ( ( ( rule__NonMeasurementData__Group_6_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_6_1_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==66) ) {
                alt12=1;
            }
            else if ( (LA12_0==67) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSensidl.g:917:1: ( ( rule__NonMeasurementData__Group_6_1_0__0 ) )
                    {
                    // InternalSensidl.g:917:1: ( ( rule__NonMeasurementData__Group_6_1_0__0 ) )
                    // InternalSensidl.g:918:1: ( rule__NonMeasurementData__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0()); 
                    // InternalSensidl.g:919:1: ( rule__NonMeasurementData__Group_6_1_0__0 )
                    // InternalSensidl.g:919:2: rule__NonMeasurementData__Group_6_1_0__0
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
                    // InternalSensidl.g:923:6: ( ( rule__NonMeasurementData__Group_6_1_1__0 ) )
                    {
                    // InternalSensidl.g:923:6: ( ( rule__NonMeasurementData__Group_6_1_1__0 ) )
                    // InternalSensidl.g:924:1: ( rule__NonMeasurementData__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1()); 
                    // InternalSensidl.g:925:1: ( rule__NonMeasurementData__Group_6_1_1__0 )
                    // InternalSensidl.g:925:2: rule__NonMeasurementData__Group_6_1_1__0
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
    // InternalSensidl.g:934:1: rule__MeasurementDataNotAdjustable__Alternatives_6_2 : ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) );
    public final void rule__MeasurementDataNotAdjustable__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:938:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) )
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
                    // InternalSensidl.g:939:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    {
                    // InternalSensidl.g:939:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    // InternalSensidl.g:940:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0()); 
                    // InternalSensidl.g:941:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    // InternalSensidl.g:941:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0
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
                    // InternalSensidl.g:945:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    {
                    // InternalSensidl.g:945:6: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    // InternalSensidl.g:946:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1()); 
                    // InternalSensidl.g:947:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    // InternalSensidl.g:947:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0
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
    // InternalSensidl.g:956:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:960:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            else if ( (LA14_0==59) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSensidl.g:961:1: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:961:1: ( ruleLinearDataConversion )
                    // InternalSensidl.g:962:1: ruleLinearDataConversion
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
                    // InternalSensidl.g:967:6: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:967:6: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:968:1: ruleLinearDataConversionWithInterval
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
    // InternalSensidl.g:978:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:982:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSensidl.g:983:1: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:983:1: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:984:1: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:985:1: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:985:3: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:990:6: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:990:6: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:991:1: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:992:1: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:992:3: 'SENSIDL_JSON'
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
    // InternalSensidl.g:1002:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1006:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSensidl.g:1007:1: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:1007:1: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:1008:1: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1009:1: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:1009:3: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1014:6: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:1014:6: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:1015:1: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1016:1: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:1016:3: 'LITTLE_ENDIAN'
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
    // InternalSensidl.g:1026:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1030:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            else if ( (LA17_0==17) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSensidl.g:1031:1: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:1031:1: ( ( 'STRING' ) )
                    // InternalSensidl.g:1032:1: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1033:1: ( 'STRING' )
                    // InternalSensidl.g:1033:3: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1038:6: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:1038:6: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:1039:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1040:1: ( 'BOOLEAN' )
                    // InternalSensidl.g:1040:3: 'BOOLEAN'
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
    // InternalSensidl.g:1050:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1054:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt18=1;
                }
                break;
            case 19:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            case 21:
                {
                alt18=4;
                }
                break;
            case 22:
                {
                alt18=5;
                }
                break;
            case 23:
                {
                alt18=6;
                }
                break;
            case 24:
                {
                alt18=7;
                }
                break;
            case 25:
                {
                alt18=8;
                }
                break;
            case 26:
                {
                alt18=9;
                }
                break;
            case 27:
                {
                alt18=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSensidl.g:1055:1: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:1055:1: ( ( 'INT8' ) )
                    // InternalSensidl.g:1056:1: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:1057:1: ( 'INT8' )
                    // InternalSensidl.g:1057:3: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:1062:6: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:1062:6: ( ( 'UINT8' ) )
                    // InternalSensidl.g:1063:1: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:1064:1: ( 'UINT8' )
                    // InternalSensidl.g:1064:3: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:1069:6: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:1069:6: ( ( 'INT16' ) )
                    // InternalSensidl.g:1070:1: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:1071:1: ( 'INT16' )
                    // InternalSensidl.g:1071:3: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:1076:6: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:1076:6: ( ( 'UINT16' ) )
                    // InternalSensidl.g:1077:1: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:1078:1: ( 'UINT16' )
                    // InternalSensidl.g:1078:3: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:1083:6: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:1083:6: ( ( 'INT32' ) )
                    // InternalSensidl.g:1084:1: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:1085:1: ( 'INT32' )
                    // InternalSensidl.g:1085:3: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:1090:6: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:1090:6: ( ( 'UINT32' ) )
                    // InternalSensidl.g:1091:1: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:1092:1: ( 'UINT32' )
                    // InternalSensidl.g:1092:3: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:1097:6: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:1097:6: ( ( 'INT64' ) )
                    // InternalSensidl.g:1098:1: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:1099:1: ( 'INT64' )
                    // InternalSensidl.g:1099:3: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:1104:6: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:1104:6: ( ( 'UINT64' ) )
                    // InternalSensidl.g:1105:1: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:1106:1: ( 'UINT64' )
                    // InternalSensidl.g:1106:3: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:1111:6: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:1111:6: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:1112:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:1113:1: ( 'FLOAT' )
                    // InternalSensidl.g:1113:3: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:1118:6: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:1118:6: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:1119:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:1120:1: ( 'DOUBLE' )
                    // InternalSensidl.g:1120:3: 'DOUBLE'
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
    // InternalSensidl.g:1132:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1136:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:1137:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
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
    // InternalSensidl.g:1144:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1148:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:1149:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:1149:1: ( 'sensorInterface' )
            // InternalSensidl.g:1150:1: 'sensorInterface'
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
    // InternalSensidl.g:1163:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1167:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:1168:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
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
    // InternalSensidl.g:1175:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1179:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:1180:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:1180:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:1181:1: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:1182:1: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:1182:2: rule__SensorInterface__NameAssignment_1
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
    // InternalSensidl.g:1192:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1196:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:1197:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
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
    // InternalSensidl.g:1204:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1208:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:1209:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:1209:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:1210:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:1211:1: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DESCRIPTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSensidl.g:1211:2: rule__SensorInterface__DescriptionAssignment_2
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
    // InternalSensidl.g:1221:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1225:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:1226:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
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
    // InternalSensidl.g:1233:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1237:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:1238:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:1238:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:1239:1: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:1240:1: ( rule__SensorInterface__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:1240:2: rule__SensorInterface__Group_3__0
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
    // InternalSensidl.g:1250:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1254:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:1255:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
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
    // InternalSensidl.g:1262:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1266:1: ( ( '{' ) )
            // InternalSensidl.g:1267:1: ( '{' )
            {
            // InternalSensidl.g:1267:1: ( '{' )
            // InternalSensidl.g:1268:1: '{'
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
    // InternalSensidl.g:1281:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1285:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:1286:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
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
    // InternalSensidl.g:1293:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1297:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:1298:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:1298:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:1299:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:1300:1: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:1300:2: rule__SensorInterface__EncodingSettingsAssignment_5
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
    // InternalSensidl.g:1310:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1314:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:1315:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
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
    // InternalSensidl.g:1322:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1326:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1327:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1327:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1328:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1329:1: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1329:2: rule__SensorInterface__DataDescriptionAssignment_6
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
    // InternalSensidl.g:1339:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1343:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1344:2: rule__SensorInterface__Group__7__Impl
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
    // InternalSensidl.g:1350:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1354:1: ( ( '}' ) )
            // InternalSensidl.g:1355:1: ( '}' )
            {
            // InternalSensidl.g:1355:1: ( '}' )
            // InternalSensidl.g:1356:1: '}'
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
    // InternalSensidl.g:1385:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1389:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1390:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
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
    // InternalSensidl.g:1397:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1401:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1402:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1402:1: ( 'with identifier' )
            // InternalSensidl.g:1403:1: 'with identifier'
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
    // InternalSensidl.g:1416:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1420:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1421:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
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
    // InternalSensidl.g:1428:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1432:1: ( ( ':' ) )
            // InternalSensidl.g:1433:1: ( ':' )
            {
            // InternalSensidl.g:1433:1: ( ':' )
            // InternalSensidl.g:1434:1: ':'
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
    // InternalSensidl.g:1447:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1451:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1452:2: rule__SensorInterface__Group_3__2__Impl
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
    // InternalSensidl.g:1458:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1462:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1463:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1463:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1464:1: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1465:1: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1465:2: rule__SensorInterface__IDAssignment_3_2
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
    // InternalSensidl.g:1481:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1485:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1486:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
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
    // InternalSensidl.g:1493:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1497:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1498:1: ( 'encoding' )
            {
            // InternalSensidl.g:1498:1: ( 'encoding' )
            // InternalSensidl.g:1499:1: 'encoding'
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
    // InternalSensidl.g:1512:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1516:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1517:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
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
    // InternalSensidl.g:1524:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1528:1: ( ( ':' ) )
            // InternalSensidl.g:1529:1: ( ':' )
            {
            // InternalSensidl.g:1529:1: ( ':' )
            // InternalSensidl.g:1530:1: ':'
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
    // InternalSensidl.g:1543:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1547:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1548:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
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
    // InternalSensidl.g:1555:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1559:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1560:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1560:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1561:1: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1562:1: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1562:2: rule__EncodingSettings__CodingAssignment_2
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
    // InternalSensidl.g:1572:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1576:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1577:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
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
    // InternalSensidl.g:1584:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1588:1: ( ( ',' ) )
            // InternalSensidl.g:1589:1: ( ',' )
            {
            // InternalSensidl.g:1589:1: ( ',' )
            // InternalSensidl.g:1590:1: ','
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
    // InternalSensidl.g:1603:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1607:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1608:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
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
    // InternalSensidl.g:1615:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1619:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1620:1: ( 'endianness' )
            {
            // InternalSensidl.g:1620:1: ( 'endianness' )
            // InternalSensidl.g:1621:1: 'endianness'
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
    // InternalSensidl.g:1634:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1638:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1639:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
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
    // InternalSensidl.g:1646:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1650:1: ( ( ':' ) )
            // InternalSensidl.g:1651:1: ( ':' )
            {
            // InternalSensidl.g:1651:1: ( ':' )
            // InternalSensidl.g:1652:1: ':'
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
    // InternalSensidl.g:1665:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1669:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1670:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
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
    // InternalSensidl.g:1677:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1681:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1682:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1682:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1683:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1684:1: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1684:2: rule__EncodingSettings__EndiannessAssignment_6
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
    // InternalSensidl.g:1694:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1698:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1699:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
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
    // InternalSensidl.g:1706:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1710:1: ( ( ',' ) )
            // InternalSensidl.g:1711:1: ( ',' )
            {
            // InternalSensidl.g:1711:1: ( ',' )
            // InternalSensidl.g:1712:1: ','
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
    // InternalSensidl.g:1725:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1729:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1730:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
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
    // InternalSensidl.g:1737:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1741:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1742:1: ( 'alignment' )
            {
            // InternalSensidl.g:1742:1: ( 'alignment' )
            // InternalSensidl.g:1743:1: 'alignment'
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
    // InternalSensidl.g:1756:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1760:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1761:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
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
    // InternalSensidl.g:1768:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1772:1: ( ( ':' ) )
            // InternalSensidl.g:1773:1: ( ':' )
            {
            // InternalSensidl.g:1773:1: ( ':' )
            // InternalSensidl.g:1774:1: ':'
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
    // InternalSensidl.g:1787:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1791:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1792:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
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
    // InternalSensidl.g:1799:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1803:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1804:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1804:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1805:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1806:1: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1806:2: rule__EncodingSettings__AlignmentAssignment_10
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
    // InternalSensidl.g:1816:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1820:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1821:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
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
    // InternalSensidl.g:1828:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1832:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1833:1: ( 'BIT' )
            {
            // InternalSensidl.g:1833:1: ( 'BIT' )
            // InternalSensidl.g:1834:1: 'BIT'
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
    // InternalSensidl.g:1847:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1851:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1852:2: rule__EncodingSettings__Group__12__Impl
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
    // InternalSensidl.g:1858:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1862:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1863:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1863:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1864:1: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1865:1: ( rule__EncodingSettings__Group_12__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:1865:2: rule__EncodingSettings__Group_12__0
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
    // InternalSensidl.g:1901:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1905:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1906:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
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
    // InternalSensidl.g:1913:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1917:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1918:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1918:1: ( 'with identifier' )
            // InternalSensidl.g:1919:1: 'with identifier'
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
    // InternalSensidl.g:1932:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1936:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1937:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
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
    // InternalSensidl.g:1944:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1948:1: ( ( ':' ) )
            // InternalSensidl.g:1949:1: ( ':' )
            {
            // InternalSensidl.g:1949:1: ( ':' )
            // InternalSensidl.g:1950:1: ':'
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
    // InternalSensidl.g:1963:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1967:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1968:2: rule__EncodingSettings__Group_12__2__Impl
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
    // InternalSensidl.g:1974:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:1978:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:1979:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:1979:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:1980:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:1981:1: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:1981:2: rule__EncodingSettings__IDAssignment_12_2
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
    // InternalSensidl.g:1997:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2001:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:2002:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
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
    // InternalSensidl.g:2009:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2013:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:2014:1: ( 'sensorData' )
            {
            // InternalSensidl.g:2014:1: ( 'sensorData' )
            // InternalSensidl.g:2015:1: 'sensorData'
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
    // InternalSensidl.g:2028:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2032:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:2033:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
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
    // InternalSensidl.g:2040:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2044:1: ( ( () ) )
            // InternalSensidl.g:2045:1: ( () )
            {
            // InternalSensidl.g:2045:1: ( () )
            // InternalSensidl.g:2046:1: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:2047:1: ()
            // InternalSensidl.g:2049:1: 
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
    // InternalSensidl.g:2059:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2063:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:2064:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
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
    // InternalSensidl.g:2071:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2075:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:2076:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:2076:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:2077:1: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:2078:1: ( rule__SensorDataDescription__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:2078:2: rule__SensorDataDescription__Group_2__0
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
    // InternalSensidl.g:2088:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2092:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:2093:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
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
    // InternalSensidl.g:2100:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2104:1: ( ( '{' ) )
            // InternalSensidl.g:2105:1: ( '{' )
            {
            // InternalSensidl.g:2105:1: ( '{' )
            // InternalSensidl.g:2106:1: '{'
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
    // InternalSensidl.g:2119:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2123:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:2124:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
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
    // InternalSensidl.g:2131:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2135:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:2136:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:2136:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:2137:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:2138:1: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSensidl.g:2138:2: rule__SensorDataDescription__DataSetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SensorDataDescription__DataSetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSensidl.g:2148:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2152:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:2153:2: rule__SensorDataDescription__Group__5__Impl
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
    // InternalSensidl.g:2159:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2163:1: ( ( '}' ) )
            // InternalSensidl.g:2164:1: ( '}' )
            {
            // InternalSensidl.g:2164:1: ( '}' )
            // InternalSensidl.g:2165:1: '}'
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
    // InternalSensidl.g:2190:1: rule__SensorDataDescription__Group_2__0 : rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 ;
    public final void rule__SensorDataDescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2194:1: ( rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1 )
            // InternalSensidl.g:2195:2: rule__SensorDataDescription__Group_2__0__Impl rule__SensorDataDescription__Group_2__1
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
    // InternalSensidl.g:2202:1: rule__SensorDataDescription__Group_2__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorDataDescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2206:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2207:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2207:1: ( 'with identifier' )
            // InternalSensidl.g:2208:1: 'with identifier'
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
    // InternalSensidl.g:2221:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2225:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:2226:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
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
    // InternalSensidl.g:2233:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2237:1: ( ( ':' ) )
            // InternalSensidl.g:2238:1: ( ':' )
            {
            // InternalSensidl.g:2238:1: ( ':' )
            // InternalSensidl.g:2239:1: ':'
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
    // InternalSensidl.g:2252:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2256:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:2257:2: rule__SensorDataDescription__Group_2__2__Impl
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
    // InternalSensidl.g:2263:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2267:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:2268:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:2268:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:2269:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:2270:1: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:2270:2: rule__SensorDataDescription__IDAssignment_2_2
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
    // InternalSensidl.g:2286:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2290:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:2291:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
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
    // InternalSensidl.g:2298:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2302:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:2303:1: ( 'dataSet' )
            {
            // InternalSensidl.g:2303:1: ( 'dataSet' )
            // InternalSensidl.g:2304:1: 'dataSet'
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
    // InternalSensidl.g:2317:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2321:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2322:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
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
    // InternalSensidl.g:2329:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2333:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2334:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2334:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2335:1: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2336:1: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2336:2: rule__DataSet__NameAssignment_1
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
    // InternalSensidl.g:2346:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2350:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2351:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
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
    // InternalSensidl.g:2358:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2362:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2363:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2363:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2364:1: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2365:1: ( rule__DataSet__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSensidl.g:2365:2: rule__DataSet__Group_2__0
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
    // InternalSensidl.g:2375:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2379:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2380:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
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
    // InternalSensidl.g:2387:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )* ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2391:1: ( ( ( rule__DataSet__Group_3__0 )* ) )
            // InternalSensidl.g:2392:1: ( ( rule__DataSet__Group_3__0 )* )
            {
            // InternalSensidl.g:2392:1: ( ( rule__DataSet__Group_3__0 )* )
            // InternalSensidl.g:2393:1: ( rule__DataSet__Group_3__0 )*
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2394:1: ( rule__DataSet__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSensidl.g:2394:2: rule__DataSet__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DataSet__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSensidl.g:2404:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2408:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2409:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
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
    // InternalSensidl.g:2416:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__Group_4__0 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2420:1: ( ( ( rule__DataSet__Group_4__0 )? ) )
            // InternalSensidl.g:2421:1: ( ( rule__DataSet__Group_4__0 )? )
            {
            // InternalSensidl.g:2421:1: ( ( rule__DataSet__Group_4__0 )? )
            // InternalSensidl.g:2422:1: ( rule__DataSet__Group_4__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_4()); 
            // InternalSensidl.g:2423:1: ( rule__DataSet__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSensidl.g:2423:2: rule__DataSet__Group_4__0
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
    // InternalSensidl.g:2433:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2437:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2438:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
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
    // InternalSensidl.g:2445:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__DescriptionAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2449:1: ( ( ( rule__DataSet__DescriptionAssignment_5 )? ) )
            // InternalSensidl.g:2450:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            {
            // InternalSensidl.g:2450:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            // InternalSensidl.g:2451:1: ( rule__DataSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 
            // InternalSensidl.g:2452:1: ( rule__DataSet__DescriptionAssignment_5 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DESCRIPTION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:2452:2: rule__DataSet__DescriptionAssignment_5
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
    // InternalSensidl.g:2462:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2466:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2467:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
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
    // InternalSensidl.g:2474:1: rule__DataSet__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2478:1: ( ( '{' ) )
            // InternalSensidl.g:2479:1: ( '{' )
            {
            // InternalSensidl.g:2479:1: ( '{' )
            // InternalSensidl.g:2480:1: '{'
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
    // InternalSensidl.g:2493:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2497:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // InternalSensidl.g:2498:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
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
    // InternalSensidl.g:2505:1: rule__DataSet__Group__7__Impl : ( ( rule__DataSet__Alternatives_7 )* ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2509:1: ( ( ( rule__DataSet__Alternatives_7 )* ) )
            // InternalSensidl.g:2510:1: ( ( rule__DataSet__Alternatives_7 )* )
            {
            // InternalSensidl.g:2510:1: ( ( rule__DataSet__Alternatives_7 )* )
            // InternalSensidl.g:2511:1: ( rule__DataSet__Alternatives_7 )*
            {
             before(grammarAccess.getDataSetAccess().getAlternatives_7()); 
            // InternalSensidl.g:2512:1: ( rule__DataSet__Alternatives_7 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=62 && LA28_0<=65)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSensidl.g:2512:2: rule__DataSet__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DataSet__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalSensidl.g:2522:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2526:1: ( rule__DataSet__Group__8__Impl )
            // InternalSensidl.g:2527:2: rule__DataSet__Group__8__Impl
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
    // InternalSensidl.g:2533:1: rule__DataSet__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2537:1: ( ( '}' ) )
            // InternalSensidl.g:2538:1: ( '}' )
            {
            // InternalSensidl.g:2538:1: ( '}' )
            // InternalSensidl.g:2539:1: '}'
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
    // InternalSensidl.g:2570:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2574:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2575:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
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
    // InternalSensidl.g:2582:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2586:1: ( ( 'uses' ) )
            // InternalSensidl.g:2587:1: ( 'uses' )
            {
            // InternalSensidl.g:2587:1: ( 'uses' )
            // InternalSensidl.g:2588:1: 'uses'
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
    // InternalSensidl.g:2601:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2605:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2606:2: rule__DataSet__Group_2__1__Impl
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
    // InternalSensidl.g:2612:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2616:1: ( ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) ) )
            // InternalSensidl.g:2617:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            {
            // InternalSensidl.g:2617:1: ( ( rule__DataSet__ParentDataSetAssignment_2_1 ) )
            // InternalSensidl.g:2618:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_2_1()); 
            // InternalSensidl.g:2619:1: ( rule__DataSet__ParentDataSetAssignment_2_1 )
            // InternalSensidl.g:2619:2: rule__DataSet__ParentDataSetAssignment_2_1
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
    // InternalSensidl.g:2633:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2637:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2638:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
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
    // InternalSensidl.g:2645:1: rule__DataSet__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2649:1: ( ( ',' ) )
            // InternalSensidl.g:2650:1: ( ',' )
            {
            // InternalSensidl.g:2650:1: ( ',' )
            // InternalSensidl.g:2651:1: ','
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
    // InternalSensidl.g:2664:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2668:1: ( rule__DataSet__Group_3__1__Impl )
            // InternalSensidl.g:2669:2: rule__DataSet__Group_3__1__Impl
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
    // InternalSensidl.g:2675:1: rule__DataSet__Group_3__1__Impl : ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2679:1: ( ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) ) )
            // InternalSensidl.g:2680:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            {
            // InternalSensidl.g:2680:1: ( ( rule__DataSet__ParentDataSetAssignment_3_1 ) )
            // InternalSensidl.g:2681:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetAssignment_3_1()); 
            // InternalSensidl.g:2682:1: ( rule__DataSet__ParentDataSetAssignment_3_1 )
            // InternalSensidl.g:2682:2: rule__DataSet__ParentDataSetAssignment_3_1
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
    // InternalSensidl.g:2696:1: rule__DataSet__Group_4__0 : rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 ;
    public final void rule__DataSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2700:1: ( rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 )
            // InternalSensidl.g:2701:2: rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1
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
    // InternalSensidl.g:2708:1: rule__DataSet__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2712:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2713:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2713:1: ( 'with identifier' )
            // InternalSensidl.g:2714:1: 'with identifier'
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
    // InternalSensidl.g:2727:1: rule__DataSet__Group_4__1 : rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 ;
    public final void rule__DataSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2731:1: ( rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 )
            // InternalSensidl.g:2732:2: rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2
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
    // InternalSensidl.g:2739:1: rule__DataSet__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2743:1: ( ( ':' ) )
            // InternalSensidl.g:2744:1: ( ':' )
            {
            // InternalSensidl.g:2744:1: ( ':' )
            // InternalSensidl.g:2745:1: ':'
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
    // InternalSensidl.g:2758:1: rule__DataSet__Group_4__2 : rule__DataSet__Group_4__2__Impl ;
    public final void rule__DataSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2762:1: ( rule__DataSet__Group_4__2__Impl )
            // InternalSensidl.g:2763:2: rule__DataSet__Group_4__2__Impl
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
    // InternalSensidl.g:2769:1: rule__DataSet__Group_4__2__Impl : ( ( rule__DataSet__IDAssignment_4_2 ) ) ;
    public final void rule__DataSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2773:1: ( ( ( rule__DataSet__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:2774:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:2774:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            // InternalSensidl.g:2775:1: ( rule__DataSet__IDAssignment_4_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:2776:1: ( rule__DataSet__IDAssignment_4_2 )
            // InternalSensidl.g:2776:2: rule__DataSet__IDAssignment_4_2
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
    // InternalSensidl.g:2792:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2796:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSensidl.g:2797:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalSensidl.g:2804:1: rule__Method__Group__0__Impl : ( ( rule__Method__Alternatives_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2808:1: ( ( ( rule__Method__Alternatives_0 )? ) )
            // InternalSensidl.g:2809:1: ( ( rule__Method__Alternatives_0 )? )
            {
            // InternalSensidl.g:2809:1: ( ( rule__Method__Alternatives_0 )? )
            // InternalSensidl.g:2810:1: ( rule__Method__Alternatives_0 )?
            {
             before(grammarAccess.getMethodAccess().getAlternatives_0()); 
            // InternalSensidl.g:2811:1: ( rule__Method__Alternatives_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=62 && LA29_0<=65)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSensidl.g:2811:2: rule__Method__Alternatives_0
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
    // InternalSensidl.g:2821:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2825:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSensidl.g:2826:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalSensidl.g:2833:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2837:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalSensidl.g:2838:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2838:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalSensidl.g:2839:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2840:1: ( rule__Method__NameAssignment_1 )
            // InternalSensidl.g:2840:2: rule__Method__NameAssignment_1
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
    // InternalSensidl.g:2850:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2854:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSensidl.g:2855:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalSensidl.g:2862:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2866:1: ( ( '(' ) )
            // InternalSensidl.g:2867:1: ( '(' )
            {
            // InternalSensidl.g:2867:1: ( '(' )
            // InternalSensidl.g:2868:1: '('
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
    // InternalSensidl.g:2881:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2885:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSensidl.g:2886:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalSensidl.g:2893:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParameterAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2897:1: ( ( ( rule__Method__ParameterAssignment_3 )? ) )
            // InternalSensidl.g:2898:1: ( ( rule__Method__ParameterAssignment_3 )? )
            {
            // InternalSensidl.g:2898:1: ( ( rule__Method__ParameterAssignment_3 )? )
            // InternalSensidl.g:2899:1: ( rule__Method__ParameterAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_3()); 
            // InternalSensidl.g:2900:1: ( rule__Method__ParameterAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=16 && LA30_0<=27)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSensidl.g:2900:2: rule__Method__ParameterAssignment_3
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
    // InternalSensidl.g:2910:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2914:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSensidl.g:2915:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalSensidl.g:2922:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2926:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // InternalSensidl.g:2927:1: ( ( rule__Method__Group_4__0 )* )
            {
            // InternalSensidl.g:2927:1: ( ( rule__Method__Group_4__0 )* )
            // InternalSensidl.g:2928:1: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSensidl.g:2929:1: ( rule__Method__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSensidl.g:2929:2: rule__Method__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Method__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSensidl.g:2939:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2943:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSensidl.g:2944:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalSensidl.g:2951:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2955:1: ( ( ')' ) )
            // InternalSensidl.g:2956:1: ( ')' )
            {
            // InternalSensidl.g:2956:1: ( ')' )
            // InternalSensidl.g:2957:1: ')'
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
    // InternalSensidl.g:2970:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2974:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalSensidl.g:2975:2: rule__Method__Group__6__Impl rule__Method__Group__7
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
    // InternalSensidl.g:2982:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:2986:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalSensidl.g:2987:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalSensidl.g:2987:1: ( ( rule__Method__Group_6__0 )? )
            // InternalSensidl.g:2988:1: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalSensidl.g:2989:1: ( rule__Method__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSensidl.g:2989:2: rule__Method__Group_6__0
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
    // InternalSensidl.g:2999:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3003:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalSensidl.g:3004:2: rule__Method__Group__7__Impl rule__Method__Group__8
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
    // InternalSensidl.g:3011:1: rule__Method__Group__7__Impl : ( 'as' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3015:1: ( ( 'as' ) )
            // InternalSensidl.g:3016:1: ( 'as' )
            {
            // InternalSensidl.g:3016:1: ( 'as' )
            // InternalSensidl.g:3017:1: 'as'
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
    // InternalSensidl.g:3030:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3034:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalSensidl.g:3035:2: rule__Method__Group__8__Impl rule__Method__Group__9
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
    // InternalSensidl.g:3042:1: rule__Method__Group__8__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3046:1: ( ( 'Method' ) )
            // InternalSensidl.g:3047:1: ( 'Method' )
            {
            // InternalSensidl.g:3047:1: ( 'Method' )
            // InternalSensidl.g:3048:1: 'Method'
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
    // InternalSensidl.g:3061:1: rule__Method__Group__9 : rule__Method__Group__9__Impl rule__Method__Group__10 ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3065:1: ( rule__Method__Group__9__Impl rule__Method__Group__10 )
            // InternalSensidl.g:3066:2: rule__Method__Group__9__Impl rule__Method__Group__10
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
    // InternalSensidl.g:3073:1: rule__Method__Group__9__Impl : ( ( rule__Method__Group_9__0 )? ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3077:1: ( ( ( rule__Method__Group_9__0 )? ) )
            // InternalSensidl.g:3078:1: ( ( rule__Method__Group_9__0 )? )
            {
            // InternalSensidl.g:3078:1: ( ( rule__Method__Group_9__0 )? )
            // InternalSensidl.g:3079:1: ( rule__Method__Group_9__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_9()); 
            // InternalSensidl.g:3080:1: ( rule__Method__Group_9__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSensidl.g:3080:2: rule__Method__Group_9__0
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
    // InternalSensidl.g:3090:1: rule__Method__Group__10 : rule__Method__Group__10__Impl ;
    public final void rule__Method__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3094:1: ( rule__Method__Group__10__Impl )
            // InternalSensidl.g:3095:2: rule__Method__Group__10__Impl
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
    // InternalSensidl.g:3101:1: rule__Method__Group__10__Impl : ( ( rule__Method__DescriptionAssignment_10 )? ) ;
    public final void rule__Method__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3105:1: ( ( ( rule__Method__DescriptionAssignment_10 )? ) )
            // InternalSensidl.g:3106:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            {
            // InternalSensidl.g:3106:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            // InternalSensidl.g:3107:1: ( rule__Method__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getMethodAccess().getDescriptionAssignment_10()); 
            // InternalSensidl.g:3108:1: ( rule__Method__DescriptionAssignment_10 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DESCRIPTION) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSensidl.g:3108:2: rule__Method__DescriptionAssignment_10
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
    // InternalSensidl.g:3140:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3144:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSensidl.g:3145:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
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
    // InternalSensidl.g:3152:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3156:1: ( ( ',' ) )
            // InternalSensidl.g:3157:1: ( ',' )
            {
            // InternalSensidl.g:3157:1: ( ',' )
            // InternalSensidl.g:3158:1: ','
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
    // InternalSensidl.g:3171:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3175:1: ( rule__Method__Group_4__1__Impl )
            // InternalSensidl.g:3176:2: rule__Method__Group_4__1__Impl
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
    // InternalSensidl.g:3182:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParameterAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3186:1: ( ( ( rule__Method__ParameterAssignment_4_1 ) ) )
            // InternalSensidl.g:3187:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            {
            // InternalSensidl.g:3187:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            // InternalSensidl.g:3188:1: ( rule__Method__ParameterAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_1()); 
            // InternalSensidl.g:3189:1: ( rule__Method__ParameterAssignment_4_1 )
            // InternalSensidl.g:3189:2: rule__Method__ParameterAssignment_4_1
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
    // InternalSensidl.g:3203:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3207:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalSensidl.g:3208:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
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
    // InternalSensidl.g:3215:1: rule__Method__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3219:1: ( ( ':' ) )
            // InternalSensidl.g:3220:1: ( ':' )
            {
            // InternalSensidl.g:3220:1: ( ':' )
            // InternalSensidl.g:3221:1: ':'
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
    // InternalSensidl.g:3234:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3238:1: ( rule__Method__Group_6__1__Impl )
            // InternalSensidl.g:3239:2: rule__Method__Group_6__1__Impl
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
    // InternalSensidl.g:3245:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Alternatives_6_1 ) ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3249:1: ( ( ( rule__Method__Alternatives_6_1 ) ) )
            // InternalSensidl.g:3250:1: ( ( rule__Method__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:3250:1: ( ( rule__Method__Alternatives_6_1 ) )
            // InternalSensidl.g:3251:1: ( rule__Method__Alternatives_6_1 )
            {
             before(grammarAccess.getMethodAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:3252:1: ( rule__Method__Alternatives_6_1 )
            // InternalSensidl.g:3252:2: rule__Method__Alternatives_6_1
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
    // InternalSensidl.g:3266:1: rule__Method__Group_9__0 : rule__Method__Group_9__0__Impl rule__Method__Group_9__1 ;
    public final void rule__Method__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3270:1: ( rule__Method__Group_9__0__Impl rule__Method__Group_9__1 )
            // InternalSensidl.g:3271:2: rule__Method__Group_9__0__Impl rule__Method__Group_9__1
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
    // InternalSensidl.g:3278:1: rule__Method__Group_9__0__Impl : ( 'with identifier' ) ;
    public final void rule__Method__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3282:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3283:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3283:1: ( 'with identifier' )
            // InternalSensidl.g:3284:1: 'with identifier'
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
    // InternalSensidl.g:3297:1: rule__Method__Group_9__1 : rule__Method__Group_9__1__Impl rule__Method__Group_9__2 ;
    public final void rule__Method__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3301:1: ( rule__Method__Group_9__1__Impl rule__Method__Group_9__2 )
            // InternalSensidl.g:3302:2: rule__Method__Group_9__1__Impl rule__Method__Group_9__2
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
    // InternalSensidl.g:3309:1: rule__Method__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Method__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3313:1: ( ( ':' ) )
            // InternalSensidl.g:3314:1: ( ':' )
            {
            // InternalSensidl.g:3314:1: ( ':' )
            // InternalSensidl.g:3315:1: ':'
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
    // InternalSensidl.g:3328:1: rule__Method__Group_9__2 : rule__Method__Group_9__2__Impl ;
    public final void rule__Method__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3332:1: ( rule__Method__Group_9__2__Impl )
            // InternalSensidl.g:3333:2: rule__Method__Group_9__2__Impl
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
    // InternalSensidl.g:3339:1: rule__Method__Group_9__2__Impl : ( ( rule__Method__IDAssignment_9_2 ) ) ;
    public final void rule__Method__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3343:1: ( ( ( rule__Method__IDAssignment_9_2 ) ) )
            // InternalSensidl.g:3344:1: ( ( rule__Method__IDAssignment_9_2 ) )
            {
            // InternalSensidl.g:3344:1: ( ( rule__Method__IDAssignment_9_2 ) )
            // InternalSensidl.g:3345:1: ( rule__Method__IDAssignment_9_2 )
            {
             before(grammarAccess.getMethodAccess().getIDAssignment_9_2()); 
            // InternalSensidl.g:3346:1: ( rule__Method__IDAssignment_9_2 )
            // InternalSensidl.g:3346:2: rule__Method__IDAssignment_9_2
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
    // InternalSensidl.g:3362:1: rule__MethodParameter__Group__0 : rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 ;
    public final void rule__MethodParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3366:1: ( rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 )
            // InternalSensidl.g:3367:2: rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1
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
    // InternalSensidl.g:3374:1: rule__MethodParameter__Group__0__Impl : ( ( rule__MethodParameter__Alternatives_0 ) ) ;
    public final void rule__MethodParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3378:1: ( ( ( rule__MethodParameter__Alternatives_0 ) ) )
            // InternalSensidl.g:3379:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            {
            // InternalSensidl.g:3379:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            // InternalSensidl.g:3380:1: ( rule__MethodParameter__Alternatives_0 )
            {
             before(grammarAccess.getMethodParameterAccess().getAlternatives_0()); 
            // InternalSensidl.g:3381:1: ( rule__MethodParameter__Alternatives_0 )
            // InternalSensidl.g:3381:2: rule__MethodParameter__Alternatives_0
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
    // InternalSensidl.g:3391:1: rule__MethodParameter__Group__1 : rule__MethodParameter__Group__1__Impl ;
    public final void rule__MethodParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3395:1: ( rule__MethodParameter__Group__1__Impl )
            // InternalSensidl.g:3396:2: rule__MethodParameter__Group__1__Impl
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
    // InternalSensidl.g:3402:1: rule__MethodParameter__Group__1__Impl : ( ( rule__MethodParameter__NameAssignment_1 ) ) ;
    public final void rule__MethodParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3406:1: ( ( ( rule__MethodParameter__NameAssignment_1 ) ) )
            // InternalSensidl.g:3407:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            {
            // InternalSensidl.g:3407:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            // InternalSensidl.g:3408:1: ( rule__MethodParameter__NameAssignment_1 )
            {
             before(grammarAccess.getMethodParameterAccess().getNameAssignment_1()); 
            // InternalSensidl.g:3409:1: ( rule__MethodParameter__NameAssignment_1 )
            // InternalSensidl.g:3409:2: rule__MethodParameter__NameAssignment_1
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
    // InternalSensidl.g:3423:1: rule__ListData__Group__0 : rule__ListData__Group__0__Impl rule__ListData__Group__1 ;
    public final void rule__ListData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3427:1: ( rule__ListData__Group__0__Impl rule__ListData__Group__1 )
            // InternalSensidl.g:3428:2: rule__ListData__Group__0__Impl rule__ListData__Group__1
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
    // InternalSensidl.g:3435:1: rule__ListData__Group__0__Impl : ( ( rule__ListData__NameAssignment_0 ) ) ;
    public final void rule__ListData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3439:1: ( ( ( rule__ListData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3440:1: ( ( rule__ListData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3440:1: ( ( rule__ListData__NameAssignment_0 ) )
            // InternalSensidl.g:3441:1: ( rule__ListData__NameAssignment_0 )
            {
             before(grammarAccess.getListDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3442:1: ( rule__ListData__NameAssignment_0 )
            // InternalSensidl.g:3442:2: rule__ListData__NameAssignment_0
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
    // InternalSensidl.g:3452:1: rule__ListData__Group__1 : rule__ListData__Group__1__Impl rule__ListData__Group__2 ;
    public final void rule__ListData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3456:1: ( rule__ListData__Group__1__Impl rule__ListData__Group__2 )
            // InternalSensidl.g:3457:2: rule__ListData__Group__1__Impl rule__ListData__Group__2
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
    // InternalSensidl.g:3464:1: rule__ListData__Group__1__Impl : ( 'as' ) ;
    public final void rule__ListData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3468:1: ( ( 'as' ) )
            // InternalSensidl.g:3469:1: ( 'as' )
            {
            // InternalSensidl.g:3469:1: ( 'as' )
            // InternalSensidl.g:3470:1: 'as'
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
    // InternalSensidl.g:3483:1: rule__ListData__Group__2 : rule__ListData__Group__2__Impl rule__ListData__Group__3 ;
    public final void rule__ListData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3487:1: ( rule__ListData__Group__2__Impl rule__ListData__Group__3 )
            // InternalSensidl.g:3488:2: rule__ListData__Group__2__Impl rule__ListData__Group__3
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
    // InternalSensidl.g:3495:1: rule__ListData__Group__2__Impl : ( 'list' ) ;
    public final void rule__ListData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3499:1: ( ( 'list' ) )
            // InternalSensidl.g:3500:1: ( 'list' )
            {
            // InternalSensidl.g:3500:1: ( 'list' )
            // InternalSensidl.g:3501:1: 'list'
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
    // InternalSensidl.g:3514:1: rule__ListData__Group__3 : rule__ListData__Group__3__Impl rule__ListData__Group__4 ;
    public final void rule__ListData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3518:1: ( rule__ListData__Group__3__Impl rule__ListData__Group__4 )
            // InternalSensidl.g:3519:2: rule__ListData__Group__3__Impl rule__ListData__Group__4
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
    // InternalSensidl.g:3526:1: rule__ListData__Group__3__Impl : ( 'of' ) ;
    public final void rule__ListData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3530:1: ( ( 'of' ) )
            // InternalSensidl.g:3531:1: ( 'of' )
            {
            // InternalSensidl.g:3531:1: ( 'of' )
            // InternalSensidl.g:3532:1: 'of'
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
    // InternalSensidl.g:3545:1: rule__ListData__Group__4 : rule__ListData__Group__4__Impl ;
    public final void rule__ListData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3549:1: ( rule__ListData__Group__4__Impl )
            // InternalSensidl.g:3550:2: rule__ListData__Group__4__Impl
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
    // InternalSensidl.g:3556:1: rule__ListData__Group__4__Impl : ( ( rule__ListData__Alternatives_4 ) ) ;
    public final void rule__ListData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3560:1: ( ( ( rule__ListData__Alternatives_4 ) ) )
            // InternalSensidl.g:3561:1: ( ( rule__ListData__Alternatives_4 ) )
            {
            // InternalSensidl.g:3561:1: ( ( rule__ListData__Alternatives_4 ) )
            // InternalSensidl.g:3562:1: ( rule__ListData__Alternatives_4 )
            {
             before(grammarAccess.getListDataAccess().getAlternatives_4()); 
            // InternalSensidl.g:3563:1: ( rule__ListData__Alternatives_4 )
            // InternalSensidl.g:3563:2: rule__ListData__Alternatives_4
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
    // InternalSensidl.g:3583:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3587:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:3588:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
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
    // InternalSensidl.g:3595:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3599:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3600:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3600:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3601:1: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3602:1: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3602:2: rule__MeasurementData__NameAssignment_0
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
    // InternalSensidl.g:3612:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3616:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:3617:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
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
    // InternalSensidl.g:3624:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3628:1: ( ( 'as' ) )
            // InternalSensidl.g:3629:1: ( 'as' )
            {
            // InternalSensidl.g:3629:1: ( 'as' )
            // InternalSensidl.g:3630:1: 'as'
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
    // InternalSensidl.g:3643:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3647:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:3648:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
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
    // InternalSensidl.g:3655:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3659:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:3660:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:3660:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:3661:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:3662:1: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:3662:2: rule__MeasurementData__DataTypeAssignment_2
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
    // InternalSensidl.g:3672:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3676:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:3677:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
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
    // InternalSensidl.g:3684:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3688:1: ( ( 'in' ) )
            // InternalSensidl.g:3689:1: ( 'in' )
            {
            // InternalSensidl.g:3689:1: ( 'in' )
            // InternalSensidl.g:3690:1: 'in'
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
    // InternalSensidl.g:3703:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3707:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:3708:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
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
    // InternalSensidl.g:3715:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3719:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:3720:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:3720:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:3721:1: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:3722:1: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:3722:2: rule__MeasurementData__UnitAssignment_4
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
    // InternalSensidl.g:3732:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3736:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:3737:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
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
    // InternalSensidl.g:3744:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3748:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3749:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3749:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3750:1: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3751:1: ( rule__MeasurementData__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSensidl.g:3751:2: rule__MeasurementData__Group_5__0
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
    // InternalSensidl.g:3761:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3765:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:3766:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
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
    // InternalSensidl.g:3773:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Alternatives_6 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3777:1: ( ( ( rule__MeasurementData__Alternatives_6 )? ) )
            // InternalSensidl.g:3778:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            {
            // InternalSensidl.g:3778:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            // InternalSensidl.g:3779:1: ( rule__MeasurementData__Alternatives_6 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 
            // InternalSensidl.g:3780:1: ( rule__MeasurementData__Alternatives_6 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSensidl.g:3780:2: rule__MeasurementData__Alternatives_6
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
    // InternalSensidl.g:3790:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3794:1: ( rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 )
            // InternalSensidl.g:3795:2: rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8
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
    // InternalSensidl.g:3802:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__Group_7__0 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3806:1: ( ( ( rule__MeasurementData__Group_7__0 )? ) )
            // InternalSensidl.g:3807:1: ( ( rule__MeasurementData__Group_7__0 )? )
            {
            // InternalSensidl.g:3807:1: ( ( rule__MeasurementData__Group_7__0 )? )
            // InternalSensidl.g:3808:1: ( rule__MeasurementData__Group_7__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7()); 
            // InternalSensidl.g:3809:1: ( rule__MeasurementData__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSensidl.g:3809:2: rule__MeasurementData__Group_7__0
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
    // InternalSensidl.g:3819:1: rule__MeasurementData__Group__8 : rule__MeasurementData__Group__8__Impl ;
    public final void rule__MeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3823:1: ( rule__MeasurementData__Group__8__Impl )
            // InternalSensidl.g:3824:2: rule__MeasurementData__Group__8__Impl
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
    // InternalSensidl.g:3830:1: rule__MeasurementData__Group__8__Impl : ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) ;
    public final void rule__MeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3834:1: ( ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) )
            // InternalSensidl.g:3835:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            {
            // InternalSensidl.g:3835:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            // InternalSensidl.g:3836:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_8()); 
            // InternalSensidl.g:3837:1: ( rule__MeasurementData__DescriptionAssignment_8 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DESCRIPTION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSensidl.g:3837:2: rule__MeasurementData__DescriptionAssignment_8
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
    // InternalSensidl.g:3865:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3869:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:3870:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
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
    // InternalSensidl.g:3877:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3881:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3882:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3882:1: ( 'with identifier' )
            // InternalSensidl.g:3883:1: 'with identifier'
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
    // InternalSensidl.g:3896:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3900:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:3901:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
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
    // InternalSensidl.g:3908:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3912:1: ( ( ':' ) )
            // InternalSensidl.g:3913:1: ( ':' )
            {
            // InternalSensidl.g:3913:1: ( ':' )
            // InternalSensidl.g:3914:1: ':'
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
    // InternalSensidl.g:3927:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3931:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3932:2: rule__MeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:3938:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3942:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3943:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3943:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3944:1: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3945:1: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3945:2: rule__MeasurementData__IDAssignment_5_2
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
    // InternalSensidl.g:3961:1: rule__MeasurementData__Group_6_0__0 : rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 ;
    public final void rule__MeasurementData__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3965:1: ( rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 )
            // InternalSensidl.g:3966:2: rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1
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
    // InternalSensidl.g:3973:1: rule__MeasurementData__Group_6_0__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3977:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3978:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3978:1: ( 'adjusted' )
            // InternalSensidl.g:3979:1: 'adjusted'
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
    // InternalSensidl.g:3992:1: rule__MeasurementData__Group_6_0__1 : rule__MeasurementData__Group_6_0__1__Impl ;
    public final void rule__MeasurementData__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:3996:1: ( rule__MeasurementData__Group_6_0__1__Impl )
            // InternalSensidl.g:3997:2: rule__MeasurementData__Group_6_0__1__Impl
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
    // InternalSensidl.g:4003:1: rule__MeasurementData__Group_6_0__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) ;
    public final void rule__MeasurementData__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4007:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) )
            // InternalSensidl.g:4008:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            {
            // InternalSensidl.g:4008:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            // InternalSensidl.g:4009:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 
            // InternalSensidl.g:4010:1: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            // InternalSensidl.g:4010:2: rule__MeasurementData__AdjustmentsAssignment_6_0_1
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
    // InternalSensidl.g:4024:1: rule__MeasurementData__Group_6_1__0 : rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 ;
    public final void rule__MeasurementData__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4028:1: ( rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 )
            // InternalSensidl.g:4029:2: rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1
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
    // InternalSensidl.g:4036:1: rule__MeasurementData__Group_6_1__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4040:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:4041:1: ( 'adjusted' )
            {
            // InternalSensidl.g:4041:1: ( 'adjusted' )
            // InternalSensidl.g:4042:1: 'adjusted'
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
    // InternalSensidl.g:4055:1: rule__MeasurementData__Group_6_1__1 : rule__MeasurementData__Group_6_1__1__Impl ;
    public final void rule__MeasurementData__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4059:1: ( rule__MeasurementData__Group_6_1__1__Impl )
            // InternalSensidl.g:4060:2: rule__MeasurementData__Group_6_1__1__Impl
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
    // InternalSensidl.g:4066:1: rule__MeasurementData__Group_6_1__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) ;
    public final void rule__MeasurementData__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4070:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) )
            // InternalSensidl.g:4071:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            {
            // InternalSensidl.g:4071:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            // InternalSensidl.g:4072:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 
            // InternalSensidl.g:4073:1: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            // InternalSensidl.g:4073:2: rule__MeasurementData__AdjustmentsAssignment_6_1_1
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
    // InternalSensidl.g:4087:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4091:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:4092:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
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
    // InternalSensidl.g:4099:1: rule__MeasurementData__Group_6_2__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4103:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:4104:1: ( 'adjusted' )
            {
            // InternalSensidl.g:4104:1: ( 'adjusted' )
            // InternalSensidl.g:4105:1: 'adjusted'
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
    // InternalSensidl.g:4118:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4122:1: ( rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 )
            // InternalSensidl.g:4123:2: rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2
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
    // InternalSensidl.g:4130:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4134:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:4135:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:4135:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:4136:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:4137:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:4137:2: rule__MeasurementData__AdjustmentsAssignment_6_2_1
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
    // InternalSensidl.g:4147:1: rule__MeasurementData__Group_6_2__2 : rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 ;
    public final void rule__MeasurementData__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4151:1: ( rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 )
            // InternalSensidl.g:4152:2: rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3
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
    // InternalSensidl.g:4159:1: rule__MeasurementData__Group_6_2__2__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4163:1: ( ( ',' ) )
            // InternalSensidl.g:4164:1: ( ',' )
            {
            // InternalSensidl.g:4164:1: ( ',' )
            // InternalSensidl.g:4165:1: ','
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
    // InternalSensidl.g:4178:1: rule__MeasurementData__Group_6_2__3 : rule__MeasurementData__Group_6_2__3__Impl ;
    public final void rule__MeasurementData__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4182:1: ( rule__MeasurementData__Group_6_2__3__Impl )
            // InternalSensidl.g:4183:2: rule__MeasurementData__Group_6_2__3__Impl
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
    // InternalSensidl.g:4189:1: rule__MeasurementData__Group_6_2__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) ;
    public final void rule__MeasurementData__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4193:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) )
            // InternalSensidl.g:4194:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            {
            // InternalSensidl.g:4194:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            // InternalSensidl.g:4195:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 
            // InternalSensidl.g:4196:1: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            // InternalSensidl.g:4196:2: rule__MeasurementData__AdjustmentsAssignment_6_2_3
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
    // InternalSensidl.g:4214:1: rule__MeasurementData__Group_7__0 : rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 ;
    public final void rule__MeasurementData__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4218:1: ( rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 )
            // InternalSensidl.g:4219:2: rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1
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
    // InternalSensidl.g:4226:1: rule__MeasurementData__Group_7__0__Impl : ( 'exclude:' ) ;
    public final void rule__MeasurementData__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4230:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:4231:1: ( 'exclude:' )
            {
            // InternalSensidl.g:4231:1: ( 'exclude:' )
            // InternalSensidl.g:4232:1: 'exclude:'
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
    // InternalSensidl.g:4245:1: rule__MeasurementData__Group_7__1 : rule__MeasurementData__Group_7__1__Impl ;
    public final void rule__MeasurementData__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4249:1: ( rule__MeasurementData__Group_7__1__Impl )
            // InternalSensidl.g:4250:2: rule__MeasurementData__Group_7__1__Impl
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
    // InternalSensidl.g:4256:1: rule__MeasurementData__Group_7__1__Impl : ( ( rule__MeasurementData__Alternatives_7_1 ) ) ;
    public final void rule__MeasurementData__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4260:1: ( ( ( rule__MeasurementData__Alternatives_7_1 ) ) )
            // InternalSensidl.g:4261:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            {
            // InternalSensidl.g:4261:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            // InternalSensidl.g:4262:1: ( rule__MeasurementData__Alternatives_7_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_7_1()); 
            // InternalSensidl.g:4263:1: ( rule__MeasurementData__Alternatives_7_1 )
            // InternalSensidl.g:4263:2: rule__MeasurementData__Alternatives_7_1
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
    // InternalSensidl.g:4277:1: rule__MeasurementData__Group_7_1_0__0 : rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 ;
    public final void rule__MeasurementData__Group_7_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4281:1: ( rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 )
            // InternalSensidl.g:4282:2: rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1
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
    // InternalSensidl.g:4289:1: rule__MeasurementData__Group_7_1_0__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4293:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) )
            // InternalSensidl.g:4294:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            {
            // InternalSensidl.g:4294:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            // InternalSensidl.g:4295:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_0()); 
            // InternalSensidl.g:4296:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            // InternalSensidl.g:4296:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0
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
    // InternalSensidl.g:4306:1: rule__MeasurementData__Group_7_1_0__1 : rule__MeasurementData__Group_7_1_0__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4310:1: ( rule__MeasurementData__Group_7_1_0__1__Impl )
            // InternalSensidl.g:4311:2: rule__MeasurementData__Group_7_1_0__1__Impl
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
    // InternalSensidl.g:4317:1: rule__MeasurementData__Group_7_1_0__1__Impl : ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4321:1: ( ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) )
            // InternalSensidl.g:4322:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            {
            // InternalSensidl.g:4322:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            // InternalSensidl.g:4323:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0_1()); 
            // InternalSensidl.g:4324:1: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSensidl.g:4324:2: rule__MeasurementData__Group_7_1_0_1__0
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
    // InternalSensidl.g:4338:1: rule__MeasurementData__Group_7_1_0_1__0 : rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 ;
    public final void rule__MeasurementData__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4342:1: ( rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 )
            // InternalSensidl.g:4343:2: rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1
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
    // InternalSensidl.g:4350:1: rule__MeasurementData__Group_7_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4354:1: ( ( ',' ) )
            // InternalSensidl.g:4355:1: ( ',' )
            {
            // InternalSensidl.g:4355:1: ( ',' )
            // InternalSensidl.g:4356:1: ','
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
    // InternalSensidl.g:4369:1: rule__MeasurementData__Group_7_1_0_1__1 : rule__MeasurementData__Group_7_1_0_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4373:1: ( rule__MeasurementData__Group_7_1_0_1__1__Impl )
            // InternalSensidl.g:4374:2: rule__MeasurementData__Group_7_1_0_1__1__Impl
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
    // InternalSensidl.g:4380:1: rule__MeasurementData__Group_7_1_0_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4384:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) )
            // InternalSensidl.g:4385:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            {
            // InternalSensidl.g:4385:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            // InternalSensidl.g:4386:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_1_1()); 
            // InternalSensidl.g:4387:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            // InternalSensidl.g:4387:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1
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
    // InternalSensidl.g:4401:1: rule__MeasurementData__Group_7_1_1__0 : rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4405:1: ( rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 )
            // InternalSensidl.g:4406:2: rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1
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
    // InternalSensidl.g:4413:1: rule__MeasurementData__Group_7_1_1__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4417:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) )
            // InternalSensidl.g:4418:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            {
            // InternalSensidl.g:4418:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            // InternalSensidl.g:4419:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_0()); 
            // InternalSensidl.g:4420:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            // InternalSensidl.g:4420:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0
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
    // InternalSensidl.g:4430:1: rule__MeasurementData__Group_7_1_1__1 : rule__MeasurementData__Group_7_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4434:1: ( rule__MeasurementData__Group_7_1_1__1__Impl )
            // InternalSensidl.g:4435:2: rule__MeasurementData__Group_7_1_1__1__Impl
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
    // InternalSensidl.g:4441:1: rule__MeasurementData__Group_7_1_1__1__Impl : ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4445:1: ( ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) )
            // InternalSensidl.g:4446:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            {
            // InternalSensidl.g:4446:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            // InternalSensidl.g:4447:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1_1()); 
            // InternalSensidl.g:4448:1: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSensidl.g:4448:2: rule__MeasurementData__Group_7_1_1_1__0
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
    // InternalSensidl.g:4462:1: rule__MeasurementData__Group_7_1_1_1__0 : rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4466:1: ( rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 )
            // InternalSensidl.g:4467:2: rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1
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
    // InternalSensidl.g:4474:1: rule__MeasurementData__Group_7_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4478:1: ( ( ',' ) )
            // InternalSensidl.g:4479:1: ( ',' )
            {
            // InternalSensidl.g:4479:1: ( ',' )
            // InternalSensidl.g:4480:1: ','
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
    // InternalSensidl.g:4493:1: rule__MeasurementData__Group_7_1_1_1__1 : rule__MeasurementData__Group_7_1_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4497:1: ( rule__MeasurementData__Group_7_1_1_1__1__Impl )
            // InternalSensidl.g:4498:2: rule__MeasurementData__Group_7_1_1_1__1__Impl
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
    // InternalSensidl.g:4504:1: rule__MeasurementData__Group_7_1_1_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4508:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) )
            // InternalSensidl.g:4509:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            {
            // InternalSensidl.g:4509:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            // InternalSensidl.g:4510:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_1_1()); 
            // InternalSensidl.g:4511:1: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            // InternalSensidl.g:4511:2: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1
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
    // InternalSensidl.g:4525:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4529:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:4530:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
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
    // InternalSensidl.g:4537:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4541:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:4542:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:4542:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:4543:1: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:4544:1: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:4544:2: rule__NonMeasurementData__NameAssignment_0
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
    // InternalSensidl.g:4554:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4558:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:4559:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
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
    // InternalSensidl.g:4566:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4570:1: ( ( 'as' ) )
            // InternalSensidl.g:4571:1: ( 'as' )
            {
            // InternalSensidl.g:4571:1: ( 'as' )
            // InternalSensidl.g:4572:1: 'as'
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
    // InternalSensidl.g:4585:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4589:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:4590:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
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
    // InternalSensidl.g:4597:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4601:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:4602:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:4602:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:4603:1: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:4604:1: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:4604:2: rule__NonMeasurementData__Alternatives_2
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
    // InternalSensidl.g:4614:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4618:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:4619:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
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
    // InternalSensidl.g:4626:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4630:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3 )? ) )
            // InternalSensidl.g:4631:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            {
            // InternalSensidl.g:4631:1: ( ( rule__NonMeasurementData__ConstantAssignment_3 )? )
            // InternalSensidl.g:4632:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3()); 
            // InternalSensidl.g:4633:1: ( rule__NonMeasurementData__ConstantAssignment_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==68) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSensidl.g:4633:2: rule__NonMeasurementData__ConstantAssignment_3
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
    // InternalSensidl.g:4643:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4647:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:4648:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
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
    // InternalSensidl.g:4655:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4659:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:4660:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:4660:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:4661:1: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:4662:1: ( rule__NonMeasurementData__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSensidl.g:4662:2: rule__NonMeasurementData__Group_4__0
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
    // InternalSensidl.g:4672:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4676:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:4677:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
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
    // InternalSensidl.g:4684:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4688:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:4689:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:4689:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:4690:1: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:4691:1: ( rule__NonMeasurementData__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSensidl.g:4691:2: rule__NonMeasurementData__Group_5__0
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
    // InternalSensidl.g:4701:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4705:1: ( rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7 )
            // InternalSensidl.g:4706:2: rule__NonMeasurementData__Group__6__Impl rule__NonMeasurementData__Group__7
            {
            pushFollow(FOLLOW_46);
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
    // InternalSensidl.g:4713:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__Group_6__0 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4717:1: ( ( ( rule__NonMeasurementData__Group_6__0 )? ) )
            // InternalSensidl.g:4718:1: ( ( rule__NonMeasurementData__Group_6__0 )? )
            {
            // InternalSensidl.g:4718:1: ( ( rule__NonMeasurementData__Group_6__0 )? )
            // InternalSensidl.g:4719:1: ( rule__NonMeasurementData__Group_6__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6()); 
            // InternalSensidl.g:4720:1: ( rule__NonMeasurementData__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSensidl.g:4720:2: rule__NonMeasurementData__Group_6__0
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
    // InternalSensidl.g:4730:1: rule__NonMeasurementData__Group__7 : rule__NonMeasurementData__Group__7__Impl ;
    public final void rule__NonMeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4734:1: ( rule__NonMeasurementData__Group__7__Impl )
            // InternalSensidl.g:4735:2: rule__NonMeasurementData__Group__7__Impl
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
    // InternalSensidl.g:4741:1: rule__NonMeasurementData__Group__7__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? ) ;
    public final void rule__NonMeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4745:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:4746:1: ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:4746:1: ( ( rule__NonMeasurementData__DescriptionAssignment_7 )? )
            // InternalSensidl.g:4747:1: ( rule__NonMeasurementData__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:4748:1: ( rule__NonMeasurementData__DescriptionAssignment_7 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DESCRIPTION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSensidl.g:4748:2: rule__NonMeasurementData__DescriptionAssignment_7
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
    // InternalSensidl.g:4774:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4778:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:4779:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalSensidl.g:4786:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4790:1: ( ( 'value' ) )
            // InternalSensidl.g:4791:1: ( 'value' )
            {
            // InternalSensidl.g:4791:1: ( 'value' )
            // InternalSensidl.g:4792:1: 'value'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSensidl.g:4805:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4809:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:4810:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
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
    // InternalSensidl.g:4817:1: rule__NonMeasurementData__Group_4__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4821:1: ( ( '=' ) )
            // InternalSensidl.g:4822:1: ( '=' )
            {
            // InternalSensidl.g:4822:1: ( '=' )
            // InternalSensidl.g:4823:1: '='
            {
             before(grammarAccess.getNonMeasurementDataAccess().getEqualsSignKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSensidl.g:4836:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4840:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:4841:2: rule__NonMeasurementData__Group_4__2__Impl
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
    // InternalSensidl.g:4847:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4851:1: ( ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) ) )
            // InternalSensidl.g:4852:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            {
            // InternalSensidl.g:4852:1: ( ( rule__NonMeasurementData__ValueAssignment_4_2 ) )
            // InternalSensidl.g:4853:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_4_2()); 
            // InternalSensidl.g:4854:1: ( rule__NonMeasurementData__ValueAssignment_4_2 )
            // InternalSensidl.g:4854:2: rule__NonMeasurementData__ValueAssignment_4_2
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
    // InternalSensidl.g:4870:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4874:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:4875:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
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
    // InternalSensidl.g:4882:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4886:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:4887:1: ( 'with identifier' )
            {
            // InternalSensidl.g:4887:1: ( 'with identifier' )
            // InternalSensidl.g:4888:1: 'with identifier'
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
    // InternalSensidl.g:4901:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4905:1: ( rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2 )
            // InternalSensidl.g:4906:2: rule__NonMeasurementData__Group_5__1__Impl rule__NonMeasurementData__Group_5__2
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
    // InternalSensidl.g:4913:1: rule__NonMeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4917:1: ( ( ':' ) )
            // InternalSensidl.g:4918:1: ( ':' )
            {
            // InternalSensidl.g:4918:1: ( ':' )
            // InternalSensidl.g:4919:1: ':'
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
    // InternalSensidl.g:4932:1: rule__NonMeasurementData__Group_5__2 : rule__NonMeasurementData__Group_5__2__Impl ;
    public final void rule__NonMeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4936:1: ( rule__NonMeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:4937:2: rule__NonMeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:4943:1: rule__NonMeasurementData__Group_5__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__NonMeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4947:1: ( ( ( rule__NonMeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:4948:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:4948:1: ( ( rule__NonMeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:4949:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:4950:1: ( rule__NonMeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:4950:2: rule__NonMeasurementData__IDAssignment_5_2
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
    // InternalSensidl.g:4966:1: rule__NonMeasurementData__Group_6__0 : rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1 ;
    public final void rule__NonMeasurementData__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4970:1: ( rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1 )
            // InternalSensidl.g:4971:2: rule__NonMeasurementData__Group_6__0__Impl rule__NonMeasurementData__Group_6__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSensidl.g:4978:1: rule__NonMeasurementData__Group_6__0__Impl : ( 'exclude:' ) ;
    public final void rule__NonMeasurementData__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:4982:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:4983:1: ( 'exclude:' )
            {
            // InternalSensidl.g:4983:1: ( 'exclude:' )
            // InternalSensidl.g:4984:1: 'exclude:'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludeKeyword_6_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSensidl.g:4997:1: rule__NonMeasurementData__Group_6__1 : rule__NonMeasurementData__Group_6__1__Impl ;
    public final void rule__NonMeasurementData__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5001:1: ( rule__NonMeasurementData__Group_6__1__Impl )
            // InternalSensidl.g:5002:2: rule__NonMeasurementData__Group_6__1__Impl
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
    // InternalSensidl.g:5008:1: rule__NonMeasurementData__Group_6__1__Impl : ( ( rule__NonMeasurementData__Alternatives_6_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5012:1: ( ( ( rule__NonMeasurementData__Alternatives_6_1 ) ) )
            // InternalSensidl.g:5013:1: ( ( rule__NonMeasurementData__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:5013:1: ( ( rule__NonMeasurementData__Alternatives_6_1 ) )
            // InternalSensidl.g:5014:1: ( rule__NonMeasurementData__Alternatives_6_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:5015:1: ( rule__NonMeasurementData__Alternatives_6_1 )
            // InternalSensidl.g:5015:2: rule__NonMeasurementData__Alternatives_6_1
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
    // InternalSensidl.g:5029:1: rule__NonMeasurementData__Group_6_1_0__0 : rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1 ;
    public final void rule__NonMeasurementData__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5033:1: ( rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1 )
            // InternalSensidl.g:5034:2: rule__NonMeasurementData__Group_6_1_0__0__Impl rule__NonMeasurementData__Group_6_1_0__1
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
    // InternalSensidl.g:5041:1: rule__NonMeasurementData__Group_6_1_0__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5045:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) ) )
            // InternalSensidl.g:5046:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) )
            {
            // InternalSensidl.g:5046:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 ) )
            // InternalSensidl.g:5047:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_0()); 
            // InternalSensidl.g:5048:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 )
            // InternalSensidl.g:5048:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0
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
    // InternalSensidl.g:5058:1: rule__NonMeasurementData__Group_6_1_0__1 : rule__NonMeasurementData__Group_6_1_0__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5062:1: ( rule__NonMeasurementData__Group_6_1_0__1__Impl )
            // InternalSensidl.g:5063:2: rule__NonMeasurementData__Group_6_1_0__1__Impl
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
    // InternalSensidl.g:5069:1: rule__NonMeasurementData__Group_6_1_0__1__Impl : ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5073:1: ( ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? ) )
            // InternalSensidl.g:5074:1: ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? )
            {
            // InternalSensidl.g:5074:1: ( ( rule__NonMeasurementData__Group_6_1_0_1__0 )? )
            // InternalSensidl.g:5075:1: ( rule__NonMeasurementData__Group_6_1_0_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_0_1()); 
            // InternalSensidl.g:5076:1: ( rule__NonMeasurementData__Group_6_1_0_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSensidl.g:5076:2: rule__NonMeasurementData__Group_6_1_0_1__0
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
    // InternalSensidl.g:5090:1: rule__NonMeasurementData__Group_6_1_0_1__0 : rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5094:1: ( rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1 )
            // InternalSensidl.g:5095:2: rule__NonMeasurementData__Group_6_1_0_1__0__Impl rule__NonMeasurementData__Group_6_1_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSensidl.g:5102:1: rule__NonMeasurementData__Group_6_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5106:1: ( ( ',' ) )
            // InternalSensidl.g:5107:1: ( ',' )
            {
            // InternalSensidl.g:5107:1: ( ',' )
            // InternalSensidl.g:5108:1: ','
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
    // InternalSensidl.g:5121:1: rule__NonMeasurementData__Group_6_1_0_1__1 : rule__NonMeasurementData__Group_6_1_0_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5125:1: ( rule__NonMeasurementData__Group_6_1_0_1__1__Impl )
            // InternalSensidl.g:5126:2: rule__NonMeasurementData__Group_6_1_0_1__1__Impl
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
    // InternalSensidl.g:5132:1: rule__NonMeasurementData__Group_6_1_0_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5136:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) ) )
            // InternalSensidl.g:5137:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) )
            {
            // InternalSensidl.g:5137:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 ) )
            // InternalSensidl.g:5138:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_0_1_1()); 
            // InternalSensidl.g:5139:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 )
            // InternalSensidl.g:5139:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1
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
    // InternalSensidl.g:5153:1: rule__NonMeasurementData__Group_6_1_1__0 : rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5157:1: ( rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1 )
            // InternalSensidl.g:5158:2: rule__NonMeasurementData__Group_6_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1__1
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
    // InternalSensidl.g:5165:1: rule__NonMeasurementData__Group_6_1_1__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5169:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) ) )
            // InternalSensidl.g:5170:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) )
            {
            // InternalSensidl.g:5170:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 ) )
            // InternalSensidl.g:5171:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_0()); 
            // InternalSensidl.g:5172:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 )
            // InternalSensidl.g:5172:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0
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
    // InternalSensidl.g:5182:1: rule__NonMeasurementData__Group_6_1_1__1 : rule__NonMeasurementData__Group_6_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5186:1: ( rule__NonMeasurementData__Group_6_1_1__1__Impl )
            // InternalSensidl.g:5187:2: rule__NonMeasurementData__Group_6_1_1__1__Impl
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
    // InternalSensidl.g:5193:1: rule__NonMeasurementData__Group_6_1_1__1__Impl : ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5197:1: ( ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? ) )
            // InternalSensidl.g:5198:1: ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? )
            {
            // InternalSensidl.g:5198:1: ( ( rule__NonMeasurementData__Group_6_1_1_1__0 )? )
            // InternalSensidl.g:5199:1: ( rule__NonMeasurementData__Group_6_1_1_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_6_1_1_1()); 
            // InternalSensidl.g:5200:1: ( rule__NonMeasurementData__Group_6_1_1_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSensidl.g:5200:2: rule__NonMeasurementData__Group_6_1_1_1__0
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
    // InternalSensidl.g:5214:1: rule__NonMeasurementData__Group_6_1_1_1__0 : rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1 ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5218:1: ( rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1 )
            // InternalSensidl.g:5219:2: rule__NonMeasurementData__Group_6_1_1_1__0__Impl rule__NonMeasurementData__Group_6_1_1_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSensidl.g:5226:1: rule__NonMeasurementData__Group_6_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5230:1: ( ( ',' ) )
            // InternalSensidl.g:5231:1: ( ',' )
            {
            // InternalSensidl.g:5231:1: ( ',' )
            // InternalSensidl.g:5232:1: ','
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
    // InternalSensidl.g:5245:1: rule__NonMeasurementData__Group_6_1_1_1__1 : rule__NonMeasurementData__Group_6_1_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5249:1: ( rule__NonMeasurementData__Group_6_1_1_1__1__Impl )
            // InternalSensidl.g:5250:2: rule__NonMeasurementData__Group_6_1_1_1__1__Impl
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
    // InternalSensidl.g:5256:1: rule__NonMeasurementData__Group_6_1_1_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_6_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5260:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) ) )
            // InternalSensidl.g:5261:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) )
            {
            // InternalSensidl.g:5261:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 ) )
            // InternalSensidl.g:5262:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_6_1_1_1_1()); 
            // InternalSensidl.g:5263:1: ( rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 )
            // InternalSensidl.g:5263:2: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1
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
    // InternalSensidl.g:5277:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5281:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:5282:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
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
    // InternalSensidl.g:5289:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5293:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:5294:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:5294:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:5295:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:5296:1: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:5296:2: rule__MeasurementDataNotAdjustable__NameAssignment_0
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
    // InternalSensidl.g:5306:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5310:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:5311:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
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
    // InternalSensidl.g:5318:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5322:1: ( ( 'as' ) )
            // InternalSensidl.g:5323:1: ( 'as' )
            {
            // InternalSensidl.g:5323:1: ( 'as' )
            // InternalSensidl.g:5324:1: 'as'
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
    // InternalSensidl.g:5337:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5341:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:5342:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
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
    // InternalSensidl.g:5349:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5353:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:5354:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:5354:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:5355:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:5356:1: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:5356:2: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
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
    // InternalSensidl.g:5366:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5370:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:5371:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
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
    // InternalSensidl.g:5378:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5382:1: ( ( 'in' ) )
            // InternalSensidl.g:5383:1: ( 'in' )
            {
            // InternalSensidl.g:5383:1: ( 'in' )
            // InternalSensidl.g:5384:1: 'in'
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
    // InternalSensidl.g:5397:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5401:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:5402:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalSensidl.g:5409:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5413:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:5414:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:5414:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:5415:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:5416:1: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:5416:2: rule__MeasurementDataNotAdjustable__UnitAssignment_4
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
    // InternalSensidl.g:5426:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5430:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:5431:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalSensidl.g:5438:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5442:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:5443:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:5443:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:5444:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:5445:1: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSensidl.g:5445:2: rule__MeasurementDataNotAdjustable__Group_5__0
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
    // InternalSensidl.g:5455:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5459:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 )
            // InternalSensidl.g:5460:2: rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7
            {
            pushFollow(FOLLOW_48);
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
    // InternalSensidl.g:5467:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5471:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) )
            // InternalSensidl.g:5472:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            {
            // InternalSensidl.g:5472:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            // InternalSensidl.g:5473:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6()); 
            // InternalSensidl.g:5474:1: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSensidl.g:5474:2: rule__MeasurementDataNotAdjustable__Group_6__0
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
    // InternalSensidl.g:5484:1: rule__MeasurementDataNotAdjustable__Group__7 : rule__MeasurementDataNotAdjustable__Group__7__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5488:1: ( rule__MeasurementDataNotAdjustable__Group__7__Impl )
            // InternalSensidl.g:5489:2: rule__MeasurementDataNotAdjustable__Group__7__Impl
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
    // InternalSensidl.g:5495:1: rule__MeasurementDataNotAdjustable__Group__7__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5499:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:5500:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:5500:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            // InternalSensidl.g:5501:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:5502:1: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DESCRIPTION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSensidl.g:5502:2: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7
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
    // InternalSensidl.g:5528:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5532:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:5533:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
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
    // InternalSensidl.g:5540:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5544:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:5545:1: ( 'with identifier' )
            {
            // InternalSensidl.g:5545:1: ( 'with identifier' )
            // InternalSensidl.g:5546:1: 'with identifier'
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
    // InternalSensidl.g:5559:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5563:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:5564:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
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
    // InternalSensidl.g:5571:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5575:1: ( ( ':' ) )
            // InternalSensidl.g:5576:1: ( ':' )
            {
            // InternalSensidl.g:5576:1: ( ':' )
            // InternalSensidl.g:5577:1: ':'
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
    // InternalSensidl.g:5590:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5594:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:5595:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
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
    // InternalSensidl.g:5601:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5605:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:5606:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:5606:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:5607:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:5608:1: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:5608:2: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
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
    // InternalSensidl.g:5624:1: rule__MeasurementDataNotAdjustable__Group_6__0 : rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5628:1: ( rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 )
            // InternalSensidl.g:5629:2: rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1
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
    // InternalSensidl.g:5636:1: rule__MeasurementDataNotAdjustable__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5640:1: ( ( 'exclude' ) )
            // InternalSensidl.g:5641:1: ( 'exclude' )
            {
            // InternalSensidl.g:5641:1: ( 'exclude' )
            // InternalSensidl.g:5642:1: 'exclude'
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
    // InternalSensidl.g:5655:1: rule__MeasurementDataNotAdjustable__Group_6__1 : rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5659:1: ( rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 )
            // InternalSensidl.g:5660:2: rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2
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
    // InternalSensidl.g:5667:1: rule__MeasurementDataNotAdjustable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5671:1: ( ( ':' ) )
            // InternalSensidl.g:5672:1: ( ':' )
            {
            // InternalSensidl.g:5672:1: ( ':' )
            // InternalSensidl.g:5673:1: ':'
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
    // InternalSensidl.g:5686:1: rule__MeasurementDataNotAdjustable__Group_6__2 : rule__MeasurementDataNotAdjustable__Group_6__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5690:1: ( rule__MeasurementDataNotAdjustable__Group_6__2__Impl )
            // InternalSensidl.g:5691:2: rule__MeasurementDataNotAdjustable__Group_6__2__Impl
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
    // InternalSensidl.g:5697:1: rule__MeasurementDataNotAdjustable__Group_6__2__Impl : ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5701:1: ( ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) )
            // InternalSensidl.g:5702:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            {
            // InternalSensidl.g:5702:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            // InternalSensidl.g:5703:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAlternatives_6_2()); 
            // InternalSensidl.g:5704:1: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            // InternalSensidl.g:5704:2: rule__MeasurementDataNotAdjustable__Alternatives_6_2
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
    // InternalSensidl.g:5720:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5724:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 )
            // InternalSensidl.g:5725:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1
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
    // InternalSensidl.g:5732:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5736:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) )
            // InternalSensidl.g:5737:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            {
            // InternalSensidl.g:5737:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            // InternalSensidl.g:5738:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_0()); 
            // InternalSensidl.g:5739:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            // InternalSensidl.g:5739:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0
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
    // InternalSensidl.g:5749:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5753:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl )
            // InternalSensidl.g:5754:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl
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
    // InternalSensidl.g:5760:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5764:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) )
            // InternalSensidl.g:5765:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            {
            // InternalSensidl.g:5765:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            // InternalSensidl.g:5766:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0_1()); 
            // InternalSensidl.g:5767:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSensidl.g:5767:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0
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
    // InternalSensidl.g:5781:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5785:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 )
            // InternalSensidl.g:5786:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1
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
    // InternalSensidl.g:5793:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5797:1: ( ( ',' ) )
            // InternalSensidl.g:5798:1: ( ',' )
            {
            // InternalSensidl.g:5798:1: ( ',' )
            // InternalSensidl.g:5799:1: ','
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
    // InternalSensidl.g:5812:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5816:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl )
            // InternalSensidl.g:5817:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl
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
    // InternalSensidl.g:5823:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5827:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) )
            // InternalSensidl.g:5828:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            {
            // InternalSensidl.g:5828:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            // InternalSensidl.g:5829:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_1_1()); 
            // InternalSensidl.g:5830:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            // InternalSensidl.g:5830:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1
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
    // InternalSensidl.g:5844:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5848:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 )
            // InternalSensidl.g:5849:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1
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
    // InternalSensidl.g:5856:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5860:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) )
            // InternalSensidl.g:5861:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            {
            // InternalSensidl.g:5861:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            // InternalSensidl.g:5862:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_0()); 
            // InternalSensidl.g:5863:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            // InternalSensidl.g:5863:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0
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
    // InternalSensidl.g:5873:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5877:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl )
            // InternalSensidl.g:5878:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl
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
    // InternalSensidl.g:5884:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5888:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) )
            // InternalSensidl.g:5889:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            {
            // InternalSensidl.g:5889:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            // InternalSensidl.g:5890:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1_1()); 
            // InternalSensidl.g:5891:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSensidl.g:5891:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0
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
    // InternalSensidl.g:5905:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5909:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 )
            // InternalSensidl.g:5910:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1
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
    // InternalSensidl.g:5917:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5921:1: ( ( ',' ) )
            // InternalSensidl.g:5922:1: ( ',' )
            {
            // InternalSensidl.g:5922:1: ( ',' )
            // InternalSensidl.g:5923:1: ','
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
    // InternalSensidl.g:5936:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5940:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl )
            // InternalSensidl.g:5941:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl
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
    // InternalSensidl.g:5947:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5951:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) )
            // InternalSensidl.g:5952:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            {
            // InternalSensidl.g:5952:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            // InternalSensidl.g:5953:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_1_1()); 
            // InternalSensidl.g:5954:1: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            // InternalSensidl.g:5954:2: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1
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
    // InternalSensidl.g:5968:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5972:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:5973:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:5980:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:5984:1: ( ( 'with range' ) )
            // InternalSensidl.g:5985:1: ( 'with range' )
            {
            // InternalSensidl.g:5985:1: ( 'with range' )
            // InternalSensidl.g:5986:1: 'with range'
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
    // InternalSensidl.g:5999:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6003:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:6004:2: rule__DataRange__Group__1__Impl
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
    // InternalSensidl.g:6010:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6014:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:6015:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:6015:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:6016:1: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:6017:1: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:6017:2: rule__DataRange__RangeAssignment_1
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
    // InternalSensidl.g:6031:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6035:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:6036:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
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
    // InternalSensidl.g:6043:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6047:1: ( ( '[' ) )
            // InternalSensidl.g:6048:1: ( '[' )
            {
            // InternalSensidl.g:6048:1: ( '[' )
            // InternalSensidl.g:6049:1: '['
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
    // InternalSensidl.g:6062:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6066:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:6067:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalSensidl.g:6074:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6078:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:6079:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:6079:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:6080:1: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:6081:1: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:6081:2: rule__Interval__LowerBoundAssignment_1
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
    // InternalSensidl.g:6091:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6095:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:6096:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
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
    // InternalSensidl.g:6103:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6107:1: ( ( ';' ) )
            // InternalSensidl.g:6108:1: ( ';' )
            {
            // InternalSensidl.g:6108:1: ( ';' )
            // InternalSensidl.g:6109:1: ';'
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
    // InternalSensidl.g:6122:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6126:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:6127:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalSensidl.g:6134:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6138:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:6139:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:6139:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:6140:1: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:6141:1: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:6141:2: rule__Interval__UpperBoundAssignment_3
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
    // InternalSensidl.g:6151:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6155:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:6156:2: rule__Interval__Group__4__Impl
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
    // InternalSensidl.g:6162:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6166:1: ( ( ']' ) )
            // InternalSensidl.g:6167:1: ( ']' )
            {
            // InternalSensidl.g:6167:1: ( ']' )
            // InternalSensidl.g:6168:1: ']'
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
    // InternalSensidl.g:6191:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6195:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:6196:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
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
    // InternalSensidl.g:6203:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6207:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:6208:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:6208:1: ( 'with scaling factor' )
            // InternalSensidl.g:6209:1: 'with scaling factor'
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
    // InternalSensidl.g:6222:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6226:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:6227:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
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
    // InternalSensidl.g:6234:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6238:1: ( ( ':' ) )
            // InternalSensidl.g:6239:1: ( ':' )
            {
            // InternalSensidl.g:6239:1: ( ':' )
            // InternalSensidl.g:6240:1: ':'
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
    // InternalSensidl.g:6253:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6257:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:6258:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalSensidl.g:6265:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6269:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:6270:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:6270:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:6271:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:6272:1: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:6272:2: rule__LinearDataConversion__ScalingFactorAssignment_2
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
    // InternalSensidl.g:6282:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6286:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:6287:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
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
    // InternalSensidl.g:6294:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6298:1: ( ( 'and offset' ) )
            // InternalSensidl.g:6299:1: ( 'and offset' )
            {
            // InternalSensidl.g:6299:1: ( 'and offset' )
            // InternalSensidl.g:6300:1: 'and offset'
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
    // InternalSensidl.g:6313:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6317:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:6318:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
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
    // InternalSensidl.g:6325:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6329:1: ( ( ':' ) )
            // InternalSensidl.g:6330:1: ( ':' )
            {
            // InternalSensidl.g:6330:1: ( ':' )
            // InternalSensidl.g:6331:1: ':'
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
    // InternalSensidl.g:6344:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6348:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:6349:2: rule__LinearDataConversion__Group__5__Impl
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
    // InternalSensidl.g:6355:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6359:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:6360:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:6360:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:6361:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:6362:1: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:6362:2: rule__LinearDataConversion__OffsetAssignment_5
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
    // InternalSensidl.g:6384:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6388:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:6389:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:6396:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6400:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:6401:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:6401:1: ( 'by linear mapping' )
            // InternalSensidl.g:6402:1: 'by linear mapping'
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
    // InternalSensidl.g:6415:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6419:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:6420:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalSensidl.g:6427:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6431:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:6432:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:6432:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:6433:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:6434:1: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:6434:2: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
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
    // InternalSensidl.g:6444:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6448:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:6449:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalSensidl.g:6456:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6460:1: ( ( '=>' ) )
            // InternalSensidl.g:6461:1: ( '=>' )
            {
            // InternalSensidl.g:6461:1: ( '=>' )
            // InternalSensidl.g:6462:1: '=>'
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
    // InternalSensidl.g:6475:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6479:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:6480:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
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
    // InternalSensidl.g:6487:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6491:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:6492:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:6492:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:6493:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:6494:1: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:6494:2: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
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
    // InternalSensidl.g:6504:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6508:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:6509:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
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
    // InternalSensidl.g:6516:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6520:1: ( ( 'as' ) )
            // InternalSensidl.g:6521:1: ( 'as' )
            {
            // InternalSensidl.g:6521:1: ( 'as' )
            // InternalSensidl.g:6522:1: 'as'
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
    // InternalSensidl.g:6535:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6539:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:6540:2: rule__LinearDataConversionWithInterval__Group__5__Impl
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
    // InternalSensidl.g:6546:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6550:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:6551:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:6551:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:6552:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:6553:1: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:6553:2: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
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
    // InternalSensidl.g:6575:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6579:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:6580:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalSensidl.g:6587:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6591:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6592:1: ( RULE_INT )
            {
            // InternalSensidl.g:6592:1: ( RULE_INT )
            // InternalSensidl.g:6593:1: RULE_INT
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
    // InternalSensidl.g:6604:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6608:1: ( rule__DOUBLE__Group__1__Impl )
            // InternalSensidl.g:6609:2: rule__DOUBLE__Group__1__Impl
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
    // InternalSensidl.g:6615:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6619:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // InternalSensidl.g:6620:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // InternalSensidl.g:6620:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // InternalSensidl.g:6621:1: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // InternalSensidl.g:6622:1: ( rule__DOUBLE__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==61) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSensidl.g:6622:2: rule__DOUBLE__Group_1__0
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
    // InternalSensidl.g:6636:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6640:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalSensidl.g:6641:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
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
    // InternalSensidl.g:6648:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6652:1: ( ( '.' ) )
            // InternalSensidl.g:6653:1: ( '.' )
            {
            // InternalSensidl.g:6653:1: ( '.' )
            // InternalSensidl.g:6654:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalSensidl.g:6667:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6671:1: ( rule__DOUBLE__Group_1__1__Impl )
            // InternalSensidl.g:6672:2: rule__DOUBLE__Group_1__1__Impl
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
    // InternalSensidl.g:6678:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6682:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6683:1: ( RULE_INT )
            {
            // InternalSensidl.g:6683:1: ( RULE_INT )
            // InternalSensidl.g:6684:1: RULE_INT
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
    // InternalSensidl.g:6699:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6703:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:6704:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
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
    // InternalSensidl.g:6711:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6715:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6716:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6716:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6717:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:6718:1: ( RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    int LA54_2 = input.LA(2);

                    if ( (LA54_2==EOF||(LA54_2>=RULE_ID && LA54_2<=RULE_DESCRIPTION)||(LA54_2>=30 && LA54_2<=31)||(LA54_2>=48 && LA54_2<=49)||LA54_2==52||(LA54_2>=62 && LA54_2<=65)) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalSensidl.g:6718:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_55); 

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalSensidl.g:6728:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6732:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:6733:2: rule__UNIT__Group__1__Impl
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
    // InternalSensidl.g:6739:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6743:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:6744:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:6744:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:6745:1: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:6746:1: ( rule__UNIT__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ANY_OTHER) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSensidl.g:6746:2: rule__UNIT__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__UNIT__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalSensidl.g:6760:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6764:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:6765:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
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
    // InternalSensidl.g:6772:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6776:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:6777:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:6777:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:6778:1: RULE_ANY_OTHER
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
    // InternalSensidl.g:6789:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6793:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:6794:2: rule__UNIT__Group_1__1__Impl
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
    // InternalSensidl.g:6800:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6804:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6805:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6805:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6806:1: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:6807:1: ( RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==EOF||(LA56_2>=RULE_ID && LA56_2<=RULE_DESCRIPTION)||(LA56_2>=30 && LA56_2<=31)||(LA56_2>=48 && LA56_2<=49)||LA56_2==52||(LA56_2>=62 && LA56_2<=65)) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalSensidl.g:6807:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_55); 

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalSensidl.g:6822:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6826:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6827:1: ( RULE_ID )
            {
            // InternalSensidl.g:6827:1: ( RULE_ID )
            // InternalSensidl.g:6828:1: RULE_ID
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
    // InternalSensidl.g:6837:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6841:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6842:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6842:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6843:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:6852:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6856:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6857:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6857:1: ( RULE_STRING )
            // InternalSensidl.g:6858:1: RULE_STRING
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
    // InternalSensidl.g:6867:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6871:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:6872:1: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:6872:1: ( ruleEncodingSettings )
            // InternalSensidl.g:6873:1: ruleEncodingSettings
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
    // InternalSensidl.g:6882:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6886:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:6887:1: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:6887:1: ( ruleSensorDataDescription )
            // InternalSensidl.g:6888:1: ruleSensorDataDescription
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
    // InternalSensidl.g:6897:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6901:1: ( ( ruleCoding ) )
            // InternalSensidl.g:6902:1: ( ruleCoding )
            {
            // InternalSensidl.g:6902:1: ( ruleCoding )
            // InternalSensidl.g:6903:1: ruleCoding
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
    // InternalSensidl.g:6912:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6916:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:6917:1: ( ruleEndianness )
            {
            // InternalSensidl.g:6917:1: ( ruleEndianness )
            // InternalSensidl.g:6918:1: ruleEndianness
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
    // InternalSensidl.g:6927:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6931:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6932:1: ( RULE_INT )
            {
            // InternalSensidl.g:6932:1: ( RULE_INT )
            // InternalSensidl.g:6933:1: RULE_INT
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
    // InternalSensidl.g:6942:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6946:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6947:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6947:1: ( RULE_STRING )
            // InternalSensidl.g:6948:1: RULE_STRING
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
    // InternalSensidl.g:6957:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6961:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6962:1: ( RULE_STRING )
            {
            // InternalSensidl.g:6962:1: ( RULE_STRING )
            // InternalSensidl.g:6963:1: RULE_STRING
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
    // InternalSensidl.g:6972:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6976:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:6977:1: ( ruleDataSet )
            {
            // InternalSensidl.g:6977:1: ( ruleDataSet )
            // InternalSensidl.g:6978:1: ruleDataSet
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
    // InternalSensidl.g:6987:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:6991:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6992:1: ( RULE_ID )
            {
            // InternalSensidl.g:6992:1: ( RULE_ID )
            // InternalSensidl.g:6993:1: RULE_ID
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
    // InternalSensidl.g:7002:1: rule__DataSet__ParentDataSetAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7006:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7007:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7007:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7008:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:7009:1: ( RULE_ID )
            // InternalSensidl.g:7010:1: RULE_ID
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
    // InternalSensidl.g:7021:1: rule__DataSet__ParentDataSetAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__ParentDataSetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7025:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7026:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7026:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7027:1: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getParentDataSetDataSetCrossReference_3_1_0()); 
            // InternalSensidl.g:7028:1: ( RULE_ID )
            // InternalSensidl.g:7029:1: RULE_ID
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
    // InternalSensidl.g:7040:1: rule__DataSet__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7044:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7045:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7045:1: ( RULE_STRING )
            // InternalSensidl.g:7046:1: RULE_STRING
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
    // InternalSensidl.g:7055:1: rule__DataSet__DescriptionAssignment_5 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7059:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7060:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7060:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7061:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7070:1: rule__DataSet__DataAssignment_7_0 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7074:1: ( ( ruleData ) )
            // InternalSensidl.g:7075:1: ( ruleData )
            {
            // InternalSensidl.g:7075:1: ( ruleData )
            // InternalSensidl.g:7076:1: ruleData
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
    // InternalSensidl.g:7085:1: rule__DataSet__MethodAssignment_7_1 : ( ruleMethod ) ;
    public final void rule__DataSet__MethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7089:1: ( ( ruleMethod ) )
            // InternalSensidl.g:7090:1: ( ruleMethod )
            {
            // InternalSensidl.g:7090:1: ( ruleMethod )
            // InternalSensidl.g:7091:1: ruleMethod
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
    // InternalSensidl.g:7100:1: rule__Method__VisibilityAssignment_0_0 : ( ( '+' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7104:1: ( ( ( '+' ) ) )
            // InternalSensidl.g:7105:1: ( ( '+' ) )
            {
            // InternalSensidl.g:7105:1: ( ( '+' ) )
            // InternalSensidl.g:7106:1: ( '+' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            // InternalSensidl.g:7107:1: ( '+' )
            // InternalSensidl.g:7108:1: '+'
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalSensidl.g:7123:1: rule__Method__VisibilityAssignment_0_1 : ( ( '-' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7127:1: ( ( ( '-' ) ) )
            // InternalSensidl.g:7128:1: ( ( '-' ) )
            {
            // InternalSensidl.g:7128:1: ( ( '-' ) )
            // InternalSensidl.g:7129:1: ( '-' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 
            // InternalSensidl.g:7130:1: ( '-' )
            // InternalSensidl.g:7131:1: '-'
            {
             before(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalSensidl.g:7146:1: rule__Method__VisibilityAssignment_0_2 : ( ( '#' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7150:1: ( ( ( '#' ) ) )
            // InternalSensidl.g:7151:1: ( ( '#' ) )
            {
            // InternalSensidl.g:7151:1: ( ( '#' ) )
            // InternalSensidl.g:7152:1: ( '#' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 
            // InternalSensidl.g:7153:1: ( '#' )
            // InternalSensidl.g:7154:1: '#'
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
    // InternalSensidl.g:7169:1: rule__Method__VisibilityAssignment_0_3 : ( ( '~' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7173:1: ( ( ( '~' ) ) )
            // InternalSensidl.g:7174:1: ( ( '~' ) )
            {
            // InternalSensidl.g:7174:1: ( ( '~' ) )
            // InternalSensidl.g:7175:1: ( '~' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 
            // InternalSensidl.g:7176:1: ( '~' )
            // InternalSensidl.g:7177:1: '~'
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
    // InternalSensidl.g:7192:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7196:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7197:1: ( RULE_ID )
            {
            // InternalSensidl.g:7197:1: ( RULE_ID )
            // InternalSensidl.g:7198:1: RULE_ID
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
    // InternalSensidl.g:7207:1: rule__Method__ParameterAssignment_3 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7211:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:7212:1: ( ruleMethodParameter )
            {
            // InternalSensidl.g:7212:1: ( ruleMethodParameter )
            // InternalSensidl.g:7213:1: ruleMethodParameter
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
    // InternalSensidl.g:7222:1: rule__Method__ParameterAssignment_4_1 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7226:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:7227:1: ( ruleMethodParameter )
            {
            // InternalSensidl.g:7227:1: ( ruleMethodParameter )
            // InternalSensidl.g:7228:1: ruleMethodParameter
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
    // InternalSensidl.g:7237:1: rule__Method__ReturnTypeAssignment_6_1_0_0 : ( ruleDataType ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7241:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7242:1: ( ruleDataType )
            {
            // InternalSensidl.g:7242:1: ( ruleDataType )
            // InternalSensidl.g:7243:1: ruleDataType
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
    // InternalSensidl.g:7252:1: rule__Method__ReturnTypeAssignment_6_1_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7256:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7257:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7257:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7258:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7267:1: rule__Method__ReturnTypeDataSetAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypeDataSetAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7271:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7272:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7272:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7273:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0()); 
            // InternalSensidl.g:7274:1: ( RULE_ID )
            // InternalSensidl.g:7275:1: RULE_ID
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
    // InternalSensidl.g:7286:1: rule__Method__IDAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Method__IDAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7290:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7291:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7291:1: ( RULE_STRING )
            // InternalSensidl.g:7292:1: RULE_STRING
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
    // InternalSensidl.g:7301:1: rule__Method__DescriptionAssignment_10 : ( RULE_DESCRIPTION ) ;
    public final void rule__Method__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7305:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7306:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7306:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7307:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7316:1: rule__MethodParameter__DataTypeAssignment_0_0_0 : ( ruleDataType ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7320:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7321:1: ( ruleDataType )
            {
            // InternalSensidl.g:7321:1: ( ruleDataType )
            // InternalSensidl.g:7322:1: ruleDataType
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
    // InternalSensidl.g:7331:1: rule__MethodParameter__DataTypeAssignment_0_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7335:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7336:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7336:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7337:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7346:1: rule__MethodParameter__DataTypeDataSetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodParameter__DataTypeDataSetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7350:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7351:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7351:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7352:1: ( RULE_ID )
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0()); 
            // InternalSensidl.g:7353:1: ( RULE_ID )
            // InternalSensidl.g:7354:1: RULE_ID
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
    // InternalSensidl.g:7365:1: rule__MethodParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7369:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7370:1: ( RULE_ID )
            {
            // InternalSensidl.g:7370:1: ( RULE_ID )
            // InternalSensidl.g:7371:1: RULE_ID
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
    // InternalSensidl.g:7380:1: rule__ListData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7384:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7385:1: ( RULE_ID )
            {
            // InternalSensidl.g:7385:1: ( RULE_ID )
            // InternalSensidl.g:7386:1: RULE_ID
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
    // InternalSensidl.g:7395:1: rule__ListData__DataTypeAssignment_4_0 : ( ruleDataType ) ;
    public final void rule__ListData__DataTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7399:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7400:1: ( ruleDataType )
            {
            // InternalSensidl.g:7400:1: ( ruleDataType )
            // InternalSensidl.g:7401:1: ruleDataType
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
    // InternalSensidl.g:7410:1: rule__ListData__DataTypeDataSetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListData__DataTypeDataSetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7414:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:7415:1: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:7415:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7416:1: ( RULE_ID )
            {
             before(grammarAccess.getListDataAccess().getDataTypeDataSetDataSetCrossReference_4_1_0()); 
            // InternalSensidl.g:7417:1: ( RULE_ID )
            // InternalSensidl.g:7418:1: RULE_ID
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
    // InternalSensidl.g:7429:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7433:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7434:1: ( RULE_ID )
            {
            // InternalSensidl.g:7434:1: ( RULE_ID )
            // InternalSensidl.g:7435:1: RULE_ID
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
    // InternalSensidl.g:7444:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7448:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7449:1: ( ruleDataType )
            {
            // InternalSensidl.g:7449:1: ( ruleDataType )
            // InternalSensidl.g:7450:1: ruleDataType
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
    // InternalSensidl.g:7459:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7463:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:7464:1: ( ruleUNIT )
            {
            // InternalSensidl.g:7464:1: ( ruleUNIT )
            // InternalSensidl.g:7465:1: ruleUNIT
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
    // InternalSensidl.g:7474:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7478:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7479:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7479:1: ( RULE_STRING )
            // InternalSensidl.g:7480:1: RULE_STRING
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
    // InternalSensidl.g:7489:1: rule__MeasurementData__AdjustmentsAssignment_6_0_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7493:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:7494:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:7494:1: ( ruleDataConversion )
            // InternalSensidl.g:7495:1: ruleDataConversion
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
    // InternalSensidl.g:7504:1: rule__MeasurementData__AdjustmentsAssignment_6_1_1 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7508:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:7509:1: ( ruleDataRange )
            {
            // InternalSensidl.g:7509:1: ( ruleDataRange )
            // InternalSensidl.g:7510:1: ruleDataRange
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
    // InternalSensidl.g:7519:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7523:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:7524:1: ( ruleDataConversion )
            {
            // InternalSensidl.g:7524:1: ( ruleDataConversion )
            // InternalSensidl.g:7525:1: ruleDataConversion
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
    // InternalSensidl.g:7534:1: rule__MeasurementData__AdjustmentsAssignment_6_2_3 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7538:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:7539:1: ( ruleDataRange )
            {
            // InternalSensidl.g:7539:1: ( ruleDataRange )
            // InternalSensidl.g:7540:1: ruleDataRange
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
    // InternalSensidl.g:7549:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7553:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7554:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7554:1: ( ( 'setter' ) )
            // InternalSensidl.g:7555:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            // InternalSensidl.g:7556:1: ( 'setter' )
            // InternalSensidl.g:7557:1: 'setter'
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
    // InternalSensidl.g:7572:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7576:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7577:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7577:1: ( ( 'getter' ) )
            // InternalSensidl.g:7578:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            // InternalSensidl.g:7579:1: ( 'getter' )
            // InternalSensidl.g:7580:1: 'getter'
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
    // InternalSensidl.g:7595:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7599:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7600:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7600:1: ( ( 'getter' ) )
            // InternalSensidl.g:7601:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            // InternalSensidl.g:7602:1: ( 'getter' )
            // InternalSensidl.g:7603:1: 'getter'
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
    // InternalSensidl.g:7618:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7622:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7623:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7623:1: ( ( 'setter' ) )
            // InternalSensidl.g:7624:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            // InternalSensidl.g:7625:1: ( 'setter' )
            // InternalSensidl.g:7626:1: 'setter'
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
    // InternalSensidl.g:7641:1: rule__MeasurementData__DescriptionAssignment_8 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7645:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7646:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7646:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7647:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7656:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7660:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7661:1: ( RULE_ID )
            {
            // InternalSensidl.g:7661:1: ( RULE_ID )
            // InternalSensidl.g:7662:1: RULE_ID
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
    // InternalSensidl.g:7671:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7675:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7676:1: ( ruleDataType )
            {
            // InternalSensidl.g:7676:1: ( ruleDataType )
            // InternalSensidl.g:7677:1: ruleDataType
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
    // InternalSensidl.g:7686:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7690:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7691:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7691:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7692:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7701:1: rule__NonMeasurementData__ConstantAssignment_3 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7705:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:7706:1: ( ( 'constant' ) )
            {
            // InternalSensidl.g:7706:1: ( ( 'constant' ) )
            // InternalSensidl.g:7707:1: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            // InternalSensidl.g:7708:1: ( 'constant' )
            // InternalSensidl.g:7709:1: 'constant'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalSensidl.g:7724:1: rule__NonMeasurementData__ValueAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7728:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7729:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7729:1: ( RULE_STRING )
            // InternalSensidl.g:7730:1: RULE_STRING
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
    // InternalSensidl.g:7739:1: rule__NonMeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7743:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7744:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7744:1: ( RULE_STRING )
            // InternalSensidl.g:7745:1: RULE_STRING
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
    // InternalSensidl.g:7754:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7758:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7759:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7759:1: ( ( 'setter' ) )
            // InternalSensidl.g:7760:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 
            // InternalSensidl.g:7761:1: ( 'setter' )
            // InternalSensidl.g:7762:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_0_0_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:7777:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7781:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7782:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7782:1: ( ( 'getter' ) )
            // InternalSensidl.g:7783:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 
            // InternalSensidl.g:7784:1: ( 'getter' )
            // InternalSensidl.g:7785:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_0_1_1_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSensidl.g:7800:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7804:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7805:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7805:1: ( ( 'getter' ) )
            // InternalSensidl.g:7806:1: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 
            // InternalSensidl.g:7807:1: ( 'getter' )
            // InternalSensidl.g:7808:1: 'getter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_6_1_1_0_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalSensidl.g:7823:1: rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_6_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7827:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7828:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7828:1: ( ( 'setter' ) )
            // InternalSensidl.g:7829:1: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 
            // InternalSensidl.g:7830:1: ( 'setter' )
            // InternalSensidl.g:7831:1: 'setter'
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_6_1_1_1_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalSensidl.g:7846:1: rule__NonMeasurementData__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7850:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7851:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7851:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7852:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:7861:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7865:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7866:1: ( RULE_ID )
            {
            // InternalSensidl.g:7866:1: ( RULE_ID )
            // InternalSensidl.g:7867:1: RULE_ID
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
    // InternalSensidl.g:7876:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7880:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7881:1: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7881:1: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7882:1: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7891:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7895:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:7896:1: ( ruleUNIT )
            {
            // InternalSensidl.g:7896:1: ( ruleUNIT )
            // InternalSensidl.g:7897:1: ruleUNIT
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
    // InternalSensidl.g:7906:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7910:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7911:1: ( RULE_STRING )
            {
            // InternalSensidl.g:7911:1: ( RULE_STRING )
            // InternalSensidl.g:7912:1: RULE_STRING
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
    // InternalSensidl.g:7921:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7925:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7926:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7926:1: ( ( 'setter' ) )
            // InternalSensidl.g:7927:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            // InternalSensidl.g:7928:1: ( 'setter' )
            // InternalSensidl.g:7929:1: 'setter'
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
    // InternalSensidl.g:7944:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7948:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7949:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7949:1: ( ( 'getter' ) )
            // InternalSensidl.g:7950:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            // InternalSensidl.g:7951:1: ( 'getter' )
            // InternalSensidl.g:7952:1: 'getter'
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
    // InternalSensidl.g:7967:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7971:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7972:1: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7972:1: ( ( 'getter' ) )
            // InternalSensidl.g:7973:1: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            // InternalSensidl.g:7974:1: ( 'getter' )
            // InternalSensidl.g:7975:1: 'getter'
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
    // InternalSensidl.g:7990:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:7994:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7995:1: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7995:1: ( ( 'setter' ) )
            // InternalSensidl.g:7996:1: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            // InternalSensidl.g:7997:1: ( 'setter' )
            // InternalSensidl.g:7998:1: 'setter'
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
    // InternalSensidl.g:8013:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8017:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:8018:1: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:8018:1: ( RULE_DESCRIPTION )
            // InternalSensidl.g:8019:1: RULE_DESCRIPTION
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
    // InternalSensidl.g:8028:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8032:1: ( ( ruleInterval ) )
            // InternalSensidl.g:8033:1: ( ruleInterval )
            {
            // InternalSensidl.g:8033:1: ( ruleInterval )
            // InternalSensidl.g:8034:1: ruleInterval
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
    // InternalSensidl.g:8043:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8047:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8048:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8048:1: ( ruleDOUBLE )
            // InternalSensidl.g:8049:1: ruleDOUBLE
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
    // InternalSensidl.g:8058:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8062:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8063:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8063:1: ( ruleDOUBLE )
            // InternalSensidl.g:8064:1: ruleDOUBLE
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
    // InternalSensidl.g:8073:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8077:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8078:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8078:1: ( ruleDOUBLE )
            // InternalSensidl.g:8079:1: ruleDOUBLE
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
    // InternalSensidl.g:8088:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8092:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:8093:1: ( ruleDOUBLE )
            {
            // InternalSensidl.g:8093:1: ( ruleDOUBLE )
            // InternalSensidl.g:8094:1: ruleDOUBLE
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
    // InternalSensidl.g:8103:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8107:1: ( ( ruleInterval ) )
            // InternalSensidl.g:8108:1: ( ruleInterval )
            {
            // InternalSensidl.g:8108:1: ( ruleInterval )
            // InternalSensidl.g:8109:1: ruleInterval
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
    // InternalSensidl.g:8118:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8122:1: ( ( ruleInterval ) )
            // InternalSensidl.g:8123:1: ( ruleInterval )
            {
            // InternalSensidl.g:8123:1: ( ruleInterval )
            // InternalSensidl.g:8124:1: ruleInterval
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
    // InternalSensidl.g:8133:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalSensidl.g:8137:1: ( ( ruleDataType ) )
            // InternalSensidl.g:8138:1: ( ruleDataType )
            {
            // InternalSensidl.g:8138:1: ( ruleDataType )
            // InternalSensidl.g:8139:1: ruleDataType
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
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\21\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
            "\1\20\1\uffff\1\20\26\uffff\2\20\17\uffff\1\22\1\uffff\2\20\13\uffff\4\20\2\uffff\1\20",
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
    static final String dfa_8s = "\56\uffff";
    static final String dfa_9s = "\21\uffff\1\26\7\uffff\1\26\12\uffff\12\26";
    static final String dfa_10s = "\1\60\1\65\1\40\1\66\1\uffff\2\4\1\72\1\67\1\4\1\40\2\4\1\72\1\4\1\67\1\70\1\5\1\4\1\74\1\4\2\uffff\1\70\1\66\1\5\1\4\1\67\2\4\1\67\1\70\1\4\1\53\1\70\1\22\12\5";
    static final String dfa_11s = "\1\60\1\73\1\40\1\66\1\uffff\2\4\2\75\1\4\1\40\2\4\1\72\1\4\1\67\1\75\1\101\1\4\1\74\1\4\2\uffff\1\70\1\66\1\101\1\4\1\75\2\4\1\67\1\75\1\4\1\53\1\70\1\33\12\101";
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
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\13\uffff\1\24\4\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "",
            "\1\23",
            "\1\32",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
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
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26",
            "\1\26\1\uffff\1\26\26\uffff\1\26\3\uffff\1\25\16\uffff\1\26\14\uffff\4\26"
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xC000000040000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xC000000000000022L,0x0000000000000003L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000020L,0x0000000000000003L});
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
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000080000080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000042L});

}