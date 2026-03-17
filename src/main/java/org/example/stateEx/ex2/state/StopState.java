package org.example.stateEx.ex2.state;

import org.example.stateEx.ex2.WashMachine;

public class StopState implements WashMachineState {
    @Override
    public void wash(WashMachine machine) {
        IO.println("WASH");
        machine.setState(new WashState());
    }

    @Override
    public void stop(WashMachine machine) {

    }

    @Override
    public void spin(WashMachine machine) {
        IO.println("SPIN");
        machine.setState(new SpinState());
    }
}
