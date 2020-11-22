package com.sda.j2.examples.zad19;

import java.util.Objects;

public class Laptop extends Computer {

    private int battery;

    public Laptop(String processor, int memory, String gpu, String manufacturer, String model, int battery) {
        super(processor, memory, gpu, manufacturer, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
            "battery=" + battery +
            "} " + super.toString();
    }
}
