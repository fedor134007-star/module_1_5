package org.example.visitorEx.ex1.animal;

import org.example.visitorEx.ex1.visitor.Visitor;

public interface Animal {
    void accept(Visitor visitor);
}
