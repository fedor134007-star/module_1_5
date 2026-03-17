package org.example.visitorEx.animal;

import org.example.visitorEx.visitor.Visitor;

public class Dog implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
