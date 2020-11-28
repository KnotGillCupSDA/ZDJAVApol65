package com.sda.j2.examples.zad32;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person1 = new Person();
        person1.setMyAge(40);
        person1.setName("Tomek");
        person1.setHeight(190);

        Person person2 = new Person();
        person2.setMyAge(42);
        person2.setName("Adam");
        person2.setHeight(175);

        List<Person> people = List.of(person1, person2);

        try(FileOutputStream fileOutputStream = new FileOutputStream("people.obj")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(people);
            objectOutputStream.flush();
        }

        try(FileInputStream fileInputStream = new FileInputStream("people.obj")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Person> deserialized = (List<Person>) objectInputStream.readObject();

            System.out.println(deserialized);
        }

    }
}
