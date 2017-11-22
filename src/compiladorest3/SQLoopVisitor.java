// Generated from SQLoop.g4 by ANTLR 4.7
package compiladorest3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLoopParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLoopVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(SQLoopParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl(SQLoopParser.DdlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(SQLoopParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#definicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicoes(SQLoopParser.DefinicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#def_metodos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_metodos(SQLoopParser.Def_metodosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#relacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacoes(SQLoopParser.RelacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#rel_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_def(SQLoopParser.Rel_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#rel_metodos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_metodos(SQLoopParser.Rel_metodosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml(SQLoopParser.DmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(SQLoopParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(SQLoopParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#insercao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsercao(SQLoopParser.InsercaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(SQLoopParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(SQLoopParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#valor_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_str(SQLoopParser.Valor_strContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#valor_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_int(SQLoopParser.Valor_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#valor_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_date(SQLoopParser.Valor_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#mais_valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_valor(SQLoopParser.Mais_valorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#consulta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsulta(SQLoopParser.ConsultaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#tabela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabela(SQLoopParser.TabelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(SQLoopParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#var_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_int(SQLoopParser.Var_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#var_str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_str(SQLoopParser.Var_strContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoopParser#var_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_date(SQLoopParser.Var_dateContext ctx);
}