package org.example.stateEx.ex2.state;

import org.example.stateEx.ex2.WashMachine;

public interface WashMachineState {
    void wash(WashMachine machine);

    void stop(WashMachine machine);

    void spin(WashMachine machine);
}
