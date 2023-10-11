/* Schrijf een programma om 2 arrays van elks minimaal 15 elementen (een double en een string) te sorteren en te
   printen. Niet van laag naar hoog maar andersom van hoog naar laag. */

package be.intecbrussel.Oefening4;

import java.util.Arrays;
import java.util.Collections;

public class Oefening1 {
    public static void main(String[] args) {
        double[] array1 = {12.2, 141, 11, 196, 19, -14.5, 33.8, 66, -100, 25, -1, 103, 334, -11, 21, 25, 67, 87, 90.6};
        String[] array2 = {"game", "pink", "ball", "mango", "dog", "apple", "fish", "queen", "hen", "dog", "love", "cat", "egg", "nose", "jam", "orange", "kite", "ink",};

        System.out.println("Original array1 is: ");
        for (double i : array1) {                                          // Prints original array1
            System.out.print(i + " ");
        }

        System.out.println("\nSorted array1 is: ");
        Arrays.sort(array1);                                              // Sorts array1 in increasing order
        for (int index = array1.length - 1; index >= 0; index--) {        // Prints sorted array2 in decreasing order
            System.out.print(array1[index] + " ");
        }

        System.out.println("\nOriginal array2 is: ");
        System.out.print(Arrays.toString(array2));                        // Prints original array1

        System.out.println("\nSorted array2 is: ");
        Arrays.sort(array2, Collections.reverseOrder());                 // Sorts array2 in decreasing order
        System.out.println(Arrays.toString(array2));                     // Prints sorted array2

    }

}

