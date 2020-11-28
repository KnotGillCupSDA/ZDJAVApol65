package com.sda.j2.examples.zad30;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path rootDir = Paths.get("src", "main", "resources");
        String fileName = "someTextFile.txt";
        Path inputFile = rootDir.resolve(fileName);

        //String content  = readTextFileWithNio(inputFile);
        List<String> lines  = readLinesOldWay(inputFile);
        //List<String> lines  = readLinesWithNio(inputFile);

        System.out.println(lines);
        System.out.println();

        String reversed = reverse(lines);

        System.out.println(reversed);
        writeToFileWithNio(reversed, rootDir.resolve(getReversedFileName(fileName)));
    }

    private static List<String> readLinesOldWay(Path inputFile) {
        return null;
    }

    private static List<String> readLinesWithNio(Path inputFile) {
        return null;
    }

    private static String reverse(List<String> lines) {
        return null;
    }

    private static String getReversedFileName(String fileName) {
        return "eliFtxeTemos.txt";
    }

    private static String readTextFileWithNio(Path inputFile) throws IOException {
        return Files.readString(inputFile, StandardCharsets.UTF_8);
    }

    private static void writeToFileWithNio(String content, Path outputFile) throws IOException {
        Files.writeString(outputFile, content, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
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
