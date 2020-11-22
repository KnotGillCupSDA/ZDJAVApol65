package com.sda.j2.examples.zad30;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String s = readTextFileOldWay("someTextFile.txt");
        System.out.println(s);

        writeToFile(s, "eliFtxeTemos.txt");
    }

    private static void writeToFile(String context, String fileName) throws IOException {
        Path rootDir = Paths.get("src", "main", "resources");
        Path myFile = rootDir.resolve(fileName);
        try(BufferedWriter out = new BufferedWriter(new FileWriter(myFile.toFile()))) {
            out.write(context);
        }
    }

    private static String readTextFileOldWay(String fileName) throws IOException {

        Path rootDir = Paths.get("src", "main", "resources");
        Path myFile = rootDir.resolve(fileName);

        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader in = new BufferedReader(new FileReader(myFile.toFile()))) {

            String line;
            while ((line = in.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }

            return stringBuilder.toString();
        }
    }
}
