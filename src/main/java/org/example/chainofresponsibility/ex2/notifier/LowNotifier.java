package org.example.chainofresponsibility.ex2.notifier;

public class LowNotifier extends Notifier {
    public LowNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        IO.println("Low Notifier: " + message);
    }
}
