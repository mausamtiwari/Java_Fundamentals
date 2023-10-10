/* Creëer op 2 manieren een array met datatype van double en char. Druk 1 element van beide array's af in de commando
   lijn. */

package be.intecbrussel.Oefening1;

import java.util.Arrays;

public class Oefening1 {
    public static void main(String[] args) {
        char[] array1 = new char[5];                          // Array declared of char data type of length 5.
        array1[0] = 'b';                                      // Initializing array by using index.
        array1[1] = 'c';                                      // Assigned 'c' in the first index.
        array1[2] = 'd';
        array1[3] = 'f';
        array1[4] = 'g';
        double[] array2 = {12.1, 13, 14.4, 15, 16.3, 18};     // Initialized an array of double data type of length 6.

        System.out.println(Arrays.toString(array1));          // Prints array1
        System.out.println(Arrays.toString(array2));          // Prints array2

        System.out.println("\n" + array1[3]);                 // Prints the element in the third index of arrar1.
        System.out.println(array2[5]);                        // Prints the element in the fifth index of array2.
    }
}
