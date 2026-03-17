package org.example.decorator.ex2.decorator;

import org.example.decorator.ex2.tractor.Tractor;

public class TractorWithLadle extends TractorDecorator {
    public TractorWithLadle(Tractor tractor) {
        super(tractor);
    }

    @Override
    public void start() {
        super.start();
        IO.println("TractorWithLadle start");
    }

    @Override
    public void work() {
        super.work();
        IO.println("TractorWithLadle start");
    }
}
