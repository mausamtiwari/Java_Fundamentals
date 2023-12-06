package be.intecbrussel.Les2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/asuratya/Downloads/Java Resources");
        File aDirectory = path.toFile();

        if (aDirectory.listFiles() != null) {
            File[] files = aDirectory.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }
}
