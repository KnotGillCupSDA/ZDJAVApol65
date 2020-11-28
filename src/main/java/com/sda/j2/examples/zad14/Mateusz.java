package com.sda.j2.examples.zad14;

import java.util.*;

public class Mateusz {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100_000];
        for (int i = 0; i < 10; i++) {
            Integer randomInt = random.nextInt(50);
            array[i] = randomInt;
        }
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer randomInt = random.nextInt(50);
            randomList.add(randomInt);
        }
        //list checker
        randomList.forEach(System.out::println);
        System.out.println(getDistinctList(array));


    }

    private static Collection<Integer> getDistinctList(int[] ints) {

        //return Arrays.stream(ints).distinct().boxed().collect(Collectors.toList());

        Set<Integer> distinct = new HashSet<>();
        for (int anInt : ints) {
            distinct.add(anInt);
        }

        return distinct;
    }


}
