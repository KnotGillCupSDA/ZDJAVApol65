package com.sda.j2.examples.zad31;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> counter = new HashMap<>();
        Path path = Paths.get("src", "main", "resources", "zad31");
        String fileName = "veryLongFile.txt";

        List<String> lines = Files.readAllLines(path.resolve(fileName), StandardCharsets.UTF_8);

        for (String line : lines) {
            String normalizedLine = line.replaceAll("[^\\p{L}\\s]", "");

            String[] words = normalizedLine.split(" ");

            for (String word : words) {
                //process word
                Integer integer = counter.get(word);
                if(integer != null) {
                    counter.put(word, integer +1);
                } else {
                    counter.put(word, 1);
                }
            }
        }

        //we should have counter map filled

        System.out.println(counter);

        //write to file
        //Files.writeString(path.resolve("counter.txt"), counter.toString());


        Files.writeString(path.resolve("counter.csv"), getInCsvFormat(counter));


    }

    private static String getInCsvFormat(Map<String, Integer> counter) {
        return counter.entrySet().stream()
                .map(e -> e.getKey()+","+e.getValue())
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
