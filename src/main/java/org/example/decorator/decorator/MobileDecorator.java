package org.example.decorator.decorator;

import org.example.decorator.mobile.Mobile;

public class MobileDecorator extends Mobile {

    Mobile mobileDecorator;

    public MobileDecorator(Mobile mobile) {
        super(mobile.name);
        this.mobileDecorator = mobile;
    }


    @Override
    public void call() {
        mobileDecorator.call();
    }

    @Override
    public void sendMessage() {
        mobileDecorator.sendMessage();
    }
}
