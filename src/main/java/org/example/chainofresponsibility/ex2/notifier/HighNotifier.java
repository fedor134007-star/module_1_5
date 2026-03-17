package org.example.chainofresponsibility.ex2.notifier;

public class HighNotifier extends Notifier {

    public HighNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
     IO.println("HighNotifier: " + message);
    }
}
