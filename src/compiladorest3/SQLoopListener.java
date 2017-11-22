// Generated from SQLoop.g4 by ANTLR 4.7
package compiladorest3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLoopParser}.
 */
public interface SQLoopListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SQLoopParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SQLoopParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#ddl}.
	 * @param ctx the parse tree
	 */
	void enterDdl(SQLoopParser.DdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#ddl}.
	 * @param ctx the parse tree
	 */
	void exitDdl(SQLoopParser.DdlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(SQLoopParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(SQLoopParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#definicoes}.
	 * @param ctx the parse tree
	 */
	void enterDefinicoes(SQLoopParser.DefinicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#definicoes}.
	 * @param ctx the parse tree
	 */
	void exitDefinicoes(SQLoopParser.DefinicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#def_metodos}.
	 * @param ctx the parse tree
	 */
	void enterDef_metodos(SQLoopParser.Def_metodosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#def_metodos}.
	 * @param ctx the parse tree
	 */
	void exitDef_metodos(SQLoopParser.Def_metodosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#relacoes}.
	 * @param ctx the parse tree
	 */
	void enterRelacoes(SQLoopParser.RelacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#relacoes}.
	 * @param ctx the parse tree
	 */
	void exitRelacoes(SQLoopParser.RelacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#rel_def}.
	 * @param ctx the parse tree
	 */
	void enterRel_def(SQLoopParser.Rel_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#rel_def}.
	 * @param ctx the parse tree
	 */
	void exitRel_def(SQLoopParser.Rel_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#rel_metodos}.
	 * @param ctx the parse tree
	 */
	void enterRel_metodos(SQLoopParser.Rel_metodosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#rel_metodos}.
	 * @param ctx the parse tree
	 */
	void exitRel_metodos(SQLoopParser.Rel_metodosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#dml}.
	 * @param ctx the parse tree
	 */
	void enterDml(SQLoopParser.DmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#dml}.
	 * @param ctx the parse tree
	 */
	void exitDml(SQLoopParser.DmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(SQLoopParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(SQLoopParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SQLoopParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SQLoopParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#insercao}.
	 * @param ctx the parse tree
	 */
	void enterInsercao(SQLoopParser.InsercaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#insercao}.
	 * @param ctx the parse tree
	 */
	void exitInsercao(SQLoopParser.InsercaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(SQLoopParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(SQLoopParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(SQLoopParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(SQLoopParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#valor_str}.
	 * @param ctx the parse tree
	 */
	void enterValor_str(SQLoopParser.Valor_strContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#valor_str}.
	 * @param ctx the parse tree
	 */
	void exitValor_str(SQLoopParser.Valor_strContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#valor_int}.
	 * @param ctx the parse tree
	 */
	void enterValor_int(SQLoopParser.Valor_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#valor_int}.
	 * @param ctx the parse tree
	 */
	void exitValor_int(SQLoopParser.Valor_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#valor_date}.
	 * @param ctx the parse tree
	 */
	void enterValor_date(SQLoopParser.Valor_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#valor_date}.
	 * @param ctx the parse tree
	 */
	void exitValor_date(SQLoopParser.Valor_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#mais_valor}.
	 * @param ctx the parse tree
	 */
	void enterMais_valor(SQLoopParser.Mais_valorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#mais_valor}.
	 * @param ctx the parse tree
	 */
	void exitMais_valor(SQLoopParser.Mais_valorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#consulta}.
	 * @param ctx the parse tree
	 */
	void enterConsulta(SQLoopParser.ConsultaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#consulta}.
	 * @param ctx the parse tree
	 */
	void exitConsulta(SQLoopParser.ConsultaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#tabela}.
	 * @param ctx the parse tree
	 */
	void enterTabela(SQLoopParser.TabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#tabela}.
	 * @param ctx the parse tree
	 */
	void exitTabela(SQLoopParser.TabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(SQLoopParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(SQLoopParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#var_int}.
	 * @param ctx the parse tree
	 */
	void enterVar_int(SQLoopParser.Var_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#var_int}.
	 * @param ctx the parse tree
	 */
	void exitVar_int(SQLoopParser.Var_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#var_str}.
	 * @param ctx the parse tree
	 */
	void enterVar_str(SQLoopParser.Var_strContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#var_str}.
	 * @param ctx the parse tree
	 */
	void exitVar_str(SQLoopParser.Var_strContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoopParser#var_date}.
	 * @param ctx the parse tree
	 */
	void enterVar_date(SQLoopParser.Var_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoopParser#var_date}.
	 * @param ctx the parse tree
	 */
	void exitVar_date(SQLoopParser.Var_dateContext ctx);
}