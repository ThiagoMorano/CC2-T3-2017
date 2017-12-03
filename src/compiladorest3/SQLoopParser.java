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
		"'='", "'['", "']'", "'''", "'-'", "','", "'where'", "'$'"
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
			if (_la==T__27) {
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
			setState(102);
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
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__10);
				setState(82);
				match(T__8);
				setState(83);
				var_int();
				setState(84);
				match(T__9);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(85);
					match(T__5);
					setState(86);
					match(T__11);
					setState(87);
					match(T__12);
					}
				}

				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__13);
				setState(91);
				match(T__8);
				setState(92);
				var_str();
				setState(93);
				match(T__9);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(T__14);
				setState(96);
				match(T__8);
				setState(97);
				var_date();
				setState(98);
				match(T__9);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(T__15);
				setState(101);
				match(T__12);
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
			setState(104);
			match(T__16);
			setState(105);
			match(T__3);
			setState(106);
			rel_def();
			setState(107);
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
			setState(109);
			tabela();
			setState(110);
			match(T__5);
			setState(111);
			rel_metodos();
			setState(112);
			match(T__6);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(113);
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
			setState(116);
			match(T__17);
			setState(117);
			match(T__8);
			setState(118);
			var_str();
			setState(119);
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
			setState(121);
			match(T__18);
			setState(122);
			comandos();
			setState(123);
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
			setState(125);
			cmd();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(126);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				tabela();
				setState(130);
				match(T__20);
				setState(131);
				insercao();
				setState(132);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				tabela();
				setState(135);
				consulta();
				setState(136);
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
			setState(140);
			match(T__21);
			setState(141);
			valores();
			setState(142);
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
			setState(144);
			valor();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(145);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				valor_str();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				valor_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
			setState(153);
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
			setState(155);
			match(T__23);
			setState(156);
			match(INTEIRO);
			setState(157);
			match(T__23);
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
			setState(159);
			match(T__23);
			setState(160);
			match(INTEIRO);
			setState(161);
			match(T__24);
			setState(162);
			match(INTEIRO);
			setState(163);
			match(T__24);
			setState(164);
			match(INTEIRO);
			setState(165);
			match(T__23);
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(167);
				match(T__25);
				setState(168);
				valor();
				}
				}
				setState(173);
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
			setState(174);
			match(T__5);
			setState(175);
			variavel();
			setState(176);
			match(T__5);
			setState(177);
			match(T__26);
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(178);
				var_int();
				setState(179);
				match(T__8);
				setState(180);
				valor_int();
				setState(181);
				match(T__9);
				}
				break;
			case 2:
				{
				setState(183);
				var_str();
				setState(184);
				match(T__8);
				setState(185);
				valor_str();
				setState(186);
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
			setState(190);
			match(T__27);
			setState(191);
			match(IDENT);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				var_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
			setState(197);
			match(T__23);
			setState(198);
			match(IDENT);
			setState(199);
			match(T__23);
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
			setState(201);
			match(T__23);
			setState(202);
			match(IDENT);
			setState(203);
			match(T__23);
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
			setState(205);
			match(T__23);
			setState(206);
			match(IDENT);
			setState(207);
			match(T__23);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4B\n"+
		"\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bu\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0082\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\5\16\u0095\n\16\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00ac"+
		"\n\23\f\23\16\23\u00af\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bf\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\5\26\u00c6\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\2\2\u00cd\2\62\3\2\2\2\48\3\2\2\2\6<\3\2\2\2\bG\3\2\2\2\nh\3\2\2\2\f"+
		"j\3\2\2\2\16o\3\2\2\2\20v\3\2\2\2\22{\3\2\2\2\24\177\3\2\2\2\26\u008c"+
		"\3\2\2\2\30\u008e\3\2\2\2\32\u0092\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3"+
		"\2\2\2 \u009d\3\2\2\2\"\u00a1\3\2\2\2$\u00ad\3\2\2\2&\u00b0\3\2\2\2(\u00c0"+
		"\3\2\2\2*\u00c5\3\2\2\2,\u00c7\3\2\2\2.\u00cb\3\2\2\2\60\u00cf\3\2\2\2"+
		"\62\64\5\4\3\2\63\65\5\22\n\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\7\2\2\3\67\3\3\2\2\289\7\3\2\29:\5\6\4\2:;\7\4\2\2;\5\3\2\2\2"+
		"<=\7\5\2\2=>\7 \2\2>?\7\6\2\2?A\5\b\5\2@B\5\f\7\2A@\3\2\2\2AB\3\2\2\2"+
		"BC\3\2\2\2CE\7\7\2\2DF\5\6\4\2ED\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH\5(\25"+
		"\2HI\7\b\2\2IJ\5\n\6\2JL\7\t\2\2KM\5\b\5\2LK\3\2\2\2LM\3\2\2\2M\t\3\2"+
		"\2\2NO\7\n\2\2OP\7\13\2\2PQ\5,\27\2QR\7\f\2\2Ri\3\2\2\2ST\7\r\2\2TU\7"+
		"\13\2\2UV\5,\27\2VZ\7\f\2\2WX\7\b\2\2XY\7\16\2\2Y[\7\17\2\2ZW\3\2\2\2"+
		"Z[\3\2\2\2[i\3\2\2\2\\]\7\20\2\2]^\7\13\2\2^_\5.\30\2_`\7\f\2\2`i\3\2"+
		"\2\2ab\7\21\2\2bc\7\13\2\2cd\5\60\31\2de\7\f\2\2ei\3\2\2\2fg\7\22\2\2"+
		"gi\7\17\2\2hN\3\2\2\2hS\3\2\2\2h\\\3\2\2\2ha\3\2\2\2hf\3\2\2\2i\13\3\2"+
		"\2\2jk\7\23\2\2kl\7\6\2\2lm\5\16\b\2mn\7\7\2\2n\r\3\2\2\2op\5(\25\2pq"+
		"\7\b\2\2qr\5\20\t\2rt\7\t\2\2su\5\16\b\2ts\3\2\2\2tu\3\2\2\2u\17\3\2\2"+
		"\2vw\7\24\2\2wx\7\13\2\2xy\5.\30\2yz\7\f\2\2z\21\3\2\2\2{|\7\25\2\2|}"+
		"\5\24\13\2}~\7\26\2\2~\23\3\2\2\2\177\u0081\5\26\f\2\u0080\u0082\5\24"+
		"\13\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\25\3\2\2\2\u0083\u0084"+
		"\5(\25\2\u0084\u0085\7\27\2\2\u0085\u0086\5\30\r\2\u0086\u0087\7\t\2\2"+
		"\u0087\u008d\3\2\2\2\u0088\u0089\5(\25\2\u0089\u008a\5&\24\2\u008a\u008b"+
		"\7\t\2\2\u008b\u008d\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0088\3\2\2\2\u008d"+
		"\27\3\2\2\2\u008e\u008f\7\30\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7\31"+
		"\2\2\u0091\31\3\2\2\2\u0092\u0094\5\34\17\2\u0093\u0095\5$\23\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\33\3\2\2\2\u0096\u009a\5\36\20"+
		"\2\u0097\u009a\5 \21\2\u0098\u009a\5\"\22\2\u0099\u0096\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\35\3\2\2\2\u009b\u009c\7\"\2"+
		"\2\u009c\37\3\2\2\2\u009d\u009e\7\32\2\2\u009e\u009f\7!\2\2\u009f\u00a0"+
		"\7\32\2\2\u00a0!\3\2\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3\7!\2\2\u00a3"+
		"\u00a4\7\33\2\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\7"+
		"!\2\2\u00a7\u00a8\7\32\2\2\u00a8#\3\2\2\2\u00a9\u00aa\7\34\2\2\u00aa\u00ac"+
		"\5\34\17\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae%\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7"+
		"\b\2\2\u00b1\u00b2\5*\26\2\u00b2\u00b3\7\b\2\2\u00b3\u00be\7\35\2\2\u00b4"+
		"\u00b5\5,\27\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7"+
		"\f\2\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\5.\30\2\u00ba\u00bb\7\13\2\2\u00bb"+
		"\u00bc\5\36\20\2\u00bc\u00bd\7\f\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b4\3"+
		"\2\2\2\u00be\u00b9\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1"+
		"\u00c2\7 \2\2\u00c2)\3\2\2\2\u00c3\u00c6\5,\27\2\u00c4\u00c6\5.\30\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6+\3\2\2\2\u00c7\u00c8\7\32\2\2"+
		"\u00c8\u00c9\7 \2\2\u00c9\u00ca\7\32\2\2\u00ca-\3\2\2\2\u00cb\u00cc\7"+
		"\32\2\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\7\32\2\2\u00ce/\3\2\2\2\u00cf\u00d0"+
		"\7\32\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7\32\2\2\u00d2\61\3\2\2\2\20"+
		"\64AELZht\u0081\u008c\u0094\u0099\u00ad\u00be\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}