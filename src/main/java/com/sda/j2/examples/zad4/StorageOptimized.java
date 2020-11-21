package com.sda.j2.examples.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageOptimized {

    private final Map<String, List<String>> storage;

    public StorageOptimized() {
        storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        List<String> values = storage.computeIfAbsent(key, s -> new ArrayList<>());
        values.add(value);
    }

    public void printValues(String key) {
        List<String> values = storage.get(key);
        System.out.println("[" + key + "]: " + values);
    }

    public void findValues(String value) {
        System.out.println("keys for value " + value);
        // dla kazdej pary klucz,wartosc
        /*for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }*/

        storage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(value))
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
