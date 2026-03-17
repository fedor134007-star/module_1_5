package org.example.chainofresponsibility.ex3.orderprocessing;

import org.example.chainofresponsibility.ex3.order.Order;

public abstract class OrderProcessing {
    protected OrderProcessing processing;

    public void setProcessing(OrderProcessing nextProcessing) {
        this.processing = nextProcessing;
    }

    public void handleOrder(Order order) {
        if (order.getStatus().isCanceled()) {
            IO.println("Заказ отменен дальнейшая обработка невозможна");
            return;
        }
        if (checkOrder(order)) {
            if (processing != null) {
                processing.handleOrder(order);
            } else {
                IO.println("Товар доставлен");
            }
        } else {
            IO.println("Обработка заказа " + order.getOrderId() + " остановлена на этапе " + this.getClass().getSimpleName());
        }
    }

    public abstract boolean checkOrder(Order order);

}
