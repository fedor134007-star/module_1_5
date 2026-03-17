package org.example.stateEx;

public class BleDevice {
    private State state = new NotConnect();

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }


    public void connect(int value) throws InterruptedException {
        setState(new ConnectingState());
        IO.println(getState());

        Thread.sleep(1000);
        if (value > 1) setState(new ConnectedState());
        if (value < 1) setState(new ErrorConnectingState());
        IO.println(getState());
        Thread.sleep(1000);
        if (state instanceof ErrorConnectingState) {
            setState(new NotConnect());
        }
        IO.println(getState());
    }
}
