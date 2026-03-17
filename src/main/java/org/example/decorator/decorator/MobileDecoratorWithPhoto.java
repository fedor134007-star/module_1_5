package org.example.decorator.decorator;

import org.example.decorator.mobile.Mobile;

public class MobileDecoratorWithPhoto extends MobileDecorator {


    public MobileDecoratorWithPhoto(Mobile mobile) {
        super(mobile);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    @Override
    public void call() {
        super.call();
    }

    public void takePhoto() {
        IO.println("Take photo  " + super.name);
    }
}
