package org.example.iteratorEx.ex3;

import java.util.ArrayList;
import java.util.List;

public class MyPhoneList implements PhoneList {
    private List<Phone> phoneList = new ArrayList<>();


    @Override
    public void addPhone(Phone phone) {
        phoneList.add(phone);
    }

    @Override
    public Iterator<Phone> createIterator() {
        return new IteratorPhone();
    }

    private class IteratorPhone implements Iterator<Phone> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < phoneList.size();
        }

        @Override
        public Phone next() {
            return phoneList.get(index++);
        }
    }
}
