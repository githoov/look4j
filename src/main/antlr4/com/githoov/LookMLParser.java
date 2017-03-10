// Generated from LookML.g4 by ANTLR 4.6

    package net.snowflake.look4j;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LookMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VIEW=1, SQL_TABLE_NAME=2, FIELD=3, SQL=4, LABEL=5, VIEW_LABEL=6, TYPE=7, 
		LINK=8, URL=9, DESCRIPTION=10, DRILL_FIELDS=11, DERIVED_TABLE=12, SQL_TRIGGER_VALUE=13, 
		SORTKEYS=14, STRING=15, QUOTED_STRING=16, TABLE_REF=17, WS=18, COMMENT=19, 
		DELIM=20, SEP=21, LBRACE=22, RBRACE=23;
	public static final int
		RULE_lookml = 0, RULE_view = 1, RULE_sql_table_name = 2, RULE_derived_table = 3, 
		RULE_derived_table_pair = 4, RULE_field = 5, RULE_pair = 6, RULE_array_key = 7, 
		RULE_array = 8, RULE_key = 9, RULE_value = 10, RULE_statement = 11, RULE_comment = 12;
	public static final String[] ruleNames = {
		"lookml", "view", "sql_table_name", "derived_table", "derived_table_pair", 
		"field", "pair", "array_key", "array", "key", "value", "statement", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'view'", "'sql_table_name'", null, "'sql'", "'label'", "'view_label'", 
		"'type'", "'link'", "'url'", "'description'", "'drill_fields'", "'derived_table'", 
		"'sql_trigger_value'", "'sortkeys'", null, null, null, null, null, "';;'", 
		"':'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VIEW", "SQL_TABLE_NAME", "FIELD", "SQL", "LABEL", "VIEW_LABEL", 
		"TYPE", "LINK", "URL", "DESCRIPTION", "DRILL_FIELDS", "DERIVED_TABLE", 
		"SQL_TRIGGER_VALUE", "SORTKEYS", "STRING", "QUOTED_STRING", "TABLE_REF", 
		"WS", "COMMENT", "DELIM", "SEP", "LBRACE", "RBRACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LookML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LookMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LookmlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LookMLParser.EOF, 0); }
		public List<ViewContext> view() {
			return getRuleContexts(ViewContext.class);
		}
		public ViewContext view(int i) {
			return getRuleContext(ViewContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public LookmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterLookml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitLookml(this);
		}
	}

	public final LookmlContext lookml() throws RecognitionException {
		LookmlContext _localctx = new LookmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lookml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIEW || _la==COMMENT) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VIEW:
					{
					setState(26);
					view();
					}
					break;
				case COMMENT:
					{
					setState(27);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewContext extends ParserRuleContext {
		public TerminalNode VIEW() { return getToken(LookMLParser.VIEW, 0); }
		public TerminalNode SEP() { return getToken(LookMLParser.SEP, 0); }
		public TerminalNode STRING() { return getToken(LookMLParser.STRING, 0); }
		public TerminalNode LBRACE() { return getToken(LookMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LookMLParser.RBRACE, 0); }
		public Sql_table_nameContext sql_table_name() {
			return getRuleContext(Sql_table_nameContext.class,0);
		}
		public Derived_tableContext derived_table() {
			return getRuleContext(Derived_tableContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitView(this);
		}
	}

	public final ViewContext view() throws RecognitionException {
		ViewContext _localctx = new ViewContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(VIEW);
			setState(36);
			match(SEP);
			setState(37);
			match(STRING);
			setState(38);
			match(LBRACE);
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQL_TABLE_NAME:
				{
				setState(39);
				sql_table_name();
				}
				break;
			case DERIVED_TABLE:
				{
				setState(40);
				derived_table();
				}
				break;
			case FIELD:
			case SQL:
			case LBRACE:
			case RBRACE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD) | (1L << SQL) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(43);
				field();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_table_nameContext extends ParserRuleContext {
		public TerminalNode SQL_TABLE_NAME() { return getToken(LookMLParser.SQL_TABLE_NAME, 0); }
		public TerminalNode SEP() { return getToken(LookMLParser.SEP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(LookMLParser.DELIM, 0); }
		public Sql_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterSql_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitSql_table_name(this);
		}
	}

	public final Sql_table_nameContext sql_table_name() throws RecognitionException {
		Sql_table_nameContext _localctx = new Sql_table_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(SQL_TABLE_NAME);
			setState(52);
			match(SEP);
			setState(53);
			statement();
			setState(54);
			match(DELIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_tableContext extends ParserRuleContext {
		public TerminalNode DERIVED_TABLE() { return getToken(LookMLParser.DERIVED_TABLE, 0); }
		public TerminalNode SEP() { return getToken(LookMLParser.SEP, 0); }
		public TerminalNode LBRACE() { return getToken(LookMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LookMLParser.RBRACE, 0); }
		public List<Derived_table_pairContext> derived_table_pair() {
			return getRuleContexts(Derived_table_pairContext.class);
		}
		public Derived_table_pairContext derived_table_pair(int i) {
			return getRuleContext(Derived_table_pairContext.class,i);
		}
		public Derived_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterDerived_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitDerived_table(this);
		}
	}

	public final Derived_tableContext derived_table() throws RecognitionException {
		Derived_tableContext _localctx = new Derived_tableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_derived_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DERIVED_TABLE);
			setState(57);
			match(SEP);
			setState(58);
			match(LBRACE);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQL) | (1L << DRILL_FIELDS) | (1L << SQL_TRIGGER_VALUE) | (1L << SORTKEYS))) != 0)) {
				{
				{
				setState(59);
				derived_table_pair();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_table_pairContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(LookMLParser.SQL, 0); }
		public TerminalNode SEP() { return getToken(LookMLParser.SEP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(LookMLParser.DELIM, 0); }
		public Array_keyContext array_key() {
			return getRuleContext(Array_keyContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode SQL_TRIGGER_VALUE() { return getToken(LookMLParser.SQL_TRIGGER_VALUE, 0); }
		public Derived_table_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_table_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterDerived_table_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitDerived_table_pair(this);
		}
	}

	public final Derived_table_pairContext derived_table_pair() throws RecognitionException {
		Derived_table_pairContext _localctx = new Derived_table_pairContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_derived_table_pair);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(SQL);
				setState(68);
				match(SEP);
				setState(69);
				statement();
				setState(70);
				match(DELIM);
				}
				break;
			case DRILL_FIELDS:
			case SORTKEYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				array_key();
				setState(73);
				match(SEP);
				setState(74);
				array();
				}
				break;
			case SQL_TRIGGER_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(SQL_TRIGGER_VALUE);
				setState(77);
				match(SEP);
				setState(78);
				statement();
				setState(79);
				match(DELIM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(LookMLParser.FIELD, 0); }
		public TerminalNode SEP() { return getToken(LookMLParser.SEP, 0); }
		public TerminalNode STRING() { return getToken(LookMLParser.STRING, 0); }
		public TerminalNode LBRACE() { return getToken(LookMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LookMLParser.RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode SQL() { return getToken(LookMLParser.SQL, 0); }
		public TerminalNode TABLE_REF() { return getToken(LookMLParser.TABLE_REF, 0); }
		public TerminalNode DELIM() { return getToken(LookMLParser.DELIM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(FIELD);
				setState(84);
				match(SEP);
				setState(85);
				match(STRING);
				setState(86);
				match(LBRACE);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQL) | (1L << LABEL) | (1L << VIEW_LABEL) | (1L << TYPE) | (1L << LINK) | (1L << URL) | (1L << DESCRIPTION) | (1L << DRILL_FIELDS) | (1L << SORTKEYS))) != 0)) {
					{
					{
					setState(87);
					pair();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(LBRACE);
				setState(95);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(SQL);
				setState(97);
				match(SEP);
				setState(98);
				match(TABLE_REF);
				setState(99);
				match(DELIM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(SQL);
				setState(101);
				match(SEP);
				setState(102);
				statement();
				setState(103);
				match(DELIM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode SEP() { return getToken(LookMLParser.SEP, 0); }
		public TerminalNode LBRACE() { return getToken(LookMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LookMLParser.RBRACE, 0); }
		public TerminalNode STRING() { return getToken(LookMLParser.STRING, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public Array_keyContext array_key() {
			return getRuleContext(Array_keyContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(LookMLParser.DELIM, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pair);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				key();
				setState(108);
				match(SEP);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(109);
					match(STRING);
					}
				}

				setState(112);
				match(LBRACE);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQL) | (1L << LABEL) | (1L << VIEW_LABEL) | (1L << TYPE) | (1L << LINK) | (1L << URL) | (1L << DESCRIPTION) | (1L << DRILL_FIELDS) | (1L << SORTKEYS))) != 0)) {
					{
					{
					setState(113);
					pair();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				array_key();
				setState(122);
				match(SEP);
				setState(123);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				key();
				setState(126);
				match(SEP);
				setState(127);
				value();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DELIM) {
					{
					setState(128);
					match(DELIM);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_keyContext extends ParserRuleContext {
		public TerminalNode DRILL_FIELDS() { return getToken(LookMLParser.DRILL_FIELDS, 0); }
		public TerminalNode SORTKEYS() { return getToken(LookMLParser.SORTKEYS, 0); }
		public Array_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterArray_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitArray_key(this);
		}
	}

	public final Array_keyContext array_key() throws RecognitionException {
		Array_keyContext _localctx = new Array_keyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==DRILL_FIELDS || _la==SORTKEYS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LookMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LookMLParser.STRING, i);
		}
		public List<TerminalNode> QUOTED_STRING() { return getTokens(LookMLParser.QUOTED_STRING); }
		public TerminalNode QUOTED_STRING(int i) {
			return getToken(LookMLParser.QUOTED_STRING, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(135);
					match(STRING);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==QUOTED_STRING) {
					{
					{
					setState(141);
					match(QUOTED_STRING);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(LookMLParser.SQL, 0); }
		public TerminalNode LABEL() { return getToken(LookMLParser.LABEL, 0); }
		public TerminalNode TYPE() { return getToken(LookMLParser.TYPE, 0); }
		public TerminalNode LINK() { return getToken(LookMLParser.LINK, 0); }
		public TerminalNode URL() { return getToken(LookMLParser.URL, 0); }
		public TerminalNode DESCRIPTION() { return getToken(LookMLParser.DESCRIPTION, 0); }
		public TerminalNode VIEW_LABEL() { return getToken(LookMLParser.VIEW_LABEL, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQL) | (1L << LABEL) | (1L << VIEW_LABEL) | (1L << TYPE) | (1L << LINK) | (1L << URL) | (1L << DESCRIPTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TABLE_REF() { return getToken(LookMLParser.TABLE_REF, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(LookMLParser.QUOTED_STRING, 0); }
		public TerminalNode STRING() { return getToken(LookMLParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << QUOTED_STRING) | (1L << TABLE_REF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LookMLParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LookMLParser.STRING, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				match(STRING);
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(LookMLParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LookMLListener ) ((LookMLListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00a3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\5\bq\n\b\3\b\3\b\7\bu\n\b"+
		"\f\b\16\bx\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b"+
		"\5\b\u0086\n\b\3\t\3\t\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\n\7\n\u0091"+
		"\n\n\f\n\16\n\u0094\13\n\5\n\u0096\n\n\3\13\3\13\3\f\3\f\3\r\6\r\u009d"+
		"\n\r\r\r\16\r\u009e\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\5\4\2\r\r\20\20\3\2\6\f\3\2\21\23\u00aa\2 \3\2\2\2\4%\3\2\2\2\6"+
		"\65\3\2\2\2\b:\3\2\2\2\nS\3\2\2\2\fk\3\2\2\2\16\u0085\3\2\2\2\20\u0087"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26\u0099\3\2\2\2\30\u009c\3"+
		"\2\2\2\32\u00a0\3\2\2\2\34\37\5\4\3\2\35\37\5\32\16\2\36\34\3\2\2\2\36"+
		"\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$"+
		"\7\2\2\3$\3\3\2\2\2%&\7\3\2\2&\'\7\27\2\2\'(\7\21\2\2(+\7\30\2\2),\5\6"+
		"\4\2*,\5\b\5\2+)\3\2\2\2+*\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-/\5\f\7\2.-\3"+
		"\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2"+
		"\2\63\64\7\31\2\2\64\5\3\2\2\2\65\66\7\4\2\2\66\67\7\27\2\2\678\5\30\r"+
		"\289\7\26\2\29\7\3\2\2\2:;\7\16\2\2;<\7\27\2\2<@\7\30\2\2=?\5\n\6\2>="+
		"\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\31\2\2"+
		"D\t\3\2\2\2EF\7\6\2\2FG\7\27\2\2GH\5\30\r\2HI\7\26\2\2IT\3\2\2\2JK\5\20"+
		"\t\2KL\7\27\2\2LM\5\22\n\2MT\3\2\2\2NO\7\17\2\2OP\7\27\2\2PQ\5\30\r\2"+
		"QR\7\26\2\2RT\3\2\2\2SE\3\2\2\2SJ\3\2\2\2SN\3\2\2\2T\13\3\2\2\2UV\7\5"+
		"\2\2VW\7\27\2\2WX\7\21\2\2X\\\7\30\2\2Y[\5\16\b\2ZY\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_l\7\31\2\2`a\7\30\2\2al\7"+
		"\31\2\2bc\7\6\2\2cd\7\27\2\2de\7\23\2\2el\7\26\2\2fg\7\6\2\2gh\7\27\2"+
		"\2hi\5\30\r\2ij\7\26\2\2jl\3\2\2\2kU\3\2\2\2k`\3\2\2\2kb\3\2\2\2kf\3\2"+
		"\2\2l\r\3\2\2\2mn\5\24\13\2np\7\27\2\2oq\7\21\2\2po\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2rv\7\30\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wy\3\2\2\2xv\3\2\2\2yz\7\31\2\2z\u0086\3\2\2\2{|\5\20\t\2|}\7\27\2\2"+
		"}~\5\22\n\2~\u0086\3\2\2\2\177\u0080\5\24\13\2\u0080\u0081\7\27\2\2\u0081"+
		"\u0083\5\26\f\2\u0082\u0084\7\26\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0086\3\2\2\2\u0085m\3\2\2\2\u0085{\3\2\2\2\u0085\177\3\2"+
		"\2\2\u0086\17\3\2\2\2\u0087\u0088\t\2\2\2\u0088\21\3\2\2\2\u0089\u008b"+
		"\7\21\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091"+
		"\7\22\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u0092\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\t\3\2\2\u0098"+
		"\25\3\2\2\2\u0099\u009a\t\4\2\2\u009a\27\3\2\2\2\u009b\u009d\7\21\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\33\3\2\2\2\22\36"+
		" +\60@S\\kpv\u0083\u0085\u008c\u0092\u0095\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}