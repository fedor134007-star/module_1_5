package org.example.visitorEx.ex1.animal;

import org.example.visitorEx.ex1.visitor.Visitor;

public class Lion implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
