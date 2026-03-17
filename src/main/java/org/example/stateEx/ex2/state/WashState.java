package org.example.stateEx.ex2.state;

import org.example.stateEx.ex2.WashMachine;

public class WashState implements WashMachineState {
    @Override
    public void wash(WashMachine machine) {

    }

    @Override
    public void stop(WashMachine machine) {
        IO.println("Stop");
        machine.setState(new StopState());
    }

    @Override
    public void spin(WashMachine machine) {
        IO.println("Spin");
        machine.setState(new SpinState());
    }
}
