package org.example.stateEx.ex2;

public class Main {
    static void main() {
        WashMachine washMachine = new WashMachine();
        IO.println(washMachine.getState());

        washMachine.wash(washMachine);
        IO.println(washMachine.getState());

        washMachine.spin(washMachine);
        IO.println(washMachine.getState());

        washMachine.stop(washMachine);
        IO.println(washMachine.getState());
    }
}
