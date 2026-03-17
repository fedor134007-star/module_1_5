package org.example.templatemethodEx.ex2;

public class LiteSql extends UpdateData {
    @Override
    void connectDB() {
        IO.println("Connecting to database...LiteSql");
    }

    @Override
    void disconnect() {
        IO.println("Disconnecting to database...LiteSql");
    }
}
