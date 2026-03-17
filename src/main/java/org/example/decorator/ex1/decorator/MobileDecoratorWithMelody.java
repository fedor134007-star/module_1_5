package org.example.decorator.ex1.decorator;

import org.example.decorator.ex1.mobile.Mobile;

public class MobileDecoratorWithMelody extends MobileDecorator {
    public MobileDecoratorWithMelody(Mobile mobile) {
        super(mobile);
    }

    @Override
    public void call() {
        IO.println("Play melody CALLING");
        super.call();
    }

    @Override
    public void sendMessage() {
        IO.println("Play melody SENDING MESSAGE");
        super.sendMessage();
    }
}
