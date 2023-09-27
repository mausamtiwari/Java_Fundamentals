// ForExample3: Maak een programma dat alle machten van 11 afdrukt die kleiner zijn dan 10000.

package be.intecbrussel.Opdracht1;

public class ForExample3 {
    public static void main(String[] args) {
        int machten11; // initialized the power of 11 as 1. (11^0=1)
        int base = 11;// The base is 11.

        for (machten11 = 1; machten11 < 10000; machten11 *= base) { // calculates the power of 11 and ends the loop if it is greater than 10000
            System.out.println(machten11);
        }
    }
}
