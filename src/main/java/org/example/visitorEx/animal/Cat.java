package org.example.visitorEx.animal;

import org.example.visitorEx.visitor.Visitor;

public class Cat implements Animal {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
