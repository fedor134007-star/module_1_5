package org.example.decorator;

import org.example.decorator.decorator.MobileDecorator;
import org.example.decorator.decorator.MobileDecoratorWithMelody;
import org.example.decorator.decorator.MobileDecoratorWithPay;
import org.example.decorator.decorator.MobileDecoratorWithPhoto;
import org.example.decorator.mobile.Android;
import org.example.decorator.mobile.Mobile;

public class Main {
    static void main() {
        Mobile mobile = new Android("xiaomi");
        IO.println(mobile.name);
        MobileDecorator mobileDecoratorWithMelody = new MobileDecoratorWithMelody(mobile);
        MobileDecorator mobileDecoratorWithPay = new MobileDecoratorWithPay(mobileDecoratorWithMelody);
        MobileDecoratorWithPhoto mobileDecoratorWithPhoto = new MobileDecoratorWithPhoto(mobileDecoratorWithPay);

        mobileDecoratorWithPhoto.call();
        mobileDecoratorWithPhoto.sendMessage();
        mobileDecoratorWithPhoto.takePhoto();
    }
}
