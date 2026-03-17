package org.example.interpreter.ex2.expression;

public class TerminalExpression implements Expression {
    String data;
    public TerminalExpression(String data) {
        this.data = data;
    }
    @Override
    public boolean interpreted(String context) {
        return context.contains(data);
    }
}
