package org.example.adapterEx.adapter2;

public class SamsungAC {
    private boolean power = false;

    public void setPower(boolean status) {
        this.power = status;
        if (status) {
            System.out.println("Samsung: Кондиционер включен");
        } else {
            System.out.println("Samsung: Кондиционер выключен");
        }
    }

    public boolean getPower() {
        return power;
    }
}
