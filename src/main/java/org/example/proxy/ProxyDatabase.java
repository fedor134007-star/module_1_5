package org.example.proxy;

public class ProxyDatabase implements Database {
    String password;
    HiveDatabase hiveDatabase;

    public ProxyDatabase(String password) {
        this.password = password;
    }

    @Override
    public void run() {
        checkHiveDatabase();
    }

    @Override
    public void insert() {
        checkHiveDatabase();
        IO.println("PROXY DATABASE insert");
        hiveDatabase.insert();
    }

    @Override
    public void update() {
        checkHiveDatabase();
        IO.println("PROXY DATABASE update");
        hiveDatabase.update();
    }

    @Override
    public void delete() {
        checkHiveDatabase();
        IO.println("PROXY DATABASE delete");
        hiveDatabase.delete();
    }


    private void checkHiveDatabase(){
        if(hiveDatabase == null){
            hiveDatabase = new HiveDatabase(password);
        }
    }
}
