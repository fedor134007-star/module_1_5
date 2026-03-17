package org.example.visitorEx.ex2.human;

import org.example.visitorEx.ex2.visitor.HumanVisitor;

public class MiddleHuman implements Human {
    public void accept(HumanVisitor visitor) {
        visitor.visit(this);
    }
}
