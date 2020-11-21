package com.sda.j2.examples.zad8;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel input) {
        int sum = input.getxLength() + input.getyLength() + input.getzLength();
        if (sum > 300 || input.getxLength() > 30 || input.getyLength() > 30 || input.getzLength() > 30) {
            System.out.println("błąd wymiarów");
            return false;
        }
        if (input.getWeight() > 30.0 && !input.isExpress()) {
            System.out.println("błąd wagi");
            return false;
        }
        if (input.getWeight() > 15.0 && input.isExpress()) {
            System.out.println("błąd wagi");
            return false;
        }
        return true;
    }
}
