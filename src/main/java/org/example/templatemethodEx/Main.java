package org.example.templatemethodEx;

public class Main {
    static void main() {
        ApiConnect apiConnect = new ApiConnect();
        apiConnect.templateConnect();

        IO.println("\n =========================== \n");

        BleConnect bleConnect = new BleConnect();
        bleConnect.templateConnect();
    }
}
