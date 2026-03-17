package org.example.iteratorEx.ex3;

public class Main {
    static void main() {
        PhoneList phoneList = new MyPhoneList();
        phoneList.addPhone(new Phone(123123));
        phoneList.addPhone(new Phone(125343123));
        phoneList.addPhone(new Phone(654));
        phoneList.addPhone(new Phone(234634));
        phoneList.addPhone(new Phone(876));


        Iterator<Phone> iterator = phoneList.createIterator();
        while (iterator.hasNext()){
            Phone phone = iterator.next();
            phone.call();
        }
    }
}
