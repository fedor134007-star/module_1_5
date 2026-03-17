package org.example.builderEx.builder;

import org.example.builderEx.pc.*;

public class CustomDirector {
    CustomBuilder builder;

    public void setBuilder(CustomPCBuilder builder) {
        this.builder = builder;
    }

    public PC createSuperPC() {
        builder.setCPU(CPU.INTEL);
        builder.setGPU(GPU.NVIDIA);
        builder.setDisplay(Display.Sony);
        builder.setMemory(Memory.Samsung1024);
        builder.setPrice(5000);
        return builder.createPC();
    }

    public PC createJuniorPC() {
        builder.setCPU(CPU.AMD);
        builder.setGPU(GPU.AMD);
        builder.setDisplay(Display.Xiaomi);
        builder.setMemory(Memory.Kingston512);
        builder.setPrice(500);
        return builder.createPC();
    }
}
