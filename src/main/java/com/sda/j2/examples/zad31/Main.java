package com.sda.j2.examples.zad31;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> counter;


        Path path = ...;
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (String line : lines) {
            String normalizedLine = line.replaceAll("[^\\p{L}\\s]", "");

            String[] words = normalizedLine.split(" ");

            for (String word : words) {
                //process word
            }
        }

        //we should have counter map filled

        System.out.println(counter);

        //write to file

    }
}
