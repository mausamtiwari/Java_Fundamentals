/* Maak een 3D array van 5 5 5 elementen en print de waarde van deze elementen uit. */

package be.intecbrussel.Oefeningen.Oefening5;

import java.util.Arrays;

public class Oefening1 {
    public static void main(String[] args) {
        int[][][] myArray = {{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}}, {{26, 27, 28, 32, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}, {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}}, {{51, 52, 53, 54, 55}, {56, 57, 58, 59, 60}, {61, 62, 63, 64, 65}, {66, 67, 68, 69, 70}, {71, 72, 73, 74, 75}}, {{76, 77, 78, 79, 80}, {81, 82, 83, 84, 85}, {86, 87, 88, 89, 90}, {91, 92, 93, 94, 95}, {96, 97, 98, 99, 100}}, {{101, 102, 103, 104, 105}, {106, 107, 108, 109, 110}, {111, 112, 113, 114, 115}, {116, 117, 118, 119, 120}, {121, 122, 123, 124, 125}}};    // initialize 3d array with 5 elemets each
        //int[][][] myArray = new int[5][5][5];                       // Initialize a 3d array of 5 elements each.

        /*for (int i = 0; i < 5; i++) {                               // Assign elements to the array.
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    myArray[i][j][k] = i;
                }
            }
        }*/

        System.out.println("The 3d array of 5 elements is: ");
        System.out.println(Arrays.deepToString(myArray));               // Prints string representation of the 3d arrray.

        System.out.println();


        for (int i = 0; i < myArray.length; i++) {                       // This loop iterates over first dimension (i)
            for (int j = 0; j < myArray[i].length; j++) {                // This loop iterates over second dimension (j)
                for (int k = 0; k < myArray[i][j].length; k++) {         // This loop iterates over third dimension (k)
                    System.out.print(myArray[i][j][k] + " ");            // Prints the elements.
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
