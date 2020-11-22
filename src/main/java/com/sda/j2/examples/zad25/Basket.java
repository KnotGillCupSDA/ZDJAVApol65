package com.sda.j2.examples.zad25;

public class Basket {
    public static final int MAX_CAPACITY = 10;
    public static final int MIN_CAPACITY = 0;

    private int elements;

    public Basket() {
        this.elements = 0;
    }

    public void addToBasket() throws BasketFullException {
        if (elements == MAX_CAPACITY) {
            throw new BasketFullException();
        }
        elements++;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (elements == MIN_CAPACITY) {
            throw new BasketEmptyException();
        }
        elements--;
    }
}