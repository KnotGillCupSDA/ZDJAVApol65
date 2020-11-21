package com.sda.j2.examples.zad4;

import java.util.*;

public class Storage {

    private final Map<String, List<String>> storage;

    public Storage() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {

        if (storage.containsKey(key)) {
            List<String> values = storage.get(key);
            values.add(value);
        } else {
            List<String> values = new ArrayList<>();
            storage.put(key, values);
            values.add(value);
        }
    }

    public void printValues(String key) {
        List<String> values = storage.get(key);
        System.out.println("[" + key + "]: " + values);
    }

    public void findValues(String value) {

        // dla kazdej pary klucz,wartosc
        // dla kazdej wartosci
        // sprawdz czy wartosc == zadanej
        // jezeli tak to wypisz na ekran

    }

}
