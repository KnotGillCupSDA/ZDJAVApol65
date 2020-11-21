package com.sda.j2.examples.zad3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("C#", 9);
        map.put("Python", 1);
        map.put("JavaScript", 0);
        map.put("PHP", 0);

        print(map);

        System.out.println();
        System.out.println("====================");
        System.out.println();

        printWithStream(map);
    }

    private static void print(Map<String, Integer> map) {

        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            /*if(++i == map.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }*/

            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() +
                    (++i == map.size() ? "." : ","));
        }
    }

    private static void printWithStream(Map<String, Integer> map) {
        System.out.println(map.entrySet().stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                .collect(Collectors.joining("," + System.lineSeparator(), "", ".")));
    }
}
