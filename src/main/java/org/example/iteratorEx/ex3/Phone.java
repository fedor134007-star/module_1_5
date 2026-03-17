package org.example.iteratorEx.ex3;

public class Phone {
    private final int number;

    public Phone(int number) {
        this.number = number;
    }

    void call() {
        System.out.println("call" + number);
    }
}
