package org.example.builderEx.ex1;

import org.example.builderEx.ex1.builder.CustomDirector;
import org.example.builderEx.ex1.builder.CustomPCBuilder;
import org.example.builderEx.ex1.builder.StandardDirector;
import org.example.builderEx.ex1.builder.StandardPCBuilder;

public class Main {
    static void main() {
        StandardDirector director = new StandardDirector(new StandardPCBuilder());
        IO.println(director.createPC());

        CustomDirector director1 = new CustomDirector();
        director1.setBuilder(new CustomPCBuilder());
        IO.println(director1.createJuniorPC());
        IO.println(director1.createSuperPC());
    }
}
