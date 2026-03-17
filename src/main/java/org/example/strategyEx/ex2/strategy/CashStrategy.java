package org.example.strategyEx.ex2.strategy;


public class CashStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        IO.println("Оплатил наличкой " + amount);
    }
}
