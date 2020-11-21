package com.sda.j2.examples.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println("keys for value " + value);
        // dla kazdej pary klucz,wartosc
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            // dla kazdej wartosci na liscie
            for (String innerValue : entry.getValue()) {
                // sprawdz czy wartosc == zadanej
                if (innerValue.equals(value)) {
                    // jezeli tak to wypisz na ekran
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }

}
