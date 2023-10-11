/* Schrijf een programma om deze array te kopiëren en te vergroten naar 10 elementen.
   int[] myIntArray = {1, 2, 3, 4, 5};  */

package be.intecbrussel.Oefening4;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5};

        System.out.println("The original array is: ");
        for (int i : myIntArray) {                                     // Prints the original array.
            System.out.print(i + " ");
        }

        int[] newArray = Arrays.copyOf(myIntArray, 10);      // Copies myIntArray to newarray of length 10.

        newArray[5] = 6;                                                // Adding elements in new array.
        newArray[7] = 7;
        newArray[8] = 9;
        newArray[9] = 10;

        System.out.println("\nThe modified array is: ");
        for (int i : newArray) {                                        // Prints the modified array.
            System.out.print(i + " ");
        }


    }
}
