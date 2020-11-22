package com.sda.j2.examples.zad18;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("IntelCore i5", 16, "AMD PowerColor", "Apple", "MacBook");
        Computer computer1 = new Computer("IntelCore i7", 24, "AMD PowerColor", "Asus", "ZenBook");
        Computer computer2 = new Computer("IntelCore i7", 24, "AMD PowerColor", "Asus", "ZenBook");

        System.out.println(computer);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println();
        System.out.println(computer.equals(computer1));
        System.out.println(computer1.equals(computer2));
    }
}
