package org.example.builderEx.builder;

import org.example.builderEx.pc.*;

public abstract class CustomBuilder {
    abstract void setCPU(CPU cpu);

    abstract void setGPU(GPU gpu);

    abstract void setMemory(Memory memory);

    abstract void setDisplay(Display display);

    abstract void setPrice(int price);

    abstract PC createPC();
}
