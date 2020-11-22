package com.sda.j2.examples.zad18;

import java.util.Objects;

public class Computer {

    private String processor;
    private int memory;
    private String gpu;
    private String manufacturer;
    private String model;

    public Computer(String processor, int memory, String gpu, String manufacturer, String model) {
        this.processor = processor;
        this.memory = memory;
        this.gpu = gpu;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return memory == computer.memory &&
            Objects.equals(processor, computer.processor) &&
            Objects.equals(gpu, computer.gpu) &&
            Objects.equals(manufacturer, computer.manufacturer) &&
            Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, memory, gpu, manufacturer, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
            "processor='" + processor + '\'' +
            ", memory=" + memory +
            ", gpu='" + gpu + '\'' +
            ", manufacturer='" + manufacturer + '\'' +
            ", model='" + model + '\'' +
            '}';
    }
}
