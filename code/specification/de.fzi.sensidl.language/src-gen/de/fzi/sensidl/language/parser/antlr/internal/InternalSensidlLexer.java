package de.fzi.sensidl.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensidlLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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

    public InternalSensidlLexer() {;} 
    public InternalSensidlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSensidlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:11:7: ( 'sensorInterface' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:11:9: 'sensorInterface'
            {
            match("sensorInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:12:7: ( 'with' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:12:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:13:7: ( 'identifier' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:13:9: 'identifier'
            {
            match("identifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:14:7: ( ':' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:15:7: ( '{' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:16:7: ( '}' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:17:7: ( ';' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:18:7: ( 'encoding' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:18:9: 'encoding'
            {
            match("encoding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:19:7: ( 'alignment' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:19:9: 'alignment'
            {
            match("alignment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:20:7: ( 'sensorData' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:20:9: 'sensorData'
            {
            match("sensorData"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:21:7: ( 'dataSet' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:21:9: 'dataSet'
            {
            match("dataSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:22:7: ( 'as' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:22:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:23:7: ( 'in' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:23:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:24:7: ( 'adjusted' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:24:9: 'adjusted'
            {
            match("adjusted"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:25:7: ( 'by' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:25:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:26:7: ( ',' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:27:7: ( 'constant' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:27:9: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:28:7: ( '=' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:29:7: ( 'value' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:29:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:30:7: ( 'range' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:30:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:31:7: ( '...' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:31:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:32:7: ( 'scaling factor' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:32:9: 'scaling factor'
            {
            match("scaling factor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:33:7: ( 'and' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:33:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:34:7: ( 'offset' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:34:9: 'offset'
            {
            match("offset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:35:7: ( 'linear mapping' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:35:9: 'linear mapping'
            {
            match("linear mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:36:7: ( '[' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:36:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:37:7: ( ']' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:37:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:38:7: ( '=>' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:38:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:39:7: ( '.' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:39:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:40:7: ( 'true' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:40:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:41:7: ( 'false' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:41:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:42:7: ( 'SENSIDL_BINARY' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:42:9: 'SENSIDL_BINARY'
            {
            match("SENSIDL_BINARY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:43:7: ( 'SENSIDL_JSON' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:43:9: 'SENSIDL_JSON'
            {
            match("SENSIDL_JSON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:44:7: ( 'BIG_ENDIAN' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:44:9: 'BIG_ENDIAN'
            {
            match("BIG_ENDIAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:45:7: ( 'LITTLE_ENDIAN' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:45:9: 'LITTLE_ENDIAN'
            {
            match("LITTLE_ENDIAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:46:7: ( 'SIGNED_CHAR' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:46:9: 'SIGNED_CHAR'
            {
            match("SIGNED_CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:47:7: ( 'UNSIGNED_CHAR' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:47:9: 'UNSIGNED_CHAR'
            {
            match("UNSIGNED_CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:48:7: ( 'SIGNED_SHORT' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:48:9: 'SIGNED_SHORT'
            {
            match("SIGNED_SHORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:49:7: ( 'UNSIGNED_SHORT' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:49:9: 'UNSIGNED_SHORT'
            {
            match("UNSIGNED_SHORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:50:7: ( 'SIGNED_LONG' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:50:9: 'SIGNED_LONG'
            {
            match("SIGNED_LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:51:7: ( 'UNSIGNED_LONG' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:51:9: 'UNSIGNED_LONG'
            {
            match("UNSIGNED_LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:52:7: ( 'SIGNED_LONG_LONG' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:52:9: 'SIGNED_LONG_LONG'
            {
            match("SIGNED_LONG_LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:53:7: ( 'UNSIGNED_LONG_LONG' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:53:9: 'UNSIGNED_LONG_LONG'
            {
            match("UNSIGNED_LONG_LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:54:7: ( 'FLOAT' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:54:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:55:7: ( 'DOUBLE' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:55:9: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:56:7: ( 'LONG_DOUBLE' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:56:9: 'LONG_DOUBLE'
            {
            match("LONG_DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_UNIT"
    public final void mRULE_UNIT() throws RecognitionException {
        try {
            int _type = RULE_UNIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1575:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1575:13: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1575:13: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1575:13: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1575:38: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1577:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1577:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1577:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1577:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1577:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1579:10: ( ( '0' .. '9' )+ )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1579:12: ( '0' .. '9' )+
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1579:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1579:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1581:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1583:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1583:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1583:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1583:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:41: ( '\\r' )? '\\n'
                    {
                    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1585:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1587:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1587:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1587:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1589:16: ( . )
            // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1589:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_UNIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=54;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:286: RULE_UNIT
                {
                mRULE_UNIT(); 

                }
                break;
            case 48 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:296: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:304: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:313: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:325: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:341: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:357: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../de.fzi.sensidl.language/src-gen/de/fzi/sensidl/language/parser/antlr/internal/InternalSensidl.g:1:365: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\3\51\4\uffff\4\51\1\uffff\1\51\1\74\2\51\1\100\2\51\2"+
        "\uffff\10\51\1\46\1\51\2\uffff\3\46\2\uffff\2\51\1\uffff\3\51\1"+
        "\132\4\uffff\2\51\1\135\3\51\1\141\1\uffff\1\51\2\uffff\2\51\2\uffff"+
        "\2\51\2\uffff\13\51\6\uffff\4\51\1\uffff\2\51\1\uffff\1\51\1\170"+
        "\1\51\1\uffff\21\51\1\u008b\4\51\1\uffff\6\51\1\u0096\13\51\1\uffff"+
        "\6\51\1\u00a8\1\u00a9\2\51\1\uffff\1\u00ac\6\51\1\u00b3\11\51\2"+
        "\uffff\1\u00be\1\51\1\uffff\6\51\1\uffff\1\u00c6\7\51\1\u00ce\1"+
        "\51\2\uffff\6\51\1\uffff\2\51\1\uffff\1\51\1\u00db\1\51\1\u00dd"+
        "\1\uffff\1\u00de\13\51\1\uffff\1\u00eb\2\uffff\12\51\1\u00f8\1\u00f9"+
        "\1\uffff\5\51\1\u00ff\6\51\2\uffff\2\51\1\u0108\1\51\1\u010b\1\uffff"+
        "\1\51\1\u010d\5\51\1\u0113\1\uffff\1\u0114\1\51\1\uffff\1\51\1\uffff"+
        "\5\51\2\uffff\1\51\1\u011d\1\u011e\1\51\1\u0121\1\51\1\u0123\1\51"+
        "\2\uffff\1\u0125\1\51\1\uffff\1\u0127\1\uffff\1\51\1\uffff\1\51"+
        "\1\uffff\1\u012a\1\51\1\uffff\1\51\1\u012d\1\uffff";
    static final String DFA14_eofS =
        "\u012e\uffff";
    static final String DFA14_minS =
        "\1\0\3\60\4\uffff\4\60\1\uffff\1\60\1\76\2\60\1\56\2\60\2\uffff"+
        "\10\60\1\101\1\60\2\uffff\2\0\1\52\2\uffff\2\60\1\uffff\4\60\4\uffff"+
        "\7\60\1\uffff\1\60\2\uffff\2\60\2\uffff\2\60\2\uffff\13\60\6\uffff"+
        "\4\60\1\uffff\2\60\1\uffff\3\60\1\uffff\26\60\1\uffff\22\60\1\uffff"+
        "\12\60\1\uffff\21\60\2\uffff\1\60\1\40\1\uffff\6\60\1\uffff\3\60"+
        "\1\40\6\60\2\uffff\6\60\1\uffff\2\60\1\uffff\4\60\1\uffff\14\60"+
        "\1\uffff\1\60\2\uffff\14\60\1\uffff\14\60\2\uffff\5\60\1\uffff\10"+
        "\60\1\uffff\2\60\1\uffff\1\60\1\uffff\5\60\2\uffff\10\60\2\uffff"+
        "\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff"+
        "\2\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\3\172\4\uffff\4\172\1\uffff\1\172\1\76\2\172\1\56\2\172"+
        "\2\uffff\12\172\2\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\4\172"+
        "\4\uffff\7\172\1\uffff\1\172\2\uffff\2\172\2\uffff\2\172\2\uffff"+
        "\13\172\6\uffff\4\172\1\uffff\2\172\1\uffff\3\172\1\uffff\26\172"+
        "\1\uffff\22\172\1\uffff\12\172\1\uffff\21\172\2\uffff\2\172\1\uffff"+
        "\6\172\1\uffff\12\172\2\uffff\6\172\1\uffff\2\172\1\uffff\4\172"+
        "\1\uffff\14\172\1\uffff\1\172\2\uffff\14\172\1\uffff\14\172\2\uffff"+
        "\5\172\1\uffff\10\172\1\uffff\2\172\1\uffff\1\172\1\uffff\5\172"+
        "\2\uffff\10\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\2\172\1\uffff\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\4\uffff\1\20\7\uffff\1\32\1\33\12\uffff"+
        "\1\60\1\61\3\uffff\1\65\1\66\2\uffff\1\57\4\uffff\1\4\1\5\1\6\1"+
        "\7\7\uffff\1\20\1\uffff\1\34\1\22\2\uffff\1\25\1\35\2\uffff\1\32"+
        "\1\33\13\uffff\1\60\1\61\1\62\1\63\1\64\1\65\4\uffff\1\15\2\uffff"+
        "\1\14\3\uffff\1\17\26\uffff\1\27\22\uffff\1\2\12\uffff\1\36\21\uffff"+
        "\1\23\1\24\2\uffff\1\37\6\uffff\1\54\12\uffff\1\30\1\31\6\uffff"+
        "\1\55\2\uffff\1\26\4\uffff\1\13\14\uffff\1\10\1\uffff\1\16\1\21"+
        "\14\uffff\1\11\14\uffff\1\12\1\3\5\uffff\1\42\10\uffff\1\44\2\uffff"+
        "\1\50\1\uffff\1\56\5\uffff\1\41\1\46\10\uffff\1\43\1\45\2\uffff"+
        "\1\51\1\uffff\1\40\1\uffff\1\47\1\uffff\1\1\2\uffff\1\52\2\uffff"+
        "\1\53";
    static final String DFA14_specialS =
        "\1\2\41\uffff\1\0\1\1\u010a\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\4\46\1\43\4\46\1"+
            "\14\1\46\1\21\1\44\12\41\1\4\1\7\1\46\1\16\3\46\1\37\1\31\1"+
            "\37\1\35\1\37\1\34\5\37\1\32\6\37\1\30\1\37\1\33\5\37\1\24\1"+
            "\46\1\25\1\36\1\40\1\46\1\11\1\13\1\15\1\12\1\10\1\27\2\37\1"+
            "\3\2\37\1\23\2\37\1\22\2\37\1\20\1\1\1\26\1\37\1\17\1\2\3\37"+
            "\1\5\1\46\1\6\uff82\46",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\50\1\52\1"+
            "\47\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\53\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\54\11\52"+
            "\1\55\14\52",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\62\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\65\7\52\1"+
            "\63\1\52\1\66\4\52\1\64\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\67\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\30\52\1\70\1\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\72\13\52",
            "\1\73",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\75\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\76\31\52",
            "\1\77",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\101\24\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\102\21\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\105\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\106\31\52",
            "\12\52\7\uffff\4\52\1\107\3\52\1\110\21\52\4\uffff\1\52\1"+
            "\uffff\32\52",
            "\12\52\7\uffff\10\52\1\111\21\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\10\52\1\112\5\52\1\113\13\52\4\uffff\1\52\1"+
            "\uffff\32\52",
            "\12\52\7\uffff\15\52\1\114\14\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\13\52\1\115\16\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\16\52\1\116\13\52\4\uffff\1\52\1\uffff\32\52",
            "\32\117\4\uffff\1\120\1\uffff\32\117",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\122",
            "\0\122",
            "\1\123\4\uffff\1\124",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\126\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\127\31\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\130\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\131\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\133\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\134\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\11\52\1\136\20\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\137\26\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\140\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\142\14\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\143\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\144\14\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\145\24\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\146\14\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\147\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\150\16\52",
            "\12\52\7\uffff\15\52\1\151\14\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\6\52\1\152\23\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\6\52\1\153\23\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\23\52\1\154\6\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\15\52\1\155\14\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\22\52\1\156\7\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\16\52\1\157\13\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\24\52\1\160\5\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\161\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\162\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\163\22\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\164\14\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\165\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\166\23\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\167\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\171\31\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\172\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\173\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\174\23\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\175\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\176\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\177\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u0080\7"+
            "\52",
            "\12\52\7\uffff\22\52\1\u0081\7\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\15\52\1\u0082\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u0083\1\uffff\32\52",
            "\12\52\7\uffff\23\52\1\u0084\6\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\6\52\1\u0085\23\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\10\52\1\u0086\21\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\1\u0087\31\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\1\52\1\u0088\30\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0089\13"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u008a\21"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u008c\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u008d\26"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u008e\14"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u008f\7"+
            "\52",
            "",
            "\12\52\7\uffff\22\52\1\u0090\7\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0091\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0092\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0093\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0094\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0095\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0097\25"+
            "\52",
            "\12\52\7\uffff\10\52\1\u0098\21\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\4\52\1\u0099\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\4\52\1\u009a\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\13\52\1\u009b\16\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u009c\1\uffff\32\52",
            "\12\52\7\uffff\6\52\1\u009d\23\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\23\52\1\u009e\6\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\13\52\1\u009f\16\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00a0\10"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00a1\14"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00a2\21"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00a3\21"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u00a4\15"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00a5\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00a6\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00a7\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00aa\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00ab\10"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\3\52\1\u00ad\26\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\3\52\1\u00ae\26\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\15\52\1\u00af\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\4\52\1\u00b0\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\3\52\1\u00b1\26\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\15\52\1\u00b2\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\4\52\1\u00b4\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\3\52\1\u00b6\4\52\1\u00b5\21\52\4\uffff\1\52"+
            "\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00b7\23"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\u00b8\24"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00b9\14"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00ba\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00bb\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00bc\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00bd\14"+
            "\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bf\17\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff"+
            "\32\52",
            "",
            "\12\52\7\uffff\13\52\1\u00c0\16\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u00c1\1\uffff\32\52",
            "\12\52\7\uffff\3\52\1\u00c2\26\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u00c3\1\uffff\32\52",
            "\12\52\7\uffff\16\52\1\u00c4\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\4\52\1\u00c5\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00c7\14"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00c8\31\52",
            "\1\u00c9\17\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff"+
            "\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00ca\21"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00cb\23"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00cc\14"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00cd\26"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00cf\6"+
            "\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\u00d0\1\uffff\32\52",
            "\12\52\7\uffff\2\52\1\u00d1\10\52\1\u00d3\6\52\1\u00d2\7\52"+
            "\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\10\52\1\u00d4\21\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\4\52\1\u00d5\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\24\52\1\u00d6\5\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\3\52\1\u00d7\26\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00d8\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00d9\6"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00da\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00dc\6"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\1\52\1\u00df\7\52\1\u00e0\20\52\4\uffff\1\52"+
            "\1\uffff\32\52",
            "\12\52\7\uffff\7\52\1\u00e1\22\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\7\52\1\u00e2\22\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\16\52\1\u00e3\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\1\u00e4\31\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\15\52\1\u00e5\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\1\52\1\u00e6\30\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u00e7\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00e8\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00e9\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00ea\10"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\10\52\1\u00ec\21\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\22\52\1\u00ed\7\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\1\u00ee\31\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\16\52\1\u00ef\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\15\52\1\u00f0\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\15\52\1\u00f1\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\3\52\1\u00f2\26\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\13\52\1\u00f3\16\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\2\52\1\u00f4\10\52\1\u00f6\6\52\1\u00f5\7\52"+
            "\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00f7\10"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\15\52\1\u00fa\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\16\52\1\u00fb\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\21\52\1\u00fc\10\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\21\52\1\u00fd\10\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\6\52\1\u00fe\23\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\10\52\1\u0100\21\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\4\52\1\u0101\25\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\7\52\1\u0102\22\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\7\52\1\u0103\22\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\16\52\1\u0104\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\u0105\24"+
            "\52",
            "",
            "",
            "\12\52\7\uffff\1\u0106\31\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\15\52\1\u0107\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\23\52\1\u0109\6\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u010a\1\uffff\32\52",
            "",
            "\12\52\7\uffff\1\u010c\31\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\1\u010e\31\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\16\52\1\u010f\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\15\52\1\u0110\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0111\31\52",
            "\12\52\7\uffff\21\52\1\u0112\10\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\13\52\1\u0115\16\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\15\52\1\u0116\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\21\52\1\u0117\10\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\21\52\1\u0118\10\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\6\52\1\u0119\23\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u011a\27"+
            "\52",
            "\12\52\7\uffff\30\52\1\u011b\1\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "",
            "\12\52\7\uffff\16\52\1\u011c\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\23\52\1\u011f\6\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\u0120\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0122\25"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\15\52\1\u0124\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\13\52\1\u0126\16\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\6\52\1\u0128\23\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\16\52\1\u0129\13\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\15\52\1\u012b\14\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "",
            "\12\52\7\uffff\6\52\1\u012c\23\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_UNIT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( ((LA14_34>='\u0000' && LA14_34<='\uFFFF')) ) {s = 82;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 82;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='s') ) {s = 1;}

                        else if ( (LA14_0=='w') ) {s = 2;}

                        else if ( (LA14_0=='i') ) {s = 3;}

                        else if ( (LA14_0==':') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='}') ) {s = 6;}

                        else if ( (LA14_0==';') ) {s = 7;}

                        else if ( (LA14_0=='e') ) {s = 8;}

                        else if ( (LA14_0=='a') ) {s = 9;}

                        else if ( (LA14_0=='d') ) {s = 10;}

                        else if ( (LA14_0=='b') ) {s = 11;}

                        else if ( (LA14_0==',') ) {s = 12;}

                        else if ( (LA14_0=='c') ) {s = 13;}

                        else if ( (LA14_0=='=') ) {s = 14;}

                        else if ( (LA14_0=='v') ) {s = 15;}

                        else if ( (LA14_0=='r') ) {s = 16;}

                        else if ( (LA14_0=='.') ) {s = 17;}

                        else if ( (LA14_0=='o') ) {s = 18;}

                        else if ( (LA14_0=='l') ) {s = 19;}

                        else if ( (LA14_0=='[') ) {s = 20;}

                        else if ( (LA14_0==']') ) {s = 21;}

                        else if ( (LA14_0=='t') ) {s = 22;}

                        else if ( (LA14_0=='f') ) {s = 23;}

                        else if ( (LA14_0=='S') ) {s = 24;}

                        else if ( (LA14_0=='B') ) {s = 25;}

                        else if ( (LA14_0=='L') ) {s = 26;}

                        else if ( (LA14_0=='U') ) {s = 27;}

                        else if ( (LA14_0=='F') ) {s = 28;}

                        else if ( (LA14_0=='D') ) {s = 29;}

                        else if ( (LA14_0=='^') ) {s = 30;}

                        else if ( (LA14_0=='A'||LA14_0=='C'||LA14_0=='E'||(LA14_0>='G' && LA14_0<='K')||(LA14_0>='M' && LA14_0<='R')||LA14_0=='T'||(LA14_0>='V' && LA14_0<='Z')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='n')||(LA14_0>='p' && LA14_0<='q')||LA14_0=='u'||(LA14_0>='x' && LA14_0<='z')) ) {s = 31;}

                        else if ( (LA14_0=='_') ) {s = 32;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 33;}

                        else if ( (LA14_0=='\"') ) {s = 34;}

                        else if ( (LA14_0=='\'') ) {s = 35;}

                        else if ( (LA14_0=='/') ) {s = 36;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 37;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='-'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}