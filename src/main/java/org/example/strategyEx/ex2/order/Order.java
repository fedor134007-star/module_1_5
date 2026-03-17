package org.example.strategyEx.ex2.order;

import org.example.strategyEx.ex2.strategy.PaymentStrategy;

public class Order {
    private int totalAmount;
    private PaymentStrategy paymentStrategy;


    public Order(PaymentStrategy paymentStrategy, int totalAmount) {
        this.paymentStrategy = paymentStrategy;
        this.totalAmount = totalAmount;
    }

    public void pay() {
        paymentStrategy.pay(totalAmount);
    }
}
