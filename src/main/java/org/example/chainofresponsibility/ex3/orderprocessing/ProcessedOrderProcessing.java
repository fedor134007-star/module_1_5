package org.example.chainofresponsibility.ex3.orderprocessing;

import org.example.chainofresponsibility.ex3.order.Order;
import org.example.chainofresponsibility.ex3.order.OrderStatus;

public class ProcessedOrderProcessing extends OrderProcessing {


    @Override
    public boolean checkOrder(Order order) {
        if(order.getStatus().getLevel() >= OrderStatus.processed.getLevel()){
            IO.println("Заказ " + order.getOrderId() + " обработан");
            return true;
        }
        return false;
    }
}
