package org.example.interpreter.ex1.expression;

public class PlusExpression implements CalcExpression {
    CalcExpression expr;
    CalcExpression expr2;
    public PlusExpression(CalcExpression expr, CalcExpression expr2) {
        this.expr = expr;
        this.expr2 = expr2;
    }

    @Override
    public int interpreted() {
        return expr.interpreted() + expr2.interpreted();
    }
}
