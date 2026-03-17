package org.example.interpreter.ex3;

public class TerminalExpression implements Expression {
    private final String data;

    TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public int interpreted() {
        return data.length();
    }
}
