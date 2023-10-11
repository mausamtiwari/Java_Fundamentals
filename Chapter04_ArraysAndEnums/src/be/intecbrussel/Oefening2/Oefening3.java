/* Schrijf een programma om het gemiddelde van deze array elementen te berekenen.
   int[] numbers = {20, 30, 25, 35, -16, 60, -100};
   Uitkomst moet zijn: 7.0 */

package be.intecbrussel.Oefening2;

import static java.lang.Math.floor;

public class Oefening3 {

    static int[] numbers = {20, 30, 25, 35, -16, 60, -100};

    public static void main(String[] args) {

        System.out.println("The average is: " + average());

    }

    public static double average() {                              //  Method to calculate the average.
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return floor(sum / numbers.length);
    }

}
