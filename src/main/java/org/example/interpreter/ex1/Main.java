package org.example.interpreter.ex1;

import org.example.interpreter.ex1.expression.CalcExpression;
import org.example.interpreter.ex1.expression.MinusExpression;
import org.example.interpreter.ex1.expression.PlusExpression;
import org.example.interpreter.ex1.expression.TerminalExpression;

public class Main {
    public static void main(String[] args) {
        CalcExpression sum = plus(10,44);
        CalcExpression minus = minus(21414,52324);

        IO.println(sum.interpreted());
        IO.println(minus.interpreted());
    }

    static CalcExpression plus(int a, int b) {
        CalcExpression expr = new TerminalExpression(a);
        CalcExpression expr2 = new TerminalExpression(b);
        return new PlusExpression(expr, expr2);
    }

    static CalcExpression minus(int a, int b) {
        CalcExpression expr = new TerminalExpression(a);
        CalcExpression expr2 = new TerminalExpression(b);
        return new MinusExpression(expr, expr2);
    }
}
