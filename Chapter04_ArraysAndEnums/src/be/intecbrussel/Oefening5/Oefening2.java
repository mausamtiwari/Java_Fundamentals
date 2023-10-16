/* Gebruik de 2D array en print deze uit in combinatie met de toString() van de class Array.
   int[ ][ ] numbers = {{1, 2, 3}, {4, 5, 6}}; */

package be.intecbrussel.Oefening5;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(numbers));       // Prints string representation of 2d array.

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
