package org.example.chainofresponsibility.ex2;

import org.example.chainofresponsibility.ex2.notifier.HighNotifier;
import org.example.chainofresponsibility.ex2.notifier.LowNotifier;
import org.example.chainofresponsibility.ex2.notifier.MediumNotifier;
import org.example.chainofresponsibility.ex2.notifier.Notifier;

public class Main {
    static void main() {
        Notifier lowNotifier = new LowNotifier(Priority.LOW);
        Notifier mediumNotifier = new MediumNotifier(Priority.MEDIUM);
        Notifier highNotifier = new HighNotifier(Priority.HIGH);

        lowNotifier.setNextNotifier(mediumNotifier);
        mediumNotifier.setNextNotifier(highNotifier);


        lowNotifier.notifierManager("Слабая заявка", Priority.LOW);
        IO.println("===============================================");
        lowNotifier.notifierManager("Средняя заявка", Priority.MEDIUM);
        IO.println("===============================================");
        lowNotifier.notifierManager("Срочная заявка", Priority.HIGH);
    }
}
