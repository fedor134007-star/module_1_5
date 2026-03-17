package org.example.chainofresponsibility.ex3;

import org.example.chainofresponsibility.ex3.order.Order;
import org.example.chainofresponsibility.ex3.order.OrderStatus;
import org.example.chainofresponsibility.ex3.orderprocessing.*;

public class Main {
    public static void main(String[] args) {
        OrderProcessing paid = new PaidOrderProcessing();
        OrderProcessing processing = new OnProcessingOrderProcessing();
        OrderProcessing processed = new ProcessedOrderProcessing();
        OrderProcessing delivery = new OnDeliveryOrderProcessing();
        OrderProcessing delivered = new DeliveredOrderProcessing();

        paid.setProcessing(processing);
        processing.setProcessing(processed);
        processed.setProcessing(delivery);
        delivery.setProcessing(delivered);

        Order order = new Order(1, "user1", "product1", OrderStatus.delivered);
//        paid.handleOrder(order);
        IO.println("//////////////////////");
        Order order2 = new Order(2, "user2", "product2", OrderStatus.delivery);
        paid.handleOrder(order2);

    }
}
