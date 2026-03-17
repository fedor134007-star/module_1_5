package org.example.templatemethodEx.ex1;

public class Main {
    static void main() {
        ApiConnect apiConnect = new ApiConnect();
        apiConnect.templateConnect();

        IO.println("\n =========================== \n");

        BleConnect bleConnect = new BleConnect();
        bleConnect.templateConnect();
    }
}
