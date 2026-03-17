package org.example.chainofresponsibility.ex3.order;

public enum OrderStatus {
    canceled(0),
    paid(1),
    processing(2),
    processed(3),
    delivery(4),
    delivered(5);

    private final int level;

    OrderStatus(int level) { this.level = level; }

    public int getLevel() { return level; }
    public boolean isCanceled() { return this == canceled; }
}
