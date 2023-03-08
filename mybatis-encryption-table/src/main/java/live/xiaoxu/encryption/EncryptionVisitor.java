package live.xiaoxu.encryption;

import live.xiaoxu.util.EncryptionUtil;
import net.sf.jsqlparser.expression.*;
import net.sf.jsqlparser.expression.operators.arithmetic.*;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.conditional.XorExpression;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.*;
import net.sf.jsqlparser.statement.alter.Alter;
import net.sf.jsqlparser.statement.alter.AlterSession;
import net.sf.jsqlparser.statement.alter.AlterSystemStatement;
import net.sf.jsqlparser.statement.alter.RenameTableStatement;
import net.sf.jsqlparser.statement.alter.sequence.AlterSequence;
import net.sf.jsqlparser.statement.analyze.Analyze;
import net.sf.jsqlparser.statement.comment.Comment;
import net.sf.jsqlparser.statement.create.index.CreateIndex;
import net.sf.jsqlparser.statement.create.schema.CreateSchema;
import net.sf.jsqlparser.statement.create.sequence.CreateSequence;
import net.sf.jsqlparser.statement.create.synonym.CreateSynonym;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import net.sf.jsqlparser.statement.create.view.AlterView;
import net.sf.jsqlparser.statement.create.view.CreateView;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.drop.Drop;
import net.sf.jsqlparser.statement.execute.Execute;
import net.sf.jsqlparser.statement.grant.Grant;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.merge.Merge;
import net.sf.jsqlparser.statement.replace.Replace;
import net.sf.jsqlparser.statement.select.*;
import net.sf.jsqlparser.statement.show.ShowIndexStatement;
import net.sf.jsqlparser.statement.show.ShowTablesStatement;
import net.sf.jsqlparser.statement.truncate.Truncate;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.statement.update.UpdateSet;
import net.sf.jsqlparser.statement.upsert.Upsert;
import net.sf.jsqlparser.statement.values.ValuesStatement;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class EncryptionVisitor implements StatementVisitor, SelectVisitor, SelectItemVisitor, ExpressionVisitor,
        FromItemVisitor, OrderByVisitor, GroupByVisitor, ItemsListVisitor {

    @Override
    public void visit(BitwiseRightShift aThis) {

    }

    @Override
    public void visit(BitwiseLeftShift aThis) {

    }

    @Override
    public void visit(NullValue nullValue) {

    }

    /**
     * SELECT FUNCTION
     */
    @Override
    public void visit(Function function) {
        Optional.ofNullable(function.getParameters()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(SignedExpression signedExpression) {

    }

    @Override
    public void visit(JdbcParameter jdbcParameter) {

    }

    @Override
    public void visit(JdbcNamedParameter jdbcNamedParameter) {

    }

    @Override
    public void visit(DoubleValue doubleValue) {

    }

    @Override
    public void visit(LongValue longValue) {

    }

    @Override
    public void visit(HexValue hexValue) {

    }

    @Override
    public void visit(DateValue dateValue) {

    }

    @Override
    public void visit(TimeValue timeValue) {

    }

    @Override
    public void visit(TimestampValue timestampValue) {

    }

    /**
     * WHERE
     */
    @Override
    public void visit(Parenthesis parenthesis) {
        Optional.ofNullable(parenthesis.getExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(StringValue stringValue) {

    }

    @Override
    public void visit(Addition addition) {

    }

    @Override
    public void visit(Division division) {

    }

    @Override
    public void visit(IntegerDivision division) {

    }

    @Override
    public void visit(Multiplication multiplication) {

    }

    @Override
    public void visit(Subtraction subtraction) {

    }

    /**
     * AND
     */
    @Override
    public void visit(AndExpression andExpression) {
        Optional.ofNullable(andExpression.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(andExpression.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(OrExpression orExpression) {
        Optional.ofNullable(orExpression.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(orExpression.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(XorExpression orExpression) {

    }

    @Override
    public void visit(Between between) {

    }

    @Override
    public void visit(OverlapsCondition overlapsCondition) {

    }

    /**
     * =
     */
    @Override
    public void visit(EqualsTo equalsTo) {
        Optional.ofNullable(equalsTo.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(equalsTo.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(GreaterThan greaterThan) {
        Optional.ofNullable(greaterThan.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(greaterThan.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(GreaterThanEquals greaterThanEquals) {

    }

    /**
     * IN
     */
    @Override
    public void visit(InExpression inExpression) {
        Optional.ofNullable(inExpression.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(inExpression.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(FullTextSearch fullTextSearch) {

    }

    /**
     * IS NULL
     */
    @Override
    public void visit(IsNullExpression isNullExpression) {
        Optional.ofNullable(isNullExpression.getLeftExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(IsBooleanExpression isBooleanExpression) {

    }

    /**
     * LIKE
     */
    @Override
    public void visit(LikeExpression likeExpression) {
        Optional.ofNullable(likeExpression.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(likeExpression.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(MinorThan minorThan) {

    }

    @Override
    public void visit(MinorThanEquals minorThanEquals) {

    }

    /**
     * !=
     */
    @Override
    public void visit(NotEqualsTo notEqualsTo) {
        Optional.ofNullable(notEqualsTo.getLeftExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(notEqualsTo.getRightExpression()).ifPresent(k -> k.accept(this));
    }

    /**
     * SELECT 字段
     */
    @Override
    public void visit(Column column) {
        Optional.ofNullable(column).ifPresent(k -> {
            String columnName = k.getColumnName();
            HashSet<String> skipColumnSet = new HashSet<String>() {{
                add("true");
                add("false");
                add("TRUE");
                add("FALSE");
            }};
            if (skipColumnSet.contains(columnName)) {
                return;
            }
            k.setColumnName(EncryptionUtil.encryptionData(columnName.replace("`", "")));
        });
    }

    /**
     * FROM
     */
    @Override
    public void visit(Table table) {
        Optional.ofNullable(table).ifPresent(k -> k.setName(EncryptionUtil.encryptionData(table.getName())));
    }

    @Override
    public void visit(SubSelect subSelect) {
        Optional.ofNullable(subSelect.getSelectBody()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(ExpressionList expressionList) {
        List<Expression> expressions = Optional.ofNullable(expressionList.getExpressions()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(expressions)) {
            expressions.forEach(k -> k.accept(this));
        }
    }

    @Override
    public void visit(NamedExpressionList namedExpressionList) {

    }

    @Override
    public void visit(MultiExpressionList multiExprList) {

    }

    @Override
    public void visit(SubJoin subjoin) {

    }

    @Override
    public void visit(LateralSubSelect lateralSubSelect) {

    }

    @Override
    public void visit(ValuesList valuesList) {

    }

    @Override
    public void visit(TableFunction tableFunction) {

    }

    @Override
    public void visit(ParenthesisFromItem aThis) {

    }

    /**
     * SELECT CASE
     */
    @Override
    public void visit(CaseExpression caseExpression) {
        List<WhenClause> whenClauses = Optional.ofNullable(caseExpression.getWhenClauses()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(whenClauses)) {
            whenClauses.forEach(k -> k.accept(this));
        }
    }

    /**
     * WHERE
     */
    @Override
    public void visit(WhenClause whenClause) {
        Optional.ofNullable(whenClause.getWhenExpression()).ifPresent(k -> k.accept(this));
        Optional.ofNullable(whenClause.getThenExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(ExistsExpression existsExpression) {

    }

    @Override
    public void visit(AnyComparisonExpression anyComparisonExpression) {

    }

    @Override
    public void visit(Concat concat) {

    }

    @Override
    public void visit(Matches matches) {

    }

    @Override
    public void visit(BitwiseAnd bitwiseAnd) {

    }

    @Override
    public void visit(BitwiseOr bitwiseOr) {

    }

    @Override
    public void visit(BitwiseXor bitwiseXor) {

    }

    @Override
    public void visit(CastExpression cast) {

    }

    @Override
    public void visit(TryCastExpression cast) {

    }

    @Override
    public void visit(SafeCastExpression safeCastExpression) {

    }

    @Override
    public void visit(Modulo modulo) {

    }

    @Override
    public void visit(AnalyticExpression aexpr) {

    }

    @Override
    public void visit(ExtractExpression eexpr) {

    }

    @Override
    public void visit(IntervalExpression iexpr) {

    }

    @Override
    public void visit(OracleHierarchicalExpression oexpr) {

    }

    @Override
    public void visit(RegExpMatchOperator rexpr) {

    }

    @Override
    public void visit(JsonExpression jsonExpr) {

    }

    @Override
    public void visit(JsonOperator jsonExpr) {

    }

    @Override
    public void visit(RegExpMySQLOperator regExpMySQLOperator) {

    }

    @Override
    public void visit(UserVariable var) {

    }

    @Override
    public void visit(NumericBind bind) {

    }

    @Override
    public void visit(KeepExpression aexpr) {

    }

    @Override
    public void visit(MySQLGroupConcat groupConcat) {

    }

    @Override
    public void visit(ValueListExpression valueList) {

    }

    @Override
    public void visit(RowConstructor rowConstructor) {

    }

    @Override
    public void visit(RowGetExpression rowGetExpression) {

    }

    @Override
    public void visit(OracleHint hint) {

    }

    @Override
    public void visit(TimeKeyExpression timeKeyExpression) {

    }

    @Override
    public void visit(DateTimeLiteralExpression literal) {

    }

    @Override
    public void visit(NotExpression aThis) {

    }

    @Override
    public void visit(NextValExpression aThis) {

    }

    @Override
    public void visit(CollateExpression aThis) {

    }

    @Override
    public void visit(SimilarToExpression aThis) {

    }

    @Override
    public void visit(ArrayExpression aThis) {

    }

    @Override
    public void visit(ArrayConstructor aThis) {

    }

    @Override
    public void visit(VariableAssignment aThis) {

    }

    @Override
    public void visit(XMLSerializeExpr aThis) {

    }

    @Override
    public void visit(TimezoneExpression aThis) {

    }

    @Override
    public void visit(JsonAggregateFunction aThis) {

    }

    @Override
    public void visit(JsonFunction aThis) {

    }

    @Override
    public void visit(ConnectByRootOperator aThis) {

    }

    @Override
    public void visit(OracleNamedFunctionParameter aThis) {

    }

    @Override
    public void visit(AllValue allValue) {

    }

    @Override
    public void visit(IsDistinctExpression isDistinctExpression) {

    }

    @Override
    public void visit(GeometryDistance geometryDistance) {

    }

    @Override
    public void visit(Analyze analyze) {

    }

    @Override
    public void visit(SavepointStatement savepointStatement) {

    }

    @Override
    public void visit(RollbackStatement rollbackStatement) {

    }

    @Override
    public void visit(Comment comment) {

    }

    @Override
    public void visit(Commit commit) {

    }

    @Override
    public void visit(Delete delete) {

        if (Objects.isNull(delete)) {
            return;
        }

        // WITH_ITEMS
        List<WithItem> withItemsList = Optional.ofNullable(delete.getWithItemsList()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(withItemsList)) {
            withItemsList.forEach(order -> order.accept(this));
        }

        // TABLE
        Optional.ofNullable(delete.getTable()).ifPresent(k -> k.accept(this));

        // WHERE
        Optional.ofNullable(delete.getWhere()).ifPresent(k -> k.accept(this));

        // JOIN
        List<Join> joins = Optional.ofNullable(delete.getJoins()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(joins)) {
            joins.forEach(join -> {
                Optional.ofNullable(join.getRightItem()).ifPresent(k -> k.accept(this));
                Collection<Expression> onExpressions = Optional.ofNullable(join.getOnExpressions()).orElse(new ArrayList<>(0));
                onExpressions.forEach(on -> on.accept(this));
            });
        }

        // ORDER BY
        List<OrderByElement> orderByElements = Optional.ofNullable(delete.getOrderByElements()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(orderByElements)) {
            orderByElements.forEach(order -> order.accept(this));
        }
    }

    @Override
    public void visit(Update update) {

        if (Objects.isNull(update)) {
            return;
        }

        // TABLE
        Optional.ofNullable(update.getTable()).ifPresent(k -> k.accept(this));

        // WHERE
        Optional.ofNullable(update.getWhere()).ifPresent(k -> k.accept(this));

        // SET
        List<UpdateSet> updateSets = Optional.ofNullable(update.getUpdateSets()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(updateSets)) {
            updateSets.forEach(updateSet -> {
                List<Column> columns = Optional.ofNullable(updateSet.getColumns()).orElse(new ArrayList<>(0));
                if (CollectionUtils.isNotEmpty(columns)) {
                    columns.forEach(column -> {
                        Optional.ofNullable(column).ifPresent(k -> k.accept(this));
                    });
                }
            });
        }

        // JOIN
        List<Join> joins = Optional.ofNullable(update.getJoins()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(joins)) {
            joins.forEach(join -> {
                Optional.ofNullable(join.getRightItem()).ifPresent(k -> k.accept(this));
                Collection<Expression> onExpressions = Optional.ofNullable(join.getOnExpressions()).orElse(new ArrayList<>(0));
                onExpressions.forEach(on -> on.accept(this));
            });
        }

        // START JOIN
        List<Join> startJoins = Optional.ofNullable(update.getStartJoins()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(startJoins)) {
            startJoins.forEach(join -> {
                Optional.ofNullable(join.getRightItem()).ifPresent(k -> k.accept(this));
                Collection<Expression> onExpressions = Optional.ofNullable(join.getOnExpressions()).orElse(new ArrayList<>(0));
                onExpressions.forEach(on -> on.accept(this));
            });
        }

        // ORDER BY
        List<OrderByElement> orderByElements = Optional.ofNullable(update.getOrderByElements()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(orderByElements)) {
            orderByElements.forEach(order -> order.accept(this));
        }
    }

    @Override
    public void visit(Insert insert) {

        if (Objects.isNull(insert)) {
            return;
        }

        // TABLE
        Optional.ofNullable(insert.getTable()).ifPresent(k -> k.accept(this));

        // COLUMN
        List<Column> columns = Optional.ofNullable(insert.getColumns()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(columns)) {
            columns.forEach(column -> column.accept(this));
        }

        // ITEMS
        Optional.ofNullable(insert.getItemsList()).ifPresent(k -> k.accept(this));

        // DUPLICATE_UPDATE_COLUMNS
        List<Column> duplicateUpdateColumns = Optional.ofNullable(insert.getDuplicateUpdateColumns()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(duplicateUpdateColumns)) {
            duplicateUpdateColumns.forEach(column -> column.accept(this));
        }

        // DUPLICATE_UPDATE_EXPRESSION
        List<Expression> duplicateUpdateExpressionList = Optional.ofNullable(insert.getDuplicateUpdateExpressionList()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(duplicateUpdateExpressionList)) {
            duplicateUpdateExpressionList.forEach(column -> column.accept(this));
        }

        // WITH_ITEMS
        List<WithItem> withItemsList = Optional.ofNullable(insert.getWithItemsList()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(withItemsList)) {
            withItemsList.forEach(order -> order.accept(this));
        }
    }

    @Override
    public void visit(Replace replace) {

    }

    @Override
    public void visit(Drop drop) {

    }

    @Override
    public void visit(Truncate truncate) {

    }

    @Override
    public void visit(CreateIndex createIndex) {

    }

    @Override
    public void visit(CreateSchema aThis) {

    }

    @Override
    public void visit(CreateTable createTable) {

    }

    @Override
    public void visit(CreateView createView) {

    }

    @Override
    public void visit(AlterView alterView) {

    }

    @Override
    public void visit(Alter alter) {

    }

    @Override
    public void visit(Statements stmts) {

    }

    @Override
    public void visit(Execute execute) {

    }

    @Override
    public void visit(SetStatement set) {

    }

    @Override
    public void visit(ResetStatement reset) {

    }

    @Override
    public void visit(ShowColumnsStatement set) {

    }

    @Override
    public void visit(ShowIndexStatement showIndexStatement) {

    }

    @Override
    public void visit(ShowTablesStatement showTables) {

    }

    @Override
    public void visit(Merge merge) {

    }

    /**
     * SELECT
     */
    @Override
    public void visit(Select select) {
        Optional.ofNullable(select.getSelectBody()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(Upsert upsert) {

    }

    @Override
    public void visit(UseStatement use) {

    }

    @Override
    public void visit(Block block) {

    }

    /**
     * SELECT
     */
    @Override
    public void visit(PlainSelect plainSelect) {

        if (Objects.isNull(plainSelect)) {
            return;
        }

        // DISTINCT
        Distinct distinct = plainSelect.getDistinct();

        // SELECT
        List<SelectItem> selectItems = plainSelect.getSelectItems();
        if (CollectionUtils.isNotEmpty(selectItems)) {
            selectItems.forEach(selectItem -> selectItem.accept(this));
        }

        // SELECT
        List<Table> intoTables = plainSelect.getIntoTables();
        if (CollectionUtils.isNotEmpty(intoTables)) {
            intoTables.forEach(selectItem -> selectItem.accept(this));
        }

        // FROM
        Optional.ofNullable(plainSelect.getFromItem()).ifPresent(k -> k.accept(this));

        // JOIN
        List<Join> joins = plainSelect.getJoins();
        if (CollectionUtils.isNotEmpty(joins)) {
            joins.forEach(join -> {
                Optional.ofNullable(join.getRightItem()).ifPresent(k -> k.accept(this));
                Collection<Expression> onExpressions = Optional.ofNullable(join.getOnExpressions()).orElse(new ArrayList<>(0));
                onExpressions.forEach(on -> on.accept(this));
            });
        }

        // WHERE
        Optional.ofNullable(plainSelect.getWhere()).ifPresent(k -> k.accept(this));

        // GROUP BY
        Optional.ofNullable(plainSelect.getGroupBy()).ifPresent(k -> k.accept(this));

        // ORDER BY
        List<OrderByElement> orderByElements = Optional.ofNullable(plainSelect.getOrderByElements()).orElse(new ArrayList<>(0));
        if (CollectionUtils.isNotEmpty(orderByElements)) {
            orderByElements.forEach(order -> order.accept(this));
        }

        // HAVING
        Optional.ofNullable(plainSelect.getHaving()).ifPresent(k -> k.accept(this));

        // FOR_UPDATE_TABLE
        Optional.ofNullable(plainSelect.getForUpdateTable()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(SetOperationList setOpList) {

    }

    @Override
    public void visit(WithItem withItem) {

    }

    @Override
    public void visit(ValuesStatement values) {

    }

    @Override
    public void visit(DescribeStatement describe) {

    }

    @Override
    public void visit(ExplainStatement aThis) {

    }

    @Override
    public void visit(ShowStatement aThis) {

    }

    @Override
    public void visit(DeclareStatement aThis) {

    }

    @Override
    public void visit(Grant grant) {

    }

    @Override
    public void visit(CreateSequence createSequence) {

    }

    @Override
    public void visit(AlterSequence alterSequence) {

    }

    @Override
    public void visit(CreateFunctionalStatement createFunctionalStatement) {

    }

    @Override
    public void visit(CreateSynonym createSynonym) {

    }

    @Override
    public void visit(AlterSession alterSession) {

    }

    @Override
    public void visit(IfElseStatement aThis) {

    }

    @Override
    public void visit(RenameTableStatement renameTableStatement) {

    }

    @Override
    public void visit(PurgeStatement purgeStatement) {

    }

    @Override
    public void visit(AlterSystemStatement alterSystemStatement) {

    }

    @Override
    public void visit(UnsupportedStatement unsupportedStatement) {

    }

    /**
     * GROUP BY
     */
    @Override
    public void visit(GroupByElement groupBy) {

    }

    /**
     * ORDER BY
     */
    @Override
    public void visit(OrderByElement orderBy) {
        Optional.ofNullable(orderBy.getExpression()).ifPresent(k -> k.accept(this));
    }

    @Override
    public void visit(AllColumns allColumns) {

    }

    @Override
    public void visit(AllTableColumns allTableColumns) {

    }

    /**
     * SELECT
     */
    @Override
    public void visit(SelectExpressionItem selectExpressionItem) {
        selectExpressionItem.setAlias(buildAlias(selectExpressionItem));
        Optional.ofNullable(selectExpressionItem.getExpression()).ifPresent(k -> k.accept(this));
    }

    private Alias buildAlias(SelectExpressionItem selectExpressionItem) {

        if (Objects.isNull(selectExpressionItem.getAlias())) {
            String field = selectExpressionItem.getExpression().toString();
            String alias;
            if (field.contains(".")) {
                alias = field.split("\\.")[1];
            } else {
                alias = field;
            }
            if (!alias.contains("`")) {
                alias = "`" + alias + "`";
            }
            return new Alias(alias);
        }
        return selectExpressionItem.getAlias();
    }
}