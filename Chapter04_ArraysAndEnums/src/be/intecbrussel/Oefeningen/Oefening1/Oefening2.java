// Creëer een String array met 5 elementen. Druk 1 element af in de commando lijn. Druk de lengte van je array af.

package be.intecbrussel.Oefeningen.Oefening1;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {

        String[] strArray = {"a", "e", "i", "o", "u"};                      // Initialized an array of String data type.

        System.out.println( Arrays.toString(strArray));                     // Prints the array.
        int arrlength = strArray.length;                                    // Gets the length of strArray.

        System.out.println("\nThe length of the array is: " + arrlength);

    }
}
