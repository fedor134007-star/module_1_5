package org.example.visitorEx.ex1.visitor;

import org.example.visitorEx.ex1.animal.Cat;
import org.example.visitorEx.ex1.animal.Dog;
import org.example.visitorEx.ex1.animal.Lion;

public interface Visitor {
    void visit(Cat visitor);
    void visit(Dog visitor);
    void visit(Lion visitor);
}
