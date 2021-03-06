package com.sda.j2.examples.zad13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {

    enum ComparisonOperator {
        LESS,
        GREATER,
        EQUAL;

        Predicate<Manufacturer> getManufacturerPredicate(int year) {
            switch (this) {
                case LESS:
                    return manufacturer -> manufacturer.getFoundedInYear() < year;
                case GREATER:
                    return manufacturer -> manufacturer.getFoundedInYear() > year;
                default:
                case EQUAL:
                    return manufacturer -> manufacturer.getFoundedInYear() == year;
            }
        }
    }

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

    public Optional<Car> getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice));
    }

    public Optional<Car> getCheapest() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice));
    }

    public Optional<Car> getCarWithAtLeast3Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .findAny();
    }

    public List<Car> getSorted(SortOrder sortOrder) {
        /*return cars.stream()
                .sorted((o1, o2) -> {
                    if(sortOrder == SortOrder.ASC) {
                        return o1.getName().compareTo(o2.getName());
                    } else {
                        return -o1.getName().compareTo(o2.getName());
                    }
                })
                .collect(Collectors.toList());*/
        return cars.stream()
                .sorted(getCarComparator(sortOrder))
                .collect(Collectors.toList());
    }

    private Comparator<Car> getCarComparator(SortOrder sortOrder) {
        Comparator<Car> comparing = Comparator.comparing(Car::getName);
        if (sortOrder == SortOrder.DESC) {
            comparing = comparing.reversed();
        }
        return comparing;
    }

    public boolean contains(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBy(int year, ComparisonOperator operator) {
        return cars.stream()
                .filter(car -> car.getManufacturers().stream()
                        .anyMatch(operator.getManufacturerPredicate(year)))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBy(int year) {
        return cars.stream()
                .filter(car -> car.getManufacturers().stream()
                        .anyMatch(manufacturer -> manufacturer.getFoundedInYear() < year))
                .collect(Collectors.toList());
    }

}
