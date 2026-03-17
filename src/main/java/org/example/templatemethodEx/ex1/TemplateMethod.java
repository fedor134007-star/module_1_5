package org.example.templatemethodEx.ex1;

public abstract class TemplateMethod {

    void templateConnect() {
        getUri();
        connect();
        loadData();
        getAction();
        syncAction();
    }

    private void getUri() {
        System.out.println("getUri//asdasdasf//sdfsdaf//");
    }

    private void loadData() {
        IO.println("Loading data...");
    }

    private void syncAction() {
        IO.println("Syncing action...");
    }

    public abstract void connect();

    public abstract void getAction();
}
