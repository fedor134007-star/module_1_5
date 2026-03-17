package org.example.visitorEx.ex2.human;

import org.example.visitorEx.ex2.visitor.HumanVisitor;

public interface Human {
    void accept(HumanVisitor visitor);
}
