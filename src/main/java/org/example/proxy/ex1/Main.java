package org.example.proxy.ex1;

public class Main {
    static void main() {
      Database database = new ProxyDatabase("password");
      database.insert();
    }
}
