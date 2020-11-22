package com.sda.j2.examples.zad25;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
            basket.removeFromBasket();
            addToBasket(basket, 12);

        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        } catch (BasketEmptyException e) {
            System.out.println("Nieco inaczej: " + e.getMessage());
        }

    }

    private static void addToBasket(Basket basket, int howMany) throws BasketFullException, BasketEmptyException {
        for (int i = 0; i < howMany; i++) {
            basket.addToBasket();
        }

        basket.removeFromBasket();
    }

}
