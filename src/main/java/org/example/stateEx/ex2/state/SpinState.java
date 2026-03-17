package org.example.stateEx.ex2.state;

import org.example.stateEx.ex2.WashMachine;

public class SpinState implements WashMachineState {

    @Override
    public void wash(WashMachine machine) {
        IO.println("WASH");
        machine.setState(new WashState());
    }

    @Override
    public void stop(WashMachine machine) {
        IO.println("STOP");
        machine.setState(new StopState());
    }

    @Override
    public void spin(WashMachine machine) {

    }
}
