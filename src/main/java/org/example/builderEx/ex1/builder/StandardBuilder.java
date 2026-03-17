package org.example.builderEx.ex1.builder;

import org.example.builderEx.ex1.pc.*;

public abstract class StandardBuilder {
    abstract void setCPU();

    abstract void setGPU();

    abstract void setMemory();

    abstract void setDisplay();

    abstract void setPrice();

    abstract PC createPC();
}
