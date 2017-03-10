// Generated from LookML.g4 by ANTLR 4.6

    package net.snowflake.look4j;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LookMLParser}.
 */
public interface LookMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LookMLParser#lookml}.
	 * @param ctx the parse tree
	 */
	void enterLookml(LookMLParser.LookmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#lookml}.
	 * @param ctx the parse tree
	 */
	void exitLookml(LookMLParser.LookmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(LookMLParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(LookMLParser.ViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#sql_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSql_table_name(LookMLParser.Sql_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#sql_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSql_table_name(LookMLParser.Sql_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(LookMLParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(LookMLParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#derived_table_pair}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table_pair(LookMLParser.Derived_table_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#derived_table_pair}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table_pair(LookMLParser.Derived_table_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LookMLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LookMLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(LookMLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(LookMLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#array_key}.
	 * @param ctx the parse tree
	 */
	void enterArray_key(LookMLParser.Array_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#array_key}.
	 * @param ctx the parse tree
	 */
	void exitArray_key(LookMLParser.Array_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LookMLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LookMLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(LookMLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(LookMLParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LookMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LookMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LookMLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LookMLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LookMLParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(LookMLParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LookMLParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(LookMLParser.CommentContext ctx);
}