/* Maak een 3D array van 5 5 5 elementen en print de waarde van deze elementen uit. */

package be.intecbrussel.Oefening5;

public class Oefening1 {
    public static void main(String[] args) {
        int[][][] myArray = {{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}}};    // initialize 3d array with 5 elemets each

        System.out.println("The 3d array of 5 elements is: ");

        for (int i = 0; i < myArray.length; i++) {                                          // This loop iterates over first dimension (i)
            for (int j = 0; j < myArray[i].length; j++) {                                   // This loop iterates over second dimension (j)
                for (int k = 0; k < myArray[i][j].length; k++) {                            // This loop iterates over third dimension (k)
                    System.out.print(myArray[i][j][k] + " ");                               // Prints the elements.
                }

                System.out.println();                                                       // Inserts a newline to separate rows
            }

            System.out.println();

        }
    }
}
