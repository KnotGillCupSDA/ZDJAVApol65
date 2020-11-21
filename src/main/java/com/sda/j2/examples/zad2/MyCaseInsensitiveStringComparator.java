package com.sda.j2.examples.zad2;

import java.util.Comparator;

public class MyCaseInsensitiveStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareToIgnoreCase(o2);
    }
}
