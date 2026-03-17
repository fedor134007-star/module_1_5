package org.example.builderEx;

import org.example.builderEx.builder.CustomDirector;
import org.example.builderEx.builder.CustomPCBuilder;
import org.example.builderEx.builder.StandardDirector;
import org.example.builderEx.builder.StandardPCBuilder;

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
