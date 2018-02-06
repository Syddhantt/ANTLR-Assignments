// Generated from prog.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link progParser}.
 */
public interface progListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(progParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(progParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(progParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(progParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(progParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(progParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(progParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(progParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(progParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(progParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(progParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(progParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(progParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(progParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(progParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(progParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(progParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(progParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(progParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(progParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(progParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(progParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(progParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(progParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#inorout}.
	 * @param ctx the parse tree
	 */
	void enterInorout(progParser.InoroutContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#inorout}.
	 * @param ctx the parse tree
	 */
	void exitInorout(progParser.InoroutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expRelational}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpRelational(progParser.ExpRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expRelational}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpRelational(progParser.ExpRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp4}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp4(progParser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code exp4}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp4(progParser.Exp4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exp3}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp3(progParser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code exp3}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp3(progParser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(progParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link progParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(progParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void enterE(progParser.EContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void exitE(progParser.EContext ctx);
	/**
	 * Enter a parse tree produced by the {@code n}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void enterN(progParser.NContext ctx);
	/**
	 * Exit a parse tree produced by the {@code n}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void exitN(progParser.NContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void enterB(progParser.BContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void exitB(progParser.BContext ctx);
	/**
	 * Enter a parse tree produced by the {@code v}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void enterV(progParser.VContext ctx);
	/**
	 * Exit a parse tree produced by the {@code v}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void exitV(progParser.VContext ctx);
	/**
	 * Enter a parse tree produced by the {@code s}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void enterS(progParser.SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code s}
	 * labeled alternative in {@link progParser#combinations}.
	 * @param ctx the parse tree
	 */
	void exitS(progParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#varCheck}.
	 * @param ctx the parse tree
	 */
	void enterVarCheck(progParser.VarCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#varCheck}.
	 * @param ctx the parse tree
	 */
	void exitVarCheck(progParser.VarCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link progParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(progParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link progParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(progParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFuncCall}
	 * labeled alternative in {@link progParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintFuncCall(progParser.PrintFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFuncCall}
	 * labeled alternative in {@link progParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintFuncCall(progParser.PrintFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(progParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(progParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(progParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(progParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link progParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(progParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link progParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(progParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionexp}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionexp(progParser.AdditionexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionexp}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionexp(progParser.AdditionexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subexp}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexp(progParser.SubexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subexp}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexp(progParser.SubexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign1}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssign1(progParser.Assign1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign1}
	 * labeled alternative in {@link progParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssign1(progParser.Assign1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mulexp}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulexp(progParser.MulexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulexp}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulexp(progParser.MulexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divexp}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivexp(progParser.DivexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divexp}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivexp(progParser.DivexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign2}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAssign2(progParser.Assign2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign2}
	 * labeled alternative in {@link progParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAssign2(progParser.Assign2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assign3}
	 * labeled alternative in {@link progParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterAssign3(progParser.Assign3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign3}
	 * labeled alternative in {@link progParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitAssign3(progParser.Assign3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assign4}
	 * labeled alternative in {@link progParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterAssign4(progParser.Assign4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign4}
	 * labeled alternative in {@link progParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitAssign4(progParser.Assign4Context ctx);
}