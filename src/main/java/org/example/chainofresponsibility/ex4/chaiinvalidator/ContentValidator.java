package org.example.chainofresponsibility.ex4.chaiinvalidator;

public class ContentValidator extends Validator {

    @Override
    public boolean validation(String message) {
        if (!message.toUpperCase().contains("БОМБА")) {
            IO.println("Строка не имеет слово бомба");
            return true;
        } else {
            IO.println("Строка имеет слово бомба");
            return false;
        }
    }
}
