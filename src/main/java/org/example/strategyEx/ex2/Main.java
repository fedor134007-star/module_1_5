package org.example.strategyEx.ex2;

import org.example.strategyEx.ex2.order.Order;
import org.example.strategyEx.ex2.strategy.CardStrategy;
import org.example.strategyEx.ex2.strategy.CashStrategy;

public class Main {
    static void main() {
        Order order1 = new Order(new CardStrategy(), 200 );
        order1.pay();

        Order order2 = new Order(new CashStrategy(), 300);
        order2.pay();

    }
}
