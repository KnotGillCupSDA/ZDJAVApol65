package com.sda.j2.examples.zad33;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        ImageSearcher imageSearcher = new ImageSearcher();
        System.out.println(imageSearcher.getImages(Paths.get("src", "main", "resources", "zad33")));

    }
}
