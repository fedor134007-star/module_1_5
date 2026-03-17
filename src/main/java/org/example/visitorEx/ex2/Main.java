package org.example.visitorEx.ex2;

import org.example.visitorEx.ex2.human.JuniorHuman;
import org.example.visitorEx.ex2.human.MiddleHuman;
import org.example.visitorEx.ex2.human.SeniorHuman;
import org.example.visitorEx.ex2.visitor.CodingVisitor;
import org.example.visitorEx.ex2.visitor.SeyVisitor;

public class Main {
    static void main() {
        SeyVisitor seyVisitor = new SeyVisitor();
        CodingVisitor codingVisitor = new CodingVisitor();


        JuniorHuman juniorHuman = new JuniorHuman();
        juniorHuman.accept(seyVisitor);
        juniorHuman.accept(codingVisitor);

        MiddleHuman middleHuman = new MiddleHuman();
        middleHuman.accept(seyVisitor);
        middleHuman.accept(codingVisitor);


        SeniorHuman seniorHuman = new SeniorHuman();
        seniorHuman.accept(seyVisitor);
        seniorHuman.accept(codingVisitor);
    }
}
