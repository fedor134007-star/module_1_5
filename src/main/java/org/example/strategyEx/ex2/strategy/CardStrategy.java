package org.example.strategyEx.ex2.strategy;


public class CardStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        IO.println("Оплатил картой " + amount);
    }
}
