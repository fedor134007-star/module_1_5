package org.example.interpreter.ex1.expression;

import org.example.interpreter.ex1.expression.CalcExpression;

public class TerminalExpression implements CalcExpression {

    private final int number;

    public TerminalExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpreted() {
        return number;
    }
}
