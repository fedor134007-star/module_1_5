package org.example.interpreter.ex2.expression;

public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreted(String context) {
        return expression1.interpreted(context) && expression2.interpreted(context);
    }
}
