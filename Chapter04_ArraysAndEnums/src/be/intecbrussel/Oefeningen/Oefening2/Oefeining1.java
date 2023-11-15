/* Schrijf een programma dat van de volgende array alle elementen optelt.
   int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   De uitkomst moet 55 zijn. */

package be.intecbrussel.Oefeningen.Oefening2;

public class Oefeining1 {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < my_array.length; i++) {
            sum = sum + my_array[i];
        }

        System.out.println("The sum is: " + sum);


    }
}
