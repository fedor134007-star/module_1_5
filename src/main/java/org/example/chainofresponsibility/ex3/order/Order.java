package org.example.chainofresponsibility.ex3.order;

public class Order {
    private int orderId;
    private String userId;
    private String productId;
    private OrderStatus status;

    public Order(int orderId, String userId, String productId, OrderStatus status) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.status = status;
    }


    public int getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductId() {
        return productId;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
