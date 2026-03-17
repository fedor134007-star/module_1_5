package org.example.chainofresponsibility.ex4.chaiinvalidator;

public abstract class Validator {
    protected Validator next;

    public void setNext(Validator next) {
        this.next = next;
    }

    public boolean handle(String message) {
        boolean result = this.validation(message);

        if (!result) return false;  // если текущая проверка не пройдена, дальше не идём

        if (this.next != null) {
            return next.handle(message);
        }
        return result;
    }

    abstract boolean validation(String message);
}
