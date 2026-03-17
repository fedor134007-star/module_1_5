package org.example.decorator.ex1;

import org.example.decorator.ex1.decorator.MobileDecorator;
import org.example.decorator.ex1.decorator.MobileDecoratorWithMelody;
import org.example.decorator.ex1.decorator.MobileDecoratorWithPay;
import org.example.decorator.ex1.decorator.MobileDecoratorWithPhoto;
import org.example.decorator.ex1.mobile.Android;
import org.example.decorator.ex1.mobile.Mobile;

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
