package org.example.visitorEx.ex1.animal;

import org.example.visitorEx.ex1.visitor.Visitor;

public class Cat implements Animal {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
