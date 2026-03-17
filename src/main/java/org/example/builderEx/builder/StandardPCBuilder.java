package org.example.builderEx.builder;

import org.example.builderEx.pc.*;

public class StandardPCBuilder extends StandardBuilder {
    private CPU cpu;
    private GPU gpu;
    private Display display;
    private Memory memory;
    private int price;

    @Override
    public void setCPU() {
        this.cpu = CPU.AMD;
    }

    @Override
    public void setGPU() {
        this.gpu = GPU.AMD;
    }

    @Override
    public void setMemory() {
        this.memory = Memory.Kingston512;
    }

    @Override
    public void setDisplay() {
        this.display = Display.Xiaomi;
    }

    @Override
    public void setPrice() {
        this.price = 300;
    }


    @Override
    public PC createPC() {
        return new PC(display, cpu, gpu, memory, price);
    }
}
