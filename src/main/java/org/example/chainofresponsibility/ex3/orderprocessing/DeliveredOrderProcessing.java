package org.example.chainofresponsibility.ex3.orderprocessing;

import org.example.chainofresponsibility.ex3.order.Order;
import org.example.chainofresponsibility.ex3.order.OrderStatus;

public class DeliveredOrderProcessing extends OrderProcessing {
    @Override
    public boolean checkOrder(Order order) {
        if (order.getStatus().getLevel() >= OrderStatus.delivered.getLevel()) {
            IO.println("Заказ " + order.getOrderId() + " доставлен");
            return true;
        }
        return false;
    }
}
