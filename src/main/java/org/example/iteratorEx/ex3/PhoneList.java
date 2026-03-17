package org.example.iteratorEx.ex3;

public interface PhoneList {
    void addPhone(Phone phone);
    Iterator<Phone> createIterator();
}
