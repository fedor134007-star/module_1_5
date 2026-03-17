package org.example.chainofresponsibility.ex4;

import org.example.chainofresponsibility.ex4.chaiinvalidator.ContentValidator;
import org.example.chainofresponsibility.ex4.chaiinvalidator.LengthValidator;
import org.example.chainofresponsibility.ex4.chaiinvalidator.Validator;

public class Main {
    static void main() {
        String a = "бомба шарик на выгуле";
        Validator validator1 = new LengthValidator();
        Validator validator2 = new ContentValidator();

        validator1.setNext(validator2);

        IO.println(validator1.handle(a));
    }
}
