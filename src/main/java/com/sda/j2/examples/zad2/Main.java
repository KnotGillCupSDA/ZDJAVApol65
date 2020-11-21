package com.sda.j2.examples.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AA");
        strings.add("AB");
        strings.add("Z");
        strings.add("b");
        strings.add("a");
        strings.add("c");

        List<String> sorted = getSorted(strings);
        System.out.println(sorted);
    }

    static List<String> getSorted(List<String> unsorted) {
        ArrayList<String> sorted = new ArrayList<>(unsorted);

        //concrete class
        //Collections.sort(sorted, new MyCaseInsensitiveStringComparator());

        //anonymous class
        /*Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareToIgnoreCase(o2);
            }
        });*/

        // java 8 - lambda
        Collections.sort(sorted, (o1, o2) -> -o1.compareToIgnoreCase(o2));

        //java 8 - built-in comparator
        //Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER.reversed());

        //java 11
        //sorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());

        return sorted;
    }
}
