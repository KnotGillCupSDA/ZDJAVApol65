package com.sda.j2.examples.zad30;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Dawid {
    public static void main(String[] args) throws IOException {
        Path rootDir = Paths.get("src", "main", "resources");
        String fileName = "someTextFile.txt";

        /*Files.lines(rootDir.resolve(fileName), StandardCharsets.UTF_8)
                .forEach(Dawid::reverseTextByDawid);*/

        reverseTextByDawid("ż");

    }
    private static void reverseTextByDawid(String content) {
        //byte[] - nieodczytuje polskich znaków
        byte[] strAsBite = content.getBytes(StandardCharsets.UTF_8);
        byte[] result = new byte[strAsBite.length];
        for (int i = 0; i < strAsBite.length; i++) {
            result[i] = strAsBite[strAsBite.length - 1 - i];
        }
        System.out.println(new String(result, StandardCharsets.UTF_8));
        //StringBuilder - działa nawet z polskimi znakami


  /*      System.out.println("============");

        StringBuilder sb = new StringBuilder();
        sb.append(content);
        sb.reverse();
        System.out.println(sb);*/
    }
}
