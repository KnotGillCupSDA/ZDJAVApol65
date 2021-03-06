package com.sda.j2.examples.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
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
        //Collections.sort(sorted, new MyStringComparator());

        //anonymous class
        /*Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });*/

        // java 8 - lambda
        //Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));

        //java 8 - built-in comparator
        //Collections.sort(sorted, Comparator.reverseOrder());

        //java 11
        sorted.sort(Comparator.reverseOrder());

        return sorted;
    }
}
