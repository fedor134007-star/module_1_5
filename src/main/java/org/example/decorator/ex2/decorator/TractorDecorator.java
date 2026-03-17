package org.example.decorator.ex2.decorator;

import org.example.decorator.ex2.tractor.Tractor;

public class TractorDecorator implements Tractor {
    private Tractor tractorDecorator;

    public TractorDecorator(Tractor tractor) {
        this.tractorDecorator = tractor;
    }


    @Override
    public void start() {
        this.tractorDecorator.start();
    }

    @Override
    public void work() {
        this.tractorDecorator.work();
    }
}
