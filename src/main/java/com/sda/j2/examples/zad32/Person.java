package com.sda.j2.examples.zad32;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 12L;

    private int myAge;
    private String name;
    private int height;
    private int weight;

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}