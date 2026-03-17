package org.example.visitorEx.visitor;

import org.example.visitorEx.animal.Cat;
import org.example.visitorEx.animal.Dog;
import org.example.visitorEx.animal.Lion;

public interface Visitor {
    void visit(Cat visitor);
    void visit(Dog visitor);
    void visit(Lion visitor);
}
