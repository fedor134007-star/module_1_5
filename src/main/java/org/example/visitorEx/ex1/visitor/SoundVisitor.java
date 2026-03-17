package org.example.visitorEx.ex1.visitor;

import org.example.visitorEx.ex1.animal.Cat;
import org.example.visitorEx.ex1.animal.Dog;
import org.example.visitorEx.ex1.animal.Lion;

public class SoundVisitor implements Visitor {
    @Override
    public void visit(Cat visitor) {
        IO.println("Мяу");
    }

    @Override
    public void visit(Dog visitor) {
        IO.println("гав гав");
    }

    @Override
    public void visit(Lion visitor) {
        IO.println("РРРРррр");
    }
}
