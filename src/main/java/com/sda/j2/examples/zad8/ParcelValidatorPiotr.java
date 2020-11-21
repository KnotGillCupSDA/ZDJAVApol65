package com.sda.j2.examples.zad8;

public class ParcelValidatorPiotr implements Validator {

    @Override
    public boolean validate(Parcel parcel) {
        if (!sumOfDimensionsIsTooHigh(parcel) || !weightTooHigh(parcel) || !dimensionsTooLow(parcel))
            return false;
        else return true;
    }

    private boolean sumOfDimensionsIsTooHigh(Parcel parcel) {
        if ((parcel.getxLength() + parcel.getyLength() + parcel.getzLength()) > 300) {
            System.out.println("Suma wymiarów dla paczki:" + parcel + " musi być poniżej 300");
            return false;
        } else {
            return true;
        }
    }

    private boolean weightTooHigh(Parcel parcel) {
        if (parcel.isExpress() && parcel.getWeight() > 15) {
            System.out.println("Waga przesylki ekspresowej nie może przekracać 15 ");
            return false;
        } else if (!parcel.isExpress() && parcel.getWeight() > 30) {
            System.out.println("Waga przesylki standardowej niemoze przekroczyc 30");
            return false;
        } else {
            return true;
        }
    }

    // tresc zadania jest mylaca.
    // W implementacji Piotra sprawdzamy de facto czy wszystkie wymiary sa wieksze lub rowne 30
    private boolean dimensionsTooLow(Parcel parcel) {
        if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
            System.out.println("wymiary dla paczki " + parcel + " nie moga byc mniejsze niz 30");
            return false;
        } else {
            return true;
        }

    }
}