package org.example.chainofresponsibility.ex3.orderprocessing;

import org.example.chainofresponsibility.ex3.order.Order;
import org.example.chainofresponsibility.ex3.order.OrderStatus;

public class OnDeliveryOrderProcessing extends OrderProcessing {

    @Override
    public boolean checkOrder(Order order) {

        if(order.getStatus().getLevel() >= OrderStatus.delivery.getLevel()){
            IO.println("Заказ " + order.getOrderId() + " на доставке");
            return true;
        }
        return false;
    }
}
