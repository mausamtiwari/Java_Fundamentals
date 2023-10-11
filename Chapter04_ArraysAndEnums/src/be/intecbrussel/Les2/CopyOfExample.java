package be.intecbrussel.Les2;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        // initializing an array original
        int[] originalArray = {1, 2, 3};

        System.out.println("Original Array");

        for (int index = 0; index < originalArray.length; index++) {
            System.out.print(originalArray[index]);
        }
        // Copying array OriginalArray to newArray

        int[] newArrray = Arrays.copyOf(originalArray, 5);

        // Changing some elements of newArray
        newArrray[3] = 11;
        newArrray[4] = 55;

        System.out.println("\nnewArray after modifications: ");

        for (int index = 0; index < newArrray.length; index++) {
            System.out.print(newArrray[index] + " ");
        }
    }
}
