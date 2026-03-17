package org.example.bridge.bridge1;

import org.example.bridge.bridge1.devices.Projector;
import org.example.bridge.bridge1.devices.Radio;
import org.example.bridge.bridge1.devices.TV;
import org.example.bridge.bridge1.remotes.BaseRemote;
import org.example.bridge.bridge1.remotes.Remote;
import org.example.bridge.bridge1.remotes.SuperRemote;

public class Main {
    static void main() {
        Remote baseRemote = new BaseRemote(new TV());
        Remote superRemote = new SuperRemote(new Radio());
        Remote baseRemote2 = new BaseRemote(new Projector());

        baseRemote2.volumeDown();
        superRemote.volumeUp();
        baseRemote.togglePower();
    }
}
