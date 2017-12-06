// Generated from SQLoop.g4 by ANTLR 4.7
package compiladorest3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLoopParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, PalavrasChave=29, IDENT=30, INTEIRO=31, 
		CADEIA=32, IGNORADOS=33, COMENTARIO=34, ERROR=35, COMENTARIO_ERRO=36;
	public static final int
		RULE_programa = 0, RULE_ddl = 1, RULE_declaracoes = 2, RULE_definicoes = 3, 
		RULE_def_metodos = 4, RULE_relacoes = 5, RULE_rel_def = 6, RULE_rel_metodos = 7, 
		RULE_dml = 8, RULE_comandos = 9, RULE_cmd = 10, RULE_insercao = 11, RULE_valores = 12, 
		RULE_valor = 13, RULE_valor_str = 14, RULE_valor_int = 15, RULE_valor_date = 16, 
		RULE_mais_valor = 17, RULE_consulta = 18, RULE_tabela = 19, RULE_variavel = 20, 
		RULE_var_int = 21, RULE_var_str = 22, RULE_var_date = 23;
	public static final String[] ruleNames = {
		"programa", "ddl", "declaracoes", "definicoes", "def_metodos", "relacoes", 
		"rel_def", "rel_metodos", "dml", "comandos", "cmd", "insercao", "valores", 
		"valor", "valor_str", "valor_int", "valor_date", "mais_valor", "consulta", 
		"tabela", "variavel", "var_int", "var_str", "var_date"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@DDL'", "'@endDDL'", "'Table'", "'{'", "'}'", "'->'", "';'", "'aincrement'", 
		"'('", "')'", "'integer'", "'unsigned'", "'()'", "'string'", "'date'", 
		"'genTimestamps'", "'Relationships'", "'belongsTo'", "'@DML'", "'@endDML'", 
		"'='", "'['", "']'", "'-'", "','", "'where'", "'$'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "PalavrasChave", "IDENT", "INTEIRO", "CADEIA", 
		"IGNORADOS", "COMENTARIO", "ERROR", "COMENTARIO_ERRO"
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
	public String getGrammarFileName() { return "SQLoop.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLoopParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DdlContext ddl() {
			return getRuleContext(DdlContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLoopParser.EOF, 0); }
		public DmlContext dml() {
			return getRuleContext(DmlContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			ddl();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(49);
				dml();
				}
			}

			setState(52);
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

	public static class DdlContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterDdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitDdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitDdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdlContext ddl() throws RecognitionException {
		DdlContext _localctx = new DdlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ddl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			declaracoes();
			setState(56);
			match(T__1);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SQLoopParser.IDENT, 0); }
		public DefinicoesContext definicoes() {
			return getRuleContext(DefinicoesContext.class,0);
		}
		public RelacoesContext relacoes() {
			return getRuleContext(RelacoesContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__2);
			setState(59);
			match(IDENT);
			setState(60);
			match(T__3);
			setState(61);
			definicoes();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(62);
				relacoes();
				}
			}

			setState(65);
			match(T__4);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(66);
				declaracoes();
				}
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

	public static class DefinicoesContext extends ParserRuleContext {
		public TabelaContext tabela() {
			return getRuleContext(TabelaContext.class,0);
		}
		public Def_metodosContext def_metodos() {
			return getRuleContext(Def_metodosContext.class,0);
		}
		public DefinicoesContext definicoes() {
			return getRuleContext(DefinicoesContext.class,0);
		}
		public DefinicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterDefinicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitDefinicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitDefinicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicoesContext definicoes() throws RecognitionException {
		DefinicoesContext _localctx = new DefinicoesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			tabela();
			setState(70);
			match(T__5);
			setState(71);
			def_metodos();
			setState(72);
			match(T__6);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(73);
				definicoes();
				}
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

	public static class Def_metodosContext extends ParserRuleContext {
		public boolean u_inteiro;
		public int tipo_def;
		public Var_intContext var_int() {
			return getRuleContext(Var_intContext.class,0);
		}
		public Var_strContext var_str() {
			return getRuleContext(Var_strContext.class,0);
		}
		public Var_dateContext var_date() {
			return getRuleContext(Var_dateContext.class,0);
		}
		public Def_metodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_metodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterDef_metodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitDef_metodos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitDef_metodos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_metodosContext def_metodos() throws RecognitionException {
		Def_metodosContext _localctx = new Def_metodosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_metodos);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__7);
				setState(77);
				match(T__8);
				setState(78);
				var_int();
				setState(79);
				match(T__9);
				((Def_metodosContext)_localctx).tipo_def =  0;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__10);
				setState(83);
				match(T__8);
				setState(84);
				var_int();
				setState(85);
				match(T__9);
				((Def_metodosContext)_localctx).tipo_def =  1;
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(87);
					match(T__5);
					setState(88);
					match(T__11);
					setState(89);
					match(T__12);
					((Def_metodosContext)_localctx).u_inteiro =  true; ((Def_metodosContext)_localctx).tipo_def =  2;
					}
				}

				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__13);
				setState(94);
				match(T__8);
				setState(95);
				var_str();
				setState(96);
				match(T__9);
				((Def_metodosContext)_localctx).tipo_def =  3;
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__14);
				setState(100);
				match(T__8);
				setState(101);
				var_date();
				setState(102);
				match(T__9);
				((Def_metodosContext)_localctx).tipo_def =  4;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(T__15);
				setState(106);
				match(T__12);
				((Def_metodosContext)_localctx).tipo_def =  5;
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

	public static class RelacoesContext extends ParserRuleContext {
		public Rel_defContext rel_def() {
			return getRuleContext(Rel_defContext.class,0);
		}
		public RelacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterRelacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitRelacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitRelacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacoesContext relacoes() throws RecognitionException {
		RelacoesContext _localctx = new RelacoesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__16);
			setState(111);
			match(T__3);
			setState(112);
			rel_def();
			setState(113);
			match(T__4);
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

	public static class Rel_defContext extends ParserRuleContext {
		public TabelaContext tabela() {
			return getRuleContext(TabelaContext.class,0);
		}
		public Rel_metodosContext rel_metodos() {
			return getRuleContext(Rel_metodosContext.class,0);
		}
		public Rel_defContext rel_def() {
			return getRuleContext(Rel_defContext.class,0);
		}
		public Rel_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterRel_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitRel_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitRel_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_defContext rel_def() throws RecognitionException {
		Rel_defContext _localctx = new Rel_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rel_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			tabela();
			setState(116);
			match(T__5);
			setState(117);
			rel_metodos();
			setState(118);
			match(T__6);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(119);
				rel_def();
				}
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

	public static class Rel_metodosContext extends ParserRuleContext {
		public Var_strContext var_str() {
			return getRuleContext(Var_strContext.class,0);
		}
		public Rel_metodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_metodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterRel_metodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitRel_metodos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitRel_metodos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_metodosContext rel_metodos() throws RecognitionException {
		Rel_metodosContext _localctx = new Rel_metodosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rel_metodos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__17);
			setState(123);
			match(T__8);
			setState(124);
			var_str();
			setState(125);
			match(T__9);
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

	public static class DmlContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public DmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterDml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitDml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitDml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__18);
			setState(128);
			comandos();
			setState(129);
			match(T__19);
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			cmd();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(132);
				comandos();
				}
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

	public static class CmdContext extends ParserRuleContext {
		public TabelaContext tabela() {
			return getRuleContext(TabelaContext.class,0);
		}
		public InsercaoContext insercao() {
			return getRuleContext(InsercaoContext.class,0);
		}
		public ConsultaContext consulta() {
			return getRuleContext(ConsultaContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmd);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				tabela();
				setState(136);
				match(T__20);
				setState(137);
				insercao();
				setState(138);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				tabela();
				setState(141);
				consulta();
				setState(142);
				match(T__6);
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

	public static class InsercaoContext extends ParserRuleContext {
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public InsercaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insercao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterInsercao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitInsercao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitInsercao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsercaoContext insercao() throws RecognitionException {
		InsercaoContext _localctx = new InsercaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insercao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__21);
			setState(147);
			valores();
			setState(148);
			match(T__22);
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

	public static class ValoresContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Mais_valorContext mais_valor() {
			return getRuleContext(Mais_valorContext.class,0);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			valor();
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(151);
				mais_valor();
				}
				break;
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

	public static class ValorContext extends ParserRuleContext {
		public Valor_strContext valor_str() {
			return getRuleContext(Valor_strContext.class,0);
		}
		public Valor_intContext valor_int() {
			return getRuleContext(Valor_intContext.class,0);
		}
		public Valor_dateContext valor_date() {
			return getRuleContext(Valor_dateContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valor);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				valor_str();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				valor_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				valor_date();
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

	public static class Valor_strContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(SQLoopParser.CADEIA, 0); }
		public Valor_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterValor_str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitValor_str(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitValor_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_strContext valor_str() throws RecognitionException {
		Valor_strContext _localctx = new Valor_strContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(CADEIA);
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

	public static class Valor_intContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(SQLoopParser.INTEIRO, 0); }
		public Valor_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterValor_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitValor_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitValor_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_intContext valor_int() throws RecognitionException {
		Valor_intContext _localctx = new Valor_intContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valor_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(INTEIRO);
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

	public static class Valor_dateContext extends ParserRuleContext {
		public List<TerminalNode> INTEIRO() { return getTokens(SQLoopParser.INTEIRO); }
		public TerminalNode INTEIRO(int i) {
			return getToken(SQLoopParser.INTEIRO, i);
		}
		public Valor_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterValor_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitValor_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitValor_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_dateContext valor_date() throws RecognitionException {
		Valor_dateContext _localctx = new Valor_dateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(INTEIRO);
			setState(164);
			match(T__23);
			setState(165);
			match(INTEIRO);
			setState(166);
			match(T__23);
			setState(167);
			match(INTEIRO);
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

	public static class Mais_valorContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public Mais_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterMais_valor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitMais_valor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitMais_valor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_valorContext mais_valor() throws RecognitionException {
		Mais_valorContext _localctx = new Mais_valorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mais_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(169);
				match(T__24);
				setState(170);
				valor();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConsultaContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Var_intContext var_int() {
			return getRuleContext(Var_intContext.class,0);
		}
		public Valor_intContext valor_int() {
			return getRuleContext(Valor_intContext.class,0);
		}
		public Var_strContext var_str() {
			return getRuleContext(Var_strContext.class,0);
		}
		public Valor_strContext valor_str() {
			return getRuleContext(Valor_strContext.class,0);
		}
		public ConsultaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consulta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterConsulta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitConsulta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitConsulta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultaContext consulta() throws RecognitionException {
		ConsultaContext _localctx = new ConsultaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_consulta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__5);
			setState(177);
			variavel();
			setState(178);
			match(T__5);
			setState(179);
			match(T__25);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(180);
				var_int();
				setState(181);
				match(T__8);
				setState(182);
				valor_int();
				setState(183);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(185);
				var_str();
				setState(186);
				match(T__8);
				setState(187);
				valor_str();
				setState(188);
				match(T__9);
				}
				break;
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

	public static class TabelaContext extends ParserRuleContext {
		public int linha;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SQLoopParser.IDENT, 0); }
		public TabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterTabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitTabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitTabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabelaContext tabela() throws RecognitionException {
		TabelaContext _localctx = new TabelaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tabela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__26);
			setState(193);
			((TabelaContext)_localctx).IDENT = match(IDENT);
			((TabelaContext)_localctx).linha =  (((TabelaContext)_localctx).IDENT!=null?((TabelaContext)_localctx).IDENT.getLine():0);
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

	public static class VariavelContext extends ParserRuleContext {
		public Var_intContext var_int() {
			return getRuleContext(Var_intContext.class,0);
		}
		public Var_strContext var_str() {
			return getRuleContext(Var_strContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variavel);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				var_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				var_str();
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

	public static class Var_intContext extends ParserRuleContext {
		public int linha;
		public String nome;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SQLoopParser.IDENT, 0); }
		public Var_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterVar_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitVar_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitVar_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_intContext var_int() throws RecognitionException {
		Var_intContext _localctx = new Var_intContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__27);
			setState(201);
			((Var_intContext)_localctx).IDENT = match(IDENT);
			setState(202);
			match(T__27);
			((Var_intContext)_localctx).linha =  (((Var_intContext)_localctx).IDENT!=null?((Var_intContext)_localctx).IDENT.getLine():0);
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

	public static class Var_strContext extends ParserRuleContext {
		public int linha;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SQLoopParser.IDENT, 0); }
		public Var_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterVar_str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitVar_str(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitVar_str(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_strContext var_str() throws RecognitionException {
		Var_strContext _localctx = new Var_strContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__27);
			setState(206);
			((Var_strContext)_localctx).IDENT = match(IDENT);
			setState(207);
			match(T__27);
			((Var_strContext)_localctx).linha =  (((Var_strContext)_localctx).IDENT!=null?((Var_strContext)_localctx).IDENT.getLine():0);
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

	public static class Var_dateContext extends ParserRuleContext {
		public int linha;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SQLoopParser.IDENT, 0); }
		public Var_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).enterVar_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLoopListener ) ((SQLoopListener)listener).exitVar_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLoopVisitor ) return ((SQLoopVisitor<? extends T>)visitor).visitVar_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_dateContext var_date() throws RecognitionException {
		Var_dateContext _localctx = new Var_dateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__27);
			setState(211);
			((Var_dateContext)_localctx).IDENT = match(IDENT);
			setState(212);
			match(T__27);
			((Var_dateContext)_localctx).linha =  (((Var_dateContext)_localctx).IDENT!=null?((Var_dateContext)_localctx).IDENT.getLine():0);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4B\n"+
		"\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u009b\n\16\3\17\3\17\3\17\5\17\u00a0\n"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00ae"+
		"\n\23\f\23\16\23\u00b1\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c1\n\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\5\26\u00c9\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\2\2\2\u00d3\2\62\3\2\2\2\48\3\2\2\2\6<\3\2\2\2\bG\3"+
		"\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16u\3\2\2\2\20|\3\2\2\2\22\u0081\3\2\2\2"+
		"\24\u0085\3\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u0098\3\2\2\2\34"+
		"\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a3\3\2\2\2\"\u00a5\3\2\2\2$\u00af"+
		"\3\2\2\2&\u00b2\3\2\2\2(\u00c2\3\2\2\2*\u00c8\3\2\2\2,\u00ca\3\2\2\2."+
		"\u00cf\3\2\2\2\60\u00d4\3\2\2\2\62\64\5\4\3\2\63\65\5\22\n\2\64\63\3\2"+
		"\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\2\2\3\67\3\3\2\2\289\7\3\2\2"+
		"9:\5\6\4\2:;\7\4\2\2;\5\3\2\2\2<=\7\5\2\2=>\7 \2\2>?\7\6\2\2?A\5\b\5\2"+
		"@B\5\f\7\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\7\7\2\2DF\5\6\4\2ED\3\2\2\2"+
		"EF\3\2\2\2F\7\3\2\2\2GH\5(\25\2HI\7\b\2\2IJ\5\n\6\2JL\7\t\2\2KM\5\b\5"+
		"\2LK\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NO\7\n\2\2OP\7\13\2\2PQ\5,\27\2QR\7\f"+
		"\2\2RS\b\6\1\2So\3\2\2\2TU\7\r\2\2UV\7\13\2\2VW\5,\27\2WX\7\f\2\2X]\b"+
		"\6\1\2YZ\7\b\2\2Z[\7\16\2\2[\\\7\17\2\2\\^\b\6\1\2]Y\3\2\2\2]^\3\2\2\2"+
		"^o\3\2\2\2_`\7\20\2\2`a\7\13\2\2ab\5.\30\2bc\7\f\2\2cd\b\6\1\2do\3\2\2"+
		"\2ef\7\21\2\2fg\7\13\2\2gh\5\60\31\2hi\7\f\2\2ij\b\6\1\2jo\3\2\2\2kl\7"+
		"\22\2\2lm\7\17\2\2mo\b\6\1\2nN\3\2\2\2nT\3\2\2\2n_\3\2\2\2ne\3\2\2\2n"+
		"k\3\2\2\2o\13\3\2\2\2pq\7\23\2\2qr\7\6\2\2rs\5\16\b\2st\7\7\2\2t\r\3\2"+
		"\2\2uv\5(\25\2vw\7\b\2\2wx\5\20\t\2xz\7\t\2\2y{\5\16\b\2zy\3\2\2\2z{\3"+
		"\2\2\2{\17\3\2\2\2|}\7\24\2\2}~\7\13\2\2~\177\5.\30\2\177\u0080\7\f\2"+
		"\2\u0080\21\3\2\2\2\u0081\u0082\7\25\2\2\u0082\u0083\5\24\13\2\u0083\u0084"+
		"\7\26\2\2\u0084\23\3\2\2\2\u0085\u0087\5\26\f\2\u0086\u0088\5\24\13\2"+
		"\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a"+
		"\5(\25\2\u008a\u008b\7\27\2\2\u008b\u008c\5\30\r\2\u008c\u008d\7\t\2\2"+
		"\u008d\u0093\3\2\2\2\u008e\u008f\5(\25\2\u008f\u0090\5&\24\2\u0090\u0091"+
		"\7\t\2\2\u0091\u0093\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008e\3\2\2\2\u0093"+
		"\27\3\2\2\2\u0094\u0095\7\30\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\31"+
		"\2\2\u0097\31\3\2\2\2\u0098\u009a\5\34\17\2\u0099\u009b\5$\23\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c\u00a0\5\36\20"+
		"\2\u009d\u00a0\5 \21\2\u009e\u00a0\5\"\22\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\"\2"+
		"\2\u00a2\37\3\2\2\2\u00a3\u00a4\7!\2\2\u00a4!\3\2\2\2\u00a5\u00a6\7!\2"+
		"\2\u00a6\u00a7\7\32\2\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\7\32\2\2\u00a9"+
		"\u00aa\7!\2\2\u00aa#\3\2\2\2\u00ab\u00ac\7\33\2\2\u00ac\u00ae\5\34\17"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0%\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3"+
		"\u00b4\5*\26\2\u00b4\u00b5\7\b\2\2\u00b5\u00c0\7\34\2\2\u00b6\u00b7\5"+
		",\27\2\u00b7\u00b8\7\13\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\f\2\2\u00ba"+
		"\u00c1\3\2\2\2\u00bb\u00bc\5.\30\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\5"+
		"\36\20\2\u00be\u00bf\7\f\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0"+
		"\u00bb\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\7 \2\2"+
		"\u00c4\u00c5\b\25\1\2\u00c5)\3\2\2\2\u00c6\u00c9\5,\27\2\u00c7\u00c9\5"+
		".\30\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00cb"+
		"\7\36\2\2\u00cb\u00cc\7 \2\2\u00cc\u00cd\7\36\2\2\u00cd\u00ce\b\27\1\2"+
		"\u00ce-\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7"+
		"\36\2\2\u00d2\u00d3\b\30\1\2\u00d3/\3\2\2\2\u00d4\u00d5\7\36\2\2\u00d5"+
		"\u00d6\7 \2\2\u00d6\u00d7\7\36\2\2\u00d7\u00d8\b\31\1\2\u00d8\61\3\2\2"+
		"\2\20\64AEL]nz\u0087\u0092\u009a\u009f\u00af\u00c0\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}