package org.example.interpreter.ex3;

public class Main {
    static void main() {
        Expression ex1 = new TerminalExpression("Hiiiidi");
        Expression ex2 = new TerminalExpression("Helasdadasdadalo");
        Expression plus = new PlusExpression(ex1, ex2);
        Expression or = new OrExpression(ex1, ex2);
        System.out.println(plus.interpreted());
        System.out.println(or.interpreted());
    }
}
