package org.example.decorator.ex2;

import org.example.decorator.ex2.decorator.TractorWithLadle;
import org.example.decorator.ex2.tractor.CatTractor;
import org.example.decorator.ex2.tractor.K700Tractor;
import org.example.decorator.ex2.tractor.Tractor;

public class Main {
    public static void main(String[] args) {
        Tractor tractor = new K700Tractor("K700");
        Tractor tractor2 = new CatTractor("Cat");

        tractor.start();
        tractor.work();
        tractor2.start();
        tractor2.work();

        TractorWithLadle tractorWithLadle = new TractorWithLadle(tractor);
        TractorWithLadle tractorWithLadle2 = new TractorWithLadle(tractor2);

        tractorWithLadle.start();
        tractorWithLadle.work();

        tractorWithLadle2.start();
        tractorWithLadle2.work();
    }
}
