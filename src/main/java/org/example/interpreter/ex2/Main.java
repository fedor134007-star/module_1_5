package org.example.interpreter.ex2;

import org.example.interpreter.ex2.expression.AndExpression;
import org.example.interpreter.ex2.expression.Expression;
import org.example.interpreter.ex2.expression.OrExpression;
import org.example.interpreter.ex2.expression.TerminalExpression;

public class Main {

    static void main() {
        Expression java = getJavaExpression();
        Expression javaSpring = getJavaSpringExpression();

        IO.println(java.interpreted(" is not work java-core"));
        IO.println(javaSpring.interpreted("java is not work spring"));
    }

    static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java-core");
        return new OrExpression(java, javaCore);
    }

    static Expression getJavaSpringExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("spring");
        return new AndExpression(java, javaCore);
    }
}
