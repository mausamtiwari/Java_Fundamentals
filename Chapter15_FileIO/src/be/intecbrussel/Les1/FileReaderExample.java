package be.intecbrussel.Les1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            // Dit object wordt gebruikt om het tekstbestaand te leze.
            fileReader = new FileReader("/Users/asuratya/Downloads/Java Resources/Test1.txt");

            // Er wordt een position-variablee gedefineerd om de gelezen posities in het bestand bij te houden.
            int position;

            // De voorwaarde (position = fileReader.read())!=-1 controleert of er nog karakters zijn om te lezen.
            // Zolang er karakters zijn, wordt de lus herhaald.
            while ((position = fileReader.read()) != -1) {
                System.out.print((char) position);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("Deze bestand bestaat niet");
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
