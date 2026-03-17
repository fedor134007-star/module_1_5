package org.example.proxy;

public class Main {
    static void main() {
      Database database = new ProxyDatabase("password");
      database.insert();
    }
}
