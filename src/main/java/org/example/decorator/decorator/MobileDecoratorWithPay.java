package org.example.decorator.decorator;

import org.example.decorator.mobile.Mobile;

public class MobileDecoratorWithPay extends MobileDecorator {
    public MobileDecoratorWithPay(Mobile mobile) {
        super(mobile);
    }

    @Override
    public void call() {
        super.call();
        IO.println("-15$");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        IO.println("-10$");
    }
}
