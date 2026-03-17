package org.example.visitorEx.ex2.visitor;

import org.example.visitorEx.ex2.human.JuniorHuman;
import org.example.visitorEx.ex2.human.MiddleHuman;
import org.example.visitorEx.ex2.human.SeniorHuman;

public class SeyVisitor implements HumanVisitor {

    @Override
    public void visit(JuniorHuman human) {
        IO.println("SeyVisitor JuniorHuman");
    }

    @Override
    public void visit(MiddleHuman human) {
        IO.println("SeyVisitor MiddleHuman");
    }

    @Override
    public void visit(SeniorHuman human) {
        IO.println("SeyVisitor SeniorHuman");
    }
}