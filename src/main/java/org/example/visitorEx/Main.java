package org.example.visitorEx;

import org.example.visitorEx.animal.Cat;
import org.example.visitorEx.animal.Dog;
import org.example.visitorEx.animal.Lion;
import org.example.visitorEx.visitor.FeedVisitor;
import org.example.visitorEx.visitor.SoundVisitor;
import org.example.visitorEx.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Visitor visitorFeed = new FeedVisitor();
        Visitor visitorSound = new SoundVisitor();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Lion lion = new Lion();

        cat.accept(visitorFeed);
        dog.accept(visitorFeed);
        lion.accept(visitorFeed);

        cat.accept(visitorSound);
        dog.accept(visitorSound);
        lion.accept(visitorSound);

    }
}
