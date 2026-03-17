package org.example.templatemethodEx.ex2;

public abstract class UpdateData {

    void templateDelete(String data) {
        connectDB();
        delete(data);
        disconnect();
    }

    void delete(String data) {
        IO.println(data);
    }


    abstract void connectDB();

    abstract void disconnect();
}
