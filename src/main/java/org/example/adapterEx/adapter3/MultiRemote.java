package org.example.adapterEx.adapter3;

public class MultiRemote {
    void play() {
        IO.println("play");
    }

    void changeVolume(boolean isUP) {
        if (isUP) IO.println("volumeUp");
        else IO.println("volumeDown");
    }

    void changeBroadcast() {
        IO.println("change broadcast");
    }
}





