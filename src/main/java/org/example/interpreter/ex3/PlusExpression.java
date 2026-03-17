package org.example.interpreter.ex3;

public class PlusExpression implements Expression {
    Expression ex1;
    Expression ex2;

    public PlusExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public int interpreted() {
        return ex1.interpreted() + ex2.interpreted();
    }
}
