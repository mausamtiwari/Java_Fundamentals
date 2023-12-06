package be.intecbrussel.Les1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/asuratya/Downloads/Java Resources/Test2.txt"));
            /*System.out.println(reader.readLine());
            System.out.println(reader.readLine());*/
            int position;
            while ((position = reader.read()) != -1) {
                System.out.print((char) position);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
