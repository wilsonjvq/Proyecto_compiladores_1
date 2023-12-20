// Generated from Expr.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(ExprParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(ExprParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(ExprParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(ExprParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExprParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExprParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ExprParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ExprParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#instrs}.
	 * @param ctx the parse tree
	 */
	void enterInstrs(ExprParser.InstrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#instrs}.
	 * @param ctx the parse tree
	 */
	void exitInstrs(ExprParser.InstrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(ExprParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(ExprParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(ExprParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(ExprParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ExprParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ExprParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comb}.
	 * @param ctx the parse tree
	 */
	void enterComb(ExprParser.CombContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comb}.
	 * @param ctx the parse tree
	 */
	void exitComb(ExprParser.CombContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(ExprParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(ExprParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(ExprParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(ExprParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExprParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unario}.
	 * @param ctx the parse tree
	 */
	void enterUnario(ExprParser.UnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unario}.
	 * @param ctx the parse tree
	 */
	void exitUnario(ExprParser.UnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExprParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExprParser.FactorContext ctx);
}