package org.example.builderEx.ex1.pc;

public class PC {
    final Display monitor;
    final CPU cpu;
    final GPU gpu;
    final Memory memory;
    final int price;

    public PC(Display monitor, CPU cpu, GPU gpu, Memory memory, int price) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", memory=" + memory +
                ", price=" + price +
                '}';
    }
}
