package com.sda.j2.examples.zad30;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {

        Path rootDir = Paths.get("src", "main", "resources");
        Path inputFile = rootDir.resolve("someTextFile.txt");

        String s = readTextFileOldWay(inputFile);
        System.out.println(s);

        System.out.println();

        s = readTextFileWithNio(inputFile);
        System.out.println(s);

        Path outputFile = rootDir.resolve("eliFtxeTemos.txt");
        writeToFileOldWay(s, outputFile);

        writeToFileWithNio(s, rootDir.resolve("eliFtxeTemosNIO.txt"));
    }

    private static String readTextFileWithNio(Path inputFile) throws IOException {
        return Files.readString(inputFile, StandardCharsets.UTF_8);
    }

    private static void writeToFileWithNio(String content, Path outputFile) throws IOException {
        Files.writeString(outputFile, content, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
    }



    private static String readTextFileOldWay(Path myFile) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader in = new BufferedReader(new FileReader(myFile.toFile()))) {

            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }

            return stringBuilder.toString();
        }
    }

    private static void writeToFileOldWay(String content, Path myFile) throws IOException {
        try(BufferedWriter out = new BufferedWriter(new FileWriter(myFile.toFile()))) {
            out.write(content);
        }
    }
}
