package org.sodalite.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAADMLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_QUALIFIED_NAME=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalAADMLexer() {;} 
    public InternalAADMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAADMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAADM.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAADM.g:11:7: ( 'node_templates{' )
            // InternalAADM.g:11:9: 'node_templates{'
            {
            match("node_templates{"); 


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
            // InternalAADM.g:12:7: ( '}' )
            // InternalAADM.g:12:9: '}'
            {
            match('}'); 

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
            // InternalAADM.g:13:7: ( '{' )
            // InternalAADM.g:13:9: '{'
            {
            match('{'); 

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
            // InternalAADM.g:14:7: ( 'type:' )
            // InternalAADM.g:14:9: 'type:'
            {
            match("type:"); 


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
            // InternalAADM.g:15:7: ( 'description:' )
            // InternalAADM.g:15:9: 'description:'
            {
            match("description:"); 


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
            // InternalAADM.g:16:7: ( 'properties{' )
            // InternalAADM.g:16:9: 'properties{'
            {
            match("properties{"); 


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
            // InternalAADM.g:17:7: ( 'attributes{' )
            // InternalAADM.g:17:9: 'attributes{'
            {
            match("attributes{"); 


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
            // InternalAADM.g:18:7: ( 'requirements{' )
            // InternalAADM.g:18:9: 'requirements{'
            {
            match("requirements{"); 


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
            // InternalAADM.g:19:7: ( 'node:' )
            // InternalAADM.g:19:9: 'node:'
            {
            match("node:"); 


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
            // InternalAADM.g:20:7: ( ':' )
            // InternalAADM.g:20:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_QUALIFIED_NAME"
    public final void mRULE_QUALIFIED_NAME() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAADM.g:1731:21: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalAADM.g:1731:23: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalAADM.g:1731:31: ( '.' RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAADM.g:1731:32: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIED_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAADM.g:1733:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalAADM.g:1733:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalAADM.g:1733:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAADM.g:1733:11: '^'
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

            // InternalAADM.g:1733:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAADM.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
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
            // InternalAADM.g:1735:10: ( ( '0' .. '9' )+ )
            // InternalAADM.g:1735:12: ( '0' .. '9' )+
            {
            // InternalAADM.g:1735:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAADM.g:1735:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalAADM.g:1737:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAADM.g:1737:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAADM.g:1737:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAADM.g:1737:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAADM.g:1737:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAADM.g:1737:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAADM.g:1737:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAADM.g:1737:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAADM.g:1737:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAADM.g:1737:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAADM.g:1737:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalAADM.g:1739:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAADM.g:1739:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAADM.g:1739:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAADM.g:1739:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalAADM.g:1741:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAADM.g:1741:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAADM.g:1741:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAADM.g:1741:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAADM.g:1741:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAADM.g:1741:41: ( '\\r' )? '\\n'
                    {
                    // InternalAADM.g:1741:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAADM.g:1741:41: '\\r'
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
            // InternalAADM.g:1743:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAADM.g:1743:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAADM.g:1743:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalAADM.g:
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
            // InternalAADM.g:1745:16: ( . )
            // InternalAADM.g:1745:18: .
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
        // InternalAADM.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_QUALIFIED_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=18;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalAADM.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalAADM.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalAADM.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalAADM.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalAADM.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalAADM.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalAADM.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalAADM.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalAADM.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalAADM.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalAADM.g:1:70: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 12 :
                // InternalAADM.g:1:90: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalAADM.g:1:98: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalAADM.g:1:107: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalAADM.g:1:119: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalAADM.g:1:135: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalAADM.g:1:151: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalAADM.g:1:159: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\24\2\uffff\5\24\1\uffff\1\21\1\24\1\uffff\3\21\2\uffff\2\24\4\uffff\5\24\1\uffff\1\24\5\uffff\15\24\2\uffff\37\24\2\uffff\2\24\1\uffff\2\24\1\uffff\1\24\1\uffff";
    static final String DFA13_eofS =
        "\134\uffff";
    static final String DFA13_minS =
        "\1\0\1\55\2\uffff\5\55\1\uffff\1\101\1\55\1\uffff\2\0\1\52\2\uffff\2\55\4\uffff\5\55\1\uffff\1\55\5\uffff\15\55\2\uffff\37\55\2\uffff\2\55\1\uffff\2\55\1\uffff\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\2\uffff\5\172\1\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\2\172\4\uffff\5\172\1\uffff\1\172\5\uffff\15\172\2\uffff\32\172\2\173\3\172\2\uffff\2\172\1\uffff\1\173\1\172\1\uffff\1\173\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\5\uffff\1\12\2\uffff\1\15\3\uffff\1\21\1\22\2\uffff\1\14\1\13\1\2\1\3\5\uffff\1\12\1\uffff\1\15\1\16\1\17\1\20\1\21\15\uffff\1\11\1\4\37\uffff\1\6\1\7\2\uffff\1\5\2\uffff\1\10\1\uffff\1\1";
    static final String DFA13_specialS =
        "\1\1\14\uffff\1\0\1\2\115\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\7\21\1\17\12\14\1\11\6\21\32\13\3\21\1\12\1\13\1\21\1\7\2\13\1\5\11\13\1\1\1\13\1\6\1\13\1\10\1\13\1\4\6\13\1\3\1\21\1\2\uff82\21",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\16\23\1\22\13\23",
            "",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\30\23\1\30\1\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\31\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\32\10\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\33\6\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\34\25\23",
            "",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\0\40",
            "\0\40",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\3\23\1\44\26\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\17\23\1\45\12\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\46\7\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\16\23\1\47\13\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\50\6\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\20\23\1\51\11\23",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "",
            "",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\52\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\53\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\2\23\1\54\27\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\17\23\1\55\12\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\56\10\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\24\23\1\57\5\23",
            "\1\23\1\25\1\uffff\12\23\1\61\6\uffff\32\23\4\uffff\1\60\1\uffff\32\23",
            "\1\23\1\25\1\uffff\12\23\1\62\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\63\10\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\64\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\65\21\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\66\21\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\67\6\23",
            "",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\70\21\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\71\10\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\23\1\72\30\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\21\23\1\73\10\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\74\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\17\23\1\75\12\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\76\6\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\24\23\1\77\5\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\100\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\14\23\1\101\15\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\102\6\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\103\21\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\104\6\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\14\23\1\105\15\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\17\23\1\106\12\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\10\23\1\107\21\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\110\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\111\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\112\25\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\13\23\1\113\16\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\16\23\1\114\13\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\115\7\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\116\7\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\15\23\1\117\14\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\1\120\31\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\15\23\1\121\14\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23\1\122",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23\1\123",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\124\6\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\23\23\1\125\6\23",
            "\1\23\1\25\1\uffff\12\23\1\126\6\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\127\7\23",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\4\23\1\130\25\23",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23\1\131",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\132\7\23",
            "",
            "\1\23\1\25\1\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23\1\133",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_QUALIFIED_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_13 = input.LA(1);

                        s = -1;
                        if ( ((LA13_13>='\u0000' && LA13_13<='\uFFFF')) ) {s = 32;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='n') ) {s = 1;}

                        else if ( (LA13_0=='}') ) {s = 2;}

                        else if ( (LA13_0=='{') ) {s = 3;}

                        else if ( (LA13_0=='t') ) {s = 4;}

                        else if ( (LA13_0=='d') ) {s = 5;}

                        else if ( (LA13_0=='p') ) {s = 6;}

                        else if ( (LA13_0=='a') ) {s = 7;}

                        else if ( (LA13_0=='r') ) {s = 8;}

                        else if ( (LA13_0==':') ) {s = 9;}

                        else if ( (LA13_0=='^') ) {s = 10;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='c')||(LA13_0>='e' && LA13_0<='m')||LA13_0=='o'||LA13_0=='q'||LA13_0=='s'||(LA13_0>='u' && LA13_0<='z')) ) {s = 11;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 12;}

                        else if ( (LA13_0=='\"') ) {s = 13;}

                        else if ( (LA13_0=='\'') ) {s = 14;}

                        else if ( (LA13_0=='/') ) {s = 15;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 16;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>=';' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_14 = input.LA(1);

                        s = -1;
                        if ( ((LA13_14>='\u0000' && LA13_14<='\uFFFF')) ) {s = 32;}

                        else s = 17;

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