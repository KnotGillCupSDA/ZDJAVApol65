package com.sda.j2.examples.zad13;

import java.util.List;
import java.util.Objects;

public class Car {
    enum EngineType {
        V12,
        V8,
        V6,
        S6,
        S4,
        S3
    }

    private final String name;
    private final String model;
    private final double price;
    private final int productionYear;
    private final List<Manufacturer> manufacturers;
    private final EngineType engineType;

    public Car(String name, String model, double price, int productionYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                productionYear == car.productionYear &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturers, car.manufacturers) &&
                engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionYear, manufacturers, engineType);
    }
}
