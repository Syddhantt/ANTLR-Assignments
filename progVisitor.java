// Generated from prog.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link progParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface progVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(progParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(progParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(progParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(progParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(progParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(progParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(progParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(progParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(progParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(progParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(progParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(progParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#inorout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInorout(progParser.InoroutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expRelational}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRelational(progParser.ExpRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp4}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp4(progParser.Exp4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exp3}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp3(progParser.Exp3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(progParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(progParser.EContext ctx);
	/**
	 * Visit a parse tree produced by the {@code n}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(progParser.NContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(progParser.BContext ctx);
	/**
	 * Visit a parse tree produced by the {@code v}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV(progParser.VContext ctx);
	/**
	 * Visit a parse tree produced by the {@code s}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(progParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#varCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarCheck(progParser.VarCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link progParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(progParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFuncCall}
	 * labeled alternative in {@link progParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFuncCall(progParser.PrintFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(progParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(progParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link progParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(progParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionexp}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionexp(progParser.AdditionexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subexp}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexp(progParser.SubexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign1}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign1(progParser.Assign1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mulexp}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulexp(progParser.MulexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divexp}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivexp(progParser.DivexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign2}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign2(progParser.Assign2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assign3}
	 * labeled alternative in {@link progParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign3(progParser.Assign3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assign4}
	 * labeled alternative in {@link progParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign4(progParser.Assign4Context ctx);
}