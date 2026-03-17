package org.example.adapterEx.adapter3;

public class Main {
    public static void main(String[] args) {
        AdapterMultiRemote adapter = new AdapterMultiRemote();
        adapter.speak();
        adapter.volumeUp();
        adapter.volumeDown();
        adapter.changeBroadcast();
    }
}
