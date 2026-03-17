package org.example.adapterEx.adapter3;

public class AdapterMultiRemote extends MultiRemote implements Radio {
    @Override
    public void speak() {
        play();
    }

    @Override
    public void volumeUp() {
        changeVolume(true);
    }

    @Override
    public void volumeDown() {
        changeVolume(false);
    }

    @Override
    public void changeChanel() {
        changeBroadcast();
    }
}
