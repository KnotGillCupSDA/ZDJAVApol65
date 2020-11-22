package com.sda.j2.examples.zad12;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1912, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1930, "Germany");

        Car car1 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, Collections.singletonList(audi), Car.EngineType.S4);
        Car car2 = new Car("Moj pierwszy samochod", "A2", 10.0, 1999, List.of(audi, bmw), Car.EngineType.S4);

        Set<Car> cars = new HashSet<>();

        cars.add(car1);
        cars.add(car2);

    }
}
