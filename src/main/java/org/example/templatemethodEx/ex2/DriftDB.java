package org.example.templatemethodEx.ex2;

public class DriftDB extends UpdateData {
    @Override
    void connectDB() {
        IO.println("Connecting to database...DriftDB");
    }

    @Override
    void disconnect() {
        IO.println("Disconnecting to database...DriftDB");
    }
}
