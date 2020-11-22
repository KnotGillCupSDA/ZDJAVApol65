package com.sda.j2.examples.zad13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarService {

    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12Engine() {
        /*List<Car> carsWithV12Engine = new ArrayList<>();
        for (Car car : cars) {
            if(car.getEngineType() == Car.EngineType.V12) {
                carsWithV12Engine.add(car);
            }
        }
        return carsWithV12Engine;*/

        return cars.stream()
                .filter(car -> car.getEngineType() == Car.EngineType.V12)
                .collect(Collectors.toList());

    }

    public List<Car> getCarsYoungerThan1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }

}
