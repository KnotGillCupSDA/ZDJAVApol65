package com.sda.j2.examples.zad19;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("IntelCore i5", 16, "AMD PowerColor", "Apple", "MacBook");
        Computer computer1 = new com.sda.zad19.Laptop("IntelCore i7", 24, "AMD PowerColor", "Asus", "ZenBook", 10);
        Computer computer2 = new com.sda.zad19.Laptop("IntelCore i7", 24, "AMD PowerColor", "Asus", "ZenBook", 11);

        System.out.println(computer);
        System.out.println(computer1);
        System.out.println(computer2.toString());
        System.out.println();
        System.out.println(computer.equals(computer1));

        System.out.println(computer1.equals(computer2));
    }
}
