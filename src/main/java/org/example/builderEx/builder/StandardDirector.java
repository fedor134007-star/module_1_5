package org.example.builderEx.builder;

import org.example.builderEx.pc.PC;

public class StandardDirector {
    StandardBuilder builder;

    public StandardDirector(StandardBuilder builder) {
        this.builder = builder;
    }

    public PC createPC() {
        builder.setCPU();
        builder.setGPU();
        builder.setDisplay();
        builder.setMemory();
        builder.setPrice();
        return builder.createPC();
    }
}
