package org.example.decorator.decorator;

import org.example.decorator.mobile.Mobile;

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
