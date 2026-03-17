package org.example.chainofresponsibility.ex2.notifier;

public abstract class Notifier {
   private int priority;
   private Notifier notifier;

   public Notifier(int priority) {
        this.priority = priority;
   }

   public void setNextNotifier(Notifier nextNotifier) {
       this.notifier = nextNotifier;
   }

   public void notifierManager(String message,  int level) {
       if (level >= priority) {
           write(message);
       }
       if(notifier != null) {
           notifier.notifierManager(message, level);
       }

   }

   public abstract void write(String message);
}
