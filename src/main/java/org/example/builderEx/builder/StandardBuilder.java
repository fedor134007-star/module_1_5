package org.example.builderEx.builder;

import org.example.builderEx.pc.*;

public abstract class StandardBuilder {
    abstract void setCPU();

    abstract void setGPU();

    abstract void setMemory();

    abstract void setDisplay();

    abstract void setPrice();

    abstract PC createPC();
}
