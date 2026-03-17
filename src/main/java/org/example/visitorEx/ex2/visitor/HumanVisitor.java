package org.example.visitorEx.ex2.visitor;

import org.example.visitorEx.ex2.human.JuniorHuman;
import org.example.visitorEx.ex2.human.MiddleHuman;
import org.example.visitorEx.ex2.human.SeniorHuman;

public interface HumanVisitor {
    void visit(JuniorHuman human);
    void visit(MiddleHuman human);
    void visit(SeniorHuman human);
}
