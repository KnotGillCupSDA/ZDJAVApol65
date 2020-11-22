package com.sda.j2.examples.zad12;

import java.util.Objects;

public class Manufacturer {
    private final String name;
    private final int foundedInYear;
    private final String countryOfOrigin;

    public Manufacturer(String name, int foundedInYear, String countryOfOrigin) {
        this.name = name;
        this.foundedInYear = foundedInYear;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public int getFoundedInYear() {
        return foundedInYear;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return foundedInYear == that.foundedInYear &&
                Objects.equals(name, that.name) &&
                Objects.equals(countryOfOrigin, that.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundedInYear, countryOfOrigin);
    }


}
