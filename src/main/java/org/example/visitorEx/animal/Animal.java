package org.example.visitorEx.animal;

import org.example.visitorEx.visitor.Visitor;

public interface Animal {
    void accept(Visitor visitor);
}
