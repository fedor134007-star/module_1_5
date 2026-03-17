package org.example.stateEx.ex2;

import org.example.stateEx.ex2.state.StopState;
import org.example.stateEx.ex2.state.WashMachineState;

public class WashMachine {
    private WashMachineState state = new StopState();

    public void setState(WashMachineState state) {
        this.state = state;
    }

    WashMachineState getState() {
        return state;
    }


    void wash(WashMachine machine){
        state.wash(this);
    }

    void spin(WashMachine machine){
        state.spin(this);
    }

    void stop(WashMachine machine){
        state.stop(this);
    }
}
