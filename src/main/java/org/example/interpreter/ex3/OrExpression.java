package org.example.interpreter.ex3;

public class OrExpression implements Expression {
    public Expression ex1;
    public Expression ex2;
    public OrExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public int interpreted() {
        return Math.max(ex1.interpreted(), ex2.interpreted());
    }
}
