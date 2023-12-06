package be.intecbrussel.Les1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample2 {
    public static void main(String[] args) {
        String[] names = {"John", "Leen", "Emy"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/asuratya/Downloads/Java Resources/Test3.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is our file.");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
