package org.example.chainofresponsibility.ex3.orderprocessing;

import org.example.chainofresponsibility.ex3.order.Order;
import org.example.chainofresponsibility.ex3.order.OrderStatus;

public class PaidOrderProcessing extends OrderProcessing {


    @Override
    public boolean checkOrder(Order order) {

        if (order.getStatus().getLevel() >= OrderStatus.paid.getLevel()) {
            IO.println("Заказ " + order.getOrderId() + " оплачен");
            return true;
        }
        IO.println("Заказ не оплачен");
        return false;
    }
}
