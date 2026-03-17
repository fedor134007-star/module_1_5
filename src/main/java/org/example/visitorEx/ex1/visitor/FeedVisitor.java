package org.example.visitorEx.ex1.visitor;

import org.example.visitorEx.ex1.animal.Cat;
import org.example.visitorEx.ex1.animal.Dog;
import org.example.visitorEx.ex1.animal.Lion;

public class FeedVisitor implements Visitor {
    @Override
    public void visit(Cat visitor) {
        IO.println("Кошачий корм");
    }

    @Override
    public void visit(Dog visitor) {
        IO.println("Собачий корм");
    }

    @Override
    public void visit(Lion visitor) {
        IO.println("Тигрячий корм))");
    }
}
