package com.sda.j2.examples.zad33;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ImageSearcher {

    public List<File> getImages(Path inputDirectory) {
        /*dir.toFile().isDirectory();
        File[] files = dir.toFile().listFiles((dir1, name) -> {
            String toLowerCase = name.toLowerCase();
            return toLowerCase.endsWith(".png")
                    || toLowerCase.endsWith(".jpg");
        });
        for (File file : files) {
            if(file.isDirectory()) {
                //reccurence call?
            } else {
                file.getName()
            }
        }*/

        return null;

    }

    public List<File> getImagesWithWalk(Path inputDirectory) {
        //Files.walk()
        return null;
    }

    public List<File> getImagesWithWalkTree(Path inputDirectory) {
        //Files.walkFileTree()
        return null;
    }
}
