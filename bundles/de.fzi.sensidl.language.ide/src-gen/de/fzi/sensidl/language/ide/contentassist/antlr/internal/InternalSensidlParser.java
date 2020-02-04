package de.fzi.sensidl.language.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
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
    // InternalSensidl.g:53:1: entryRuleSensorInterface : ruleSensorInterface EOF ;
    public final void entryRuleSensorInterface() throws RecognitionException {
        try {
            // InternalSensidl.g:54:1: ( ruleSensorInterface EOF )
            // InternalSensidl.g:55:1: ruleSensorInterface EOF
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
    // InternalSensidl.g:62:1: ruleSensorInterface : ( ( rule__SensorInterface__Group__0 ) ) ;
    public final void ruleSensorInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:66:2: ( ( ( rule__SensorInterface__Group__0 ) ) )
            // InternalSensidl.g:67:2: ( ( rule__SensorInterface__Group__0 ) )
            {
            // InternalSensidl.g:67:2: ( ( rule__SensorInterface__Group__0 ) )
            // InternalSensidl.g:68:3: ( rule__SensorInterface__Group__0 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup()); 
            // InternalSensidl.g:69:3: ( rule__SensorInterface__Group__0 )
            // InternalSensidl.g:69:4: rule__SensorInterface__Group__0
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
    // InternalSensidl.g:78:1: entryRuleEncodingSettings : ruleEncodingSettings EOF ;
    public final void entryRuleEncodingSettings() throws RecognitionException {
        try {
            // InternalSensidl.g:79:1: ( ruleEncodingSettings EOF )
            // InternalSensidl.g:80:1: ruleEncodingSettings EOF
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
    // InternalSensidl.g:87:1: ruleEncodingSettings : ( ( rule__EncodingSettings__Group__0 ) ) ;
    public final void ruleEncodingSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:91:2: ( ( ( rule__EncodingSettings__Group__0 ) ) )
            // InternalSensidl.g:92:2: ( ( rule__EncodingSettings__Group__0 ) )
            {
            // InternalSensidl.g:92:2: ( ( rule__EncodingSettings__Group__0 ) )
            // InternalSensidl.g:93:3: ( rule__EncodingSettings__Group__0 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup()); 
            // InternalSensidl.g:94:3: ( rule__EncodingSettings__Group__0 )
            // InternalSensidl.g:94:4: rule__EncodingSettings__Group__0
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
    // InternalSensidl.g:103:1: entryRuleSensorDataDescription : ruleSensorDataDescription EOF ;
    public final void entryRuleSensorDataDescription() throws RecognitionException {
        try {
            // InternalSensidl.g:104:1: ( ruleSensorDataDescription EOF )
            // InternalSensidl.g:105:1: ruleSensorDataDescription EOF
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
    // InternalSensidl.g:112:1: ruleSensorDataDescription : ( ( rule__SensorDataDescription__Group__0 ) ) ;
    public final void ruleSensorDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:116:2: ( ( ( rule__SensorDataDescription__Group__0 ) ) )
            // InternalSensidl.g:117:2: ( ( rule__SensorDataDescription__Group__0 ) )
            {
            // InternalSensidl.g:117:2: ( ( rule__SensorDataDescription__Group__0 ) )
            // InternalSensidl.g:118:3: ( rule__SensorDataDescription__Group__0 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup()); 
            // InternalSensidl.g:119:3: ( rule__SensorDataDescription__Group__0 )
            // InternalSensidl.g:119:4: rule__SensorDataDescription__Group__0
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
    // InternalSensidl.g:128:1: entryRuleDataSet : ruleDataSet EOF ;
    public final void entryRuleDataSet() throws RecognitionException {
        try {
            // InternalSensidl.g:129:1: ( ruleDataSet EOF )
            // InternalSensidl.g:130:1: ruleDataSet EOF
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
    // InternalSensidl.g:137:1: ruleDataSet : ( ( rule__DataSet__Group__0 ) ) ;
    public final void ruleDataSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:141:2: ( ( ( rule__DataSet__Group__0 ) ) )
            // InternalSensidl.g:142:2: ( ( rule__DataSet__Group__0 ) )
            {
            // InternalSensidl.g:142:2: ( ( rule__DataSet__Group__0 ) )
            // InternalSensidl.g:143:3: ( rule__DataSet__Group__0 )
            {
             before(grammarAccess.getDataSetAccess().getGroup()); 
            // InternalSensidl.g:144:3: ( rule__DataSet__Group__0 )
            // InternalSensidl.g:144:4: rule__DataSet__Group__0
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
    // InternalSensidl.g:153:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalSensidl.g:154:1: ( ruleMethod EOF )
            // InternalSensidl.g:155:1: ruleMethod EOF
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
    // InternalSensidl.g:162:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:166:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalSensidl.g:167:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalSensidl.g:167:2: ( ( rule__Method__Group__0 ) )
            // InternalSensidl.g:168:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalSensidl.g:169:3: ( rule__Method__Group__0 )
            // InternalSensidl.g:169:4: rule__Method__Group__0
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
    // InternalSensidl.g:178:1: entryRuleMethodParameter : ruleMethodParameter EOF ;
    public final void entryRuleMethodParameter() throws RecognitionException {
        try {
            // InternalSensidl.g:179:1: ( ruleMethodParameter EOF )
            // InternalSensidl.g:180:1: ruleMethodParameter EOF
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
    // InternalSensidl.g:187:1: ruleMethodParameter : ( ( rule__MethodParameter__Group__0 ) ) ;
    public final void ruleMethodParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:191:2: ( ( ( rule__MethodParameter__Group__0 ) ) )
            // InternalSensidl.g:192:2: ( ( rule__MethodParameter__Group__0 ) )
            {
            // InternalSensidl.g:192:2: ( ( rule__MethodParameter__Group__0 ) )
            // InternalSensidl.g:193:3: ( rule__MethodParameter__Group__0 )
            {
             before(grammarAccess.getMethodParameterAccess().getGroup()); 
            // InternalSensidl.g:194:3: ( rule__MethodParameter__Group__0 )
            // InternalSensidl.g:194:4: rule__MethodParameter__Group__0
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
    // InternalSensidl.g:203:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalSensidl.g:204:1: ( ruleData EOF )
            // InternalSensidl.g:205:1: ruleData EOF
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
    // InternalSensidl.g:212:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:216:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalSensidl.g:217:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalSensidl.g:217:2: ( ( rule__Data__Alternatives ) )
            // InternalSensidl.g:218:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalSensidl.g:219:3: ( rule__Data__Alternatives )
            // InternalSensidl.g:219:4: rule__Data__Alternatives
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
    // InternalSensidl.g:228:1: entryRuleListData : ruleListData EOF ;
    public final void entryRuleListData() throws RecognitionException {
        try {
            // InternalSensidl.g:229:1: ( ruleListData EOF )
            // InternalSensidl.g:230:1: ruleListData EOF
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
    // InternalSensidl.g:237:1: ruleListData : ( ( rule__ListData__Group__0 ) ) ;
    public final void ruleListData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:241:2: ( ( ( rule__ListData__Group__0 ) ) )
            // InternalSensidl.g:242:2: ( ( rule__ListData__Group__0 ) )
            {
            // InternalSensidl.g:242:2: ( ( rule__ListData__Group__0 ) )
            // InternalSensidl.g:243:3: ( rule__ListData__Group__0 )
            {
             before(grammarAccess.getListDataAccess().getGroup()); 
            // InternalSensidl.g:244:3: ( rule__ListData__Group__0 )
            // InternalSensidl.g:244:4: rule__ListData__Group__0
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
    // InternalSensidl.g:253:1: entryRuleMeasurementData : ruleMeasurementData EOF ;
    public final void entryRuleMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:254:1: ( ruleMeasurementData EOF )
            // InternalSensidl.g:255:1: ruleMeasurementData EOF
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
    // InternalSensidl.g:262:1: ruleMeasurementData : ( ( rule__MeasurementData__Group__0 ) ) ;
    public final void ruleMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:266:2: ( ( ( rule__MeasurementData__Group__0 ) ) )
            // InternalSensidl.g:267:2: ( ( rule__MeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:267:2: ( ( rule__MeasurementData__Group__0 ) )
            // InternalSensidl.g:268:3: ( rule__MeasurementData__Group__0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:269:3: ( rule__MeasurementData__Group__0 )
            // InternalSensidl.g:269:4: rule__MeasurementData__Group__0
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
    // InternalSensidl.g:278:1: entryRuleNonMeasurementData : ruleNonMeasurementData EOF ;
    public final void entryRuleNonMeasurementData() throws RecognitionException {
        try {
            // InternalSensidl.g:279:1: ( ruleNonMeasurementData EOF )
            // InternalSensidl.g:280:1: ruleNonMeasurementData EOF
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
    // InternalSensidl.g:287:1: ruleNonMeasurementData : ( ( rule__NonMeasurementData__Group__0 ) ) ;
    public final void ruleNonMeasurementData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:291:2: ( ( ( rule__NonMeasurementData__Group__0 ) ) )
            // InternalSensidl.g:292:2: ( ( rule__NonMeasurementData__Group__0 ) )
            {
            // InternalSensidl.g:292:2: ( ( rule__NonMeasurementData__Group__0 ) )
            // InternalSensidl.g:293:3: ( rule__NonMeasurementData__Group__0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup()); 
            // InternalSensidl.g:294:3: ( rule__NonMeasurementData__Group__0 )
            // InternalSensidl.g:294:4: rule__NonMeasurementData__Group__0
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
    // InternalSensidl.g:303:1: entryRuleMeasurementDataNotAdjustable : ruleMeasurementDataNotAdjustable EOF ;
    public final void entryRuleMeasurementDataNotAdjustable() throws RecognitionException {
        try {
            // InternalSensidl.g:304:1: ( ruleMeasurementDataNotAdjustable EOF )
            // InternalSensidl.g:305:1: ruleMeasurementDataNotAdjustable EOF
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
    // InternalSensidl.g:312:1: ruleMeasurementDataNotAdjustable : ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) ;
    public final void ruleMeasurementDataNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:316:2: ( ( ( rule__MeasurementDataNotAdjustable__Group__0 ) ) )
            // InternalSensidl.g:317:2: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            {
            // InternalSensidl.g:317:2: ( ( rule__MeasurementDataNotAdjustable__Group__0 ) )
            // InternalSensidl.g:318:3: ( rule__MeasurementDataNotAdjustable__Group__0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup()); 
            // InternalSensidl.g:319:3: ( rule__MeasurementDataNotAdjustable__Group__0 )
            // InternalSensidl.g:319:4: rule__MeasurementDataNotAdjustable__Group__0
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
    // InternalSensidl.g:328:1: entryRuleDataRange : ruleDataRange EOF ;
    public final void entryRuleDataRange() throws RecognitionException {
        try {
            // InternalSensidl.g:329:1: ( ruleDataRange EOF )
            // InternalSensidl.g:330:1: ruleDataRange EOF
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
    // InternalSensidl.g:337:1: ruleDataRange : ( ( rule__DataRange__Group__0 ) ) ;
    public final void ruleDataRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:341:2: ( ( ( rule__DataRange__Group__0 ) ) )
            // InternalSensidl.g:342:2: ( ( rule__DataRange__Group__0 ) )
            {
            // InternalSensidl.g:342:2: ( ( rule__DataRange__Group__0 ) )
            // InternalSensidl.g:343:3: ( rule__DataRange__Group__0 )
            {
             before(grammarAccess.getDataRangeAccess().getGroup()); 
            // InternalSensidl.g:344:3: ( rule__DataRange__Group__0 )
            // InternalSensidl.g:344:4: rule__DataRange__Group__0
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
    // InternalSensidl.g:353:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:354:1: ( ruleInterval EOF )
            // InternalSensidl.g:355:1: ruleInterval EOF
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
    // InternalSensidl.g:362:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:366:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSensidl.g:367:2: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSensidl.g:367:2: ( ( rule__Interval__Group__0 ) )
            // InternalSensidl.g:368:3: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSensidl.g:369:3: ( rule__Interval__Group__0 )
            // InternalSensidl.g:369:4: rule__Interval__Group__0
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
    // InternalSensidl.g:378:1: entryRuleDataConversion : ruleDataConversion EOF ;
    public final void entryRuleDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:379:1: ( ruleDataConversion EOF )
            // InternalSensidl.g:380:1: ruleDataConversion EOF
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
    // InternalSensidl.g:387:1: ruleDataConversion : ( ( rule__DataConversion__Alternatives ) ) ;
    public final void ruleDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:391:2: ( ( ( rule__DataConversion__Alternatives ) ) )
            // InternalSensidl.g:392:2: ( ( rule__DataConversion__Alternatives ) )
            {
            // InternalSensidl.g:392:2: ( ( rule__DataConversion__Alternatives ) )
            // InternalSensidl.g:393:3: ( rule__DataConversion__Alternatives )
            {
             before(grammarAccess.getDataConversionAccess().getAlternatives()); 
            // InternalSensidl.g:394:3: ( rule__DataConversion__Alternatives )
            // InternalSensidl.g:394:4: rule__DataConversion__Alternatives
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
    // InternalSensidl.g:403:1: entryRuleLinearDataConversion : ruleLinearDataConversion EOF ;
    public final void entryRuleLinearDataConversion() throws RecognitionException {
        try {
            // InternalSensidl.g:404:1: ( ruleLinearDataConversion EOF )
            // InternalSensidl.g:405:1: ruleLinearDataConversion EOF
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
    // InternalSensidl.g:412:1: ruleLinearDataConversion : ( ( rule__LinearDataConversion__Group__0 ) ) ;
    public final void ruleLinearDataConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:416:2: ( ( ( rule__LinearDataConversion__Group__0 ) ) )
            // InternalSensidl.g:417:2: ( ( rule__LinearDataConversion__Group__0 ) )
            {
            // InternalSensidl.g:417:2: ( ( rule__LinearDataConversion__Group__0 ) )
            // InternalSensidl.g:418:3: ( rule__LinearDataConversion__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getGroup()); 
            // InternalSensidl.g:419:3: ( rule__LinearDataConversion__Group__0 )
            // InternalSensidl.g:419:4: rule__LinearDataConversion__Group__0
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
    // InternalSensidl.g:428:1: entryRuleLinearDataConversionWithInterval : ruleLinearDataConversionWithInterval EOF ;
    public final void entryRuleLinearDataConversionWithInterval() throws RecognitionException {
        try {
            // InternalSensidl.g:429:1: ( ruleLinearDataConversionWithInterval EOF )
            // InternalSensidl.g:430:1: ruleLinearDataConversionWithInterval EOF
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
    // InternalSensidl.g:437:1: ruleLinearDataConversionWithInterval : ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) ;
    public final void ruleLinearDataConversionWithInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:441:2: ( ( ( rule__LinearDataConversionWithInterval__Group__0 ) ) )
            // InternalSensidl.g:442:2: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            {
            // InternalSensidl.g:442:2: ( ( rule__LinearDataConversionWithInterval__Group__0 ) )
            // InternalSensidl.g:443:3: ( rule__LinearDataConversionWithInterval__Group__0 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getGroup()); 
            // InternalSensidl.g:444:3: ( rule__LinearDataConversionWithInterval__Group__0 )
            // InternalSensidl.g:444:4: rule__LinearDataConversionWithInterval__Group__0
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
    // InternalSensidl.g:453:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalSensidl.g:454:1: ( ruleDOUBLE EOF )
            // InternalSensidl.g:455:1: ruleDOUBLE EOF
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
    // InternalSensidl.g:462:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:466:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalSensidl.g:467:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalSensidl.g:467:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalSensidl.g:468:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalSensidl.g:469:3: ( rule__DOUBLE__Group__0 )
            // InternalSensidl.g:469:4: rule__DOUBLE__Group__0
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
    // InternalSensidl.g:478:1: entryRuleUNIT : ruleUNIT EOF ;
    public final void entryRuleUNIT() throws RecognitionException {
        try {
            // InternalSensidl.g:479:1: ( ruleUNIT EOF )
            // InternalSensidl.g:480:1: ruleUNIT EOF
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
    // InternalSensidl.g:487:1: ruleUNIT : ( ( rule__UNIT__Group__0 ) ) ;
    public final void ruleUNIT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:491:2: ( ( ( rule__UNIT__Group__0 ) ) )
            // InternalSensidl.g:492:2: ( ( rule__UNIT__Group__0 ) )
            {
            // InternalSensidl.g:492:2: ( ( rule__UNIT__Group__0 ) )
            // InternalSensidl.g:493:3: ( rule__UNIT__Group__0 )
            {
             before(grammarAccess.getUNITAccess().getGroup()); 
            // InternalSensidl.g:494:3: ( rule__UNIT__Group__0 )
            // InternalSensidl.g:494:4: rule__UNIT__Group__0
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
    // InternalSensidl.g:503:1: ruleCoding : ( ( rule__Coding__Alternatives ) ) ;
    public final void ruleCoding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:507:1: ( ( ( rule__Coding__Alternatives ) ) )
            // InternalSensidl.g:508:2: ( ( rule__Coding__Alternatives ) )
            {
            // InternalSensidl.g:508:2: ( ( rule__Coding__Alternatives ) )
            // InternalSensidl.g:509:3: ( rule__Coding__Alternatives )
            {
             before(grammarAccess.getCodingAccess().getAlternatives()); 
            // InternalSensidl.g:510:3: ( rule__Coding__Alternatives )
            // InternalSensidl.g:510:4: rule__Coding__Alternatives
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
    // InternalSensidl.g:519:1: ruleEndianness : ( ( rule__Endianness__Alternatives ) ) ;
    public final void ruleEndianness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:523:1: ( ( ( rule__Endianness__Alternatives ) ) )
            // InternalSensidl.g:524:2: ( ( rule__Endianness__Alternatives ) )
            {
            // InternalSensidl.g:524:2: ( ( rule__Endianness__Alternatives ) )
            // InternalSensidl.g:525:3: ( rule__Endianness__Alternatives )
            {
             before(grammarAccess.getEndiannessAccess().getAlternatives()); 
            // InternalSensidl.g:526:3: ( rule__Endianness__Alternatives )
            // InternalSensidl.g:526:4: rule__Endianness__Alternatives
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
    // InternalSensidl.g:535:1: ruleDataTypeNotAdjustable : ( ( rule__DataTypeNotAdjustable__Alternatives ) ) ;
    public final void ruleDataTypeNotAdjustable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:539:1: ( ( ( rule__DataTypeNotAdjustable__Alternatives ) ) )
            // InternalSensidl.g:540:2: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            {
            // InternalSensidl.g:540:2: ( ( rule__DataTypeNotAdjustable__Alternatives ) )
            // InternalSensidl.g:541:3: ( rule__DataTypeNotAdjustable__Alternatives )
            {
             before(grammarAccess.getDataTypeNotAdjustableAccess().getAlternatives()); 
            // InternalSensidl.g:542:3: ( rule__DataTypeNotAdjustable__Alternatives )
            // InternalSensidl.g:542:4: rule__DataTypeNotAdjustable__Alternatives
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
    // InternalSensidl.g:551:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:555:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalSensidl.g:556:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalSensidl.g:556:2: ( ( rule__DataType__Alternatives ) )
            // InternalSensidl.g:557:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalSensidl.g:558:3: ( rule__DataType__Alternatives )
            // InternalSensidl.g:558:4: rule__DataType__Alternatives
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
    // InternalSensidl.g:566:1: rule__DataSet__Alternatives_7 : ( ( ( rule__DataSet__DataAssignment_7_0 ) ) | ( ( rule__DataSet__MethodAssignment_7_1 ) ) );
    public final void rule__DataSet__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:570:1: ( ( ( rule__DataSet__DataAssignment_7_0 ) ) | ( ( rule__DataSet__MethodAssignment_7_1 ) ) )
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
                    // InternalSensidl.g:571:2: ( ( rule__DataSet__DataAssignment_7_0 ) )
                    {
                    // InternalSensidl.g:571:2: ( ( rule__DataSet__DataAssignment_7_0 ) )
                    // InternalSensidl.g:572:3: ( rule__DataSet__DataAssignment_7_0 )
                    {
                     before(grammarAccess.getDataSetAccess().getDataAssignment_7_0()); 
                    // InternalSensidl.g:573:3: ( rule__DataSet__DataAssignment_7_0 )
                    // InternalSensidl.g:573:4: rule__DataSet__DataAssignment_7_0
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
                    // InternalSensidl.g:577:2: ( ( rule__DataSet__MethodAssignment_7_1 ) )
                    {
                    // InternalSensidl.g:577:2: ( ( rule__DataSet__MethodAssignment_7_1 ) )
                    // InternalSensidl.g:578:3: ( rule__DataSet__MethodAssignment_7_1 )
                    {
                     before(grammarAccess.getDataSetAccess().getMethodAssignment_7_1()); 
                    // InternalSensidl.g:579:3: ( rule__DataSet__MethodAssignment_7_1 )
                    // InternalSensidl.g:579:4: rule__DataSet__MethodAssignment_7_1
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
    // InternalSensidl.g:587:1: rule__Method__Alternatives_0 : ( ( ( rule__Method__VisibilityAssignment_0_0 ) ) | ( ( rule__Method__VisibilityAssignment_0_1 ) ) | ( ( rule__Method__VisibilityAssignment_0_2 ) ) | ( ( rule__Method__VisibilityAssignment_0_3 ) ) );
    public final void rule__Method__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:591:1: ( ( ( rule__Method__VisibilityAssignment_0_0 ) ) | ( ( rule__Method__VisibilityAssignment_0_1 ) ) | ( ( rule__Method__VisibilityAssignment_0_2 ) ) | ( ( rule__Method__VisibilityAssignment_0_3 ) ) )
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
                    // InternalSensidl.g:592:2: ( ( rule__Method__VisibilityAssignment_0_0 ) )
                    {
                    // InternalSensidl.g:592:2: ( ( rule__Method__VisibilityAssignment_0_0 ) )
                    // InternalSensidl.g:593:3: ( rule__Method__VisibilityAssignment_0_0 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_0()); 
                    // InternalSensidl.g:594:3: ( rule__Method__VisibilityAssignment_0_0 )
                    // InternalSensidl.g:594:4: rule__Method__VisibilityAssignment_0_0
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
                    // InternalSensidl.g:598:2: ( ( rule__Method__VisibilityAssignment_0_1 ) )
                    {
                    // InternalSensidl.g:598:2: ( ( rule__Method__VisibilityAssignment_0_1 ) )
                    // InternalSensidl.g:599:3: ( rule__Method__VisibilityAssignment_0_1 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_1()); 
                    // InternalSensidl.g:600:3: ( rule__Method__VisibilityAssignment_0_1 )
                    // InternalSensidl.g:600:4: rule__Method__VisibilityAssignment_0_1
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
                    // InternalSensidl.g:604:2: ( ( rule__Method__VisibilityAssignment_0_2 ) )
                    {
                    // InternalSensidl.g:604:2: ( ( rule__Method__VisibilityAssignment_0_2 ) )
                    // InternalSensidl.g:605:3: ( rule__Method__VisibilityAssignment_0_2 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_2()); 
                    // InternalSensidl.g:606:3: ( rule__Method__VisibilityAssignment_0_2 )
                    // InternalSensidl.g:606:4: rule__Method__VisibilityAssignment_0_2
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
                    // InternalSensidl.g:610:2: ( ( rule__Method__VisibilityAssignment_0_3 ) )
                    {
                    // InternalSensidl.g:610:2: ( ( rule__Method__VisibilityAssignment_0_3 ) )
                    // InternalSensidl.g:611:3: ( rule__Method__VisibilityAssignment_0_3 )
                    {
                     before(grammarAccess.getMethodAccess().getVisibilityAssignment_0_3()); 
                    // InternalSensidl.g:612:3: ( rule__Method__VisibilityAssignment_0_3 )
                    // InternalSensidl.g:612:4: rule__Method__VisibilityAssignment_0_3
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
    // InternalSensidl.g:620:1: rule__Method__Alternatives_6_1 : ( ( ( rule__Method__Alternatives_6_1_0 ) ) | ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) ) );
    public final void rule__Method__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:624:1: ( ( ( rule__Method__Alternatives_6_1_0 ) ) | ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) ) )
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
                    // InternalSensidl.g:625:2: ( ( rule__Method__Alternatives_6_1_0 ) )
                    {
                    // InternalSensidl.g:625:2: ( ( rule__Method__Alternatives_6_1_0 ) )
                    // InternalSensidl.g:626:3: ( rule__Method__Alternatives_6_1_0 )
                    {
                     before(grammarAccess.getMethodAccess().getAlternatives_6_1_0()); 
                    // InternalSensidl.g:627:3: ( rule__Method__Alternatives_6_1_0 )
                    // InternalSensidl.g:627:4: rule__Method__Alternatives_6_1_0
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
                    // InternalSensidl.g:631:2: ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) )
                    {
                    // InternalSensidl.g:631:2: ( ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 ) )
                    // InternalSensidl.g:632:3: ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeDataSetAssignment_6_1_1()); 
                    // InternalSensidl.g:633:3: ( rule__Method__ReturnTypeDataSetAssignment_6_1_1 )
                    // InternalSensidl.g:633:4: rule__Method__ReturnTypeDataSetAssignment_6_1_1
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
    // InternalSensidl.g:641:1: rule__Method__Alternatives_6_1_0 : ( ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) ) | ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) ) );
    public final void rule__Method__Alternatives_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:645:1: ( ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) ) | ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) ) )
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
                    // InternalSensidl.g:646:2: ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) )
                    {
                    // InternalSensidl.g:646:2: ( ( rule__Method__ReturnTypeAssignment_6_1_0_0 ) )
                    // InternalSensidl.g:647:3: ( rule__Method__ReturnTypeAssignment_6_1_0_0 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_0()); 
                    // InternalSensidl.g:648:3: ( rule__Method__ReturnTypeAssignment_6_1_0_0 )
                    // InternalSensidl.g:648:4: rule__Method__ReturnTypeAssignment_6_1_0_0
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
                    // InternalSensidl.g:652:2: ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) )
                    {
                    // InternalSensidl.g:652:2: ( ( rule__Method__ReturnTypeAssignment_6_1_0_1 ) )
                    // InternalSensidl.g:653:3: ( rule__Method__ReturnTypeAssignment_6_1_0_1 )
                    {
                     before(grammarAccess.getMethodAccess().getReturnTypeAssignment_6_1_0_1()); 
                    // InternalSensidl.g:654:3: ( rule__Method__ReturnTypeAssignment_6_1_0_1 )
                    // InternalSensidl.g:654:4: rule__Method__ReturnTypeAssignment_6_1_0_1
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
    // InternalSensidl.g:662:1: rule__MethodParameter__Alternatives_0 : ( ( ( rule__MethodParameter__Alternatives_0_0 ) ) | ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) ) );
    public final void rule__MethodParameter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:666:1: ( ( ( rule__MethodParameter__Alternatives_0_0 ) ) | ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) ) )
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
                    // InternalSensidl.g:667:2: ( ( rule__MethodParameter__Alternatives_0_0 ) )
                    {
                    // InternalSensidl.g:667:2: ( ( rule__MethodParameter__Alternatives_0_0 ) )
                    // InternalSensidl.g:668:3: ( rule__MethodParameter__Alternatives_0_0 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getAlternatives_0_0()); 
                    // InternalSensidl.g:669:3: ( rule__MethodParameter__Alternatives_0_0 )
                    // InternalSensidl.g:669:4: rule__MethodParameter__Alternatives_0_0
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
                    // InternalSensidl.g:673:2: ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) )
                    {
                    // InternalSensidl.g:673:2: ( ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 ) )
                    // InternalSensidl.g:674:3: ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetAssignment_0_1()); 
                    // InternalSensidl.g:675:3: ( rule__MethodParameter__DataTypeDataSetAssignment_0_1 )
                    // InternalSensidl.g:675:4: rule__MethodParameter__DataTypeDataSetAssignment_0_1
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
    // InternalSensidl.g:683:1: rule__MethodParameter__Alternatives_0_0 : ( ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) ) | ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) ) );
    public final void rule__MethodParameter__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:687:1: ( ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) ) | ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) ) )
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
                    // InternalSensidl.g:688:2: ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) )
                    {
                    // InternalSensidl.g:688:2: ( ( rule__MethodParameter__DataTypeAssignment_0_0_0 ) )
                    // InternalSensidl.g:689:3: ( rule__MethodParameter__DataTypeAssignment_0_0_0 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_0()); 
                    // InternalSensidl.g:690:3: ( rule__MethodParameter__DataTypeAssignment_0_0_0 )
                    // InternalSensidl.g:690:4: rule__MethodParameter__DataTypeAssignment_0_0_0
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
                    // InternalSensidl.g:694:2: ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) )
                    {
                    // InternalSensidl.g:694:2: ( ( rule__MethodParameter__DataTypeAssignment_0_0_1 ) )
                    // InternalSensidl.g:695:3: ( rule__MethodParameter__DataTypeAssignment_0_0_1 )
                    {
                     before(grammarAccess.getMethodParameterAccess().getDataTypeAssignment_0_0_1()); 
                    // InternalSensidl.g:696:3: ( rule__MethodParameter__DataTypeAssignment_0_0_1 )
                    // InternalSensidl.g:696:4: rule__MethodParameter__DataTypeAssignment_0_0_1
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
    // InternalSensidl.g:704:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) | ( ruleListData ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:708:1: ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) | ( ruleListData ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalSensidl.g:709:2: ( ruleMeasurementData )
                    {
                    // InternalSensidl.g:709:2: ( ruleMeasurementData )
                    // InternalSensidl.g:710:3: ruleMeasurementData
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
                    // InternalSensidl.g:715:2: ( ruleNonMeasurementData )
                    {
                    // InternalSensidl.g:715:2: ( ruleNonMeasurementData )
                    // InternalSensidl.g:716:3: ruleNonMeasurementData
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
                    // InternalSensidl.g:721:2: ( ruleMeasurementDataNotAdjustable )
                    {
                    // InternalSensidl.g:721:2: ( ruleMeasurementDataNotAdjustable )
                    // InternalSensidl.g:722:3: ruleMeasurementDataNotAdjustable
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
                    // InternalSensidl.g:727:2: ( ruleListData )
                    {
                    // InternalSensidl.g:727:2: ( ruleListData )
                    // InternalSensidl.g:728:3: ruleListData
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
    // InternalSensidl.g:737:1: rule__ListData__Alternatives_4 : ( ( ( rule__ListData__DataTypeAssignment_4_0 ) ) | ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) ) );
    public final void rule__ListData__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:741:1: ( ( ( rule__ListData__DataTypeAssignment_4_0 ) ) | ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) ) )
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
                    // InternalSensidl.g:742:2: ( ( rule__ListData__DataTypeAssignment_4_0 ) )
                    {
                    // InternalSensidl.g:742:2: ( ( rule__ListData__DataTypeAssignment_4_0 ) )
                    // InternalSensidl.g:743:3: ( rule__ListData__DataTypeAssignment_4_0 )
                    {
                     before(grammarAccess.getListDataAccess().getDataTypeAssignment_4_0()); 
                    // InternalSensidl.g:744:3: ( rule__ListData__DataTypeAssignment_4_0 )
                    // InternalSensidl.g:744:4: rule__ListData__DataTypeAssignment_4_0
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
                    // InternalSensidl.g:748:2: ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) )
                    {
                    // InternalSensidl.g:748:2: ( ( rule__ListData__DataTypeDataSetAssignment_4_1 ) )
                    // InternalSensidl.g:749:3: ( rule__ListData__DataTypeDataSetAssignment_4_1 )
                    {
                     before(grammarAccess.getListDataAccess().getDataTypeDataSetAssignment_4_1()); 
                    // InternalSensidl.g:750:3: ( rule__ListData__DataTypeDataSetAssignment_4_1 )
                    // InternalSensidl.g:750:4: rule__ListData__DataTypeDataSetAssignment_4_1
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
    // InternalSensidl.g:758:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );
    public final void rule__MeasurementData__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:762:1: ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalSensidl.g:763:2: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    {
                    // InternalSensidl.g:763:2: ( ( rule__MeasurementData__Group_6_0__0 ) )
                    // InternalSensidl.g:764:3: ( rule__MeasurementData__Group_6_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_0()); 
                    // InternalSensidl.g:765:3: ( rule__MeasurementData__Group_6_0__0 )
                    // InternalSensidl.g:765:4: rule__MeasurementData__Group_6_0__0
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
                    // InternalSensidl.g:769:2: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    {
                    // InternalSensidl.g:769:2: ( ( rule__MeasurementData__Group_6_1__0 ) )
                    // InternalSensidl.g:770:3: ( rule__MeasurementData__Group_6_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_1()); 
                    // InternalSensidl.g:771:3: ( rule__MeasurementData__Group_6_1__0 )
                    // InternalSensidl.g:771:4: rule__MeasurementData__Group_6_1__0
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
                    // InternalSensidl.g:775:2: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    {
                    // InternalSensidl.g:775:2: ( ( rule__MeasurementData__Group_6_2__0 ) )
                    // InternalSensidl.g:776:3: ( rule__MeasurementData__Group_6_2__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_6_2()); 
                    // InternalSensidl.g:777:3: ( rule__MeasurementData__Group_6_2__0 )
                    // InternalSensidl.g:777:4: rule__MeasurementData__Group_6_2__0
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
    // InternalSensidl.g:785:1: rule__MeasurementData__Alternatives_7_1 : ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) );
    public final void rule__MeasurementData__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:789:1: ( ( ( rule__MeasurementData__Group_7_1_0__0 ) ) | ( ( rule__MeasurementData__Group_7_1_1__0 ) ) )
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
                    // InternalSensidl.g:790:2: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    {
                    // InternalSensidl.g:790:2: ( ( rule__MeasurementData__Group_7_1_0__0 ) )
                    // InternalSensidl.g:791:3: ( rule__MeasurementData__Group_7_1_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0()); 
                    // InternalSensidl.g:792:3: ( rule__MeasurementData__Group_7_1_0__0 )
                    // InternalSensidl.g:792:4: rule__MeasurementData__Group_7_1_0__0
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
                    // InternalSensidl.g:796:2: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    {
                    // InternalSensidl.g:796:2: ( ( rule__MeasurementData__Group_7_1_1__0 ) )
                    // InternalSensidl.g:797:3: ( rule__MeasurementData__Group_7_1_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1()); 
                    // InternalSensidl.g:798:3: ( rule__MeasurementData__Group_7_1_1__0 )
                    // InternalSensidl.g:798:4: rule__MeasurementData__Group_7_1_1__0
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
    // InternalSensidl.g:806:1: rule__NonMeasurementData__Alternatives_2 : ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) );
    public final void rule__NonMeasurementData__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:810:1: ( ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) ) | ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) ) )
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
                    // InternalSensidl.g:811:2: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    {
                    // InternalSensidl.g:811:2: ( ( rule__NonMeasurementData__DataTypeAssignment_2_0 ) )
                    // InternalSensidl.g:812:3: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_0()); 
                    // InternalSensidl.g:813:3: ( rule__NonMeasurementData__DataTypeAssignment_2_0 )
                    // InternalSensidl.g:813:4: rule__NonMeasurementData__DataTypeAssignment_2_0
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
                    // InternalSensidl.g:817:2: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    {
                    // InternalSensidl.g:817:2: ( ( rule__NonMeasurementData__DataTypeAssignment_2_1 ) )
                    // InternalSensidl.g:818:3: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getDataTypeAssignment_2_1()); 
                    // InternalSensidl.g:819:3: ( rule__NonMeasurementData__DataTypeAssignment_2_1 )
                    // InternalSensidl.g:819:4: rule__NonMeasurementData__DataTypeAssignment_2_1
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
    // InternalSensidl.g:827:1: rule__NonMeasurementData__Alternatives_3 : ( ( ( rule__NonMeasurementData__Group_3_0__0 ) ) | ( ( rule__NonMeasurementData__Group_3_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:831:1: ( ( ( rule__NonMeasurementData__Group_3_0__0 ) ) | ( ( rule__NonMeasurementData__Group_3_1__0 ) ) )
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
                    // InternalSensidl.g:832:2: ( ( rule__NonMeasurementData__Group_3_0__0 ) )
                    {
                    // InternalSensidl.g:832:2: ( ( rule__NonMeasurementData__Group_3_0__0 ) )
                    // InternalSensidl.g:833:3: ( rule__NonMeasurementData__Group_3_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_3_0()); 
                    // InternalSensidl.g:834:3: ( rule__NonMeasurementData__Group_3_0__0 )
                    // InternalSensidl.g:834:4: rule__NonMeasurementData__Group_3_0__0
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
                    // InternalSensidl.g:838:2: ( ( rule__NonMeasurementData__Group_3_1__0 ) )
                    {
                    // InternalSensidl.g:838:2: ( ( rule__NonMeasurementData__Group_3_1__0 ) )
                    // InternalSensidl.g:839:3: ( rule__NonMeasurementData__Group_3_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_3_1()); 
                    // InternalSensidl.g:840:3: ( rule__NonMeasurementData__Group_3_1__0 )
                    // InternalSensidl.g:840:4: rule__NonMeasurementData__Group_3_1__0
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
    // InternalSensidl.g:848:1: rule__NonMeasurementData__Alternatives_5_1 : ( ( ( rule__NonMeasurementData__Group_5_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_5_1_1__0 ) ) );
    public final void rule__NonMeasurementData__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:852:1: ( ( ( rule__NonMeasurementData__Group_5_1_0__0 ) ) | ( ( rule__NonMeasurementData__Group_5_1_1__0 ) ) )
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
                    // InternalSensidl.g:853:2: ( ( rule__NonMeasurementData__Group_5_1_0__0 ) )
                    {
                    // InternalSensidl.g:853:2: ( ( rule__NonMeasurementData__Group_5_1_0__0 ) )
                    // InternalSensidl.g:854:3: ( rule__NonMeasurementData__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_0()); 
                    // InternalSensidl.g:855:3: ( rule__NonMeasurementData__Group_5_1_0__0 )
                    // InternalSensidl.g:855:4: rule__NonMeasurementData__Group_5_1_0__0
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
                    // InternalSensidl.g:859:2: ( ( rule__NonMeasurementData__Group_5_1_1__0 ) )
                    {
                    // InternalSensidl.g:859:2: ( ( rule__NonMeasurementData__Group_5_1_1__0 ) )
                    // InternalSensidl.g:860:3: ( rule__NonMeasurementData__Group_5_1_1__0 )
                    {
                     before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_1()); 
                    // InternalSensidl.g:861:3: ( rule__NonMeasurementData__Group_5_1_1__0 )
                    // InternalSensidl.g:861:4: rule__NonMeasurementData__Group_5_1_1__0
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
    // InternalSensidl.g:869:1: rule__MeasurementDataNotAdjustable__Alternatives_6_2 : ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) );
    public final void rule__MeasurementDataNotAdjustable__Alternatives_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:873:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) ) | ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) ) )
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
                    // InternalSensidl.g:874:2: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    {
                    // InternalSensidl.g:874:2: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 ) )
                    // InternalSensidl.g:875:3: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0()); 
                    // InternalSensidl.g:876:3: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0 )
                    // InternalSensidl.g:876:4: rule__MeasurementDataNotAdjustable__Group_6_2_0__0
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
                    // InternalSensidl.g:880:2: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    {
                    // InternalSensidl.g:880:2: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 ) )
                    // InternalSensidl.g:881:3: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    {
                     before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1()); 
                    // InternalSensidl.g:882:3: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0 )
                    // InternalSensidl.g:882:4: rule__MeasurementDataNotAdjustable__Group_6_2_1__0
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
    // InternalSensidl.g:890:1: rule__DataConversion__Alternatives : ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) );
    public final void rule__DataConversion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:894:1: ( ( ruleLinearDataConversion ) | ( ruleLinearDataConversionWithInterval ) )
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
                    // InternalSensidl.g:895:2: ( ruleLinearDataConversion )
                    {
                    // InternalSensidl.g:895:2: ( ruleLinearDataConversion )
                    // InternalSensidl.g:896:3: ruleLinearDataConversion
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
                    // InternalSensidl.g:901:2: ( ruleLinearDataConversionWithInterval )
                    {
                    // InternalSensidl.g:901:2: ( ruleLinearDataConversionWithInterval )
                    // InternalSensidl.g:902:3: ruleLinearDataConversionWithInterval
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
    // InternalSensidl.g:911:1: rule__Coding__Alternatives : ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) );
    public final void rule__Coding__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:915:1: ( ( ( 'SENSIDL_BINARY' ) ) | ( ( 'SENSIDL_JSON' ) ) )
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
                    // InternalSensidl.g:916:2: ( ( 'SENSIDL_BINARY' ) )
                    {
                    // InternalSensidl.g:916:2: ( ( 'SENSIDL_BINARY' ) )
                    // InternalSensidl.g:917:3: ( 'SENSIDL_BINARY' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:918:3: ( 'SENSIDL_BINARY' )
                    // InternalSensidl.g:918:4: 'SENSIDL_BINARY'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCodingAccess().getSENSIDL_BINARYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:922:2: ( ( 'SENSIDL_JSON' ) )
                    {
                    // InternalSensidl.g:922:2: ( ( 'SENSIDL_JSON' ) )
                    // InternalSensidl.g:923:3: ( 'SENSIDL_JSON' )
                    {
                     before(grammarAccess.getCodingAccess().getSENSIDL_JSONEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:924:3: ( 'SENSIDL_JSON' )
                    // InternalSensidl.g:924:4: 'SENSIDL_JSON'
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
    // InternalSensidl.g:932:1: rule__Endianness__Alternatives : ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) );
    public final void rule__Endianness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:936:1: ( ( ( 'BIG_ENDIAN' ) ) | ( ( 'LITTLE_ENDIAN' ) ) )
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
                    // InternalSensidl.g:937:2: ( ( 'BIG_ENDIAN' ) )
                    {
                    // InternalSensidl.g:937:2: ( ( 'BIG_ENDIAN' ) )
                    // InternalSensidl.g:938:3: ( 'BIG_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:939:3: ( 'BIG_ENDIAN' )
                    // InternalSensidl.g:939:4: 'BIG_ENDIAN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndiannessAccess().getBIG_ENDIANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:943:2: ( ( 'LITTLE_ENDIAN' ) )
                    {
                    // InternalSensidl.g:943:2: ( ( 'LITTLE_ENDIAN' ) )
                    // InternalSensidl.g:944:3: ( 'LITTLE_ENDIAN' )
                    {
                     before(grammarAccess.getEndiannessAccess().getLITTLE_ENDIANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:945:3: ( 'LITTLE_ENDIAN' )
                    // InternalSensidl.g:945:4: 'LITTLE_ENDIAN'
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
    // InternalSensidl.g:953:1: rule__DataTypeNotAdjustable__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) );
    public final void rule__DataTypeNotAdjustable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:957:1: ( ( ( 'STRING' ) ) | ( ( 'BOOLEAN' ) ) )
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
                    // InternalSensidl.g:958:2: ( ( 'STRING' ) )
                    {
                    // InternalSensidl.g:958:2: ( ( 'STRING' ) )
                    // InternalSensidl.g:959:3: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:960:3: ( 'STRING' )
                    // InternalSensidl.g:960:4: 'STRING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeNotAdjustableAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:964:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalSensidl.g:964:2: ( ( 'BOOLEAN' ) )
                    // InternalSensidl.g:965:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getDataTypeNotAdjustableAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:966:3: ( 'BOOLEAN' )
                    // InternalSensidl.g:966:4: 'BOOLEAN'
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
    // InternalSensidl.g:974:1: rule__DataType__Alternatives : ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:978:1: ( ( ( 'INT8' ) ) | ( ( 'UINT8' ) ) | ( ( 'INT16' ) ) | ( ( 'UINT16' ) ) | ( ( 'INT32' ) ) | ( ( 'UINT32' ) ) | ( ( 'INT64' ) ) | ( ( 'UINT64' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) )
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
                    // InternalSensidl.g:979:2: ( ( 'INT8' ) )
                    {
                    // InternalSensidl.g:979:2: ( ( 'INT8' ) )
                    // InternalSensidl.g:980:3: ( 'INT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 
                    // InternalSensidl.g:981:3: ( 'INT8' )
                    // InternalSensidl.g:981:4: 'INT8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSensidl.g:985:2: ( ( 'UINT8' ) )
                    {
                    // InternalSensidl.g:985:2: ( ( 'UINT8' ) )
                    // InternalSensidl.g:986:3: ( 'UINT8' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 
                    // InternalSensidl.g:987:3: ( 'UINT8' )
                    // InternalSensidl.g:987:4: 'UINT8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT8EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSensidl.g:991:2: ( ( 'INT16' ) )
                    {
                    // InternalSensidl.g:991:2: ( ( 'INT16' ) )
                    // InternalSensidl.g:992:3: ( 'INT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 
                    // InternalSensidl.g:993:3: ( 'INT16' )
                    // InternalSensidl.g:993:4: 'INT16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSensidl.g:997:2: ( ( 'UINT16' ) )
                    {
                    // InternalSensidl.g:997:2: ( ( 'UINT16' ) )
                    // InternalSensidl.g:998:3: ( 'UINT16' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 
                    // InternalSensidl.g:999:3: ( 'UINT16' )
                    // InternalSensidl.g:999:4: 'UINT16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT16EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSensidl.g:1003:2: ( ( 'INT32' ) )
                    {
                    // InternalSensidl.g:1003:2: ( ( 'INT32' ) )
                    // InternalSensidl.g:1004:3: ( 'INT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 
                    // InternalSensidl.g:1005:3: ( 'INT32' )
                    // InternalSensidl.g:1005:4: 'INT32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT32EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSensidl.g:1009:2: ( ( 'UINT32' ) )
                    {
                    // InternalSensidl.g:1009:2: ( ( 'UINT32' ) )
                    // InternalSensidl.g:1010:3: ( 'UINT32' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 
                    // InternalSensidl.g:1011:3: ( 'UINT32' )
                    // InternalSensidl.g:1011:4: 'UINT32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT32EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSensidl.g:1015:2: ( ( 'INT64' ) )
                    {
                    // InternalSensidl.g:1015:2: ( ( 'INT64' ) )
                    // InternalSensidl.g:1016:3: ( 'INT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 
                    // InternalSensidl.g:1017:3: ( 'INT64' )
                    // InternalSensidl.g:1017:4: 'INT64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINT64EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSensidl.g:1021:2: ( ( 'UINT64' ) )
                    {
                    // InternalSensidl.g:1021:2: ( ( 'UINT64' ) )
                    // InternalSensidl.g:1022:3: ( 'UINT64' )
                    {
                     before(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 
                    // InternalSensidl.g:1023:3: ( 'UINT64' )
                    // InternalSensidl.g:1023:4: 'UINT64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getUINT64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSensidl.g:1027:2: ( ( 'FLOAT' ) )
                    {
                    // InternalSensidl.g:1027:2: ( ( 'FLOAT' ) )
                    // InternalSensidl.g:1028:3: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 
                    // InternalSensidl.g:1029:3: ( 'FLOAT' )
                    // InternalSensidl.g:1029:4: 'FLOAT'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSensidl.g:1033:2: ( ( 'DOUBLE' ) )
                    {
                    // InternalSensidl.g:1033:2: ( ( 'DOUBLE' ) )
                    // InternalSensidl.g:1034:3: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_9()); 
                    // InternalSensidl.g:1035:3: ( 'DOUBLE' )
                    // InternalSensidl.g:1035:4: 'DOUBLE'
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
    // InternalSensidl.g:1043:1: rule__SensorInterface__Group__0 : rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 ;
    public final void rule__SensorInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1047:1: ( rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1 )
            // InternalSensidl.g:1048:2: rule__SensorInterface__Group__0__Impl rule__SensorInterface__Group__1
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
    // InternalSensidl.g:1055:1: rule__SensorInterface__Group__0__Impl : ( 'sensorInterface' ) ;
    public final void rule__SensorInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1059:1: ( ( 'sensorInterface' ) )
            // InternalSensidl.g:1060:1: ( 'sensorInterface' )
            {
            // InternalSensidl.g:1060:1: ( 'sensorInterface' )
            // InternalSensidl.g:1061:2: 'sensorInterface'
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
    // InternalSensidl.g:1070:1: rule__SensorInterface__Group__1 : rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 ;
    public final void rule__SensorInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1074:1: ( rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2 )
            // InternalSensidl.g:1075:2: rule__SensorInterface__Group__1__Impl rule__SensorInterface__Group__2
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
    // InternalSensidl.g:1082:1: rule__SensorInterface__Group__1__Impl : ( ( rule__SensorInterface__NameAssignment_1 ) ) ;
    public final void rule__SensorInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1086:1: ( ( ( rule__SensorInterface__NameAssignment_1 ) ) )
            // InternalSensidl.g:1087:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            {
            // InternalSensidl.g:1087:1: ( ( rule__SensorInterface__NameAssignment_1 ) )
            // InternalSensidl.g:1088:2: ( rule__SensorInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getNameAssignment_1()); 
            // InternalSensidl.g:1089:2: ( rule__SensorInterface__NameAssignment_1 )
            // InternalSensidl.g:1089:3: rule__SensorInterface__NameAssignment_1
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
    // InternalSensidl.g:1097:1: rule__SensorInterface__Group__2 : rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 ;
    public final void rule__SensorInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1101:1: ( rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3 )
            // InternalSensidl.g:1102:2: rule__SensorInterface__Group__2__Impl rule__SensorInterface__Group__3
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
    // InternalSensidl.g:1109:1: rule__SensorInterface__Group__2__Impl : ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) ;
    public final void rule__SensorInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1113:1: ( ( ( rule__SensorInterface__DescriptionAssignment_2 )? ) )
            // InternalSensidl.g:1114:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            {
            // InternalSensidl.g:1114:1: ( ( rule__SensorInterface__DescriptionAssignment_2 )? )
            // InternalSensidl.g:1115:2: ( rule__SensorInterface__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getDescriptionAssignment_2()); 
            // InternalSensidl.g:1116:2: ( rule__SensorInterface__DescriptionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DESCRIPTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSensidl.g:1116:3: rule__SensorInterface__DescriptionAssignment_2
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
    // InternalSensidl.g:1124:1: rule__SensorInterface__Group__3 : rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 ;
    public final void rule__SensorInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1128:1: ( rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4 )
            // InternalSensidl.g:1129:2: rule__SensorInterface__Group__3__Impl rule__SensorInterface__Group__4
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
    // InternalSensidl.g:1136:1: rule__SensorInterface__Group__3__Impl : ( ( rule__SensorInterface__Group_3__0 )? ) ;
    public final void rule__SensorInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1140:1: ( ( ( rule__SensorInterface__Group_3__0 )? ) )
            // InternalSensidl.g:1141:1: ( ( rule__SensorInterface__Group_3__0 )? )
            {
            // InternalSensidl.g:1141:1: ( ( rule__SensorInterface__Group_3__0 )? )
            // InternalSensidl.g:1142:2: ( rule__SensorInterface__Group_3__0 )?
            {
             before(grammarAccess.getSensorInterfaceAccess().getGroup_3()); 
            // InternalSensidl.g:1143:2: ( rule__SensorInterface__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSensidl.g:1143:3: rule__SensorInterface__Group_3__0
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
    // InternalSensidl.g:1151:1: rule__SensorInterface__Group__4 : rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 ;
    public final void rule__SensorInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1155:1: ( rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5 )
            // InternalSensidl.g:1156:2: rule__SensorInterface__Group__4__Impl rule__SensorInterface__Group__5
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
    // InternalSensidl.g:1163:1: rule__SensorInterface__Group__4__Impl : ( '{' ) ;
    public final void rule__SensorInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1167:1: ( ( '{' ) )
            // InternalSensidl.g:1168:1: ( '{' )
            {
            // InternalSensidl.g:1168:1: ( '{' )
            // InternalSensidl.g:1169:2: '{'
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
    // InternalSensidl.g:1178:1: rule__SensorInterface__Group__5 : rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 ;
    public final void rule__SensorInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1182:1: ( rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6 )
            // InternalSensidl.g:1183:2: rule__SensorInterface__Group__5__Impl rule__SensorInterface__Group__6
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
    // InternalSensidl.g:1190:1: rule__SensorInterface__Group__5__Impl : ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) ;
    public final void rule__SensorInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1194:1: ( ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) ) )
            // InternalSensidl.g:1195:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            {
            // InternalSensidl.g:1195:1: ( ( rule__SensorInterface__EncodingSettingsAssignment_5 ) )
            // InternalSensidl.g:1196:2: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getEncodingSettingsAssignment_5()); 
            // InternalSensidl.g:1197:2: ( rule__SensorInterface__EncodingSettingsAssignment_5 )
            // InternalSensidl.g:1197:3: rule__SensorInterface__EncodingSettingsAssignment_5
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
    // InternalSensidl.g:1205:1: rule__SensorInterface__Group__6 : rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 ;
    public final void rule__SensorInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1209:1: ( rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7 )
            // InternalSensidl.g:1210:2: rule__SensorInterface__Group__6__Impl rule__SensorInterface__Group__7
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
    // InternalSensidl.g:1217:1: rule__SensorInterface__Group__6__Impl : ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) ;
    public final void rule__SensorInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1221:1: ( ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) ) )
            // InternalSensidl.g:1222:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            {
            // InternalSensidl.g:1222:1: ( ( rule__SensorInterface__DataDescriptionAssignment_6 ) )
            // InternalSensidl.g:1223:2: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getDataDescriptionAssignment_6()); 
            // InternalSensidl.g:1224:2: ( rule__SensorInterface__DataDescriptionAssignment_6 )
            // InternalSensidl.g:1224:3: rule__SensorInterface__DataDescriptionAssignment_6
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
    // InternalSensidl.g:1232:1: rule__SensorInterface__Group__7 : rule__SensorInterface__Group__7__Impl ;
    public final void rule__SensorInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1236:1: ( rule__SensorInterface__Group__7__Impl )
            // InternalSensidl.g:1237:2: rule__SensorInterface__Group__7__Impl
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
    // InternalSensidl.g:1243:1: rule__SensorInterface__Group__7__Impl : ( '}' ) ;
    public final void rule__SensorInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1247:1: ( ( '}' ) )
            // InternalSensidl.g:1248:1: ( '}' )
            {
            // InternalSensidl.g:1248:1: ( '}' )
            // InternalSensidl.g:1249:2: '}'
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
    // InternalSensidl.g:1259:1: rule__SensorInterface__Group_3__0 : rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 ;
    public final void rule__SensorInterface__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1263:1: ( rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1 )
            // InternalSensidl.g:1264:2: rule__SensorInterface__Group_3__0__Impl rule__SensorInterface__Group_3__1
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
    // InternalSensidl.g:1271:1: rule__SensorInterface__Group_3__0__Impl : ( 'with identifier' ) ;
    public final void rule__SensorInterface__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1275:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1276:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1276:1: ( 'with identifier' )
            // InternalSensidl.g:1277:2: 'with identifier'
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
    // InternalSensidl.g:1286:1: rule__SensorInterface__Group_3__1 : rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 ;
    public final void rule__SensorInterface__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1290:1: ( rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2 )
            // InternalSensidl.g:1291:2: rule__SensorInterface__Group_3__1__Impl rule__SensorInterface__Group_3__2
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
    // InternalSensidl.g:1298:1: rule__SensorInterface__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SensorInterface__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1302:1: ( ( ':' ) )
            // InternalSensidl.g:1303:1: ( ':' )
            {
            // InternalSensidl.g:1303:1: ( ':' )
            // InternalSensidl.g:1304:2: ':'
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
    // InternalSensidl.g:1313:1: rule__SensorInterface__Group_3__2 : rule__SensorInterface__Group_3__2__Impl ;
    public final void rule__SensorInterface__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1317:1: ( rule__SensorInterface__Group_3__2__Impl )
            // InternalSensidl.g:1318:2: rule__SensorInterface__Group_3__2__Impl
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
    // InternalSensidl.g:1324:1: rule__SensorInterface__Group_3__2__Impl : ( ( rule__SensorInterface__IDAssignment_3_2 ) ) ;
    public final void rule__SensorInterface__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1328:1: ( ( ( rule__SensorInterface__IDAssignment_3_2 ) ) )
            // InternalSensidl.g:1329:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            {
            // InternalSensidl.g:1329:1: ( ( rule__SensorInterface__IDAssignment_3_2 ) )
            // InternalSensidl.g:1330:2: ( rule__SensorInterface__IDAssignment_3_2 )
            {
             before(grammarAccess.getSensorInterfaceAccess().getIDAssignment_3_2()); 
            // InternalSensidl.g:1331:2: ( rule__SensorInterface__IDAssignment_3_2 )
            // InternalSensidl.g:1331:3: rule__SensorInterface__IDAssignment_3_2
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
    // InternalSensidl.g:1340:1: rule__EncodingSettings__Group__0 : rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 ;
    public final void rule__EncodingSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1344:1: ( rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1 )
            // InternalSensidl.g:1345:2: rule__EncodingSettings__Group__0__Impl rule__EncodingSettings__Group__1
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
    // InternalSensidl.g:1352:1: rule__EncodingSettings__Group__0__Impl : ( 'encoding' ) ;
    public final void rule__EncodingSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1356:1: ( ( 'encoding' ) )
            // InternalSensidl.g:1357:1: ( 'encoding' )
            {
            // InternalSensidl.g:1357:1: ( 'encoding' )
            // InternalSensidl.g:1358:2: 'encoding'
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
    // InternalSensidl.g:1367:1: rule__EncodingSettings__Group__1 : rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 ;
    public final void rule__EncodingSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1371:1: ( rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2 )
            // InternalSensidl.g:1372:2: rule__EncodingSettings__Group__1__Impl rule__EncodingSettings__Group__2
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
    // InternalSensidl.g:1379:1: rule__EncodingSettings__Group__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1383:1: ( ( ':' ) )
            // InternalSensidl.g:1384:1: ( ':' )
            {
            // InternalSensidl.g:1384:1: ( ':' )
            // InternalSensidl.g:1385:2: ':'
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
    // InternalSensidl.g:1394:1: rule__EncodingSettings__Group__2 : rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 ;
    public final void rule__EncodingSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1398:1: ( rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3 )
            // InternalSensidl.g:1399:2: rule__EncodingSettings__Group__2__Impl rule__EncodingSettings__Group__3
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
    // InternalSensidl.g:1406:1: rule__EncodingSettings__Group__2__Impl : ( ( rule__EncodingSettings__CodingAssignment_2 ) ) ;
    public final void rule__EncodingSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1410:1: ( ( ( rule__EncodingSettings__CodingAssignment_2 ) ) )
            // InternalSensidl.g:1411:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            {
            // InternalSensidl.g:1411:1: ( ( rule__EncodingSettings__CodingAssignment_2 ) )
            // InternalSensidl.g:1412:2: ( rule__EncodingSettings__CodingAssignment_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getCodingAssignment_2()); 
            // InternalSensidl.g:1413:2: ( rule__EncodingSettings__CodingAssignment_2 )
            // InternalSensidl.g:1413:3: rule__EncodingSettings__CodingAssignment_2
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
    // InternalSensidl.g:1421:1: rule__EncodingSettings__Group__3 : rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 ;
    public final void rule__EncodingSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1425:1: ( rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4 )
            // InternalSensidl.g:1426:2: rule__EncodingSettings__Group__3__Impl rule__EncodingSettings__Group__4
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
    // InternalSensidl.g:1433:1: rule__EncodingSettings__Group__3__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1437:1: ( ( ',' ) )
            // InternalSensidl.g:1438:1: ( ',' )
            {
            // InternalSensidl.g:1438:1: ( ',' )
            // InternalSensidl.g:1439:2: ','
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
    // InternalSensidl.g:1448:1: rule__EncodingSettings__Group__4 : rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 ;
    public final void rule__EncodingSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1452:1: ( rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5 )
            // InternalSensidl.g:1453:2: rule__EncodingSettings__Group__4__Impl rule__EncodingSettings__Group__5
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
    // InternalSensidl.g:1460:1: rule__EncodingSettings__Group__4__Impl : ( 'endianness' ) ;
    public final void rule__EncodingSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1464:1: ( ( 'endianness' ) )
            // InternalSensidl.g:1465:1: ( 'endianness' )
            {
            // InternalSensidl.g:1465:1: ( 'endianness' )
            // InternalSensidl.g:1466:2: 'endianness'
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
    // InternalSensidl.g:1475:1: rule__EncodingSettings__Group__5 : rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 ;
    public final void rule__EncodingSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1479:1: ( rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6 )
            // InternalSensidl.g:1480:2: rule__EncodingSettings__Group__5__Impl rule__EncodingSettings__Group__6
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
    // InternalSensidl.g:1487:1: rule__EncodingSettings__Group__5__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1491:1: ( ( ':' ) )
            // InternalSensidl.g:1492:1: ( ':' )
            {
            // InternalSensidl.g:1492:1: ( ':' )
            // InternalSensidl.g:1493:2: ':'
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
    // InternalSensidl.g:1502:1: rule__EncodingSettings__Group__6 : rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 ;
    public final void rule__EncodingSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1506:1: ( rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7 )
            // InternalSensidl.g:1507:2: rule__EncodingSettings__Group__6__Impl rule__EncodingSettings__Group__7
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
    // InternalSensidl.g:1514:1: rule__EncodingSettings__Group__6__Impl : ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) ;
    public final void rule__EncodingSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1518:1: ( ( ( rule__EncodingSettings__EndiannessAssignment_6 ) ) )
            // InternalSensidl.g:1519:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            {
            // InternalSensidl.g:1519:1: ( ( rule__EncodingSettings__EndiannessAssignment_6 ) )
            // InternalSensidl.g:1520:2: ( rule__EncodingSettings__EndiannessAssignment_6 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getEndiannessAssignment_6()); 
            // InternalSensidl.g:1521:2: ( rule__EncodingSettings__EndiannessAssignment_6 )
            // InternalSensidl.g:1521:3: rule__EncodingSettings__EndiannessAssignment_6
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
    // InternalSensidl.g:1529:1: rule__EncodingSettings__Group__7 : rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 ;
    public final void rule__EncodingSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1533:1: ( rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8 )
            // InternalSensidl.g:1534:2: rule__EncodingSettings__Group__7__Impl rule__EncodingSettings__Group__8
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
    // InternalSensidl.g:1541:1: rule__EncodingSettings__Group__7__Impl : ( ',' ) ;
    public final void rule__EncodingSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1545:1: ( ( ',' ) )
            // InternalSensidl.g:1546:1: ( ',' )
            {
            // InternalSensidl.g:1546:1: ( ',' )
            // InternalSensidl.g:1547:2: ','
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
    // InternalSensidl.g:1556:1: rule__EncodingSettings__Group__8 : rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 ;
    public final void rule__EncodingSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1560:1: ( rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9 )
            // InternalSensidl.g:1561:2: rule__EncodingSettings__Group__8__Impl rule__EncodingSettings__Group__9
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
    // InternalSensidl.g:1568:1: rule__EncodingSettings__Group__8__Impl : ( 'alignment' ) ;
    public final void rule__EncodingSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1572:1: ( ( 'alignment' ) )
            // InternalSensidl.g:1573:1: ( 'alignment' )
            {
            // InternalSensidl.g:1573:1: ( 'alignment' )
            // InternalSensidl.g:1574:2: 'alignment'
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
    // InternalSensidl.g:1583:1: rule__EncodingSettings__Group__9 : rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 ;
    public final void rule__EncodingSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1587:1: ( rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10 )
            // InternalSensidl.g:1588:2: rule__EncodingSettings__Group__9__Impl rule__EncodingSettings__Group__10
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
    // InternalSensidl.g:1595:1: rule__EncodingSettings__Group__9__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1599:1: ( ( ':' ) )
            // InternalSensidl.g:1600:1: ( ':' )
            {
            // InternalSensidl.g:1600:1: ( ':' )
            // InternalSensidl.g:1601:2: ':'
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
    // InternalSensidl.g:1610:1: rule__EncodingSettings__Group__10 : rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 ;
    public final void rule__EncodingSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1614:1: ( rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11 )
            // InternalSensidl.g:1615:2: rule__EncodingSettings__Group__10__Impl rule__EncodingSettings__Group__11
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
    // InternalSensidl.g:1622:1: rule__EncodingSettings__Group__10__Impl : ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) ;
    public final void rule__EncodingSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1626:1: ( ( ( rule__EncodingSettings__AlignmentAssignment_10 ) ) )
            // InternalSensidl.g:1627:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            {
            // InternalSensidl.g:1627:1: ( ( rule__EncodingSettings__AlignmentAssignment_10 ) )
            // InternalSensidl.g:1628:2: ( rule__EncodingSettings__AlignmentAssignment_10 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getAlignmentAssignment_10()); 
            // InternalSensidl.g:1629:2: ( rule__EncodingSettings__AlignmentAssignment_10 )
            // InternalSensidl.g:1629:3: rule__EncodingSettings__AlignmentAssignment_10
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
    // InternalSensidl.g:1637:1: rule__EncodingSettings__Group__11 : rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 ;
    public final void rule__EncodingSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1641:1: ( rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12 )
            // InternalSensidl.g:1642:2: rule__EncodingSettings__Group__11__Impl rule__EncodingSettings__Group__12
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
    // InternalSensidl.g:1649:1: rule__EncodingSettings__Group__11__Impl : ( 'BIT' ) ;
    public final void rule__EncodingSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1653:1: ( ( 'BIT' ) )
            // InternalSensidl.g:1654:1: ( 'BIT' )
            {
            // InternalSensidl.g:1654:1: ( 'BIT' )
            // InternalSensidl.g:1655:2: 'BIT'
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
    // InternalSensidl.g:1664:1: rule__EncodingSettings__Group__12 : rule__EncodingSettings__Group__12__Impl ;
    public final void rule__EncodingSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1668:1: ( rule__EncodingSettings__Group__12__Impl )
            // InternalSensidl.g:1669:2: rule__EncodingSettings__Group__12__Impl
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
    // InternalSensidl.g:1675:1: rule__EncodingSettings__Group__12__Impl : ( ( rule__EncodingSettings__Group_12__0 )? ) ;
    public final void rule__EncodingSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1679:1: ( ( ( rule__EncodingSettings__Group_12__0 )? ) )
            // InternalSensidl.g:1680:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            {
            // InternalSensidl.g:1680:1: ( ( rule__EncodingSettings__Group_12__0 )? )
            // InternalSensidl.g:1681:2: ( rule__EncodingSettings__Group_12__0 )?
            {
             before(grammarAccess.getEncodingSettingsAccess().getGroup_12()); 
            // InternalSensidl.g:1682:2: ( rule__EncodingSettings__Group_12__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSensidl.g:1682:3: rule__EncodingSettings__Group_12__0
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
    // InternalSensidl.g:1691:1: rule__EncodingSettings__Group_12__0 : rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 ;
    public final void rule__EncodingSettings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1695:1: ( rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1 )
            // InternalSensidl.g:1696:2: rule__EncodingSettings__Group_12__0__Impl rule__EncodingSettings__Group_12__1
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
    // InternalSensidl.g:1703:1: rule__EncodingSettings__Group_12__0__Impl : ( 'with identifier' ) ;
    public final void rule__EncodingSettings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1707:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:1708:1: ( 'with identifier' )
            {
            // InternalSensidl.g:1708:1: ( 'with identifier' )
            // InternalSensidl.g:1709:2: 'with identifier'
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
    // InternalSensidl.g:1718:1: rule__EncodingSettings__Group_12__1 : rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 ;
    public final void rule__EncodingSettings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1722:1: ( rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2 )
            // InternalSensidl.g:1723:2: rule__EncodingSettings__Group_12__1__Impl rule__EncodingSettings__Group_12__2
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
    // InternalSensidl.g:1730:1: rule__EncodingSettings__Group_12__1__Impl : ( ':' ) ;
    public final void rule__EncodingSettings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1734:1: ( ( ':' ) )
            // InternalSensidl.g:1735:1: ( ':' )
            {
            // InternalSensidl.g:1735:1: ( ':' )
            // InternalSensidl.g:1736:2: ':'
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
    // InternalSensidl.g:1745:1: rule__EncodingSettings__Group_12__2 : rule__EncodingSettings__Group_12__2__Impl ;
    public final void rule__EncodingSettings__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1749:1: ( rule__EncodingSettings__Group_12__2__Impl )
            // InternalSensidl.g:1750:2: rule__EncodingSettings__Group_12__2__Impl
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
    // InternalSensidl.g:1756:1: rule__EncodingSettings__Group_12__2__Impl : ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) ;
    public final void rule__EncodingSettings__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1760:1: ( ( ( rule__EncodingSettings__IDAssignment_12_2 ) ) )
            // InternalSensidl.g:1761:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            {
            // InternalSensidl.g:1761:1: ( ( rule__EncodingSettings__IDAssignment_12_2 ) )
            // InternalSensidl.g:1762:2: ( rule__EncodingSettings__IDAssignment_12_2 )
            {
             before(grammarAccess.getEncodingSettingsAccess().getIDAssignment_12_2()); 
            // InternalSensidl.g:1763:2: ( rule__EncodingSettings__IDAssignment_12_2 )
            // InternalSensidl.g:1763:3: rule__EncodingSettings__IDAssignment_12_2
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
    // InternalSensidl.g:1772:1: rule__SensorDataDescription__Group__0 : rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 ;
    public final void rule__SensorDataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1776:1: ( rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1 )
            // InternalSensidl.g:1777:2: rule__SensorDataDescription__Group__0__Impl rule__SensorDataDescription__Group__1
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
    // InternalSensidl.g:1784:1: rule__SensorDataDescription__Group__0__Impl : ( 'sensorData' ) ;
    public final void rule__SensorDataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1788:1: ( ( 'sensorData' ) )
            // InternalSensidl.g:1789:1: ( 'sensorData' )
            {
            // InternalSensidl.g:1789:1: ( 'sensorData' )
            // InternalSensidl.g:1790:2: 'sensorData'
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
    // InternalSensidl.g:1799:1: rule__SensorDataDescription__Group__1 : rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 ;
    public final void rule__SensorDataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1803:1: ( rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2 )
            // InternalSensidl.g:1804:2: rule__SensorDataDescription__Group__1__Impl rule__SensorDataDescription__Group__2
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
    // InternalSensidl.g:1811:1: rule__SensorDataDescription__Group__1__Impl : ( () ) ;
    public final void rule__SensorDataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1815:1: ( ( () ) )
            // InternalSensidl.g:1816:1: ( () )
            {
            // InternalSensidl.g:1816:1: ( () )
            // InternalSensidl.g:1817:2: ()
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getSensorDataDescriptionAction_1()); 
            // InternalSensidl.g:1818:2: ()
            // InternalSensidl.g:1818:3: 
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
    // InternalSensidl.g:1826:1: rule__SensorDataDescription__Group__2 : rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 ;
    public final void rule__SensorDataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1830:1: ( rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3 )
            // InternalSensidl.g:1831:2: rule__SensorDataDescription__Group__2__Impl rule__SensorDataDescription__Group__3
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
    // InternalSensidl.g:1838:1: rule__SensorDataDescription__Group__2__Impl : ( ( rule__SensorDataDescription__Group_2__0 )? ) ;
    public final void rule__SensorDataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1842:1: ( ( ( rule__SensorDataDescription__Group_2__0 )? ) )
            // InternalSensidl.g:1843:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            {
            // InternalSensidl.g:1843:1: ( ( rule__SensorDataDescription__Group_2__0 )? )
            // InternalSensidl.g:1844:2: ( rule__SensorDataDescription__Group_2__0 )?
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getGroup_2()); 
            // InternalSensidl.g:1845:2: ( rule__SensorDataDescription__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSensidl.g:1845:3: rule__SensorDataDescription__Group_2__0
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
    // InternalSensidl.g:1853:1: rule__SensorDataDescription__Group__3 : rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 ;
    public final void rule__SensorDataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1857:1: ( rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4 )
            // InternalSensidl.g:1858:2: rule__SensorDataDescription__Group__3__Impl rule__SensorDataDescription__Group__4
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
    // InternalSensidl.g:1865:1: rule__SensorDataDescription__Group__3__Impl : ( '{' ) ;
    public final void rule__SensorDataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1869:1: ( ( '{' ) )
            // InternalSensidl.g:1870:1: ( '{' )
            {
            // InternalSensidl.g:1870:1: ( '{' )
            // InternalSensidl.g:1871:2: '{'
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
    // InternalSensidl.g:1880:1: rule__SensorDataDescription__Group__4 : rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 ;
    public final void rule__SensorDataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1884:1: ( rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5 )
            // InternalSensidl.g:1885:2: rule__SensorDataDescription__Group__4__Impl rule__SensorDataDescription__Group__5
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
    // InternalSensidl.g:1892:1: rule__SensorDataDescription__Group__4__Impl : ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) ;
    public final void rule__SensorDataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1896:1: ( ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* ) )
            // InternalSensidl.g:1897:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            {
            // InternalSensidl.g:1897:1: ( ( rule__SensorDataDescription__DataSetsAssignment_4 )* )
            // InternalSensidl.g:1898:2: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getDataSetsAssignment_4()); 
            // InternalSensidl.g:1899:2: ( rule__SensorDataDescription__DataSetsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSensidl.g:1899:3: rule__SensorDataDescription__DataSetsAssignment_4
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
    // InternalSensidl.g:1907:1: rule__SensorDataDescription__Group__5 : rule__SensorDataDescription__Group__5__Impl ;
    public final void rule__SensorDataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1911:1: ( rule__SensorDataDescription__Group__5__Impl )
            // InternalSensidl.g:1912:2: rule__SensorDataDescription__Group__5__Impl
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
    // InternalSensidl.g:1918:1: rule__SensorDataDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorDataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1922:1: ( ( '}' ) )
            // InternalSensidl.g:1923:1: ( '}' )
            {
            // InternalSensidl.g:1923:1: ( '}' )
            // InternalSensidl.g:1924:2: '}'
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
            // InternalSensidl.g:1952:2: 'with identifier'
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
    // InternalSensidl.g:1961:1: rule__SensorDataDescription__Group_2__1 : rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 ;
    public final void rule__SensorDataDescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1965:1: ( rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2 )
            // InternalSensidl.g:1966:2: rule__SensorDataDescription__Group_2__1__Impl rule__SensorDataDescription__Group_2__2
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
    // InternalSensidl.g:1973:1: rule__SensorDataDescription__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SensorDataDescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1977:1: ( ( ':' ) )
            // InternalSensidl.g:1978:1: ( ':' )
            {
            // InternalSensidl.g:1978:1: ( ':' )
            // InternalSensidl.g:1979:2: ':'
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
    // InternalSensidl.g:1988:1: rule__SensorDataDescription__Group_2__2 : rule__SensorDataDescription__Group_2__2__Impl ;
    public final void rule__SensorDataDescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:1992:1: ( rule__SensorDataDescription__Group_2__2__Impl )
            // InternalSensidl.g:1993:2: rule__SensorDataDescription__Group_2__2__Impl
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
    // InternalSensidl.g:1999:1: rule__SensorDataDescription__Group_2__2__Impl : ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) ;
    public final void rule__SensorDataDescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2003:1: ( ( ( rule__SensorDataDescription__IDAssignment_2_2 ) ) )
            // InternalSensidl.g:2004:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            {
            // InternalSensidl.g:2004:1: ( ( rule__SensorDataDescription__IDAssignment_2_2 ) )
            // InternalSensidl.g:2005:2: ( rule__SensorDataDescription__IDAssignment_2_2 )
            {
             before(grammarAccess.getSensorDataDescriptionAccess().getIDAssignment_2_2()); 
            // InternalSensidl.g:2006:2: ( rule__SensorDataDescription__IDAssignment_2_2 )
            // InternalSensidl.g:2006:3: rule__SensorDataDescription__IDAssignment_2_2
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
    // InternalSensidl.g:2015:1: rule__DataSet__Group__0 : rule__DataSet__Group__0__Impl rule__DataSet__Group__1 ;
    public final void rule__DataSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2019:1: ( rule__DataSet__Group__0__Impl rule__DataSet__Group__1 )
            // InternalSensidl.g:2020:2: rule__DataSet__Group__0__Impl rule__DataSet__Group__1
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
    // InternalSensidl.g:2027:1: rule__DataSet__Group__0__Impl : ( 'dataSet' ) ;
    public final void rule__DataSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2031:1: ( ( 'dataSet' ) )
            // InternalSensidl.g:2032:1: ( 'dataSet' )
            {
            // InternalSensidl.g:2032:1: ( 'dataSet' )
            // InternalSensidl.g:2033:2: 'dataSet'
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
    // InternalSensidl.g:2042:1: rule__DataSet__Group__1 : rule__DataSet__Group__1__Impl rule__DataSet__Group__2 ;
    public final void rule__DataSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2046:1: ( rule__DataSet__Group__1__Impl rule__DataSet__Group__2 )
            // InternalSensidl.g:2047:2: rule__DataSet__Group__1__Impl rule__DataSet__Group__2
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
    // InternalSensidl.g:2054:1: rule__DataSet__Group__1__Impl : ( ( rule__DataSet__NameAssignment_1 ) ) ;
    public final void rule__DataSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2058:1: ( ( ( rule__DataSet__NameAssignment_1 ) ) )
            // InternalSensidl.g:2059:1: ( ( rule__DataSet__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2059:1: ( ( rule__DataSet__NameAssignment_1 ) )
            // InternalSensidl.g:2060:2: ( rule__DataSet__NameAssignment_1 )
            {
             before(grammarAccess.getDataSetAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2061:2: ( rule__DataSet__NameAssignment_1 )
            // InternalSensidl.g:2061:3: rule__DataSet__NameAssignment_1
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
    // InternalSensidl.g:2069:1: rule__DataSet__Group__2 : rule__DataSet__Group__2__Impl rule__DataSet__Group__3 ;
    public final void rule__DataSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2073:1: ( rule__DataSet__Group__2__Impl rule__DataSet__Group__3 )
            // InternalSensidl.g:2074:2: rule__DataSet__Group__2__Impl rule__DataSet__Group__3
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
    // InternalSensidl.g:2081:1: rule__DataSet__Group__2__Impl : ( ( rule__DataSet__Group_2__0 )? ) ;
    public final void rule__DataSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2085:1: ( ( ( rule__DataSet__Group_2__0 )? ) )
            // InternalSensidl.g:2086:1: ( ( rule__DataSet__Group_2__0 )? )
            {
            // InternalSensidl.g:2086:1: ( ( rule__DataSet__Group_2__0 )? )
            // InternalSensidl.g:2087:2: ( rule__DataSet__Group_2__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_2()); 
            // InternalSensidl.g:2088:2: ( rule__DataSet__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSensidl.g:2088:3: rule__DataSet__Group_2__0
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
    // InternalSensidl.g:2096:1: rule__DataSet__Group__3 : rule__DataSet__Group__3__Impl rule__DataSet__Group__4 ;
    public final void rule__DataSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2100:1: ( rule__DataSet__Group__3__Impl rule__DataSet__Group__4 )
            // InternalSensidl.g:2101:2: rule__DataSet__Group__3__Impl rule__DataSet__Group__4
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
    // InternalSensidl.g:2108:1: rule__DataSet__Group__3__Impl : ( ( rule__DataSet__Group_3__0 )* ) ;
    public final void rule__DataSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2112:1: ( ( ( rule__DataSet__Group_3__0 )* ) )
            // InternalSensidl.g:2113:1: ( ( rule__DataSet__Group_3__0 )* )
            {
            // InternalSensidl.g:2113:1: ( ( rule__DataSet__Group_3__0 )* )
            // InternalSensidl.g:2114:2: ( rule__DataSet__Group_3__0 )*
            {
             before(grammarAccess.getDataSetAccess().getGroup_3()); 
            // InternalSensidl.g:2115:2: ( rule__DataSet__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSensidl.g:2115:3: rule__DataSet__Group_3__0
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
    // InternalSensidl.g:2123:1: rule__DataSet__Group__4 : rule__DataSet__Group__4__Impl rule__DataSet__Group__5 ;
    public final void rule__DataSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2127:1: ( rule__DataSet__Group__4__Impl rule__DataSet__Group__5 )
            // InternalSensidl.g:2128:2: rule__DataSet__Group__4__Impl rule__DataSet__Group__5
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
    // InternalSensidl.g:2135:1: rule__DataSet__Group__4__Impl : ( ( rule__DataSet__Group_4__0 )? ) ;
    public final void rule__DataSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2139:1: ( ( ( rule__DataSet__Group_4__0 )? ) )
            // InternalSensidl.g:2140:1: ( ( rule__DataSet__Group_4__0 )? )
            {
            // InternalSensidl.g:2140:1: ( ( rule__DataSet__Group_4__0 )? )
            // InternalSensidl.g:2141:2: ( rule__DataSet__Group_4__0 )?
            {
             before(grammarAccess.getDataSetAccess().getGroup_4()); 
            // InternalSensidl.g:2142:2: ( rule__DataSet__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSensidl.g:2142:3: rule__DataSet__Group_4__0
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
    // InternalSensidl.g:2150:1: rule__DataSet__Group__5 : rule__DataSet__Group__5__Impl rule__DataSet__Group__6 ;
    public final void rule__DataSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2154:1: ( rule__DataSet__Group__5__Impl rule__DataSet__Group__6 )
            // InternalSensidl.g:2155:2: rule__DataSet__Group__5__Impl rule__DataSet__Group__6
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
    // InternalSensidl.g:2162:1: rule__DataSet__Group__5__Impl : ( ( rule__DataSet__DescriptionAssignment_5 )? ) ;
    public final void rule__DataSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2166:1: ( ( ( rule__DataSet__DescriptionAssignment_5 )? ) )
            // InternalSensidl.g:2167:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            {
            // InternalSensidl.g:2167:1: ( ( rule__DataSet__DescriptionAssignment_5 )? )
            // InternalSensidl.g:2168:2: ( rule__DataSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getDataSetAccess().getDescriptionAssignment_5()); 
            // InternalSensidl.g:2169:2: ( rule__DataSet__DescriptionAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DESCRIPTION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSensidl.g:2169:3: rule__DataSet__DescriptionAssignment_5
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
    // InternalSensidl.g:2177:1: rule__DataSet__Group__6 : rule__DataSet__Group__6__Impl rule__DataSet__Group__7 ;
    public final void rule__DataSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2181:1: ( rule__DataSet__Group__6__Impl rule__DataSet__Group__7 )
            // InternalSensidl.g:2182:2: rule__DataSet__Group__6__Impl rule__DataSet__Group__7
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
    // InternalSensidl.g:2189:1: rule__DataSet__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2193:1: ( ( '{' ) )
            // InternalSensidl.g:2194:1: ( '{' )
            {
            // InternalSensidl.g:2194:1: ( '{' )
            // InternalSensidl.g:2195:2: '{'
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
    // InternalSensidl.g:2204:1: rule__DataSet__Group__7 : rule__DataSet__Group__7__Impl rule__DataSet__Group__8 ;
    public final void rule__DataSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2208:1: ( rule__DataSet__Group__7__Impl rule__DataSet__Group__8 )
            // InternalSensidl.g:2209:2: rule__DataSet__Group__7__Impl rule__DataSet__Group__8
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
    // InternalSensidl.g:2216:1: rule__DataSet__Group__7__Impl : ( ( rule__DataSet__Alternatives_7 )* ) ;
    public final void rule__DataSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2220:1: ( ( ( rule__DataSet__Alternatives_7 )* ) )
            // InternalSensidl.g:2221:1: ( ( rule__DataSet__Alternatives_7 )* )
            {
            // InternalSensidl.g:2221:1: ( ( rule__DataSet__Alternatives_7 )* )
            // InternalSensidl.g:2222:2: ( rule__DataSet__Alternatives_7 )*
            {
             before(grammarAccess.getDataSetAccess().getAlternatives_7()); 
            // InternalSensidl.g:2223:2: ( rule__DataSet__Alternatives_7 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==61||(LA29_0>=63 && LA29_0<=65)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSensidl.g:2223:3: rule__DataSet__Alternatives_7
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
    // InternalSensidl.g:2231:1: rule__DataSet__Group__8 : rule__DataSet__Group__8__Impl ;
    public final void rule__DataSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2235:1: ( rule__DataSet__Group__8__Impl )
            // InternalSensidl.g:2236:2: rule__DataSet__Group__8__Impl
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
    // InternalSensidl.g:2242:1: rule__DataSet__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2246:1: ( ( '}' ) )
            // InternalSensidl.g:2247:1: ( '}' )
            {
            // InternalSensidl.g:2247:1: ( '}' )
            // InternalSensidl.g:2248:2: '}'
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
    // InternalSensidl.g:2258:1: rule__DataSet__Group_2__0 : rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 ;
    public final void rule__DataSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2262:1: ( rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1 )
            // InternalSensidl.g:2263:2: rule__DataSet__Group_2__0__Impl rule__DataSet__Group_2__1
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
    // InternalSensidl.g:2270:1: rule__DataSet__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__DataSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2274:1: ( ( 'uses' ) )
            // InternalSensidl.g:2275:1: ( 'uses' )
            {
            // InternalSensidl.g:2275:1: ( 'uses' )
            // InternalSensidl.g:2276:2: 'uses'
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
    // InternalSensidl.g:2285:1: rule__DataSet__Group_2__1 : rule__DataSet__Group_2__1__Impl ;
    public final void rule__DataSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2289:1: ( rule__DataSet__Group_2__1__Impl )
            // InternalSensidl.g:2290:2: rule__DataSet__Group_2__1__Impl
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
    // InternalSensidl.g:2296:1: rule__DataSet__Group_2__1__Impl : ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) ) ;
    public final void rule__DataSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2300:1: ( ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) ) )
            // InternalSensidl.g:2301:1: ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) )
            {
            // InternalSensidl.g:2301:1: ( ( rule__DataSet__UsedDataSetsAssignment_2_1 ) )
            // InternalSensidl.g:2302:2: ( rule__DataSet__UsedDataSetsAssignment_2_1 )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsAssignment_2_1()); 
            // InternalSensidl.g:2303:2: ( rule__DataSet__UsedDataSetsAssignment_2_1 )
            // InternalSensidl.g:2303:3: rule__DataSet__UsedDataSetsAssignment_2_1
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
    // InternalSensidl.g:2312:1: rule__DataSet__Group_3__0 : rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 ;
    public final void rule__DataSet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2316:1: ( rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1 )
            // InternalSensidl.g:2317:2: rule__DataSet__Group_3__0__Impl rule__DataSet__Group_3__1
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
    // InternalSensidl.g:2324:1: rule__DataSet__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataSet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2328:1: ( ( ',' ) )
            // InternalSensidl.g:2329:1: ( ',' )
            {
            // InternalSensidl.g:2329:1: ( ',' )
            // InternalSensidl.g:2330:2: ','
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
    // InternalSensidl.g:2339:1: rule__DataSet__Group_3__1 : rule__DataSet__Group_3__1__Impl ;
    public final void rule__DataSet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2343:1: ( rule__DataSet__Group_3__1__Impl )
            // InternalSensidl.g:2344:2: rule__DataSet__Group_3__1__Impl
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
    // InternalSensidl.g:2350:1: rule__DataSet__Group_3__1__Impl : ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) ) ;
    public final void rule__DataSet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2354:1: ( ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) ) )
            // InternalSensidl.g:2355:1: ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) )
            {
            // InternalSensidl.g:2355:1: ( ( rule__DataSet__UsedDataSetsAssignment_3_1 ) )
            // InternalSensidl.g:2356:2: ( rule__DataSet__UsedDataSetsAssignment_3_1 )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsAssignment_3_1()); 
            // InternalSensidl.g:2357:2: ( rule__DataSet__UsedDataSetsAssignment_3_1 )
            // InternalSensidl.g:2357:3: rule__DataSet__UsedDataSetsAssignment_3_1
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
    // InternalSensidl.g:2366:1: rule__DataSet__Group_4__0 : rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 ;
    public final void rule__DataSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2370:1: ( rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1 )
            // InternalSensidl.g:2371:2: rule__DataSet__Group_4__0__Impl rule__DataSet__Group_4__1
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
    // InternalSensidl.g:2378:1: rule__DataSet__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__DataSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2382:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2383:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2383:1: ( 'with identifier' )
            // InternalSensidl.g:2384:2: 'with identifier'
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
    // InternalSensidl.g:2393:1: rule__DataSet__Group_4__1 : rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 ;
    public final void rule__DataSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2397:1: ( rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2 )
            // InternalSensidl.g:2398:2: rule__DataSet__Group_4__1__Impl rule__DataSet__Group_4__2
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
    // InternalSensidl.g:2405:1: rule__DataSet__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DataSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2409:1: ( ( ':' ) )
            // InternalSensidl.g:2410:1: ( ':' )
            {
            // InternalSensidl.g:2410:1: ( ':' )
            // InternalSensidl.g:2411:2: ':'
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
    // InternalSensidl.g:2420:1: rule__DataSet__Group_4__2 : rule__DataSet__Group_4__2__Impl ;
    public final void rule__DataSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2424:1: ( rule__DataSet__Group_4__2__Impl )
            // InternalSensidl.g:2425:2: rule__DataSet__Group_4__2__Impl
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
    // InternalSensidl.g:2431:1: rule__DataSet__Group_4__2__Impl : ( ( rule__DataSet__IDAssignment_4_2 ) ) ;
    public final void rule__DataSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2435:1: ( ( ( rule__DataSet__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:2436:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:2436:1: ( ( rule__DataSet__IDAssignment_4_2 ) )
            // InternalSensidl.g:2437:2: ( rule__DataSet__IDAssignment_4_2 )
            {
             before(grammarAccess.getDataSetAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:2438:2: ( rule__DataSet__IDAssignment_4_2 )
            // InternalSensidl.g:2438:3: rule__DataSet__IDAssignment_4_2
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
    // InternalSensidl.g:2447:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2451:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalSensidl.g:2452:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalSensidl.g:2459:1: rule__Method__Group__0__Impl : ( ( rule__Method__Alternatives_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2463:1: ( ( ( rule__Method__Alternatives_0 )? ) )
            // InternalSensidl.g:2464:1: ( ( rule__Method__Alternatives_0 )? )
            {
            // InternalSensidl.g:2464:1: ( ( rule__Method__Alternatives_0 )? )
            // InternalSensidl.g:2465:2: ( rule__Method__Alternatives_0 )?
            {
             before(grammarAccess.getMethodAccess().getAlternatives_0()); 
            // InternalSensidl.g:2466:2: ( rule__Method__Alternatives_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61||(LA30_0>=63 && LA30_0<=65)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSensidl.g:2466:3: rule__Method__Alternatives_0
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
    // InternalSensidl.g:2474:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2478:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalSensidl.g:2479:2: rule__Method__Group__1__Impl rule__Method__Group__2
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
    // InternalSensidl.g:2486:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2490:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalSensidl.g:2491:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2491:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalSensidl.g:2492:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2493:2: ( rule__Method__NameAssignment_1 )
            // InternalSensidl.g:2493:3: rule__Method__NameAssignment_1
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
    // InternalSensidl.g:2501:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2505:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalSensidl.g:2506:2: rule__Method__Group__2__Impl rule__Method__Group__3
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
    // InternalSensidl.g:2513:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2517:1: ( ( '(' ) )
            // InternalSensidl.g:2518:1: ( '(' )
            {
            // InternalSensidl.g:2518:1: ( '(' )
            // InternalSensidl.g:2519:2: '('
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
    // InternalSensidl.g:2528:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2532:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalSensidl.g:2533:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalSensidl.g:2540:1: rule__Method__Group__3__Impl : ( ( rule__Method__ParameterAssignment_3 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2544:1: ( ( ( rule__Method__ParameterAssignment_3 )? ) )
            // InternalSensidl.g:2545:1: ( ( rule__Method__ParameterAssignment_3 )? )
            {
            // InternalSensidl.g:2545:1: ( ( rule__Method__ParameterAssignment_3 )? )
            // InternalSensidl.g:2546:2: ( rule__Method__ParameterAssignment_3 )?
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_3()); 
            // InternalSensidl.g:2547:2: ( rule__Method__ParameterAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=16 && LA31_0<=27)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSensidl.g:2547:3: rule__Method__ParameterAssignment_3
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
    // InternalSensidl.g:2555:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2559:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalSensidl.g:2560:2: rule__Method__Group__4__Impl rule__Method__Group__5
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
    // InternalSensidl.g:2567:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )* ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2571:1: ( ( ( rule__Method__Group_4__0 )* ) )
            // InternalSensidl.g:2572:1: ( ( rule__Method__Group_4__0 )* )
            {
            // InternalSensidl.g:2572:1: ( ( rule__Method__Group_4__0 )* )
            // InternalSensidl.g:2573:2: ( rule__Method__Group_4__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalSensidl.g:2574:2: ( rule__Method__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSensidl.g:2574:3: rule__Method__Group_4__0
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
    // InternalSensidl.g:2582:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2586:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalSensidl.g:2587:2: rule__Method__Group__5__Impl rule__Method__Group__6
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
    // InternalSensidl.g:2594:1: rule__Method__Group__5__Impl : ( ')' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2598:1: ( ( ')' ) )
            // InternalSensidl.g:2599:1: ( ')' )
            {
            // InternalSensidl.g:2599:1: ( ')' )
            // InternalSensidl.g:2600:2: ')'
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
    // InternalSensidl.g:2609:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2613:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalSensidl.g:2614:2: rule__Method__Group__6__Impl rule__Method__Group__7
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
    // InternalSensidl.g:2621:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2625:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalSensidl.g:2626:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalSensidl.g:2626:1: ( ( rule__Method__Group_6__0 )? )
            // InternalSensidl.g:2627:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalSensidl.g:2628:2: ( rule__Method__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSensidl.g:2628:3: rule__Method__Group_6__0
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
    // InternalSensidl.g:2636:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2640:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalSensidl.g:2641:2: rule__Method__Group__7__Impl rule__Method__Group__8
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
    // InternalSensidl.g:2648:1: rule__Method__Group__7__Impl : ( 'as' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2652:1: ( ( 'as' ) )
            // InternalSensidl.g:2653:1: ( 'as' )
            {
            // InternalSensidl.g:2653:1: ( 'as' )
            // InternalSensidl.g:2654:2: 'as'
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
    // InternalSensidl.g:2663:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2667:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalSensidl.g:2668:2: rule__Method__Group__8__Impl rule__Method__Group__9
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
    // InternalSensidl.g:2675:1: rule__Method__Group__8__Impl : ( 'Method' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2679:1: ( ( 'Method' ) )
            // InternalSensidl.g:2680:1: ( 'Method' )
            {
            // InternalSensidl.g:2680:1: ( 'Method' )
            // InternalSensidl.g:2681:2: 'Method'
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
    // InternalSensidl.g:2690:1: rule__Method__Group__9 : rule__Method__Group__9__Impl rule__Method__Group__10 ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2694:1: ( rule__Method__Group__9__Impl rule__Method__Group__10 )
            // InternalSensidl.g:2695:2: rule__Method__Group__9__Impl rule__Method__Group__10
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
    // InternalSensidl.g:2702:1: rule__Method__Group__9__Impl : ( ( rule__Method__Group_9__0 )? ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2706:1: ( ( ( rule__Method__Group_9__0 )? ) )
            // InternalSensidl.g:2707:1: ( ( rule__Method__Group_9__0 )? )
            {
            // InternalSensidl.g:2707:1: ( ( rule__Method__Group_9__0 )? )
            // InternalSensidl.g:2708:2: ( rule__Method__Group_9__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_9()); 
            // InternalSensidl.g:2709:2: ( rule__Method__Group_9__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSensidl.g:2709:3: rule__Method__Group_9__0
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
    // InternalSensidl.g:2717:1: rule__Method__Group__10 : rule__Method__Group__10__Impl ;
    public final void rule__Method__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2721:1: ( rule__Method__Group__10__Impl )
            // InternalSensidl.g:2722:2: rule__Method__Group__10__Impl
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
    // InternalSensidl.g:2728:1: rule__Method__Group__10__Impl : ( ( rule__Method__DescriptionAssignment_10 )? ) ;
    public final void rule__Method__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2732:1: ( ( ( rule__Method__DescriptionAssignment_10 )? ) )
            // InternalSensidl.g:2733:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            {
            // InternalSensidl.g:2733:1: ( ( rule__Method__DescriptionAssignment_10 )? )
            // InternalSensidl.g:2734:2: ( rule__Method__DescriptionAssignment_10 )?
            {
             before(grammarAccess.getMethodAccess().getDescriptionAssignment_10()); 
            // InternalSensidl.g:2735:2: ( rule__Method__DescriptionAssignment_10 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DESCRIPTION) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSensidl.g:2735:3: rule__Method__DescriptionAssignment_10
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
    // InternalSensidl.g:2744:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2748:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalSensidl.g:2749:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
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
    // InternalSensidl.g:2756:1: rule__Method__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2760:1: ( ( ',' ) )
            // InternalSensidl.g:2761:1: ( ',' )
            {
            // InternalSensidl.g:2761:1: ( ',' )
            // InternalSensidl.g:2762:2: ','
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
    // InternalSensidl.g:2771:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2775:1: ( rule__Method__Group_4__1__Impl )
            // InternalSensidl.g:2776:2: rule__Method__Group_4__1__Impl
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
    // InternalSensidl.g:2782:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ParameterAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2786:1: ( ( ( rule__Method__ParameterAssignment_4_1 ) ) )
            // InternalSensidl.g:2787:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            {
            // InternalSensidl.g:2787:1: ( ( rule__Method__ParameterAssignment_4_1 ) )
            // InternalSensidl.g:2788:2: ( rule__Method__ParameterAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getParameterAssignment_4_1()); 
            // InternalSensidl.g:2789:2: ( rule__Method__ParameterAssignment_4_1 )
            // InternalSensidl.g:2789:3: rule__Method__ParameterAssignment_4_1
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
    // InternalSensidl.g:2798:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2802:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalSensidl.g:2803:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
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
    // InternalSensidl.g:2810:1: rule__Method__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2814:1: ( ( ':' ) )
            // InternalSensidl.g:2815:1: ( ':' )
            {
            // InternalSensidl.g:2815:1: ( ':' )
            // InternalSensidl.g:2816:2: ':'
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
    // InternalSensidl.g:2825:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2829:1: ( rule__Method__Group_6__1__Impl )
            // InternalSensidl.g:2830:2: rule__Method__Group_6__1__Impl
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
    // InternalSensidl.g:2836:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Alternatives_6_1 ) ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2840:1: ( ( ( rule__Method__Alternatives_6_1 ) ) )
            // InternalSensidl.g:2841:1: ( ( rule__Method__Alternatives_6_1 ) )
            {
            // InternalSensidl.g:2841:1: ( ( rule__Method__Alternatives_6_1 ) )
            // InternalSensidl.g:2842:2: ( rule__Method__Alternatives_6_1 )
            {
             before(grammarAccess.getMethodAccess().getAlternatives_6_1()); 
            // InternalSensidl.g:2843:2: ( rule__Method__Alternatives_6_1 )
            // InternalSensidl.g:2843:3: rule__Method__Alternatives_6_1
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
    // InternalSensidl.g:2852:1: rule__Method__Group_9__0 : rule__Method__Group_9__0__Impl rule__Method__Group_9__1 ;
    public final void rule__Method__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2856:1: ( rule__Method__Group_9__0__Impl rule__Method__Group_9__1 )
            // InternalSensidl.g:2857:2: rule__Method__Group_9__0__Impl rule__Method__Group_9__1
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
    // InternalSensidl.g:2864:1: rule__Method__Group_9__0__Impl : ( 'with identifier' ) ;
    public final void rule__Method__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2868:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:2869:1: ( 'with identifier' )
            {
            // InternalSensidl.g:2869:1: ( 'with identifier' )
            // InternalSensidl.g:2870:2: 'with identifier'
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
    // InternalSensidl.g:2879:1: rule__Method__Group_9__1 : rule__Method__Group_9__1__Impl rule__Method__Group_9__2 ;
    public final void rule__Method__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2883:1: ( rule__Method__Group_9__1__Impl rule__Method__Group_9__2 )
            // InternalSensidl.g:2884:2: rule__Method__Group_9__1__Impl rule__Method__Group_9__2
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
    // InternalSensidl.g:2891:1: rule__Method__Group_9__1__Impl : ( ':' ) ;
    public final void rule__Method__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2895:1: ( ( ':' ) )
            // InternalSensidl.g:2896:1: ( ':' )
            {
            // InternalSensidl.g:2896:1: ( ':' )
            // InternalSensidl.g:2897:2: ':'
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
    // InternalSensidl.g:2906:1: rule__Method__Group_9__2 : rule__Method__Group_9__2__Impl ;
    public final void rule__Method__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2910:1: ( rule__Method__Group_9__2__Impl )
            // InternalSensidl.g:2911:2: rule__Method__Group_9__2__Impl
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
    // InternalSensidl.g:2917:1: rule__Method__Group_9__2__Impl : ( ( rule__Method__IDAssignment_9_2 ) ) ;
    public final void rule__Method__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2921:1: ( ( ( rule__Method__IDAssignment_9_2 ) ) )
            // InternalSensidl.g:2922:1: ( ( rule__Method__IDAssignment_9_2 ) )
            {
            // InternalSensidl.g:2922:1: ( ( rule__Method__IDAssignment_9_2 ) )
            // InternalSensidl.g:2923:2: ( rule__Method__IDAssignment_9_2 )
            {
             before(grammarAccess.getMethodAccess().getIDAssignment_9_2()); 
            // InternalSensidl.g:2924:2: ( rule__Method__IDAssignment_9_2 )
            // InternalSensidl.g:2924:3: rule__Method__IDAssignment_9_2
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
    // InternalSensidl.g:2933:1: rule__MethodParameter__Group__0 : rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 ;
    public final void rule__MethodParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2937:1: ( rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 )
            // InternalSensidl.g:2938:2: rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1
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
    // InternalSensidl.g:2945:1: rule__MethodParameter__Group__0__Impl : ( ( rule__MethodParameter__Alternatives_0 ) ) ;
    public final void rule__MethodParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2949:1: ( ( ( rule__MethodParameter__Alternatives_0 ) ) )
            // InternalSensidl.g:2950:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            {
            // InternalSensidl.g:2950:1: ( ( rule__MethodParameter__Alternatives_0 ) )
            // InternalSensidl.g:2951:2: ( rule__MethodParameter__Alternatives_0 )
            {
             before(grammarAccess.getMethodParameterAccess().getAlternatives_0()); 
            // InternalSensidl.g:2952:2: ( rule__MethodParameter__Alternatives_0 )
            // InternalSensidl.g:2952:3: rule__MethodParameter__Alternatives_0
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
    // InternalSensidl.g:2960:1: rule__MethodParameter__Group__1 : rule__MethodParameter__Group__1__Impl ;
    public final void rule__MethodParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2964:1: ( rule__MethodParameter__Group__1__Impl )
            // InternalSensidl.g:2965:2: rule__MethodParameter__Group__1__Impl
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
    // InternalSensidl.g:2971:1: rule__MethodParameter__Group__1__Impl : ( ( rule__MethodParameter__NameAssignment_1 ) ) ;
    public final void rule__MethodParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2975:1: ( ( ( rule__MethodParameter__NameAssignment_1 ) ) )
            // InternalSensidl.g:2976:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            {
            // InternalSensidl.g:2976:1: ( ( rule__MethodParameter__NameAssignment_1 ) )
            // InternalSensidl.g:2977:2: ( rule__MethodParameter__NameAssignment_1 )
            {
             before(grammarAccess.getMethodParameterAccess().getNameAssignment_1()); 
            // InternalSensidl.g:2978:2: ( rule__MethodParameter__NameAssignment_1 )
            // InternalSensidl.g:2978:3: rule__MethodParameter__NameAssignment_1
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
    // InternalSensidl.g:2987:1: rule__ListData__Group__0 : rule__ListData__Group__0__Impl rule__ListData__Group__1 ;
    public final void rule__ListData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:2991:1: ( rule__ListData__Group__0__Impl rule__ListData__Group__1 )
            // InternalSensidl.g:2992:2: rule__ListData__Group__0__Impl rule__ListData__Group__1
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
    // InternalSensidl.g:2999:1: rule__ListData__Group__0__Impl : ( ( rule__ListData__NameAssignment_0 ) ) ;
    public final void rule__ListData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3003:1: ( ( ( rule__ListData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3004:1: ( ( rule__ListData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3004:1: ( ( rule__ListData__NameAssignment_0 ) )
            // InternalSensidl.g:3005:2: ( rule__ListData__NameAssignment_0 )
            {
             before(grammarAccess.getListDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3006:2: ( rule__ListData__NameAssignment_0 )
            // InternalSensidl.g:3006:3: rule__ListData__NameAssignment_0
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
    // InternalSensidl.g:3014:1: rule__ListData__Group__1 : rule__ListData__Group__1__Impl rule__ListData__Group__2 ;
    public final void rule__ListData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3018:1: ( rule__ListData__Group__1__Impl rule__ListData__Group__2 )
            // InternalSensidl.g:3019:2: rule__ListData__Group__1__Impl rule__ListData__Group__2
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
    // InternalSensidl.g:3026:1: rule__ListData__Group__1__Impl : ( 'as' ) ;
    public final void rule__ListData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3030:1: ( ( 'as' ) )
            // InternalSensidl.g:3031:1: ( 'as' )
            {
            // InternalSensidl.g:3031:1: ( 'as' )
            // InternalSensidl.g:3032:2: 'as'
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
    // InternalSensidl.g:3041:1: rule__ListData__Group__2 : rule__ListData__Group__2__Impl rule__ListData__Group__3 ;
    public final void rule__ListData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3045:1: ( rule__ListData__Group__2__Impl rule__ListData__Group__3 )
            // InternalSensidl.g:3046:2: rule__ListData__Group__2__Impl rule__ListData__Group__3
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
    // InternalSensidl.g:3053:1: rule__ListData__Group__2__Impl : ( 'list' ) ;
    public final void rule__ListData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3057:1: ( ( 'list' ) )
            // InternalSensidl.g:3058:1: ( 'list' )
            {
            // InternalSensidl.g:3058:1: ( 'list' )
            // InternalSensidl.g:3059:2: 'list'
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
    // InternalSensidl.g:3068:1: rule__ListData__Group__3 : rule__ListData__Group__3__Impl rule__ListData__Group__4 ;
    public final void rule__ListData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3072:1: ( rule__ListData__Group__3__Impl rule__ListData__Group__4 )
            // InternalSensidl.g:3073:2: rule__ListData__Group__3__Impl rule__ListData__Group__4
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
    // InternalSensidl.g:3080:1: rule__ListData__Group__3__Impl : ( 'of' ) ;
    public final void rule__ListData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3084:1: ( ( 'of' ) )
            // InternalSensidl.g:3085:1: ( 'of' )
            {
            // InternalSensidl.g:3085:1: ( 'of' )
            // InternalSensidl.g:3086:2: 'of'
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
    // InternalSensidl.g:3095:1: rule__ListData__Group__4 : rule__ListData__Group__4__Impl ;
    public final void rule__ListData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3099:1: ( rule__ListData__Group__4__Impl )
            // InternalSensidl.g:3100:2: rule__ListData__Group__4__Impl
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
    // InternalSensidl.g:3106:1: rule__ListData__Group__4__Impl : ( ( rule__ListData__Alternatives_4 ) ) ;
    public final void rule__ListData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3110:1: ( ( ( rule__ListData__Alternatives_4 ) ) )
            // InternalSensidl.g:3111:1: ( ( rule__ListData__Alternatives_4 ) )
            {
            // InternalSensidl.g:3111:1: ( ( rule__ListData__Alternatives_4 ) )
            // InternalSensidl.g:3112:2: ( rule__ListData__Alternatives_4 )
            {
             before(grammarAccess.getListDataAccess().getAlternatives_4()); 
            // InternalSensidl.g:3113:2: ( rule__ListData__Alternatives_4 )
            // InternalSensidl.g:3113:3: rule__ListData__Alternatives_4
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
    // InternalSensidl.g:3122:1: rule__MeasurementData__Group__0 : rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 ;
    public final void rule__MeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3126:1: ( rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1 )
            // InternalSensidl.g:3127:2: rule__MeasurementData__Group__0__Impl rule__MeasurementData__Group__1
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
    // InternalSensidl.g:3134:1: rule__MeasurementData__Group__0__Impl : ( ( rule__MeasurementData__NameAssignment_0 ) ) ;
    public final void rule__MeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3138:1: ( ( ( rule__MeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3139:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3139:1: ( ( rule__MeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3140:2: ( rule__MeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3141:2: ( rule__MeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3141:3: rule__MeasurementData__NameAssignment_0
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
    // InternalSensidl.g:3149:1: rule__MeasurementData__Group__1 : rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 ;
    public final void rule__MeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3153:1: ( rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2 )
            // InternalSensidl.g:3154:2: rule__MeasurementData__Group__1__Impl rule__MeasurementData__Group__2
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
    // InternalSensidl.g:3161:1: rule__MeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3165:1: ( ( 'as' ) )
            // InternalSensidl.g:3166:1: ( 'as' )
            {
            // InternalSensidl.g:3166:1: ( 'as' )
            // InternalSensidl.g:3167:2: 'as'
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
    // InternalSensidl.g:3176:1: rule__MeasurementData__Group__2 : rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 ;
    public final void rule__MeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3180:1: ( rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3 )
            // InternalSensidl.g:3181:2: rule__MeasurementData__Group__2__Impl rule__MeasurementData__Group__3
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
    // InternalSensidl.g:3188:1: rule__MeasurementData__Group__2__Impl : ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3192:1: ( ( ( rule__MeasurementData__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:3193:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:3193:1: ( ( rule__MeasurementData__DataTypeAssignment_2 ) )
            // InternalSensidl.g:3194:2: ( rule__MeasurementData__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:3195:2: ( rule__MeasurementData__DataTypeAssignment_2 )
            // InternalSensidl.g:3195:3: rule__MeasurementData__DataTypeAssignment_2
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
    // InternalSensidl.g:3203:1: rule__MeasurementData__Group__3 : rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 ;
    public final void rule__MeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3207:1: ( rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4 )
            // InternalSensidl.g:3208:2: rule__MeasurementData__Group__3__Impl rule__MeasurementData__Group__4
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
    // InternalSensidl.g:3215:1: rule__MeasurementData__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3219:1: ( ( 'in' ) )
            // InternalSensidl.g:3220:1: ( 'in' )
            {
            // InternalSensidl.g:3220:1: ( 'in' )
            // InternalSensidl.g:3221:2: 'in'
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
    // InternalSensidl.g:3230:1: rule__MeasurementData__Group__4 : rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 ;
    public final void rule__MeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3234:1: ( rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5 )
            // InternalSensidl.g:3235:2: rule__MeasurementData__Group__4__Impl rule__MeasurementData__Group__5
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
    // InternalSensidl.g:3242:1: rule__MeasurementData__Group__4__Impl : ( ( rule__MeasurementData__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3246:1: ( ( ( rule__MeasurementData__UnitAssignment_4 ) ) )
            // InternalSensidl.g:3247:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:3247:1: ( ( rule__MeasurementData__UnitAssignment_4 ) )
            // InternalSensidl.g:3248:2: ( rule__MeasurementData__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:3249:2: ( rule__MeasurementData__UnitAssignment_4 )
            // InternalSensidl.g:3249:3: rule__MeasurementData__UnitAssignment_4
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
    // InternalSensidl.g:3257:1: rule__MeasurementData__Group__5 : rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 ;
    public final void rule__MeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3261:1: ( rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6 )
            // InternalSensidl.g:3262:2: rule__MeasurementData__Group__5__Impl rule__MeasurementData__Group__6
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
    // InternalSensidl.g:3269:1: rule__MeasurementData__Group__5__Impl : ( ( rule__MeasurementData__Group_5__0 )? ) ;
    public final void rule__MeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3273:1: ( ( ( rule__MeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:3274:1: ( ( rule__MeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:3274:1: ( ( rule__MeasurementData__Group_5__0 )? )
            // InternalSensidl.g:3275:2: ( rule__MeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:3276:2: ( rule__MeasurementData__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSensidl.g:3276:3: rule__MeasurementData__Group_5__0
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
    // InternalSensidl.g:3284:1: rule__MeasurementData__Group__6 : rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 ;
    public final void rule__MeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3288:1: ( rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7 )
            // InternalSensidl.g:3289:2: rule__MeasurementData__Group__6__Impl rule__MeasurementData__Group__7
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
    // InternalSensidl.g:3296:1: rule__MeasurementData__Group__6__Impl : ( ( rule__MeasurementData__Alternatives_6 )? ) ;
    public final void rule__MeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3300:1: ( ( ( rule__MeasurementData__Alternatives_6 )? ) )
            // InternalSensidl.g:3301:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            {
            // InternalSensidl.g:3301:1: ( ( rule__MeasurementData__Alternatives_6 )? )
            // InternalSensidl.g:3302:2: ( rule__MeasurementData__Alternatives_6 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_6()); 
            // InternalSensidl.g:3303:2: ( rule__MeasurementData__Alternatives_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSensidl.g:3303:3: rule__MeasurementData__Alternatives_6
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
    // InternalSensidl.g:3311:1: rule__MeasurementData__Group__7 : rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 ;
    public final void rule__MeasurementData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3315:1: ( rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8 )
            // InternalSensidl.g:3316:2: rule__MeasurementData__Group__7__Impl rule__MeasurementData__Group__8
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
    // InternalSensidl.g:3323:1: rule__MeasurementData__Group__7__Impl : ( ( rule__MeasurementData__Group_7__0 )? ) ;
    public final void rule__MeasurementData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3327:1: ( ( ( rule__MeasurementData__Group_7__0 )? ) )
            // InternalSensidl.g:3328:1: ( ( rule__MeasurementData__Group_7__0 )? )
            {
            // InternalSensidl.g:3328:1: ( ( rule__MeasurementData__Group_7__0 )? )
            // InternalSensidl.g:3329:2: ( rule__MeasurementData__Group_7__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7()); 
            // InternalSensidl.g:3330:2: ( rule__MeasurementData__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSensidl.g:3330:3: rule__MeasurementData__Group_7__0
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
    // InternalSensidl.g:3338:1: rule__MeasurementData__Group__8 : rule__MeasurementData__Group__8__Impl ;
    public final void rule__MeasurementData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3342:1: ( rule__MeasurementData__Group__8__Impl )
            // InternalSensidl.g:3343:2: rule__MeasurementData__Group__8__Impl
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
    // InternalSensidl.g:3349:1: rule__MeasurementData__Group__8__Impl : ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) ;
    public final void rule__MeasurementData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3353:1: ( ( ( rule__MeasurementData__DescriptionAssignment_8 )? ) )
            // InternalSensidl.g:3354:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            {
            // InternalSensidl.g:3354:1: ( ( rule__MeasurementData__DescriptionAssignment_8 )? )
            // InternalSensidl.g:3355:2: ( rule__MeasurementData__DescriptionAssignment_8 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getDescriptionAssignment_8()); 
            // InternalSensidl.g:3356:2: ( rule__MeasurementData__DescriptionAssignment_8 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DESCRIPTION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSensidl.g:3356:3: rule__MeasurementData__DescriptionAssignment_8
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
    // InternalSensidl.g:3365:1: rule__MeasurementData__Group_5__0 : rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 ;
    public final void rule__MeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3369:1: ( rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1 )
            // InternalSensidl.g:3370:2: rule__MeasurementData__Group_5__0__Impl rule__MeasurementData__Group_5__1
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
    // InternalSensidl.g:3377:1: rule__MeasurementData__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3381:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:3382:1: ( 'with identifier' )
            {
            // InternalSensidl.g:3382:1: ( 'with identifier' )
            // InternalSensidl.g:3383:2: 'with identifier'
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
    // InternalSensidl.g:3392:1: rule__MeasurementData__Group_5__1 : rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 ;
    public final void rule__MeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3396:1: ( rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2 )
            // InternalSensidl.g:3397:2: rule__MeasurementData__Group_5__1__Impl rule__MeasurementData__Group_5__2
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
    // InternalSensidl.g:3404:1: rule__MeasurementData__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3408:1: ( ( ':' ) )
            // InternalSensidl.g:3409:1: ( ':' )
            {
            // InternalSensidl.g:3409:1: ( ':' )
            // InternalSensidl.g:3410:2: ':'
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
    // InternalSensidl.g:3419:1: rule__MeasurementData__Group_5__2 : rule__MeasurementData__Group_5__2__Impl ;
    public final void rule__MeasurementData__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3423:1: ( rule__MeasurementData__Group_5__2__Impl )
            // InternalSensidl.g:3424:2: rule__MeasurementData__Group_5__2__Impl
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
    // InternalSensidl.g:3430:1: rule__MeasurementData__Group_5__2__Impl : ( ( rule__MeasurementData__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementData__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3434:1: ( ( ( rule__MeasurementData__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:3435:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:3435:1: ( ( rule__MeasurementData__IDAssignment_5_2 ) )
            // InternalSensidl.g:3436:2: ( rule__MeasurementData__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:3437:2: ( rule__MeasurementData__IDAssignment_5_2 )
            // InternalSensidl.g:3437:3: rule__MeasurementData__IDAssignment_5_2
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
    // InternalSensidl.g:3446:1: rule__MeasurementData__Group_6_0__0 : rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 ;
    public final void rule__MeasurementData__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3450:1: ( rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1 )
            // InternalSensidl.g:3451:2: rule__MeasurementData__Group_6_0__0__Impl rule__MeasurementData__Group_6_0__1
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
    // InternalSensidl.g:3458:1: rule__MeasurementData__Group_6_0__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3462:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3463:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3463:1: ( 'adjusted' )
            // InternalSensidl.g:3464:2: 'adjusted'
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
    // InternalSensidl.g:3473:1: rule__MeasurementData__Group_6_0__1 : rule__MeasurementData__Group_6_0__1__Impl ;
    public final void rule__MeasurementData__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3477:1: ( rule__MeasurementData__Group_6_0__1__Impl )
            // InternalSensidl.g:3478:2: rule__MeasurementData__Group_6_0__1__Impl
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
    // InternalSensidl.g:3484:1: rule__MeasurementData__Group_6_0__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) ;
    public final void rule__MeasurementData__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3488:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) ) )
            // InternalSensidl.g:3489:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            {
            // InternalSensidl.g:3489:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 ) )
            // InternalSensidl.g:3490:2: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_0_1()); 
            // InternalSensidl.g:3491:2: ( rule__MeasurementData__AdjustmentsAssignment_6_0_1 )
            // InternalSensidl.g:3491:3: rule__MeasurementData__AdjustmentsAssignment_6_0_1
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
    // InternalSensidl.g:3500:1: rule__MeasurementData__Group_6_1__0 : rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 ;
    public final void rule__MeasurementData__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3504:1: ( rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1 )
            // InternalSensidl.g:3505:2: rule__MeasurementData__Group_6_1__0__Impl rule__MeasurementData__Group_6_1__1
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
    // InternalSensidl.g:3512:1: rule__MeasurementData__Group_6_1__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3516:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3517:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3517:1: ( 'adjusted' )
            // InternalSensidl.g:3518:2: 'adjusted'
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
    // InternalSensidl.g:3527:1: rule__MeasurementData__Group_6_1__1 : rule__MeasurementData__Group_6_1__1__Impl ;
    public final void rule__MeasurementData__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3531:1: ( rule__MeasurementData__Group_6_1__1__Impl )
            // InternalSensidl.g:3532:2: rule__MeasurementData__Group_6_1__1__Impl
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
    // InternalSensidl.g:3538:1: rule__MeasurementData__Group_6_1__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) ;
    public final void rule__MeasurementData__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3542:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) ) )
            // InternalSensidl.g:3543:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            {
            // InternalSensidl.g:3543:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 ) )
            // InternalSensidl.g:3544:2: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_1_1()); 
            // InternalSensidl.g:3545:2: ( rule__MeasurementData__AdjustmentsAssignment_6_1_1 )
            // InternalSensidl.g:3545:3: rule__MeasurementData__AdjustmentsAssignment_6_1_1
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
    // InternalSensidl.g:3554:1: rule__MeasurementData__Group_6_2__0 : rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 ;
    public final void rule__MeasurementData__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3558:1: ( rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1 )
            // InternalSensidl.g:3559:2: rule__MeasurementData__Group_6_2__0__Impl rule__MeasurementData__Group_6_2__1
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
    // InternalSensidl.g:3566:1: rule__MeasurementData__Group_6_2__0__Impl : ( 'adjusted' ) ;
    public final void rule__MeasurementData__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3570:1: ( ( 'adjusted' ) )
            // InternalSensidl.g:3571:1: ( 'adjusted' )
            {
            // InternalSensidl.g:3571:1: ( 'adjusted' )
            // InternalSensidl.g:3572:2: 'adjusted'
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
    // InternalSensidl.g:3581:1: rule__MeasurementData__Group_6_2__1 : rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 ;
    public final void rule__MeasurementData__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3585:1: ( rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2 )
            // InternalSensidl.g:3586:2: rule__MeasurementData__Group_6_2__1__Impl rule__MeasurementData__Group_6_2__2
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
    // InternalSensidl.g:3593:1: rule__MeasurementData__Group_6_2__1__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) ;
    public final void rule__MeasurementData__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3597:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) ) )
            // InternalSensidl.g:3598:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            {
            // InternalSensidl.g:3598:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 ) )
            // InternalSensidl.g:3599:2: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_1()); 
            // InternalSensidl.g:3600:2: ( rule__MeasurementData__AdjustmentsAssignment_6_2_1 )
            // InternalSensidl.g:3600:3: rule__MeasurementData__AdjustmentsAssignment_6_2_1
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
    // InternalSensidl.g:3608:1: rule__MeasurementData__Group_6_2__2 : rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 ;
    public final void rule__MeasurementData__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3612:1: ( rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3 )
            // InternalSensidl.g:3613:2: rule__MeasurementData__Group_6_2__2__Impl rule__MeasurementData__Group_6_2__3
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
    // InternalSensidl.g:3620:1: rule__MeasurementData__Group_6_2__2__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3624:1: ( ( ',' ) )
            // InternalSensidl.g:3625:1: ( ',' )
            {
            // InternalSensidl.g:3625:1: ( ',' )
            // InternalSensidl.g:3626:2: ','
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
    // InternalSensidl.g:3635:1: rule__MeasurementData__Group_6_2__3 : rule__MeasurementData__Group_6_2__3__Impl ;
    public final void rule__MeasurementData__Group_6_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3639:1: ( rule__MeasurementData__Group_6_2__3__Impl )
            // InternalSensidl.g:3640:2: rule__MeasurementData__Group_6_2__3__Impl
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
    // InternalSensidl.g:3646:1: rule__MeasurementData__Group_6_2__3__Impl : ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) ;
    public final void rule__MeasurementData__Group_6_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3650:1: ( ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) ) )
            // InternalSensidl.g:3651:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            {
            // InternalSensidl.g:3651:1: ( ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 ) )
            // InternalSensidl.g:3652:2: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAdjustmentsAssignment_6_2_3()); 
            // InternalSensidl.g:3653:2: ( rule__MeasurementData__AdjustmentsAssignment_6_2_3 )
            // InternalSensidl.g:3653:3: rule__MeasurementData__AdjustmentsAssignment_6_2_3
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
    // InternalSensidl.g:3662:1: rule__MeasurementData__Group_7__0 : rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 ;
    public final void rule__MeasurementData__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3666:1: ( rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1 )
            // InternalSensidl.g:3667:2: rule__MeasurementData__Group_7__0__Impl rule__MeasurementData__Group_7__1
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
    // InternalSensidl.g:3674:1: rule__MeasurementData__Group_7__0__Impl : ( 'exclude:' ) ;
    public final void rule__MeasurementData__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3678:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:3679:1: ( 'exclude:' )
            {
            // InternalSensidl.g:3679:1: ( 'exclude:' )
            // InternalSensidl.g:3680:2: 'exclude:'
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
    // InternalSensidl.g:3689:1: rule__MeasurementData__Group_7__1 : rule__MeasurementData__Group_7__1__Impl ;
    public final void rule__MeasurementData__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3693:1: ( rule__MeasurementData__Group_7__1__Impl )
            // InternalSensidl.g:3694:2: rule__MeasurementData__Group_7__1__Impl
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
    // InternalSensidl.g:3700:1: rule__MeasurementData__Group_7__1__Impl : ( ( rule__MeasurementData__Alternatives_7_1 ) ) ;
    public final void rule__MeasurementData__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3704:1: ( ( ( rule__MeasurementData__Alternatives_7_1 ) ) )
            // InternalSensidl.g:3705:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            {
            // InternalSensidl.g:3705:1: ( ( rule__MeasurementData__Alternatives_7_1 ) )
            // InternalSensidl.g:3706:2: ( rule__MeasurementData__Alternatives_7_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getAlternatives_7_1()); 
            // InternalSensidl.g:3707:2: ( rule__MeasurementData__Alternatives_7_1 )
            // InternalSensidl.g:3707:3: rule__MeasurementData__Alternatives_7_1
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
    // InternalSensidl.g:3716:1: rule__MeasurementData__Group_7_1_0__0 : rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 ;
    public final void rule__MeasurementData__Group_7_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3720:1: ( rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1 )
            // InternalSensidl.g:3721:2: rule__MeasurementData__Group_7_1_0__0__Impl rule__MeasurementData__Group_7_1_0__1
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
    // InternalSensidl.g:3728:1: rule__MeasurementData__Group_7_1_0__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3732:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) ) )
            // InternalSensidl.g:3733:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            {
            // InternalSensidl.g:3733:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 ) )
            // InternalSensidl.g:3734:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_0()); 
            // InternalSensidl.g:3735:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 )
            // InternalSensidl.g:3735:3: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0
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
    // InternalSensidl.g:3743:1: rule__MeasurementData__Group_7_1_0__1 : rule__MeasurementData__Group_7_1_0__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3747:1: ( rule__MeasurementData__Group_7_1_0__1__Impl )
            // InternalSensidl.g:3748:2: rule__MeasurementData__Group_7_1_0__1__Impl
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
    // InternalSensidl.g:3754:1: rule__MeasurementData__Group_7_1_0__1__Impl : ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3758:1: ( ( ( rule__MeasurementData__Group_7_1_0_1__0 )? ) )
            // InternalSensidl.g:3759:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            {
            // InternalSensidl.g:3759:1: ( ( rule__MeasurementData__Group_7_1_0_1__0 )? )
            // InternalSensidl.g:3760:2: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_0_1()); 
            // InternalSensidl.g:3761:2: ( rule__MeasurementData__Group_7_1_0_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSensidl.g:3761:3: rule__MeasurementData__Group_7_1_0_1__0
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
    // InternalSensidl.g:3770:1: rule__MeasurementData__Group_7_1_0_1__0 : rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 ;
    public final void rule__MeasurementData__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3774:1: ( rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1 )
            // InternalSensidl.g:3775:2: rule__MeasurementData__Group_7_1_0_1__0__Impl rule__MeasurementData__Group_7_1_0_1__1
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
    // InternalSensidl.g:3782:1: rule__MeasurementData__Group_7_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3786:1: ( ( ',' ) )
            // InternalSensidl.g:3787:1: ( ',' )
            {
            // InternalSensidl.g:3787:1: ( ',' )
            // InternalSensidl.g:3788:2: ','
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
    // InternalSensidl.g:3797:1: rule__MeasurementData__Group_7_1_0_1__1 : rule__MeasurementData__Group_7_1_0_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3801:1: ( rule__MeasurementData__Group_7_1_0_1__1__Impl )
            // InternalSensidl.g:3802:2: rule__MeasurementData__Group_7_1_0_1__1__Impl
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
    // InternalSensidl.g:3808:1: rule__MeasurementData__Group_7_1_0_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3812:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) ) )
            // InternalSensidl.g:3813:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            {
            // InternalSensidl.g:3813:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 ) )
            // InternalSensidl.g:3814:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_0_1_1()); 
            // InternalSensidl.g:3815:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 )
            // InternalSensidl.g:3815:3: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1
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
    // InternalSensidl.g:3824:1: rule__MeasurementData__Group_7_1_1__0 : rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3828:1: ( rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1 )
            // InternalSensidl.g:3829:2: rule__MeasurementData__Group_7_1_1__0__Impl rule__MeasurementData__Group_7_1_1__1
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
    // InternalSensidl.g:3836:1: rule__MeasurementData__Group_7_1_1__0__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3840:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) ) )
            // InternalSensidl.g:3841:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            {
            // InternalSensidl.g:3841:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 ) )
            // InternalSensidl.g:3842:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_0()); 
            // InternalSensidl.g:3843:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 )
            // InternalSensidl.g:3843:3: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0
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
    // InternalSensidl.g:3851:1: rule__MeasurementData__Group_7_1_1__1 : rule__MeasurementData__Group_7_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3855:1: ( rule__MeasurementData__Group_7_1_1__1__Impl )
            // InternalSensidl.g:3856:2: rule__MeasurementData__Group_7_1_1__1__Impl
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
    // InternalSensidl.g:3862:1: rule__MeasurementData__Group_7_1_1__1__Impl : ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) ;
    public final void rule__MeasurementData__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3866:1: ( ( ( rule__MeasurementData__Group_7_1_1_1__0 )? ) )
            // InternalSensidl.g:3867:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            {
            // InternalSensidl.g:3867:1: ( ( rule__MeasurementData__Group_7_1_1_1__0 )? )
            // InternalSensidl.g:3868:2: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataAccess().getGroup_7_1_1_1()); 
            // InternalSensidl.g:3869:2: ( rule__MeasurementData__Group_7_1_1_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==34) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSensidl.g:3869:3: rule__MeasurementData__Group_7_1_1_1__0
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
    // InternalSensidl.g:3878:1: rule__MeasurementData__Group_7_1_1_1__0 : rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 ;
    public final void rule__MeasurementData__Group_7_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3882:1: ( rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1 )
            // InternalSensidl.g:3883:2: rule__MeasurementData__Group_7_1_1_1__0__Impl rule__MeasurementData__Group_7_1_1_1__1
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
    // InternalSensidl.g:3890:1: rule__MeasurementData__Group_7_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3894:1: ( ( ',' ) )
            // InternalSensidl.g:3895:1: ( ',' )
            {
            // InternalSensidl.g:3895:1: ( ',' )
            // InternalSensidl.g:3896:2: ','
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
    // InternalSensidl.g:3905:1: rule__MeasurementData__Group_7_1_1_1__1 : rule__MeasurementData__Group_7_1_1_1__1__Impl ;
    public final void rule__MeasurementData__Group_7_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3909:1: ( rule__MeasurementData__Group_7_1_1_1__1__Impl )
            // InternalSensidl.g:3910:2: rule__MeasurementData__Group_7_1_1_1__1__Impl
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
    // InternalSensidl.g:3916:1: rule__MeasurementData__Group_7_1_1_1__1__Impl : ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) ;
    public final void rule__MeasurementData__Group_7_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3920:1: ( ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) ) )
            // InternalSensidl.g:3921:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            {
            // InternalSensidl.g:3921:1: ( ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 ) )
            // InternalSensidl.g:3922:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsAssignment_7_1_1_1_1()); 
            // InternalSensidl.g:3923:2: ( rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 )
            // InternalSensidl.g:3923:3: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1
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
    // InternalSensidl.g:3932:1: rule__NonMeasurementData__Group__0 : rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 ;
    public final void rule__NonMeasurementData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3936:1: ( rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1 )
            // InternalSensidl.g:3937:2: rule__NonMeasurementData__Group__0__Impl rule__NonMeasurementData__Group__1
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
    // InternalSensidl.g:3944:1: rule__NonMeasurementData__Group__0__Impl : ( ( rule__NonMeasurementData__NameAssignment_0 ) ) ;
    public final void rule__NonMeasurementData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3948:1: ( ( ( rule__NonMeasurementData__NameAssignment_0 ) ) )
            // InternalSensidl.g:3949:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            {
            // InternalSensidl.g:3949:1: ( ( rule__NonMeasurementData__NameAssignment_0 ) )
            // InternalSensidl.g:3950:2: ( rule__NonMeasurementData__NameAssignment_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getNameAssignment_0()); 
            // InternalSensidl.g:3951:2: ( rule__NonMeasurementData__NameAssignment_0 )
            // InternalSensidl.g:3951:3: rule__NonMeasurementData__NameAssignment_0
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
    // InternalSensidl.g:3959:1: rule__NonMeasurementData__Group__1 : rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 ;
    public final void rule__NonMeasurementData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3963:1: ( rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2 )
            // InternalSensidl.g:3964:2: rule__NonMeasurementData__Group__1__Impl rule__NonMeasurementData__Group__2
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
    // InternalSensidl.g:3971:1: rule__NonMeasurementData__Group__1__Impl : ( 'as' ) ;
    public final void rule__NonMeasurementData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3975:1: ( ( 'as' ) )
            // InternalSensidl.g:3976:1: ( 'as' )
            {
            // InternalSensidl.g:3976:1: ( 'as' )
            // InternalSensidl.g:3977:2: 'as'
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
    // InternalSensidl.g:3986:1: rule__NonMeasurementData__Group__2 : rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 ;
    public final void rule__NonMeasurementData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:3990:1: ( rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3 )
            // InternalSensidl.g:3991:2: rule__NonMeasurementData__Group__2__Impl rule__NonMeasurementData__Group__3
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
    // InternalSensidl.g:3998:1: rule__NonMeasurementData__Group__2__Impl : ( ( rule__NonMeasurementData__Alternatives_2 ) ) ;
    public final void rule__NonMeasurementData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4002:1: ( ( ( rule__NonMeasurementData__Alternatives_2 ) ) )
            // InternalSensidl.g:4003:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            {
            // InternalSensidl.g:4003:1: ( ( rule__NonMeasurementData__Alternatives_2 ) )
            // InternalSensidl.g:4004:2: ( rule__NonMeasurementData__Alternatives_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_2()); 
            // InternalSensidl.g:4005:2: ( rule__NonMeasurementData__Alternatives_2 )
            // InternalSensidl.g:4005:3: rule__NonMeasurementData__Alternatives_2
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
    // InternalSensidl.g:4013:1: rule__NonMeasurementData__Group__3 : rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 ;
    public final void rule__NonMeasurementData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4017:1: ( rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4 )
            // InternalSensidl.g:4018:2: rule__NonMeasurementData__Group__3__Impl rule__NonMeasurementData__Group__4
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
    // InternalSensidl.g:4025:1: rule__NonMeasurementData__Group__3__Impl : ( ( rule__NonMeasurementData__Alternatives_3 )? ) ;
    public final void rule__NonMeasurementData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4029:1: ( ( ( rule__NonMeasurementData__Alternatives_3 )? ) )
            // InternalSensidl.g:4030:1: ( ( rule__NonMeasurementData__Alternatives_3 )? )
            {
            // InternalSensidl.g:4030:1: ( ( rule__NonMeasurementData__Alternatives_3 )? )
            // InternalSensidl.g:4031:2: ( rule__NonMeasurementData__Alternatives_3 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_3()); 
            // InternalSensidl.g:4032:2: ( rule__NonMeasurementData__Alternatives_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50||LA42_0==68) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSensidl.g:4032:3: rule__NonMeasurementData__Alternatives_3
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
    // InternalSensidl.g:4040:1: rule__NonMeasurementData__Group__4 : rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 ;
    public final void rule__NonMeasurementData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4044:1: ( rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5 )
            // InternalSensidl.g:4045:2: rule__NonMeasurementData__Group__4__Impl rule__NonMeasurementData__Group__5
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
    // InternalSensidl.g:4052:1: rule__NonMeasurementData__Group__4__Impl : ( ( rule__NonMeasurementData__Group_4__0 )? ) ;
    public final void rule__NonMeasurementData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4056:1: ( ( ( rule__NonMeasurementData__Group_4__0 )? ) )
            // InternalSensidl.g:4057:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            {
            // InternalSensidl.g:4057:1: ( ( rule__NonMeasurementData__Group_4__0 )? )
            // InternalSensidl.g:4058:2: ( rule__NonMeasurementData__Group_4__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_4()); 
            // InternalSensidl.g:4059:2: ( rule__NonMeasurementData__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSensidl.g:4059:3: rule__NonMeasurementData__Group_4__0
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
    // InternalSensidl.g:4067:1: rule__NonMeasurementData__Group__5 : rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 ;
    public final void rule__NonMeasurementData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4071:1: ( rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6 )
            // InternalSensidl.g:4072:2: rule__NonMeasurementData__Group__5__Impl rule__NonMeasurementData__Group__6
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
    // InternalSensidl.g:4079:1: rule__NonMeasurementData__Group__5__Impl : ( ( rule__NonMeasurementData__Group_5__0 )? ) ;
    public final void rule__NonMeasurementData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4083:1: ( ( ( rule__NonMeasurementData__Group_5__0 )? ) )
            // InternalSensidl.g:4084:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            {
            // InternalSensidl.g:4084:1: ( ( rule__NonMeasurementData__Group_5__0 )? )
            // InternalSensidl.g:4085:2: ( rule__NonMeasurementData__Group_5__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5()); 
            // InternalSensidl.g:4086:2: ( rule__NonMeasurementData__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSensidl.g:4086:3: rule__NonMeasurementData__Group_5__0
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
    // InternalSensidl.g:4094:1: rule__NonMeasurementData__Group__6 : rule__NonMeasurementData__Group__6__Impl ;
    public final void rule__NonMeasurementData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4098:1: ( rule__NonMeasurementData__Group__6__Impl )
            // InternalSensidl.g:4099:2: rule__NonMeasurementData__Group__6__Impl
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
    // InternalSensidl.g:4105:1: rule__NonMeasurementData__Group__6__Impl : ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) ;
    public final void rule__NonMeasurementData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4109:1: ( ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? ) )
            // InternalSensidl.g:4110:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            {
            // InternalSensidl.g:4110:1: ( ( rule__NonMeasurementData__DescriptionAssignment_6 )? )
            // InternalSensidl.g:4111:2: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getDescriptionAssignment_6()); 
            // InternalSensidl.g:4112:2: ( rule__NonMeasurementData__DescriptionAssignment_6 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DESCRIPTION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSensidl.g:4112:3: rule__NonMeasurementData__DescriptionAssignment_6
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
    // InternalSensidl.g:4121:1: rule__NonMeasurementData__Group_3_0__0 : rule__NonMeasurementData__Group_3_0__0__Impl rule__NonMeasurementData__Group_3_0__1 ;
    public final void rule__NonMeasurementData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4125:1: ( rule__NonMeasurementData__Group_3_0__0__Impl rule__NonMeasurementData__Group_3_0__1 )
            // InternalSensidl.g:4126:2: rule__NonMeasurementData__Group_3_0__0__Impl rule__NonMeasurementData__Group_3_0__1
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
    // InternalSensidl.g:4133:1: rule__NonMeasurementData__Group_3_0__0__Impl : ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4137:1: ( ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) ) )
            // InternalSensidl.g:4138:1: ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) )
            {
            // InternalSensidl.g:4138:1: ( ( rule__NonMeasurementData__ConstantAssignment_3_0_0 ) )
            // InternalSensidl.g:4139:2: ( rule__NonMeasurementData__ConstantAssignment_3_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantAssignment_3_0_0()); 
            // InternalSensidl.g:4140:2: ( rule__NonMeasurementData__ConstantAssignment_3_0_0 )
            // InternalSensidl.g:4140:3: rule__NonMeasurementData__ConstantAssignment_3_0_0
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
    // InternalSensidl.g:4148:1: rule__NonMeasurementData__Group_3_0__1 : rule__NonMeasurementData__Group_3_0__1__Impl rule__NonMeasurementData__Group_3_0__2 ;
    public final void rule__NonMeasurementData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4152:1: ( rule__NonMeasurementData__Group_3_0__1__Impl rule__NonMeasurementData__Group_3_0__2 )
            // InternalSensidl.g:4153:2: rule__NonMeasurementData__Group_3_0__1__Impl rule__NonMeasurementData__Group_3_0__2
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
    // InternalSensidl.g:4160:1: rule__NonMeasurementData__Group_3_0__1__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4164:1: ( ( 'value' ) )
            // InternalSensidl.g:4165:1: ( 'value' )
            {
            // InternalSensidl.g:4165:1: ( 'value' )
            // InternalSensidl.g:4166:2: 'value'
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
    // InternalSensidl.g:4175:1: rule__NonMeasurementData__Group_3_0__2 : rule__NonMeasurementData__Group_3_0__2__Impl rule__NonMeasurementData__Group_3_0__3 ;
    public final void rule__NonMeasurementData__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4179:1: ( rule__NonMeasurementData__Group_3_0__2__Impl rule__NonMeasurementData__Group_3_0__3 )
            // InternalSensidl.g:4180:2: rule__NonMeasurementData__Group_3_0__2__Impl rule__NonMeasurementData__Group_3_0__3
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
    // InternalSensidl.g:4187:1: rule__NonMeasurementData__Group_3_0__2__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4191:1: ( ( '=' ) )
            // InternalSensidl.g:4192:1: ( '=' )
            {
            // InternalSensidl.g:4192:1: ( '=' )
            // InternalSensidl.g:4193:2: '='
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
    // InternalSensidl.g:4202:1: rule__NonMeasurementData__Group_3_0__3 : rule__NonMeasurementData__Group_3_0__3__Impl ;
    public final void rule__NonMeasurementData__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4206:1: ( rule__NonMeasurementData__Group_3_0__3__Impl )
            // InternalSensidl.g:4207:2: rule__NonMeasurementData__Group_3_0__3__Impl
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
    // InternalSensidl.g:4213:1: rule__NonMeasurementData__Group_3_0__3__Impl : ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) ) ;
    public final void rule__NonMeasurementData__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4217:1: ( ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) ) )
            // InternalSensidl.g:4218:1: ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) )
            {
            // InternalSensidl.g:4218:1: ( ( rule__NonMeasurementData__ValueAssignment_3_0_3 ) )
            // InternalSensidl.g:4219:2: ( rule__NonMeasurementData__ValueAssignment_3_0_3 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_3_0_3()); 
            // InternalSensidl.g:4220:2: ( rule__NonMeasurementData__ValueAssignment_3_0_3 )
            // InternalSensidl.g:4220:3: rule__NonMeasurementData__ValueAssignment_3_0_3
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
    // InternalSensidl.g:4229:1: rule__NonMeasurementData__Group_3_1__0 : rule__NonMeasurementData__Group_3_1__0__Impl rule__NonMeasurementData__Group_3_1__1 ;
    public final void rule__NonMeasurementData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4233:1: ( rule__NonMeasurementData__Group_3_1__0__Impl rule__NonMeasurementData__Group_3_1__1 )
            // InternalSensidl.g:4234:2: rule__NonMeasurementData__Group_3_1__0__Impl rule__NonMeasurementData__Group_3_1__1
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
    // InternalSensidl.g:4241:1: rule__NonMeasurementData__Group_3_1__0__Impl : ( 'value' ) ;
    public final void rule__NonMeasurementData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4245:1: ( ( 'value' ) )
            // InternalSensidl.g:4246:1: ( 'value' )
            {
            // InternalSensidl.g:4246:1: ( 'value' )
            // InternalSensidl.g:4247:2: 'value'
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
    // InternalSensidl.g:4256:1: rule__NonMeasurementData__Group_3_1__1 : rule__NonMeasurementData__Group_3_1__1__Impl rule__NonMeasurementData__Group_3_1__2 ;
    public final void rule__NonMeasurementData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4260:1: ( rule__NonMeasurementData__Group_3_1__1__Impl rule__NonMeasurementData__Group_3_1__2 )
            // InternalSensidl.g:4261:2: rule__NonMeasurementData__Group_3_1__1__Impl rule__NonMeasurementData__Group_3_1__2
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
    // InternalSensidl.g:4268:1: rule__NonMeasurementData__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__NonMeasurementData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4272:1: ( ( '=' ) )
            // InternalSensidl.g:4273:1: ( '=' )
            {
            // InternalSensidl.g:4273:1: ( '=' )
            // InternalSensidl.g:4274:2: '='
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
    // InternalSensidl.g:4283:1: rule__NonMeasurementData__Group_3_1__2 : rule__NonMeasurementData__Group_3_1__2__Impl ;
    public final void rule__NonMeasurementData__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4287:1: ( rule__NonMeasurementData__Group_3_1__2__Impl )
            // InternalSensidl.g:4288:2: rule__NonMeasurementData__Group_3_1__2__Impl
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
    // InternalSensidl.g:4294:1: rule__NonMeasurementData__Group_3_1__2__Impl : ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) ) ;
    public final void rule__NonMeasurementData__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4298:1: ( ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) ) )
            // InternalSensidl.g:4299:1: ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) )
            {
            // InternalSensidl.g:4299:1: ( ( rule__NonMeasurementData__ValueAssignment_3_1_2 ) )
            // InternalSensidl.g:4300:2: ( rule__NonMeasurementData__ValueAssignment_3_1_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getValueAssignment_3_1_2()); 
            // InternalSensidl.g:4301:2: ( rule__NonMeasurementData__ValueAssignment_3_1_2 )
            // InternalSensidl.g:4301:3: rule__NonMeasurementData__ValueAssignment_3_1_2
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
    // InternalSensidl.g:4310:1: rule__NonMeasurementData__Group_4__0 : rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 ;
    public final void rule__NonMeasurementData__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4314:1: ( rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1 )
            // InternalSensidl.g:4315:2: rule__NonMeasurementData__Group_4__0__Impl rule__NonMeasurementData__Group_4__1
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
    // InternalSensidl.g:4322:1: rule__NonMeasurementData__Group_4__0__Impl : ( 'with identifier' ) ;
    public final void rule__NonMeasurementData__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4326:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:4327:1: ( 'with identifier' )
            {
            // InternalSensidl.g:4327:1: ( 'with identifier' )
            // InternalSensidl.g:4328:2: 'with identifier'
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
    // InternalSensidl.g:4337:1: rule__NonMeasurementData__Group_4__1 : rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 ;
    public final void rule__NonMeasurementData__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4341:1: ( rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2 )
            // InternalSensidl.g:4342:2: rule__NonMeasurementData__Group_4__1__Impl rule__NonMeasurementData__Group_4__2
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
    // InternalSensidl.g:4349:1: rule__NonMeasurementData__Group_4__1__Impl : ( ':' ) ;
    public final void rule__NonMeasurementData__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4353:1: ( ( ':' ) )
            // InternalSensidl.g:4354:1: ( ':' )
            {
            // InternalSensidl.g:4354:1: ( ':' )
            // InternalSensidl.g:4355:2: ':'
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
    // InternalSensidl.g:4364:1: rule__NonMeasurementData__Group_4__2 : rule__NonMeasurementData__Group_4__2__Impl ;
    public final void rule__NonMeasurementData__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4368:1: ( rule__NonMeasurementData__Group_4__2__Impl )
            // InternalSensidl.g:4369:2: rule__NonMeasurementData__Group_4__2__Impl
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
    // InternalSensidl.g:4375:1: rule__NonMeasurementData__Group_4__2__Impl : ( ( rule__NonMeasurementData__IDAssignment_4_2 ) ) ;
    public final void rule__NonMeasurementData__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4379:1: ( ( ( rule__NonMeasurementData__IDAssignment_4_2 ) ) )
            // InternalSensidl.g:4380:1: ( ( rule__NonMeasurementData__IDAssignment_4_2 ) )
            {
            // InternalSensidl.g:4380:1: ( ( rule__NonMeasurementData__IDAssignment_4_2 ) )
            // InternalSensidl.g:4381:2: ( rule__NonMeasurementData__IDAssignment_4_2 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getIDAssignment_4_2()); 
            // InternalSensidl.g:4382:2: ( rule__NonMeasurementData__IDAssignment_4_2 )
            // InternalSensidl.g:4382:3: rule__NonMeasurementData__IDAssignment_4_2
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
    // InternalSensidl.g:4391:1: rule__NonMeasurementData__Group_5__0 : rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 ;
    public final void rule__NonMeasurementData__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4395:1: ( rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1 )
            // InternalSensidl.g:4396:2: rule__NonMeasurementData__Group_5__0__Impl rule__NonMeasurementData__Group_5__1
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
    // InternalSensidl.g:4403:1: rule__NonMeasurementData__Group_5__0__Impl : ( 'exclude:' ) ;
    public final void rule__NonMeasurementData__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4407:1: ( ( 'exclude:' ) )
            // InternalSensidl.g:4408:1: ( 'exclude:' )
            {
            // InternalSensidl.g:4408:1: ( 'exclude:' )
            // InternalSensidl.g:4409:2: 'exclude:'
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
    // InternalSensidl.g:4418:1: rule__NonMeasurementData__Group_5__1 : rule__NonMeasurementData__Group_5__1__Impl ;
    public final void rule__NonMeasurementData__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4422:1: ( rule__NonMeasurementData__Group_5__1__Impl )
            // InternalSensidl.g:4423:2: rule__NonMeasurementData__Group_5__1__Impl
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
    // InternalSensidl.g:4429:1: rule__NonMeasurementData__Group_5__1__Impl : ( ( rule__NonMeasurementData__Alternatives_5_1 ) ) ;
    public final void rule__NonMeasurementData__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4433:1: ( ( ( rule__NonMeasurementData__Alternatives_5_1 ) ) )
            // InternalSensidl.g:4434:1: ( ( rule__NonMeasurementData__Alternatives_5_1 ) )
            {
            // InternalSensidl.g:4434:1: ( ( rule__NonMeasurementData__Alternatives_5_1 ) )
            // InternalSensidl.g:4435:2: ( rule__NonMeasurementData__Alternatives_5_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getAlternatives_5_1()); 
            // InternalSensidl.g:4436:2: ( rule__NonMeasurementData__Alternatives_5_1 )
            // InternalSensidl.g:4436:3: rule__NonMeasurementData__Alternatives_5_1
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
    // InternalSensidl.g:4445:1: rule__NonMeasurementData__Group_5_1_0__0 : rule__NonMeasurementData__Group_5_1_0__0__Impl rule__NonMeasurementData__Group_5_1_0__1 ;
    public final void rule__NonMeasurementData__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4449:1: ( rule__NonMeasurementData__Group_5_1_0__0__Impl rule__NonMeasurementData__Group_5_1_0__1 )
            // InternalSensidl.g:4450:2: rule__NonMeasurementData__Group_5_1_0__0__Impl rule__NonMeasurementData__Group_5_1_0__1
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
    // InternalSensidl.g:4457:1: rule__NonMeasurementData__Group_5_1_0__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4461:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) ) )
            // InternalSensidl.g:4462:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) )
            {
            // InternalSensidl.g:4462:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 ) )
            // InternalSensidl.g:4463:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_0_0()); 
            // InternalSensidl.g:4464:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 )
            // InternalSensidl.g:4464:3: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0
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
    // InternalSensidl.g:4472:1: rule__NonMeasurementData__Group_5_1_0__1 : rule__NonMeasurementData__Group_5_1_0__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4476:1: ( rule__NonMeasurementData__Group_5_1_0__1__Impl )
            // InternalSensidl.g:4477:2: rule__NonMeasurementData__Group_5_1_0__1__Impl
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
    // InternalSensidl.g:4483:1: rule__NonMeasurementData__Group_5_1_0__1__Impl : ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4487:1: ( ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? ) )
            // InternalSensidl.g:4488:1: ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? )
            {
            // InternalSensidl.g:4488:1: ( ( rule__NonMeasurementData__Group_5_1_0_1__0 )? )
            // InternalSensidl.g:4489:2: ( rule__NonMeasurementData__Group_5_1_0_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_0_1()); 
            // InternalSensidl.g:4490:2: ( rule__NonMeasurementData__Group_5_1_0_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSensidl.g:4490:3: rule__NonMeasurementData__Group_5_1_0_1__0
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
    // InternalSensidl.g:4499:1: rule__NonMeasurementData__Group_5_1_0_1__0 : rule__NonMeasurementData__Group_5_1_0_1__0__Impl rule__NonMeasurementData__Group_5_1_0_1__1 ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4503:1: ( rule__NonMeasurementData__Group_5_1_0_1__0__Impl rule__NonMeasurementData__Group_5_1_0_1__1 )
            // InternalSensidl.g:4504:2: rule__NonMeasurementData__Group_5_1_0_1__0__Impl rule__NonMeasurementData__Group_5_1_0_1__1
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
    // InternalSensidl.g:4511:1: rule__NonMeasurementData__Group_5_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4515:1: ( ( ',' ) )
            // InternalSensidl.g:4516:1: ( ',' )
            {
            // InternalSensidl.g:4516:1: ( ',' )
            // InternalSensidl.g:4517:2: ','
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
    // InternalSensidl.g:4526:1: rule__NonMeasurementData__Group_5_1_0_1__1 : rule__NonMeasurementData__Group_5_1_0_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4530:1: ( rule__NonMeasurementData__Group_5_1_0_1__1__Impl )
            // InternalSensidl.g:4531:2: rule__NonMeasurementData__Group_5_1_0_1__1__Impl
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
    // InternalSensidl.g:4537:1: rule__NonMeasurementData__Group_5_1_0_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4541:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) ) )
            // InternalSensidl.g:4542:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) )
            {
            // InternalSensidl.g:4542:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 ) )
            // InternalSensidl.g:4543:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_0_1_1()); 
            // InternalSensidl.g:4544:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 )
            // InternalSensidl.g:4544:3: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1
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
    // InternalSensidl.g:4553:1: rule__NonMeasurementData__Group_5_1_1__0 : rule__NonMeasurementData__Group_5_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1__1 ;
    public final void rule__NonMeasurementData__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4557:1: ( rule__NonMeasurementData__Group_5_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1__1 )
            // InternalSensidl.g:4558:2: rule__NonMeasurementData__Group_5_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1__1
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
    // InternalSensidl.g:4565:1: rule__NonMeasurementData__Group_5_1_1__0__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4569:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) ) )
            // InternalSensidl.g:4570:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) )
            {
            // InternalSensidl.g:4570:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 ) )
            // InternalSensidl.g:4571:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_1_0()); 
            // InternalSensidl.g:4572:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 )
            // InternalSensidl.g:4572:3: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0
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
    // InternalSensidl.g:4580:1: rule__NonMeasurementData__Group_5_1_1__1 : rule__NonMeasurementData__Group_5_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4584:1: ( rule__NonMeasurementData__Group_5_1_1__1__Impl )
            // InternalSensidl.g:4585:2: rule__NonMeasurementData__Group_5_1_1__1__Impl
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
    // InternalSensidl.g:4591:1: rule__NonMeasurementData__Group_5_1_1__1__Impl : ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? ) ;
    public final void rule__NonMeasurementData__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4595:1: ( ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? ) )
            // InternalSensidl.g:4596:1: ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? )
            {
            // InternalSensidl.g:4596:1: ( ( rule__NonMeasurementData__Group_5_1_1_1__0 )? )
            // InternalSensidl.g:4597:2: ( rule__NonMeasurementData__Group_5_1_1_1__0 )?
            {
             before(grammarAccess.getNonMeasurementDataAccess().getGroup_5_1_1_1()); 
            // InternalSensidl.g:4598:2: ( rule__NonMeasurementData__Group_5_1_1_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSensidl.g:4598:3: rule__NonMeasurementData__Group_5_1_1_1__0
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
    // InternalSensidl.g:4607:1: rule__NonMeasurementData__Group_5_1_1_1__0 : rule__NonMeasurementData__Group_5_1_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1_1__1 ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4611:1: ( rule__NonMeasurementData__Group_5_1_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1_1__1 )
            // InternalSensidl.g:4612:2: rule__NonMeasurementData__Group_5_1_1_1__0__Impl rule__NonMeasurementData__Group_5_1_1_1__1
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
    // InternalSensidl.g:4619:1: rule__NonMeasurementData__Group_5_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4623:1: ( ( ',' ) )
            // InternalSensidl.g:4624:1: ( ',' )
            {
            // InternalSensidl.g:4624:1: ( ',' )
            // InternalSensidl.g:4625:2: ','
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
    // InternalSensidl.g:4634:1: rule__NonMeasurementData__Group_5_1_1_1__1 : rule__NonMeasurementData__Group_5_1_1_1__1__Impl ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4638:1: ( rule__NonMeasurementData__Group_5_1_1_1__1__Impl )
            // InternalSensidl.g:4639:2: rule__NonMeasurementData__Group_5_1_1_1__1__Impl
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
    // InternalSensidl.g:4645:1: rule__NonMeasurementData__Group_5_1_1_1__1__Impl : ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) ) ;
    public final void rule__NonMeasurementData__Group_5_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4649:1: ( ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) ) )
            // InternalSensidl.g:4650:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) )
            {
            // InternalSensidl.g:4650:1: ( ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 ) )
            // InternalSensidl.g:4651:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsAssignment_5_1_1_1_1()); 
            // InternalSensidl.g:4652:2: ( rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 )
            // InternalSensidl.g:4652:3: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1
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
    // InternalSensidl.g:4661:1: rule__MeasurementDataNotAdjustable__Group__0 : rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4665:1: ( rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1 )
            // InternalSensidl.g:4666:2: rule__MeasurementDataNotAdjustable__Group__0__Impl rule__MeasurementDataNotAdjustable__Group__1
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
    // InternalSensidl.g:4673:1: rule__MeasurementDataNotAdjustable__Group__0__Impl : ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4677:1: ( ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) ) )
            // InternalSensidl.g:4678:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            {
            // InternalSensidl.g:4678:1: ( ( rule__MeasurementDataNotAdjustable__NameAssignment_0 ) )
            // InternalSensidl.g:4679:2: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getNameAssignment_0()); 
            // InternalSensidl.g:4680:2: ( rule__MeasurementDataNotAdjustable__NameAssignment_0 )
            // InternalSensidl.g:4680:3: rule__MeasurementDataNotAdjustable__NameAssignment_0
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
    // InternalSensidl.g:4688:1: rule__MeasurementDataNotAdjustable__Group__1 : rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4692:1: ( rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2 )
            // InternalSensidl.g:4693:2: rule__MeasurementDataNotAdjustable__Group__1__Impl rule__MeasurementDataNotAdjustable__Group__2
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
    // InternalSensidl.g:4700:1: rule__MeasurementDataNotAdjustable__Group__1__Impl : ( 'as' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4704:1: ( ( 'as' ) )
            // InternalSensidl.g:4705:1: ( 'as' )
            {
            // InternalSensidl.g:4705:1: ( 'as' )
            // InternalSensidl.g:4706:2: 'as'
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
    // InternalSensidl.g:4715:1: rule__MeasurementDataNotAdjustable__Group__2 : rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 ;
    public final void rule__MeasurementDataNotAdjustable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4719:1: ( rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3 )
            // InternalSensidl.g:4720:2: rule__MeasurementDataNotAdjustable__Group__2__Impl rule__MeasurementDataNotAdjustable__Group__3
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
    // InternalSensidl.g:4727:1: rule__MeasurementDataNotAdjustable__Group__2__Impl : ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4731:1: ( ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) ) )
            // InternalSensidl.g:4732:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            {
            // InternalSensidl.g:4732:1: ( ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 ) )
            // InternalSensidl.g:4733:2: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDataTypeAssignment_2()); 
            // InternalSensidl.g:4734:2: ( rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 )
            // InternalSensidl.g:4734:3: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2
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
    // InternalSensidl.g:4742:1: rule__MeasurementDataNotAdjustable__Group__3 : rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 ;
    public final void rule__MeasurementDataNotAdjustable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4746:1: ( rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4 )
            // InternalSensidl.g:4747:2: rule__MeasurementDataNotAdjustable__Group__3__Impl rule__MeasurementDataNotAdjustable__Group__4
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
    // InternalSensidl.g:4754:1: rule__MeasurementDataNotAdjustable__Group__3__Impl : ( 'in' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4758:1: ( ( 'in' ) )
            // InternalSensidl.g:4759:1: ( 'in' )
            {
            // InternalSensidl.g:4759:1: ( 'in' )
            // InternalSensidl.g:4760:2: 'in'
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
    // InternalSensidl.g:4769:1: rule__MeasurementDataNotAdjustable__Group__4 : rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 ;
    public final void rule__MeasurementDataNotAdjustable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4773:1: ( rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5 )
            // InternalSensidl.g:4774:2: rule__MeasurementDataNotAdjustable__Group__4__Impl rule__MeasurementDataNotAdjustable__Group__5
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
    // InternalSensidl.g:4781:1: rule__MeasurementDataNotAdjustable__Group__4__Impl : ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4785:1: ( ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) ) )
            // InternalSensidl.g:4786:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            {
            // InternalSensidl.g:4786:1: ( ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 ) )
            // InternalSensidl.g:4787:2: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getUnitAssignment_4()); 
            // InternalSensidl.g:4788:2: ( rule__MeasurementDataNotAdjustable__UnitAssignment_4 )
            // InternalSensidl.g:4788:3: rule__MeasurementDataNotAdjustable__UnitAssignment_4
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
    // InternalSensidl.g:4796:1: rule__MeasurementDataNotAdjustable__Group__5 : rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 ;
    public final void rule__MeasurementDataNotAdjustable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4800:1: ( rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6 )
            // InternalSensidl.g:4801:2: rule__MeasurementDataNotAdjustable__Group__5__Impl rule__MeasurementDataNotAdjustable__Group__6
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
    // InternalSensidl.g:4808:1: rule__MeasurementDataNotAdjustable__Group__5__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4812:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? ) )
            // InternalSensidl.g:4813:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            {
            // InternalSensidl.g:4813:1: ( ( rule__MeasurementDataNotAdjustable__Group_5__0 )? )
            // InternalSensidl.g:4814:2: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_5()); 
            // InternalSensidl.g:4815:2: ( rule__MeasurementDataNotAdjustable__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSensidl.g:4815:3: rule__MeasurementDataNotAdjustable__Group_5__0
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
    // InternalSensidl.g:4823:1: rule__MeasurementDataNotAdjustable__Group__6 : rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 ;
    public final void rule__MeasurementDataNotAdjustable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4827:1: ( rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7 )
            // InternalSensidl.g:4828:2: rule__MeasurementDataNotAdjustable__Group__6__Impl rule__MeasurementDataNotAdjustable__Group__7
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
    // InternalSensidl.g:4835:1: rule__MeasurementDataNotAdjustable__Group__6__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4839:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? ) )
            // InternalSensidl.g:4840:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            {
            // InternalSensidl.g:4840:1: ( ( rule__MeasurementDataNotAdjustable__Group_6__0 )? )
            // InternalSensidl.g:4841:2: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6()); 
            // InternalSensidl.g:4842:2: ( rule__MeasurementDataNotAdjustable__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSensidl.g:4842:3: rule__MeasurementDataNotAdjustable__Group_6__0
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
    // InternalSensidl.g:4850:1: rule__MeasurementDataNotAdjustable__Group__7 : rule__MeasurementDataNotAdjustable__Group__7__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4854:1: ( rule__MeasurementDataNotAdjustable__Group__7__Impl )
            // InternalSensidl.g:4855:2: rule__MeasurementDataNotAdjustable__Group__7__Impl
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
    // InternalSensidl.g:4861:1: rule__MeasurementDataNotAdjustable__Group__7__Impl : ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4865:1: ( ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? ) )
            // InternalSensidl.g:4866:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            {
            // InternalSensidl.g:4866:1: ( ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )? )
            // InternalSensidl.g:4867:2: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getDescriptionAssignment_7()); 
            // InternalSensidl.g:4868:2: ( rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DESCRIPTION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSensidl.g:4868:3: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7
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
    // InternalSensidl.g:4877:1: rule__MeasurementDataNotAdjustable__Group_5__0 : rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4881:1: ( rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1 )
            // InternalSensidl.g:4882:2: rule__MeasurementDataNotAdjustable__Group_5__0__Impl rule__MeasurementDataNotAdjustable__Group_5__1
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
    // InternalSensidl.g:4889:1: rule__MeasurementDataNotAdjustable__Group_5__0__Impl : ( 'with identifier' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4893:1: ( ( 'with identifier' ) )
            // InternalSensidl.g:4894:1: ( 'with identifier' )
            {
            // InternalSensidl.g:4894:1: ( 'with identifier' )
            // InternalSensidl.g:4895:2: 'with identifier'
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
    // InternalSensidl.g:4904:1: rule__MeasurementDataNotAdjustable__Group_5__1 : rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4908:1: ( rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2 )
            // InternalSensidl.g:4909:2: rule__MeasurementDataNotAdjustable__Group_5__1__Impl rule__MeasurementDataNotAdjustable__Group_5__2
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
    // InternalSensidl.g:4916:1: rule__MeasurementDataNotAdjustable__Group_5__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4920:1: ( ( ':' ) )
            // InternalSensidl.g:4921:1: ( ':' )
            {
            // InternalSensidl.g:4921:1: ( ':' )
            // InternalSensidl.g:4922:2: ':'
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
    // InternalSensidl.g:4931:1: rule__MeasurementDataNotAdjustable__Group_5__2 : rule__MeasurementDataNotAdjustable__Group_5__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4935:1: ( rule__MeasurementDataNotAdjustable__Group_5__2__Impl )
            // InternalSensidl.g:4936:2: rule__MeasurementDataNotAdjustable__Group_5__2__Impl
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
    // InternalSensidl.g:4942:1: rule__MeasurementDataNotAdjustable__Group_5__2__Impl : ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4946:1: ( ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) ) )
            // InternalSensidl.g:4947:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            {
            // InternalSensidl.g:4947:1: ( ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 ) )
            // InternalSensidl.g:4948:2: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getIDAssignment_5_2()); 
            // InternalSensidl.g:4949:2: ( rule__MeasurementDataNotAdjustable__IDAssignment_5_2 )
            // InternalSensidl.g:4949:3: rule__MeasurementDataNotAdjustable__IDAssignment_5_2
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
    // InternalSensidl.g:4958:1: rule__MeasurementDataNotAdjustable__Group_6__0 : rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4962:1: ( rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1 )
            // InternalSensidl.g:4963:2: rule__MeasurementDataNotAdjustable__Group_6__0__Impl rule__MeasurementDataNotAdjustable__Group_6__1
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
    // InternalSensidl.g:4970:1: rule__MeasurementDataNotAdjustable__Group_6__0__Impl : ( 'exclude' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4974:1: ( ( 'exclude' ) )
            // InternalSensidl.g:4975:1: ( 'exclude' )
            {
            // InternalSensidl.g:4975:1: ( 'exclude' )
            // InternalSensidl.g:4976:2: 'exclude'
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
    // InternalSensidl.g:4985:1: rule__MeasurementDataNotAdjustable__Group_6__1 : rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:4989:1: ( rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2 )
            // InternalSensidl.g:4990:2: rule__MeasurementDataNotAdjustable__Group_6__1__Impl rule__MeasurementDataNotAdjustable__Group_6__2
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
    // InternalSensidl.g:4997:1: rule__MeasurementDataNotAdjustable__Group_6__1__Impl : ( ':' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5001:1: ( ( ':' ) )
            // InternalSensidl.g:5002:1: ( ':' )
            {
            // InternalSensidl.g:5002:1: ( ':' )
            // InternalSensidl.g:5003:2: ':'
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
    // InternalSensidl.g:5012:1: rule__MeasurementDataNotAdjustable__Group_6__2 : rule__MeasurementDataNotAdjustable__Group_6__2__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5016:1: ( rule__MeasurementDataNotAdjustable__Group_6__2__Impl )
            // InternalSensidl.g:5017:2: rule__MeasurementDataNotAdjustable__Group_6__2__Impl
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
    // InternalSensidl.g:5023:1: rule__MeasurementDataNotAdjustable__Group_6__2__Impl : ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5027:1: ( ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) ) )
            // InternalSensidl.g:5028:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            {
            // InternalSensidl.g:5028:1: ( ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 ) )
            // InternalSensidl.g:5029:2: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getAlternatives_6_2()); 
            // InternalSensidl.g:5030:2: ( rule__MeasurementDataNotAdjustable__Alternatives_6_2 )
            // InternalSensidl.g:5030:3: rule__MeasurementDataNotAdjustable__Alternatives_6_2
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
    // InternalSensidl.g:5039:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5043:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1 )
            // InternalSensidl.g:5044:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0__1
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
    // InternalSensidl.g:5051:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5055:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) ) )
            // InternalSensidl.g:5056:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            {
            // InternalSensidl.g:5056:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 ) )
            // InternalSensidl.g:5057:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_0()); 
            // InternalSensidl.g:5058:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 )
            // InternalSensidl.g:5058:3: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0
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
    // InternalSensidl.g:5066:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5070:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl )
            // InternalSensidl.g:5071:2: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl
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
    // InternalSensidl.g:5077:1: rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5081:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? ) )
            // InternalSensidl.g:5082:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            {
            // InternalSensidl.g:5082:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )? )
            // InternalSensidl.g:5083:2: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_0_1()); 
            // InternalSensidl.g:5084:2: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSensidl.g:5084:3: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0
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
    // InternalSensidl.g:5093:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5097:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 )
            // InternalSensidl.g:5098:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1
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
    // InternalSensidl.g:5105:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5109:1: ( ( ',' ) )
            // InternalSensidl.g:5110:1: ( ',' )
            {
            // InternalSensidl.g:5110:1: ( ',' )
            // InternalSensidl.g:5111:2: ','
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
    // InternalSensidl.g:5120:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5124:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl )
            // InternalSensidl.g:5125:2: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl
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
    // InternalSensidl.g:5131:1: rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5135:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) ) )
            // InternalSensidl.g:5136:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            {
            // InternalSensidl.g:5136:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 ) )
            // InternalSensidl.g:5137:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_0_1_1()); 
            // InternalSensidl.g:5138:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 )
            // InternalSensidl.g:5138:3: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1
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
    // InternalSensidl.g:5147:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5151:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1 )
            // InternalSensidl.g:5152:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1__1
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
    // InternalSensidl.g:5159:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5163:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) ) )
            // InternalSensidl.g:5164:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            {
            // InternalSensidl.g:5164:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 ) )
            // InternalSensidl.g:5165:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_0()); 
            // InternalSensidl.g:5166:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 )
            // InternalSensidl.g:5166:3: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0
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
    // InternalSensidl.g:5174:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5178:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl )
            // InternalSensidl.g:5179:2: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl
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
    // InternalSensidl.g:5185:1: rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5189:1: ( ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? ) )
            // InternalSensidl.g:5190:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            {
            // InternalSensidl.g:5190:1: ( ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )? )
            // InternalSensidl.g:5191:2: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getGroup_6_2_1_1()); 
            // InternalSensidl.g:5192:2: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSensidl.g:5192:3: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0
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
    // InternalSensidl.g:5201:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5205:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 )
            // InternalSensidl.g:5206:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1
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
    // InternalSensidl.g:5213:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5217:1: ( ( ',' ) )
            // InternalSensidl.g:5218:1: ( ',' )
            {
            // InternalSensidl.g:5218:1: ( ',' )
            // InternalSensidl.g:5219:2: ','
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
    // InternalSensidl.g:5228:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1 : rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5232:1: ( rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl )
            // InternalSensidl.g:5233:2: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl
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
    // InternalSensidl.g:5239:1: rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl : ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) ;
    public final void rule__MeasurementDataNotAdjustable__Group_6_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5243:1: ( ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) ) )
            // InternalSensidl.g:5244:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            {
            // InternalSensidl.g:5244:1: ( ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 ) )
            // InternalSensidl.g:5245:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsAssignment_6_2_1_1_1()); 
            // InternalSensidl.g:5246:2: ( rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 )
            // InternalSensidl.g:5246:3: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1
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
    // InternalSensidl.g:5255:1: rule__DataRange__Group__0 : rule__DataRange__Group__0__Impl rule__DataRange__Group__1 ;
    public final void rule__DataRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5259:1: ( rule__DataRange__Group__0__Impl rule__DataRange__Group__1 )
            // InternalSensidl.g:5260:2: rule__DataRange__Group__0__Impl rule__DataRange__Group__1
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
    // InternalSensidl.g:5267:1: rule__DataRange__Group__0__Impl : ( 'with range' ) ;
    public final void rule__DataRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5271:1: ( ( 'with range' ) )
            // InternalSensidl.g:5272:1: ( 'with range' )
            {
            // InternalSensidl.g:5272:1: ( 'with range' )
            // InternalSensidl.g:5273:2: 'with range'
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
    // InternalSensidl.g:5282:1: rule__DataRange__Group__1 : rule__DataRange__Group__1__Impl ;
    public final void rule__DataRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5286:1: ( rule__DataRange__Group__1__Impl )
            // InternalSensidl.g:5287:2: rule__DataRange__Group__1__Impl
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
    // InternalSensidl.g:5293:1: rule__DataRange__Group__1__Impl : ( ( rule__DataRange__RangeAssignment_1 ) ) ;
    public final void rule__DataRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5297:1: ( ( ( rule__DataRange__RangeAssignment_1 ) ) )
            // InternalSensidl.g:5298:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            {
            // InternalSensidl.g:5298:1: ( ( rule__DataRange__RangeAssignment_1 ) )
            // InternalSensidl.g:5299:2: ( rule__DataRange__RangeAssignment_1 )
            {
             before(grammarAccess.getDataRangeAccess().getRangeAssignment_1()); 
            // InternalSensidl.g:5300:2: ( rule__DataRange__RangeAssignment_1 )
            // InternalSensidl.g:5300:3: rule__DataRange__RangeAssignment_1
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
    // InternalSensidl.g:5309:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5313:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSensidl.g:5314:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
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
    // InternalSensidl.g:5321:1: rule__Interval__Group__0__Impl : ( '[' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5325:1: ( ( '[' ) )
            // InternalSensidl.g:5326:1: ( '[' )
            {
            // InternalSensidl.g:5326:1: ( '[' )
            // InternalSensidl.g:5327:2: '['
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
    // InternalSensidl.g:5336:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5340:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSensidl.g:5341:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
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
    // InternalSensidl.g:5348:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__LowerBoundAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5352:1: ( ( ( rule__Interval__LowerBoundAssignment_1 ) ) )
            // InternalSensidl.g:5353:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            {
            // InternalSensidl.g:5353:1: ( ( rule__Interval__LowerBoundAssignment_1 ) )
            // InternalSensidl.g:5354:2: ( rule__Interval__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getLowerBoundAssignment_1()); 
            // InternalSensidl.g:5355:2: ( rule__Interval__LowerBoundAssignment_1 )
            // InternalSensidl.g:5355:3: rule__Interval__LowerBoundAssignment_1
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
    // InternalSensidl.g:5363:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5367:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSensidl.g:5368:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
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
    // InternalSensidl.g:5375:1: rule__Interval__Group__2__Impl : ( ';' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5379:1: ( ( ';' ) )
            // InternalSensidl.g:5380:1: ( ';' )
            {
            // InternalSensidl.g:5380:1: ( ';' )
            // InternalSensidl.g:5381:2: ';'
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
    // InternalSensidl.g:5390:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5394:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSensidl.g:5395:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
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
    // InternalSensidl.g:5402:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__UpperBoundAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5406:1: ( ( ( rule__Interval__UpperBoundAssignment_3 ) ) )
            // InternalSensidl.g:5407:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            {
            // InternalSensidl.g:5407:1: ( ( rule__Interval__UpperBoundAssignment_3 ) )
            // InternalSensidl.g:5408:2: ( rule__Interval__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getUpperBoundAssignment_3()); 
            // InternalSensidl.g:5409:2: ( rule__Interval__UpperBoundAssignment_3 )
            // InternalSensidl.g:5409:3: rule__Interval__UpperBoundAssignment_3
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
    // InternalSensidl.g:5417:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5421:1: ( rule__Interval__Group__4__Impl )
            // InternalSensidl.g:5422:2: rule__Interval__Group__4__Impl
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
    // InternalSensidl.g:5428:1: rule__Interval__Group__4__Impl : ( ']' ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5432:1: ( ( ']' ) )
            // InternalSensidl.g:5433:1: ( ']' )
            {
            // InternalSensidl.g:5433:1: ( ']' )
            // InternalSensidl.g:5434:2: ']'
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
    // InternalSensidl.g:5444:1: rule__LinearDataConversion__Group__0 : rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 ;
    public final void rule__LinearDataConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5448:1: ( rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1 )
            // InternalSensidl.g:5449:2: rule__LinearDataConversion__Group__0__Impl rule__LinearDataConversion__Group__1
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
    // InternalSensidl.g:5456:1: rule__LinearDataConversion__Group__0__Impl : ( 'with scaling factor' ) ;
    public final void rule__LinearDataConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5460:1: ( ( 'with scaling factor' ) )
            // InternalSensidl.g:5461:1: ( 'with scaling factor' )
            {
            // InternalSensidl.g:5461:1: ( 'with scaling factor' )
            // InternalSensidl.g:5462:2: 'with scaling factor'
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
    // InternalSensidl.g:5471:1: rule__LinearDataConversion__Group__1 : rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 ;
    public final void rule__LinearDataConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5475:1: ( rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2 )
            // InternalSensidl.g:5476:2: rule__LinearDataConversion__Group__1__Impl rule__LinearDataConversion__Group__2
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
    // InternalSensidl.g:5483:1: rule__LinearDataConversion__Group__1__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5487:1: ( ( ':' ) )
            // InternalSensidl.g:5488:1: ( ':' )
            {
            // InternalSensidl.g:5488:1: ( ':' )
            // InternalSensidl.g:5489:2: ':'
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
    // InternalSensidl.g:5498:1: rule__LinearDataConversion__Group__2 : rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 ;
    public final void rule__LinearDataConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5502:1: ( rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3 )
            // InternalSensidl.g:5503:2: rule__LinearDataConversion__Group__2__Impl rule__LinearDataConversion__Group__3
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
    // InternalSensidl.g:5510:1: rule__LinearDataConversion__Group__2__Impl : ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) ;
    public final void rule__LinearDataConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5514:1: ( ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) ) )
            // InternalSensidl.g:5515:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            {
            // InternalSensidl.g:5515:1: ( ( rule__LinearDataConversion__ScalingFactorAssignment_2 ) )
            // InternalSensidl.g:5516:2: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getScalingFactorAssignment_2()); 
            // InternalSensidl.g:5517:2: ( rule__LinearDataConversion__ScalingFactorAssignment_2 )
            // InternalSensidl.g:5517:3: rule__LinearDataConversion__ScalingFactorAssignment_2
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
    // InternalSensidl.g:5525:1: rule__LinearDataConversion__Group__3 : rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 ;
    public final void rule__LinearDataConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5529:1: ( rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4 )
            // InternalSensidl.g:5530:2: rule__LinearDataConversion__Group__3__Impl rule__LinearDataConversion__Group__4
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
    // InternalSensidl.g:5537:1: rule__LinearDataConversion__Group__3__Impl : ( 'and offset' ) ;
    public final void rule__LinearDataConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5541:1: ( ( 'and offset' ) )
            // InternalSensidl.g:5542:1: ( 'and offset' )
            {
            // InternalSensidl.g:5542:1: ( 'and offset' )
            // InternalSensidl.g:5543:2: 'and offset'
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
    // InternalSensidl.g:5552:1: rule__LinearDataConversion__Group__4 : rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 ;
    public final void rule__LinearDataConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5556:1: ( rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5 )
            // InternalSensidl.g:5557:2: rule__LinearDataConversion__Group__4__Impl rule__LinearDataConversion__Group__5
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
    // InternalSensidl.g:5564:1: rule__LinearDataConversion__Group__4__Impl : ( ':' ) ;
    public final void rule__LinearDataConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5568:1: ( ( ':' ) )
            // InternalSensidl.g:5569:1: ( ':' )
            {
            // InternalSensidl.g:5569:1: ( ':' )
            // InternalSensidl.g:5570:2: ':'
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
    // InternalSensidl.g:5579:1: rule__LinearDataConversion__Group__5 : rule__LinearDataConversion__Group__5__Impl ;
    public final void rule__LinearDataConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5583:1: ( rule__LinearDataConversion__Group__5__Impl )
            // InternalSensidl.g:5584:2: rule__LinearDataConversion__Group__5__Impl
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
    // InternalSensidl.g:5590:1: rule__LinearDataConversion__Group__5__Impl : ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) ;
    public final void rule__LinearDataConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5594:1: ( ( ( rule__LinearDataConversion__OffsetAssignment_5 ) ) )
            // InternalSensidl.g:5595:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            {
            // InternalSensidl.g:5595:1: ( ( rule__LinearDataConversion__OffsetAssignment_5 ) )
            // InternalSensidl.g:5596:2: ( rule__LinearDataConversion__OffsetAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionAccess().getOffsetAssignment_5()); 
            // InternalSensidl.g:5597:2: ( rule__LinearDataConversion__OffsetAssignment_5 )
            // InternalSensidl.g:5597:3: rule__LinearDataConversion__OffsetAssignment_5
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
    // InternalSensidl.g:5606:1: rule__LinearDataConversionWithInterval__Group__0 : rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 ;
    public final void rule__LinearDataConversionWithInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5610:1: ( rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1 )
            // InternalSensidl.g:5611:2: rule__LinearDataConversionWithInterval__Group__0__Impl rule__LinearDataConversionWithInterval__Group__1
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
    // InternalSensidl.g:5618:1: rule__LinearDataConversionWithInterval__Group__0__Impl : ( 'by linear mapping' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5622:1: ( ( 'by linear mapping' ) )
            // InternalSensidl.g:5623:1: ( 'by linear mapping' )
            {
            // InternalSensidl.g:5623:1: ( 'by linear mapping' )
            // InternalSensidl.g:5624:2: 'by linear mapping'
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
    // InternalSensidl.g:5633:1: rule__LinearDataConversionWithInterval__Group__1 : rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 ;
    public final void rule__LinearDataConversionWithInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5637:1: ( rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2 )
            // InternalSensidl.g:5638:2: rule__LinearDataConversionWithInterval__Group__1__Impl rule__LinearDataConversionWithInterval__Group__2
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
    // InternalSensidl.g:5645:1: rule__LinearDataConversionWithInterval__Group__1__Impl : ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5649:1: ( ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) ) )
            // InternalSensidl.g:5650:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            {
            // InternalSensidl.g:5650:1: ( ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 ) )
            // InternalSensidl.g:5651:2: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getFromIntervalAssignment_1()); 
            // InternalSensidl.g:5652:2: ( rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 )
            // InternalSensidl.g:5652:3: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1
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
    // InternalSensidl.g:5660:1: rule__LinearDataConversionWithInterval__Group__2 : rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 ;
    public final void rule__LinearDataConversionWithInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5664:1: ( rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3 )
            // InternalSensidl.g:5665:2: rule__LinearDataConversionWithInterval__Group__2__Impl rule__LinearDataConversionWithInterval__Group__3
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
    // InternalSensidl.g:5672:1: rule__LinearDataConversionWithInterval__Group__2__Impl : ( '=>' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5676:1: ( ( '=>' ) )
            // InternalSensidl.g:5677:1: ( '=>' )
            {
            // InternalSensidl.g:5677:1: ( '=>' )
            // InternalSensidl.g:5678:2: '=>'
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
    // InternalSensidl.g:5687:1: rule__LinearDataConversionWithInterval__Group__3 : rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 ;
    public final void rule__LinearDataConversionWithInterval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5691:1: ( rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4 )
            // InternalSensidl.g:5692:2: rule__LinearDataConversionWithInterval__Group__3__Impl rule__LinearDataConversionWithInterval__Group__4
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
    // InternalSensidl.g:5699:1: rule__LinearDataConversionWithInterval__Group__3__Impl : ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5703:1: ( ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) ) )
            // InternalSensidl.g:5704:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            {
            // InternalSensidl.g:5704:1: ( ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 ) )
            // InternalSensidl.g:5705:2: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getToIntervalAssignment_3()); 
            // InternalSensidl.g:5706:2: ( rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 )
            // InternalSensidl.g:5706:3: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3
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
    // InternalSensidl.g:5714:1: rule__LinearDataConversionWithInterval__Group__4 : rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 ;
    public final void rule__LinearDataConversionWithInterval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5718:1: ( rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5 )
            // InternalSensidl.g:5719:2: rule__LinearDataConversionWithInterval__Group__4__Impl rule__LinearDataConversionWithInterval__Group__5
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
    // InternalSensidl.g:5726:1: rule__LinearDataConversionWithInterval__Group__4__Impl : ( 'as' ) ;
    public final void rule__LinearDataConversionWithInterval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5730:1: ( ( 'as' ) )
            // InternalSensidl.g:5731:1: ( 'as' )
            {
            // InternalSensidl.g:5731:1: ( 'as' )
            // InternalSensidl.g:5732:2: 'as'
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
    // InternalSensidl.g:5741:1: rule__LinearDataConversionWithInterval__Group__5 : rule__LinearDataConversionWithInterval__Group__5__Impl ;
    public final void rule__LinearDataConversionWithInterval__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5745:1: ( rule__LinearDataConversionWithInterval__Group__5__Impl )
            // InternalSensidl.g:5746:2: rule__LinearDataConversionWithInterval__Group__5__Impl
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
    // InternalSensidl.g:5752:1: rule__LinearDataConversionWithInterval__Group__5__Impl : ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) ;
    public final void rule__LinearDataConversionWithInterval__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5756:1: ( ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) ) )
            // InternalSensidl.g:5757:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            {
            // InternalSensidl.g:5757:1: ( ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 ) )
            // InternalSensidl.g:5758:2: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            {
             before(grammarAccess.getLinearDataConversionWithIntervalAccess().getDataTypeAssignment_5()); 
            // InternalSensidl.g:5759:2: ( rule__LinearDataConversionWithInterval__DataTypeAssignment_5 )
            // InternalSensidl.g:5759:3: rule__LinearDataConversionWithInterval__DataTypeAssignment_5
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
    // InternalSensidl.g:5768:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5772:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalSensidl.g:5773:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
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
    // InternalSensidl.g:5780:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5784:1: ( ( ( '-' )? ) )
            // InternalSensidl.g:5785:1: ( ( '-' )? )
            {
            // InternalSensidl.g:5785:1: ( ( '-' )? )
            // InternalSensidl.g:5786:2: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // InternalSensidl.g:5787:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==61) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSensidl.g:5787:3: '-'
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
    // InternalSensidl.g:5795:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5799:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalSensidl.g:5800:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
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
    // InternalSensidl.g:5807:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5811:1: ( ( RULE_INT ) )
            // InternalSensidl.g:5812:1: ( RULE_INT )
            {
            // InternalSensidl.g:5812:1: ( RULE_INT )
            // InternalSensidl.g:5813:2: RULE_INT
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
    // InternalSensidl.g:5822:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5826:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalSensidl.g:5827:2: rule__DOUBLE__Group__2__Impl
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
    // InternalSensidl.g:5833:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5837:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // InternalSensidl.g:5838:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // InternalSensidl.g:5838:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // InternalSensidl.g:5839:2: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // InternalSensidl.g:5840:2: ( rule__DOUBLE__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSensidl.g:5840:3: rule__DOUBLE__Group_2__0
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
    // InternalSensidl.g:5849:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5853:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // InternalSensidl.g:5854:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
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
    // InternalSensidl.g:5861:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5865:1: ( ( '.' ) )
            // InternalSensidl.g:5866:1: ( '.' )
            {
            // InternalSensidl.g:5866:1: ( '.' )
            // InternalSensidl.g:5867:2: '.'
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
    // InternalSensidl.g:5876:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5880:1: ( rule__DOUBLE__Group_2__1__Impl )
            // InternalSensidl.g:5881:2: rule__DOUBLE__Group_2__1__Impl
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
    // InternalSensidl.g:5887:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5891:1: ( ( RULE_INT ) )
            // InternalSensidl.g:5892:1: ( RULE_INT )
            {
            // InternalSensidl.g:5892:1: ( RULE_INT )
            // InternalSensidl.g:5893:2: RULE_INT
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
    // InternalSensidl.g:5903:1: rule__UNIT__Group__0 : rule__UNIT__Group__0__Impl rule__UNIT__Group__1 ;
    public final void rule__UNIT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5907:1: ( rule__UNIT__Group__0__Impl rule__UNIT__Group__1 )
            // InternalSensidl.g:5908:2: rule__UNIT__Group__0__Impl rule__UNIT__Group__1
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
    // InternalSensidl.g:5915:1: rule__UNIT__Group__0__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5919:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:5920:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:5920:1: ( ( RULE_ID )* )
            // InternalSensidl.g:5921:2: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_0()); 
            // InternalSensidl.g:5922:2: ( RULE_ID )*
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
            	    // InternalSensidl.g:5922:3: RULE_ID
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
    // InternalSensidl.g:5930:1: rule__UNIT__Group__1 : rule__UNIT__Group__1__Impl ;
    public final void rule__UNIT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5934:1: ( rule__UNIT__Group__1__Impl )
            // InternalSensidl.g:5935:2: rule__UNIT__Group__1__Impl
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
    // InternalSensidl.g:5941:1: rule__UNIT__Group__1__Impl : ( ( rule__UNIT__Group_1__0 )* ) ;
    public final void rule__UNIT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5945:1: ( ( ( rule__UNIT__Group_1__0 )* ) )
            // InternalSensidl.g:5946:1: ( ( rule__UNIT__Group_1__0 )* )
            {
            // InternalSensidl.g:5946:1: ( ( rule__UNIT__Group_1__0 )* )
            // InternalSensidl.g:5947:2: ( rule__UNIT__Group_1__0 )*
            {
             before(grammarAccess.getUNITAccess().getGroup_1()); 
            // InternalSensidl.g:5948:2: ( rule__UNIT__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ANY_OTHER) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalSensidl.g:5948:3: rule__UNIT__Group_1__0
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
    // InternalSensidl.g:5957:1: rule__UNIT__Group_1__0 : rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 ;
    public final void rule__UNIT__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5961:1: ( rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1 )
            // InternalSensidl.g:5962:2: rule__UNIT__Group_1__0__Impl rule__UNIT__Group_1__1
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
    // InternalSensidl.g:5969:1: rule__UNIT__Group_1__0__Impl : ( RULE_ANY_OTHER ) ;
    public final void rule__UNIT__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5973:1: ( ( RULE_ANY_OTHER ) )
            // InternalSensidl.g:5974:1: ( RULE_ANY_OTHER )
            {
            // InternalSensidl.g:5974:1: ( RULE_ANY_OTHER )
            // InternalSensidl.g:5975:2: RULE_ANY_OTHER
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
    // InternalSensidl.g:5984:1: rule__UNIT__Group_1__1 : rule__UNIT__Group_1__1__Impl ;
    public final void rule__UNIT__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5988:1: ( rule__UNIT__Group_1__1__Impl )
            // InternalSensidl.g:5989:2: rule__UNIT__Group_1__1__Impl
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
    // InternalSensidl.g:5995:1: rule__UNIT__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__UNIT__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:5999:1: ( ( ( RULE_ID )* ) )
            // InternalSensidl.g:6000:1: ( ( RULE_ID )* )
            {
            // InternalSensidl.g:6000:1: ( ( RULE_ID )* )
            // InternalSensidl.g:6001:2: ( RULE_ID )*
            {
             before(grammarAccess.getUNITAccess().getIDTerminalRuleCall_1_1()); 
            // InternalSensidl.g:6002:2: ( RULE_ID )*
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
            	    // InternalSensidl.g:6002:3: RULE_ID
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
    // InternalSensidl.g:6011:1: rule__SensorInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6015:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6016:2: ( RULE_ID )
            {
            // InternalSensidl.g:6016:2: ( RULE_ID )
            // InternalSensidl.g:6017:3: RULE_ID
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
    // InternalSensidl.g:6026:1: rule__SensorInterface__DescriptionAssignment_2 : ( RULE_DESCRIPTION ) ;
    public final void rule__SensorInterface__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6030:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6031:2: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6031:2: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6032:3: RULE_DESCRIPTION
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
    // InternalSensidl.g:6041:1: rule__SensorInterface__IDAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__SensorInterface__IDAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6045:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6046:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6046:2: ( RULE_STRING )
            // InternalSensidl.g:6047:3: RULE_STRING
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
    // InternalSensidl.g:6056:1: rule__SensorInterface__EncodingSettingsAssignment_5 : ( ruleEncodingSettings ) ;
    public final void rule__SensorInterface__EncodingSettingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6060:1: ( ( ruleEncodingSettings ) )
            // InternalSensidl.g:6061:2: ( ruleEncodingSettings )
            {
            // InternalSensidl.g:6061:2: ( ruleEncodingSettings )
            // InternalSensidl.g:6062:3: ruleEncodingSettings
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
    // InternalSensidl.g:6071:1: rule__SensorInterface__DataDescriptionAssignment_6 : ( ruleSensorDataDescription ) ;
    public final void rule__SensorInterface__DataDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6075:1: ( ( ruleSensorDataDescription ) )
            // InternalSensidl.g:6076:2: ( ruleSensorDataDescription )
            {
            // InternalSensidl.g:6076:2: ( ruleSensorDataDescription )
            // InternalSensidl.g:6077:3: ruleSensorDataDescription
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
    // InternalSensidl.g:6086:1: rule__EncodingSettings__CodingAssignment_2 : ( ruleCoding ) ;
    public final void rule__EncodingSettings__CodingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6090:1: ( ( ruleCoding ) )
            // InternalSensidl.g:6091:2: ( ruleCoding )
            {
            // InternalSensidl.g:6091:2: ( ruleCoding )
            // InternalSensidl.g:6092:3: ruleCoding
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
    // InternalSensidl.g:6101:1: rule__EncodingSettings__EndiannessAssignment_6 : ( ruleEndianness ) ;
    public final void rule__EncodingSettings__EndiannessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6105:1: ( ( ruleEndianness ) )
            // InternalSensidl.g:6106:2: ( ruleEndianness )
            {
            // InternalSensidl.g:6106:2: ( ruleEndianness )
            // InternalSensidl.g:6107:3: ruleEndianness
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
    // InternalSensidl.g:6116:1: rule__EncodingSettings__AlignmentAssignment_10 : ( RULE_INT ) ;
    public final void rule__EncodingSettings__AlignmentAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6120:1: ( ( RULE_INT ) )
            // InternalSensidl.g:6121:2: ( RULE_INT )
            {
            // InternalSensidl.g:6121:2: ( RULE_INT )
            // InternalSensidl.g:6122:3: RULE_INT
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
    // InternalSensidl.g:6131:1: rule__EncodingSettings__IDAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__EncodingSettings__IDAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6135:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6136:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6136:2: ( RULE_STRING )
            // InternalSensidl.g:6137:3: RULE_STRING
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
    // InternalSensidl.g:6146:1: rule__SensorDataDescription__IDAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__SensorDataDescription__IDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6150:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6151:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6151:2: ( RULE_STRING )
            // InternalSensidl.g:6152:3: RULE_STRING
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
    // InternalSensidl.g:6161:1: rule__SensorDataDescription__DataSetsAssignment_4 : ( ruleDataSet ) ;
    public final void rule__SensorDataDescription__DataSetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6165:1: ( ( ruleDataSet ) )
            // InternalSensidl.g:6166:2: ( ruleDataSet )
            {
            // InternalSensidl.g:6166:2: ( ruleDataSet )
            // InternalSensidl.g:6167:3: ruleDataSet
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
    // InternalSensidl.g:6176:1: rule__DataSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6180:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6181:2: ( RULE_ID )
            {
            // InternalSensidl.g:6181:2: ( RULE_ID )
            // InternalSensidl.g:6182:3: RULE_ID
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
    // InternalSensidl.g:6191:1: rule__DataSet__UsedDataSetsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__UsedDataSetsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6195:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6196:2: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6196:2: ( ( RULE_ID ) )
            // InternalSensidl.g:6197:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_2_1_0()); 
            // InternalSensidl.g:6198:3: ( RULE_ID )
            // InternalSensidl.g:6199:4: RULE_ID
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
    // InternalSensidl.g:6210:1: rule__DataSet__UsedDataSetsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSet__UsedDataSetsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6214:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6215:2: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6215:2: ( ( RULE_ID ) )
            // InternalSensidl.g:6216:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSetAccess().getUsedDataSetsDataSetCrossReference_3_1_0()); 
            // InternalSensidl.g:6217:3: ( RULE_ID )
            // InternalSensidl.g:6218:4: RULE_ID
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
    // InternalSensidl.g:6229:1: rule__DataSet__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__DataSet__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6233:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6234:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6234:2: ( RULE_STRING )
            // InternalSensidl.g:6235:3: RULE_STRING
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
    // InternalSensidl.g:6244:1: rule__DataSet__DescriptionAssignment_5 : ( RULE_DESCRIPTION ) ;
    public final void rule__DataSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6248:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6249:2: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6249:2: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6250:3: RULE_DESCRIPTION
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
    // InternalSensidl.g:6259:1: rule__DataSet__DataAssignment_7_0 : ( ruleData ) ;
    public final void rule__DataSet__DataAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6263:1: ( ( ruleData ) )
            // InternalSensidl.g:6264:2: ( ruleData )
            {
            // InternalSensidl.g:6264:2: ( ruleData )
            // InternalSensidl.g:6265:3: ruleData
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
    // InternalSensidl.g:6274:1: rule__DataSet__MethodAssignment_7_1 : ( ruleMethod ) ;
    public final void rule__DataSet__MethodAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6278:1: ( ( ruleMethod ) )
            // InternalSensidl.g:6279:2: ( ruleMethod )
            {
            // InternalSensidl.g:6279:2: ( ruleMethod )
            // InternalSensidl.g:6280:3: ruleMethod
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
    // InternalSensidl.g:6289:1: rule__Method__VisibilityAssignment_0_0 : ( ( '+' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6293:1: ( ( ( '+' ) ) )
            // InternalSensidl.g:6294:2: ( ( '+' ) )
            {
            // InternalSensidl.g:6294:2: ( ( '+' ) )
            // InternalSensidl.g:6295:3: ( '+' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityPlusSignKeyword_0_0_0()); 
            // InternalSensidl.g:6296:3: ( '+' )
            // InternalSensidl.g:6297:4: '+'
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
    // InternalSensidl.g:6308:1: rule__Method__VisibilityAssignment_0_1 : ( ( '-' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6312:1: ( ( ( '-' ) ) )
            // InternalSensidl.g:6313:2: ( ( '-' ) )
            {
            // InternalSensidl.g:6313:2: ( ( '-' ) )
            // InternalSensidl.g:6314:3: ( '-' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityHyphenMinusKeyword_0_1_0()); 
            // InternalSensidl.g:6315:3: ( '-' )
            // InternalSensidl.g:6316:4: '-'
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
    // InternalSensidl.g:6327:1: rule__Method__VisibilityAssignment_0_2 : ( ( '#' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6331:1: ( ( ( '#' ) ) )
            // InternalSensidl.g:6332:2: ( ( '#' ) )
            {
            // InternalSensidl.g:6332:2: ( ( '#' ) )
            // InternalSensidl.g:6333:3: ( '#' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityNumberSignKeyword_0_2_0()); 
            // InternalSensidl.g:6334:3: ( '#' )
            // InternalSensidl.g:6335:4: '#'
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
    // InternalSensidl.g:6346:1: rule__Method__VisibilityAssignment_0_3 : ( ( '~' ) ) ;
    public final void rule__Method__VisibilityAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6350:1: ( ( ( '~' ) ) )
            // InternalSensidl.g:6351:2: ( ( '~' ) )
            {
            // InternalSensidl.g:6351:2: ( ( '~' ) )
            // InternalSensidl.g:6352:3: ( '~' )
            {
             before(grammarAccess.getMethodAccess().getVisibilityTildeKeyword_0_3_0()); 
            // InternalSensidl.g:6353:3: ( '~' )
            // InternalSensidl.g:6354:4: '~'
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
    // InternalSensidl.g:6365:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6369:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6370:2: ( RULE_ID )
            {
            // InternalSensidl.g:6370:2: ( RULE_ID )
            // InternalSensidl.g:6371:3: RULE_ID
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
    // InternalSensidl.g:6380:1: rule__Method__ParameterAssignment_3 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6384:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:6385:2: ( ruleMethodParameter )
            {
            // InternalSensidl.g:6385:2: ( ruleMethodParameter )
            // InternalSensidl.g:6386:3: ruleMethodParameter
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
    // InternalSensidl.g:6395:1: rule__Method__ParameterAssignment_4_1 : ( ruleMethodParameter ) ;
    public final void rule__Method__ParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6399:1: ( ( ruleMethodParameter ) )
            // InternalSensidl.g:6400:2: ( ruleMethodParameter )
            {
            // InternalSensidl.g:6400:2: ( ruleMethodParameter )
            // InternalSensidl.g:6401:3: ruleMethodParameter
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
    // InternalSensidl.g:6410:1: rule__Method__ReturnTypeAssignment_6_1_0_0 : ( ruleDataType ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6414:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6415:2: ( ruleDataType )
            {
            // InternalSensidl.g:6415:2: ( ruleDataType )
            // InternalSensidl.g:6416:3: ruleDataType
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
    // InternalSensidl.g:6425:1: rule__Method__ReturnTypeAssignment_6_1_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__Method__ReturnTypeAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6429:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:6430:2: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:6430:2: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:6431:3: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:6440:1: rule__Method__ReturnTypeDataSetAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Method__ReturnTypeDataSetAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6444:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6445:2: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6445:2: ( ( RULE_ID ) )
            // InternalSensidl.g:6446:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeDataSetDataSetCrossReference_6_1_1_0()); 
            // InternalSensidl.g:6447:3: ( RULE_ID )
            // InternalSensidl.g:6448:4: RULE_ID
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
    // InternalSensidl.g:6459:1: rule__Method__IDAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__Method__IDAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6463:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6464:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6464:2: ( RULE_STRING )
            // InternalSensidl.g:6465:3: RULE_STRING
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
    // InternalSensidl.g:6474:1: rule__Method__DescriptionAssignment_10 : ( RULE_DESCRIPTION ) ;
    public final void rule__Method__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6478:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6479:2: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6479:2: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6480:3: RULE_DESCRIPTION
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
    // InternalSensidl.g:6489:1: rule__MethodParameter__DataTypeAssignment_0_0_0 : ( ruleDataType ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6493:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6494:2: ( ruleDataType )
            {
            // InternalSensidl.g:6494:2: ( ruleDataType )
            // InternalSensidl.g:6495:3: ruleDataType
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
    // InternalSensidl.g:6504:1: rule__MethodParameter__DataTypeAssignment_0_0_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MethodParameter__DataTypeAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6508:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:6509:2: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:6509:2: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:6510:3: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:6519:1: rule__MethodParameter__DataTypeDataSetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodParameter__DataTypeDataSetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6523:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6524:2: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6524:2: ( ( RULE_ID ) )
            // InternalSensidl.g:6525:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodParameterAccess().getDataTypeDataSetDataSetCrossReference_0_1_0()); 
            // InternalSensidl.g:6526:3: ( RULE_ID )
            // InternalSensidl.g:6527:4: RULE_ID
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
    // InternalSensidl.g:6538:1: rule__MethodParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6542:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6543:2: ( RULE_ID )
            {
            // InternalSensidl.g:6543:2: ( RULE_ID )
            // InternalSensidl.g:6544:3: RULE_ID
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
    // InternalSensidl.g:6553:1: rule__ListData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6557:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6558:2: ( RULE_ID )
            {
            // InternalSensidl.g:6558:2: ( RULE_ID )
            // InternalSensidl.g:6559:3: RULE_ID
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
    // InternalSensidl.g:6568:1: rule__ListData__DataTypeAssignment_4_0 : ( ruleDataType ) ;
    public final void rule__ListData__DataTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6572:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6573:2: ( ruleDataType )
            {
            // InternalSensidl.g:6573:2: ( ruleDataType )
            // InternalSensidl.g:6574:3: ruleDataType
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
    // InternalSensidl.g:6583:1: rule__ListData__DataTypeDataSetAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListData__DataTypeDataSetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6587:1: ( ( ( RULE_ID ) ) )
            // InternalSensidl.g:6588:2: ( ( RULE_ID ) )
            {
            // InternalSensidl.g:6588:2: ( ( RULE_ID ) )
            // InternalSensidl.g:6589:3: ( RULE_ID )
            {
             before(grammarAccess.getListDataAccess().getDataTypeDataSetDataSetCrossReference_4_1_0()); 
            // InternalSensidl.g:6590:3: ( RULE_ID )
            // InternalSensidl.g:6591:4: RULE_ID
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
    // InternalSensidl.g:6602:1: rule__MeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6606:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6607:2: ( RULE_ID )
            {
            // InternalSensidl.g:6607:2: ( RULE_ID )
            // InternalSensidl.g:6608:3: RULE_ID
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
    // InternalSensidl.g:6617:1: rule__MeasurementData__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__MeasurementData__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6621:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6622:2: ( ruleDataType )
            {
            // InternalSensidl.g:6622:2: ( ruleDataType )
            // InternalSensidl.g:6623:3: ruleDataType
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
    // InternalSensidl.g:6632:1: rule__MeasurementData__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementData__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6636:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:6637:2: ( ruleUNIT )
            {
            // InternalSensidl.g:6637:2: ( ruleUNIT )
            // InternalSensidl.g:6638:3: ruleUNIT
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
    // InternalSensidl.g:6647:1: rule__MeasurementData__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementData__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6651:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6652:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6652:2: ( RULE_STRING )
            // InternalSensidl.g:6653:3: RULE_STRING
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
    // InternalSensidl.g:6662:1: rule__MeasurementData__AdjustmentsAssignment_6_0_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6666:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:6667:2: ( ruleDataConversion )
            {
            // InternalSensidl.g:6667:2: ( ruleDataConversion )
            // InternalSensidl.g:6668:3: ruleDataConversion
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
    // InternalSensidl.g:6677:1: rule__MeasurementData__AdjustmentsAssignment_6_1_1 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6681:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:6682:2: ( ruleDataRange )
            {
            // InternalSensidl.g:6682:2: ( ruleDataRange )
            // InternalSensidl.g:6683:3: ruleDataRange
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
    // InternalSensidl.g:6692:1: rule__MeasurementData__AdjustmentsAssignment_6_2_1 : ( ruleDataConversion ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6696:1: ( ( ruleDataConversion ) )
            // InternalSensidl.g:6697:2: ( ruleDataConversion )
            {
            // InternalSensidl.g:6697:2: ( ruleDataConversion )
            // InternalSensidl.g:6698:3: ruleDataConversion
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
    // InternalSensidl.g:6707:1: rule__MeasurementData__AdjustmentsAssignment_6_2_3 : ( ruleDataRange ) ;
    public final void rule__MeasurementData__AdjustmentsAssignment_6_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6711:1: ( ( ruleDataRange ) )
            // InternalSensidl.g:6712:2: ( ruleDataRange )
            {
            // InternalSensidl.g:6712:2: ( ruleDataRange )
            // InternalSensidl.g:6713:3: ruleDataRange
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
    // InternalSensidl.g:6722:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6726:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6727:2: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6727:2: ( ( 'setter' ) )
            // InternalSensidl.g:6728:3: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_0_0_0()); 
            // InternalSensidl.g:6729:3: ( 'setter' )
            // InternalSensidl.g:6730:4: 'setter'
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
    // InternalSensidl.g:6741:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6745:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6746:2: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6746:2: ( ( 'getter' ) )
            // InternalSensidl.g:6747:3: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_0_1_1_0()); 
            // InternalSensidl.g:6748:3: ( 'getter' )
            // InternalSensidl.g:6749:4: 'getter'
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
    // InternalSensidl.g:6760:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6764:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6765:2: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6765:2: ( ( 'getter' ) )
            // InternalSensidl.g:6766:3: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsGetterKeyword_7_1_1_0_0()); 
            // InternalSensidl.g:6767:3: ( 'getter' )
            // InternalSensidl.g:6768:4: 'getter'
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
    // InternalSensidl.g:6779:1: rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementData__ExcludedMethodsAssignment_7_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6783:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6784:2: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6784:2: ( ( 'setter' ) )
            // InternalSensidl.g:6785:3: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataAccess().getExcludedMethodsSetterKeyword_7_1_1_1_1_0()); 
            // InternalSensidl.g:6786:3: ( 'setter' )
            // InternalSensidl.g:6787:4: 'setter'
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
    // InternalSensidl.g:6798:1: rule__MeasurementData__DescriptionAssignment_8 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementData__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6802:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:6803:2: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:6803:2: ( RULE_DESCRIPTION )
            // InternalSensidl.g:6804:3: RULE_DESCRIPTION
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
    // InternalSensidl.g:6813:1: rule__NonMeasurementData__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NonMeasurementData__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6817:1: ( ( RULE_ID ) )
            // InternalSensidl.g:6818:2: ( RULE_ID )
            {
            // InternalSensidl.g:6818:2: ( RULE_ID )
            // InternalSensidl.g:6819:3: RULE_ID
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
    // InternalSensidl.g:6828:1: rule__NonMeasurementData__DataTypeAssignment_2_0 : ( ruleDataType ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6832:1: ( ( ruleDataType ) )
            // InternalSensidl.g:6833:2: ( ruleDataType )
            {
            // InternalSensidl.g:6833:2: ( ruleDataType )
            // InternalSensidl.g:6834:3: ruleDataType
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
    // InternalSensidl.g:6843:1: rule__NonMeasurementData__DataTypeAssignment_2_1 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__NonMeasurementData__DataTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6847:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:6848:2: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:6848:2: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:6849:3: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:6858:1: rule__NonMeasurementData__ConstantAssignment_3_0_0 : ( ( 'constant' ) ) ;
    public final void rule__NonMeasurementData__ConstantAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6862:1: ( ( ( 'constant' ) ) )
            // InternalSensidl.g:6863:2: ( ( 'constant' ) )
            {
            // InternalSensidl.g:6863:2: ( ( 'constant' ) )
            // InternalSensidl.g:6864:3: ( 'constant' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getConstantConstantKeyword_3_0_0_0()); 
            // InternalSensidl.g:6865:3: ( 'constant' )
            // InternalSensidl.g:6866:4: 'constant'
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
    // InternalSensidl.g:6877:1: rule__NonMeasurementData__ValueAssignment_3_0_3 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_3_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6881:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6882:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6882:2: ( RULE_STRING )
            // InternalSensidl.g:6883:3: RULE_STRING
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
    // InternalSensidl.g:6892:1: rule__NonMeasurementData__ValueAssignment_3_1_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__ValueAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6896:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6897:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6897:2: ( RULE_STRING )
            // InternalSensidl.g:6898:3: RULE_STRING
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
    // InternalSensidl.g:6907:1: rule__NonMeasurementData__IDAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__NonMeasurementData__IDAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6911:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:6912:2: ( RULE_STRING )
            {
            // InternalSensidl.g:6912:2: ( RULE_STRING )
            // InternalSensidl.g:6913:3: RULE_STRING
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
    // InternalSensidl.g:6922:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6926:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6927:2: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6927:2: ( ( 'setter' ) )
            // InternalSensidl.g:6928:3: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_0_0_0()); 
            // InternalSensidl.g:6929:3: ( 'setter' )
            // InternalSensidl.g:6930:4: 'setter'
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
    // InternalSensidl.g:6941:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6945:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6946:2: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6946:2: ( ( 'getter' ) )
            // InternalSensidl.g:6947:3: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_0_1_1_0()); 
            // InternalSensidl.g:6948:3: ( 'getter' )
            // InternalSensidl.g:6949:4: 'getter'
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
    // InternalSensidl.g:6960:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0 : ( ( 'getter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6964:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:6965:2: ( ( 'getter' ) )
            {
            // InternalSensidl.g:6965:2: ( ( 'getter' ) )
            // InternalSensidl.g:6966:3: ( 'getter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsGetterKeyword_5_1_1_0_0()); 
            // InternalSensidl.g:6967:3: ( 'getter' )
            // InternalSensidl.g:6968:4: 'getter'
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
    // InternalSensidl.g:6979:1: rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__NonMeasurementData__ExcludedMethodsAssignment_5_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:6983:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:6984:2: ( ( 'setter' ) )
            {
            // InternalSensidl.g:6984:2: ( ( 'setter' ) )
            // InternalSensidl.g:6985:3: ( 'setter' )
            {
             before(grammarAccess.getNonMeasurementDataAccess().getExcludedMethodsSetterKeyword_5_1_1_1_1_0()); 
            // InternalSensidl.g:6986:3: ( 'setter' )
            // InternalSensidl.g:6987:4: 'setter'
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
    // InternalSensidl.g:6998:1: rule__NonMeasurementData__DescriptionAssignment_6 : ( RULE_DESCRIPTION ) ;
    public final void rule__NonMeasurementData__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7002:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7003:2: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7003:2: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7004:3: RULE_DESCRIPTION
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
    // InternalSensidl.g:7013:1: rule__MeasurementDataNotAdjustable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MeasurementDataNotAdjustable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7017:1: ( ( RULE_ID ) )
            // InternalSensidl.g:7018:2: ( RULE_ID )
            {
            // InternalSensidl.g:7018:2: ( RULE_ID )
            // InternalSensidl.g:7019:3: RULE_ID
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
    // InternalSensidl.g:7028:1: rule__MeasurementDataNotAdjustable__DataTypeAssignment_2 : ( ruleDataTypeNotAdjustable ) ;
    public final void rule__MeasurementDataNotAdjustable__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7032:1: ( ( ruleDataTypeNotAdjustable ) )
            // InternalSensidl.g:7033:2: ( ruleDataTypeNotAdjustable )
            {
            // InternalSensidl.g:7033:2: ( ruleDataTypeNotAdjustable )
            // InternalSensidl.g:7034:3: ruleDataTypeNotAdjustable
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
    // InternalSensidl.g:7043:1: rule__MeasurementDataNotAdjustable__UnitAssignment_4 : ( ruleUNIT ) ;
    public final void rule__MeasurementDataNotAdjustable__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7047:1: ( ( ruleUNIT ) )
            // InternalSensidl.g:7048:2: ( ruleUNIT )
            {
            // InternalSensidl.g:7048:2: ( ruleUNIT )
            // InternalSensidl.g:7049:3: ruleUNIT
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
    // InternalSensidl.g:7058:1: rule__MeasurementDataNotAdjustable__IDAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__MeasurementDataNotAdjustable__IDAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7062:1: ( ( RULE_STRING ) )
            // InternalSensidl.g:7063:2: ( RULE_STRING )
            {
            // InternalSensidl.g:7063:2: ( RULE_STRING )
            // InternalSensidl.g:7064:3: RULE_STRING
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
    // InternalSensidl.g:7073:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7077:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7078:2: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7078:2: ( ( 'setter' ) )
            // InternalSensidl.g:7079:3: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_0_0_0()); 
            // InternalSensidl.g:7080:3: ( 'setter' )
            // InternalSensidl.g:7081:4: 'setter'
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
    // InternalSensidl.g:7092:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7096:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7097:2: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7097:2: ( ( 'getter' ) )
            // InternalSensidl.g:7098:3: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_0_1_1_0()); 
            // InternalSensidl.g:7099:3: ( 'getter' )
            // InternalSensidl.g:7100:4: 'getter'
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
    // InternalSensidl.g:7111:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0 : ( ( 'getter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7115:1: ( ( ( 'getter' ) ) )
            // InternalSensidl.g:7116:2: ( ( 'getter' ) )
            {
            // InternalSensidl.g:7116:2: ( ( 'getter' ) )
            // InternalSensidl.g:7117:3: ( 'getter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsGetterKeyword_6_2_1_0_0()); 
            // InternalSensidl.g:7118:3: ( 'getter' )
            // InternalSensidl.g:7119:4: 'getter'
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
    // InternalSensidl.g:7130:1: rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1 : ( ( 'setter' ) ) ;
    public final void rule__MeasurementDataNotAdjustable__ExcludedMethodsAssignment_6_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7134:1: ( ( ( 'setter' ) ) )
            // InternalSensidl.g:7135:2: ( ( 'setter' ) )
            {
            // InternalSensidl.g:7135:2: ( ( 'setter' ) )
            // InternalSensidl.g:7136:3: ( 'setter' )
            {
             before(grammarAccess.getMeasurementDataNotAdjustableAccess().getExcludedMethodsSetterKeyword_6_2_1_1_1_0()); 
            // InternalSensidl.g:7137:3: ( 'setter' )
            // InternalSensidl.g:7138:4: 'setter'
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
    // InternalSensidl.g:7149:1: rule__MeasurementDataNotAdjustable__DescriptionAssignment_7 : ( RULE_DESCRIPTION ) ;
    public final void rule__MeasurementDataNotAdjustable__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7153:1: ( ( RULE_DESCRIPTION ) )
            // InternalSensidl.g:7154:2: ( RULE_DESCRIPTION )
            {
            // InternalSensidl.g:7154:2: ( RULE_DESCRIPTION )
            // InternalSensidl.g:7155:3: RULE_DESCRIPTION
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
    // InternalSensidl.g:7164:1: rule__DataRange__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__DataRange__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7168:1: ( ( ruleInterval ) )
            // InternalSensidl.g:7169:2: ( ruleInterval )
            {
            // InternalSensidl.g:7169:2: ( ruleInterval )
            // InternalSensidl.g:7170:3: ruleInterval
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
    // InternalSensidl.g:7179:1: rule__Interval__LowerBoundAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Interval__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7183:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7184:2: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7184:2: ( ruleDOUBLE )
            // InternalSensidl.g:7185:3: ruleDOUBLE
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
    // InternalSensidl.g:7194:1: rule__Interval__UpperBoundAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Interval__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7198:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7199:2: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7199:2: ( ruleDOUBLE )
            // InternalSensidl.g:7200:3: ruleDOUBLE
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
    // InternalSensidl.g:7209:1: rule__LinearDataConversion__ScalingFactorAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__ScalingFactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7213:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7214:2: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7214:2: ( ruleDOUBLE )
            // InternalSensidl.g:7215:3: ruleDOUBLE
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
    // InternalSensidl.g:7224:1: rule__LinearDataConversion__OffsetAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__LinearDataConversion__OffsetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7228:1: ( ( ruleDOUBLE ) )
            // InternalSensidl.g:7229:2: ( ruleDOUBLE )
            {
            // InternalSensidl.g:7229:2: ( ruleDOUBLE )
            // InternalSensidl.g:7230:3: ruleDOUBLE
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
    // InternalSensidl.g:7239:1: rule__LinearDataConversionWithInterval__FromIntervalAssignment_1 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__FromIntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7243:1: ( ( ruleInterval ) )
            // InternalSensidl.g:7244:2: ( ruleInterval )
            {
            // InternalSensidl.g:7244:2: ( ruleInterval )
            // InternalSensidl.g:7245:3: ruleInterval
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
    // InternalSensidl.g:7254:1: rule__LinearDataConversionWithInterval__ToIntervalAssignment_3 : ( ruleInterval ) ;
    public final void rule__LinearDataConversionWithInterval__ToIntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7258:1: ( ( ruleInterval ) )
            // InternalSensidl.g:7259:2: ( ruleInterval )
            {
            // InternalSensidl.g:7259:2: ( ruleInterval )
            // InternalSensidl.g:7260:3: ruleInterval
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
    // InternalSensidl.g:7269:1: rule__LinearDataConversionWithInterval__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__LinearDataConversionWithInterval__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSensidl.g:7273:1: ( ( ruleDataType ) )
            // InternalSensidl.g:7274:2: ( ruleDataType )
            {
            // InternalSensidl.g:7274:2: ( ruleDataType )
            // InternalSensidl.g:7275:3: ruleDataType
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
            return "704:1: rule__Data__Alternatives : ( ( ruleMeasurementData ) | ( ruleNonMeasurementData ) | ( ruleMeasurementDataNotAdjustable ) | ( ruleListData ) );";
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
            return "758:1: rule__MeasurementData__Alternatives_6 : ( ( ( rule__MeasurementData__Group_6_0__0 ) ) | ( ( rule__MeasurementData__Group_6_1__0 ) ) | ( ( rule__MeasurementData__Group_6_2__0 ) ) );";
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