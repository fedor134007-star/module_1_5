package org.example.chainofresponsibility.ex2.notifier;

public class MediumNotifier extends Notifier {

    public MediumNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        IO.println("MediumNotifier: " + message);
    }
}
