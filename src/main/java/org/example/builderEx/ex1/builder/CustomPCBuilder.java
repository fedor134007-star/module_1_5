package org.example.builderEx.ex1.builder;

import org.example.builderEx.ex1.pc.*;

public class CustomPCBuilder extends CustomBuilder {
    private CPU cpu;
    private GPU gpu;
    private Display display;
    private Memory memory;
    private int price;

    @Override
    void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    void setGPU(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    void setPrice(int price) {
        this.price = price;
    }

    @Override
    public PC createPC() {
        return new PC(display, cpu, gpu, memory, price);
    }
}
