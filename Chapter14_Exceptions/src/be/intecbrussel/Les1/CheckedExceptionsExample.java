package be.intecbrussel.Les1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsExample {
    // Meerdere exceptions kunnen worden gegooid met throws

    public static void main(String[] args) {
        String a = "/Users/asuratya/Downloads/Java Resources.pdf";
        try {
            FileInputStream fis = new FileInputStream(a);
        } catch (FileNotFoundException exception) {
            System.out.println("Deze file bestaat");
        }


    }
}
