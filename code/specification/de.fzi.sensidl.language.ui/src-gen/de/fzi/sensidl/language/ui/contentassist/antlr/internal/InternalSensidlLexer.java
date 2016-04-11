package de.fzi.sensidl.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensidlLexer extends Lexer {
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

    public InternalSensidlLexer() {;} 
    public InternalSensidlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSensidlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSensidl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:11:7: ( 'SENSIDL_BINARY' )
            // InternalSensidl.g:11:9: 'SENSIDL_BINARY'
            {
            match("SENSIDL_BINARY"); 


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
            // InternalSensidl.g:12:7: ( 'SENSIDL_JSON' )
            // InternalSensidl.g:12:9: 'SENSIDL_JSON'
            {
            match("SENSIDL_JSON"); 


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
            // InternalSensidl.g:13:7: ( 'BIG_ENDIAN' )
            // InternalSensidl.g:13:9: 'BIG_ENDIAN'
            {
            match("BIG_ENDIAN"); 


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
            // InternalSensidl.g:14:7: ( 'LITTLE_ENDIAN' )
            // InternalSensidl.g:14:9: 'LITTLE_ENDIAN'
            {
            match("LITTLE_ENDIAN"); 


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
            // InternalSensidl.g:15:7: ( 'STRING' )
            // InternalSensidl.g:15:9: 'STRING'
            {
            match("STRING"); 


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
            // InternalSensidl.g:16:7: ( 'BOOLEAN' )
            // InternalSensidl.g:16:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


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
            // InternalSensidl.g:17:7: ( 'INT8' )
            // InternalSensidl.g:17:9: 'INT8'
            {
            match("INT8"); 


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
            // InternalSensidl.g:18:7: ( 'UINT8' )
            // InternalSensidl.g:18:9: 'UINT8'
            {
            match("UINT8"); 


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
            // InternalSensidl.g:19:7: ( 'INT16' )
            // InternalSensidl.g:19:9: 'INT16'
            {
            match("INT16"); 


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
            // InternalSensidl.g:20:7: ( 'UINT16' )
            // InternalSensidl.g:20:9: 'UINT16'
            {
            match("UINT16"); 


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
            // InternalSensidl.g:21:7: ( 'INT32' )
            // InternalSensidl.g:21:9: 'INT32'
            {
            match("INT32"); 


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
            // InternalSensidl.g:22:7: ( 'UINT32' )
            // InternalSensidl.g:22:9: 'UINT32'
            {
            match("UINT32"); 


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
            // InternalSensidl.g:23:7: ( 'INT64' )
            // InternalSensidl.g:23:9: 'INT64'
            {
            match("INT64"); 


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
            // InternalSensidl.g:24:7: ( 'UINT64' )
            // InternalSensidl.g:24:9: 'UINT64'
            {
            match("UINT64"); 


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
            // InternalSensidl.g:25:7: ( 'FLOAT' )
            // InternalSensidl.g:25:9: 'FLOAT'
            {
            match("FLOAT"); 


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
            // InternalSensidl.g:26:7: ( 'DOUBLE' )
            // InternalSensidl.g:26:9: 'DOUBLE'
            {
            match("DOUBLE"); 


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
            // InternalSensidl.g:27:7: ( 'sensorInterface' )
            // InternalSensidl.g:27:9: 'sensorInterface'
            {
            match("sensorInterface"); 


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
            // InternalSensidl.g:28:7: ( '{' )
            // InternalSensidl.g:28:9: '{'
            {
            match('{'); 

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
            // InternalSensidl.g:29:7: ( '}' )
            // InternalSensidl.g:29:9: '}'
            {
            match('}'); 

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
            // InternalSensidl.g:30:7: ( 'with identifier' )
            // InternalSensidl.g:30:9: 'with identifier'
            {
            match("with identifier"); 


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
            // InternalSensidl.g:31:7: ( ':' )
            // InternalSensidl.g:31:9: ':'
            {
            match(':'); 

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
            // InternalSensidl.g:32:7: ( 'encoding' )
            // InternalSensidl.g:32:9: 'encoding'
            {
            match("encoding"); 


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
            // InternalSensidl.g:33:7: ( ',' )
            // InternalSensidl.g:33:9: ','
            {
            match(','); 

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
            // InternalSensidl.g:34:7: ( 'endianness' )
            // InternalSensidl.g:34:9: 'endianness'
            {
            match("endianness"); 


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
            // InternalSensidl.g:35:7: ( 'alignment' )
            // InternalSensidl.g:35:9: 'alignment'
            {
            match("alignment"); 


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
            // InternalSensidl.g:36:7: ( 'BIT' )
            // InternalSensidl.g:36:9: 'BIT'
            {
            match("BIT"); 


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
            // InternalSensidl.g:37:7: ( 'sensorData' )
            // InternalSensidl.g:37:9: 'sensorData'
            {
            match("sensorData"); 


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
            // InternalSensidl.g:38:7: ( 'dataSet' )
            // InternalSensidl.g:38:9: 'dataSet'
            {
            match("dataSet"); 


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
            // InternalSensidl.g:39:7: ( 'uses' )
            // InternalSensidl.g:39:9: 'uses'
            {
            match("uses"); 


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
            // InternalSensidl.g:40:7: ( 'as' )
            // InternalSensidl.g:40:9: 'as'
            {
            match("as"); 


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
            // InternalSensidl.g:41:7: ( 'in' )
            // InternalSensidl.g:41:9: 'in'
            {
            match("in"); 


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
            // InternalSensidl.g:42:7: ( 'adjusted' )
            // InternalSensidl.g:42:9: 'adjusted'
            {
            match("adjusted"); 


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
            // InternalSensidl.g:43:7: ( 'exclude:' )
            // InternalSensidl.g:43:9: 'exclude:'
            {
            match("exclude:"); 


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
            // InternalSensidl.g:44:7: ( 'value' )
            // InternalSensidl.g:44:9: 'value'
            {
            match("value"); 


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
            // InternalSensidl.g:45:7: ( '=' )
            // InternalSensidl.g:45:9: '='
            {
            match('='); 

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
            // InternalSensidl.g:46:7: ( 'exclude' )
            // InternalSensidl.g:46:9: 'exclude'
            {
            match("exclude"); 


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
            // InternalSensidl.g:47:7: ( 'with range' )
            // InternalSensidl.g:47:9: 'with range'
            {
            match("with range"); 


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
            // InternalSensidl.g:48:7: ( '[' )
            // InternalSensidl.g:48:9: '['
            {
            match('['); 

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
            // InternalSensidl.g:49:7: ( ';' )
            // InternalSensidl.g:49:9: ';'
            {
            match(';'); 

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
            // InternalSensidl.g:50:7: ( ']' )
            // InternalSensidl.g:50:9: ']'
            {
            match(']'); 

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
            // InternalSensidl.g:51:7: ( 'with scaling factor' )
            // InternalSensidl.g:51:9: 'with scaling factor'
            {
            match("with scaling factor"); 


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
            // InternalSensidl.g:52:7: ( 'and offset' )
            // InternalSensidl.g:52:9: 'and offset'
            {
            match("and offset"); 


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
            // InternalSensidl.g:53:7: ( 'by linear mapping' )
            // InternalSensidl.g:53:9: 'by linear mapping'
            {
            match("by linear mapping"); 


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
            // InternalSensidl.g:54:7: ( '=>' )
            // InternalSensidl.g:54:9: '=>'
            {
            match("=>"); 


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
            // InternalSensidl.g:55:7: ( '.' )
            // InternalSensidl.g:55:9: '.'
            {
            match('.'); 

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
            // InternalSensidl.g:56:7: ( 'setter' )
            // InternalSensidl.g:56:9: 'setter'
            {
            match("setter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:57:7: ( 'getter' )
            // InternalSensidl.g:57:9: 'getter'
            {
            match("getter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:58:7: ( 'constant' )
            // InternalSensidl.g:58:9: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:6758:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalSensidl.g:6758:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSensidl.g:6758:31: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSensidl.g:6758:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "RULE_DESCRIPTION"
    public final void mRULE_DESCRIPTION() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:6760:18: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalSensidl.g:6760:20: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalSensidl.g:6760:26: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSensidl.g:6760:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "RULE_DESCRIPTION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:6762:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSensidl.g:6762:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSensidl.g:6762:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSensidl.g:6762:11: '^'
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

            // InternalSensidl.g:6762:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSensidl.g:
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
            // InternalSensidl.g:6764:10: ( ( '0' .. '9' )+ )
            // InternalSensidl.g:6764:12: ( '0' .. '9' )+
            {
            // InternalSensidl.g:6764:12: ( '0' .. '9' )+
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
            	    // InternalSensidl.g:6764:13: '0' .. '9'
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
            // InternalSensidl.g:6766:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSensidl.g:6766:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSensidl.g:6766:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalSensidl.g:6766:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSensidl.g:6766:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalSensidl.g:6766:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSensidl.g:6766:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalSensidl.g:6766:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSensidl.g:6766:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalSensidl.g:6766:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSensidl.g:6766:61: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSensidl.g:6768:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSensidl.g:6768:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSensidl.g:6768:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSensidl.g:6768:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalSensidl.g:6768:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSensidl.g:6768:41: ( '\\r' )? '\\n'
                    {
                    // InternalSensidl.g:6768:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSensidl.g:6768:41: '\\r'
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
            // InternalSensidl.g:6770:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSensidl.g:6770:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSensidl.g:6770:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSensidl.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalSensidl.g:6772:16: ( . )
            // InternalSensidl.g:6772:18: .
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
        // InternalSensidl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_ML_COMMENT | RULE_DESCRIPTION | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=56;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalSensidl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSensidl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSensidl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSensidl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSensidl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSensidl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSensidl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSensidl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSensidl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSensidl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSensidl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSensidl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSensidl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSensidl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSensidl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSensidl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalSensidl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalSensidl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalSensidl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalSensidl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalSensidl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalSensidl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalSensidl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalSensidl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalSensidl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalSensidl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalSensidl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalSensidl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalSensidl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalSensidl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalSensidl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalSensidl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalSensidl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalSensidl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalSensidl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalSensidl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalSensidl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalSensidl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalSensidl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalSensidl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalSensidl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalSensidl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalSensidl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalSensidl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalSensidl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalSensidl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalSensidl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalSensidl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalSensidl.g:1:298: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalSensidl.g:1:314: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 51 :
                // InternalSensidl.g:1:331: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalSensidl.g:1:339: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 53 :
                // InternalSensidl.g:1:348: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 54 :
                // InternalSensidl.g:1:360: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalSensidl.g:1:376: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalSensidl.g:1:384: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\10\46\2\uffff\1\46\1\uffff\1\46\1\uffff\5\46\1\77\3\uffff\1\46\1\uffff\2\46\2\43\2\uffff\2\43\2\uffff\2\46\1\uffff\10\46\2\uffff\1\46\1\uffff\2\46\1\uffff\1\46\1\135\4\46\1\142\1\46\5\uffff\1\46\1\uffff\2\46\5\uffff\3\46\1\154\15\46\1\uffff\4\46\1\uffff\1\46\1\uffff\2\46\2\uffff\3\46\1\uffff\2\46\1\u0089\16\46\1\uffff\1\46\1\u009c\10\46\1\uffff\1\u00a5\1\u00a6\1\u00a7\1\u00a8\3\46\1\u00ac\3\46\1\uffff\6\46\1\uffff\1\u00b9\3\46\1\u00bd\3\46\4\uffff\1\u00c1\1\u00c2\1\u00c3\1\uffff\1\u00c4\1\46\1\u00c7\3\uffff\6\46\1\uffff\1\u00ce\2\46\1\uffff\1\46\1\u00d2\1\46\4\uffff\2\46\1\uffff\2\46\1\u00d9\2\46\1\u00dc\1\uffff\3\46\1\uffff\3\46\1\u00e4\1\46\2\uffff\1\46\1\u00e7\1\uffff\1\u00e8\6\46\1\uffff\1\46\1\u00f0\2\uffff\2\46\1\u00f3\2\46\1\u00f6\1\u00f7\1\uffff\2\46\1\uffff\2\46\2\uffff\1\46\1\u00fd\3\46\1\uffff\1\u0101\1\46\1\u0103\1\uffff\1\46\1\uffff\1\u0105\1\uffff";
    static final String DFA13_eofS =
        "\u0106\uffff";
    static final String DFA13_minS =
        "\1\0\1\105\2\111\1\116\1\111\1\114\1\117\1\145\2\uffff\1\151\1\uffff\1\156\1\uffff\1\144\1\141\1\163\1\156\1\141\1\76\3\uffff\1\171\1\uffff\1\145\1\157\1\52\1\101\2\uffff\2\0\2\uffff\1\116\1\122\1\uffff\1\107\1\117\2\124\1\116\1\117\1\125\1\156\2\uffff\1\164\1\uffff\2\143\1\uffff\1\151\1\60\1\152\1\144\1\164\1\145\1\60\1\154\5\uffff\1\40\1\uffff\1\164\1\156\1\0\4\uffff\1\123\1\111\1\137\1\60\1\114\1\124\1\61\1\124\1\101\1\102\1\163\1\164\1\150\1\157\1\151\1\154\1\147\1\uffff\1\165\1\40\1\141\1\163\1\uffff\1\165\1\uffff\1\164\1\163\2\uffff\1\111\1\116\1\105\1\uffff\1\105\1\114\1\60\1\66\1\62\1\64\1\61\1\124\1\114\1\157\1\145\1\40\1\144\1\141\1\165\1\156\1\163\1\uffff\1\123\1\60\2\145\1\164\1\104\1\107\1\116\1\101\1\105\1\uffff\4\60\1\66\1\62\1\64\1\60\1\105\2\162\2\151\1\156\1\144\1\155\1\164\1\145\1\uffff\1\60\1\162\1\141\1\114\1\60\1\104\1\116\1\137\4\uffff\3\60\1\uffff\1\60\1\104\1\60\3\uffff\2\156\3\145\1\164\1\uffff\1\60\1\156\1\137\1\uffff\1\111\1\60\1\105\4\uffff\1\156\1\141\1\uffff\1\147\1\145\1\60\1\156\1\144\1\60\1\uffff\1\164\1\102\1\101\1\uffff\1\116\2\164\1\60\1\163\2\uffff\1\164\1\60\1\uffff\1\60\1\111\1\123\1\116\1\104\1\145\1\141\1\uffff\1\163\1\60\2\uffff\1\116\1\117\1\60\1\111\1\162\2\60\1\uffff\1\101\1\116\1\uffff\1\101\1\146\2\uffff\1\122\1\60\1\116\1\141\1\131\1\uffff\1\60\1\143\1\60\1\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\124\1\117\1\111\1\116\1\111\1\114\1\117\1\145\2\uffff\1\151\1\uffff\1\170\1\uffff\1\163\1\141\1\163\1\156\1\141\1\76\3\uffff\1\171\1\uffff\1\145\1\157\1\57\1\172\2\uffff\2\uffff\2\uffff\1\116\1\122\1\uffff\1\124\1\117\2\124\1\116\1\117\1\125\1\164\2\uffff\1\164\1\uffff\1\144\1\143\1\uffff\1\151\1\172\1\152\1\144\1\164\1\145\1\172\1\154\5\uffff\1\40\1\uffff\1\164\1\156\1\uffff\4\uffff\1\123\1\111\1\137\1\172\1\114\1\124\1\70\1\124\1\101\1\102\1\163\1\164\1\150\1\157\1\151\1\154\1\147\1\uffff\1\165\1\40\1\141\1\163\1\uffff\1\165\1\uffff\1\164\1\163\2\uffff\1\111\1\116\1\105\1\uffff\1\105\1\114\1\172\1\66\1\62\1\64\1\70\1\124\1\114\1\157\1\145\1\40\1\144\1\141\1\165\1\156\1\163\1\uffff\1\123\1\172\2\145\1\164\1\104\1\107\1\116\1\101\1\105\1\uffff\4\172\1\66\1\62\1\64\1\172\1\105\2\162\1\163\1\151\1\156\1\144\1\155\1\164\1\145\1\uffff\1\172\1\162\1\141\1\114\1\172\1\104\1\116\1\137\4\uffff\3\172\1\uffff\1\172\1\111\1\172\3\uffff\2\156\3\145\1\164\1\uffff\1\172\1\156\1\137\1\uffff\1\111\1\172\1\105\4\uffff\1\156\1\141\1\uffff\1\147\1\145\1\172\1\156\1\144\1\172\1\uffff\1\164\1\112\1\101\1\uffff\1\116\2\164\1\172\1\163\2\uffff\1\164\1\172\1\uffff\1\172\1\111\1\123\1\116\1\104\1\145\1\141\1\uffff\1\163\1\172\2\uffff\1\116\1\117\1\172\1\111\1\162\2\172\1\uffff\1\101\1\116\1\uffff\1\101\1\146\2\uffff\1\122\1\172\1\116\1\141\1\131\1\uffff\1\172\1\143\1\172\1\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\22\1\23\1\uffff\1\25\1\uffff\1\27\6\uffff\1\46\1\47\1\50\1\uffff\1\55\4\uffff\1\63\1\64\2\uffff\1\67\1\70\2\uffff\1\63\10\uffff\1\22\1\23\1\uffff\1\25\2\uffff\1\27\10\uffff\1\54\1\43\1\46\1\47\1\50\1\uffff\1\55\3\uffff\1\66\1\64\1\65\1\67\21\uffff\1\36\4\uffff\1\37\1\uffff\1\53\2\uffff\1\61\1\62\3\uffff\1\32\21\uffff\1\52\12\uffff\1\7\22\uffff\1\35\10\uffff\1\11\1\13\1\15\1\10\3\uffff\1\17\3\uffff\1\24\1\45\1\51\6\uffff\1\42\3\uffff\1\5\3\uffff\1\12\1\14\1\16\1\20\2\uffff\1\56\6\uffff\1\57\3\uffff\1\6\5\uffff\1\41\1\44\2\uffff\1\34\7\uffff\1\26\2\uffff\1\40\1\60\7\uffff\1\31\2\uffff\1\3\2\uffff\1\33\1\30\5\uffff\1\2\3\uffff\1\4\1\uffff\1\1\1\uffff\1\21";
    static final String DFA13_specialS =
        "\1\2\37\uffff\1\0\1\3\45\uffff\1\1\u00be\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\40\4\43\1\41\4\43\1\16\1\43\1\31\1\34\12\37\1\14\1\26\1\43\1\24\3\43\1\36\1\2\1\36\1\7\1\36\1\6\2\36\1\4\2\36\1\3\6\36\1\1\1\36\1\5\5\36\1\25\1\43\1\27\1\35\1\36\1\43\1\17\1\30\1\33\1\20\1\15\1\36\1\32\1\36\1\22\11\36\1\10\1\36\1\21\1\23\1\13\3\36\1\11\1\43\1\12\uff82\43",
            "\1\44\16\uffff\1\45",
            "\1\47\5\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\61",
            "",
            "\1\63\11\uffff\1\64",
            "",
            "\1\70\7\uffff\1\66\1\uffff\1\71\4\uffff\1\67",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\1\103",
            "",
            "\1\105",
            "\1\106",
            "\1\107\4\uffff\1\110",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\112",
            "\0\112",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "\1\116\14\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126\5\uffff\1\127",
            "",
            "",
            "\1\130",
            "",
            "\1\131\1\132",
            "\1\133",
            "",
            "\1\134",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\52\147\1\150\uffd5\147",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\155",
            "\1\156",
            "\1\160\1\uffff\1\161\2\uffff\1\162\1\uffff\1\157",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\1\uffff\1\u008f\2\uffff\1\u0090\1\uffff\1\u008d",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0\10\uffff\1\u00b1\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c6\4\uffff\1\u00c5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d3",
            "",
            "",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\12\46\1\u00d8\6\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00da",
            "\1\u00db",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00dd",
            "\1\u00de\7\uffff\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f4",
            "\1\u00f5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0102",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0104",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_ML_COMMENT | RULE_DESCRIPTION | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_71 = input.LA(1);

                        s = -1;
                        if ( ((LA13_71>='\u0000' && LA13_71<=')')||(LA13_71>='+' && LA13_71<='\uFFFF')) ) {s = 103;}

                        else if ( (LA13_71=='*') ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='S') ) {s = 1;}

                        else if ( (LA13_0=='B') ) {s = 2;}

                        else if ( (LA13_0=='L') ) {s = 3;}

                        else if ( (LA13_0=='I') ) {s = 4;}

                        else if ( (LA13_0=='U') ) {s = 5;}

                        else if ( (LA13_0=='F') ) {s = 6;}

                        else if ( (LA13_0=='D') ) {s = 7;}

                        else if ( (LA13_0=='s') ) {s = 8;}

                        else if ( (LA13_0=='{') ) {s = 9;}

                        else if ( (LA13_0=='}') ) {s = 10;}

                        else if ( (LA13_0=='w') ) {s = 11;}

                        else if ( (LA13_0==':') ) {s = 12;}

                        else if ( (LA13_0=='e') ) {s = 13;}

                        else if ( (LA13_0==',') ) {s = 14;}

                        else if ( (LA13_0=='a') ) {s = 15;}

                        else if ( (LA13_0=='d') ) {s = 16;}

                        else if ( (LA13_0=='u') ) {s = 17;}

                        else if ( (LA13_0=='i') ) {s = 18;}

                        else if ( (LA13_0=='v') ) {s = 19;}

                        else if ( (LA13_0=='=') ) {s = 20;}

                        else if ( (LA13_0=='[') ) {s = 21;}

                        else if ( (LA13_0==';') ) {s = 22;}

                        else if ( (LA13_0==']') ) {s = 23;}

                        else if ( (LA13_0=='b') ) {s = 24;}

                        else if ( (LA13_0=='.') ) {s = 25;}

                        else if ( (LA13_0=='g') ) {s = 26;}

                        else if ( (LA13_0=='c') ) {s = 27;}

                        else if ( (LA13_0=='/') ) {s = 28;}

                        else if ( (LA13_0=='^') ) {s = 29;}

                        else if ( (LA13_0=='A'||LA13_0=='C'||LA13_0=='E'||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='R')||LA13_0=='T'||(LA13_0>='V' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='f'||LA13_0=='h'||(LA13_0>='j' && LA13_0<='r')||LA13_0=='t'||(LA13_0>='x' && LA13_0<='z')) ) {s = 30;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 31;}

                        else if ( (LA13_0=='\"') ) {s = 32;}

                        else if ( (LA13_0=='\'') ) {s = 33;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 34;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='-'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( ((LA13_33>='\u0000' && LA13_33<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}