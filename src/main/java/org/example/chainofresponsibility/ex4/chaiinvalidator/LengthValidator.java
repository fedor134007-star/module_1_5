package org.example.chainofresponsibility.ex4.chaiinvalidator;

public class LengthValidator extends Validator {

    @Override
    public boolean validation(String message) {
        if (message.length() > 10) {
            IO.println("Длина больше 10");
            return true;
        } else {
            IO.println("Длина меньше 10");
            return false;
        }
    }
}
