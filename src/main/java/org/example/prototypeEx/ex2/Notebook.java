package org.example.prototypeEx.ex2;


import java.util.Objects;

public class Notebook implements Copy<Notebook> {
    private String cpu;
    private String gpu;
    private String memory;

    public Notebook(String cpu, String gpu, String memory) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
    }


    @Override
    public Notebook copy() {
        return new Notebook(this.cpu, this.gpu, this.memory);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(cpu, notebook.cpu) && Objects.equals(gpu, notebook.gpu) && Objects.equals(memory, notebook.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, memory);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
