package be.intecbrussel.Les2;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        String sourceFile = "/Users/asuratya/Downloads/Java Resources/Test1.txt";
        String destinationFile = "/Users/asuratya/Downloads/Java Resources/NewTest.txt";

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Files copied successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
