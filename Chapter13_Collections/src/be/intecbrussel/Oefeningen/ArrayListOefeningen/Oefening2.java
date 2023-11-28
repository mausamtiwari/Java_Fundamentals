/* Maak een Arraylist van 10 random numbers. Gebruik hiervoor de random class.
   Druk daarna de lijst af System.out.println(numbers);de getallen moeten van
   groot naar klein worden afgedrukt.
 */


package be.intecbrussel.Oefeningen.ArrayListOefeningen;

import java.util.*;

public class Oefening2 {
    public static void main(String[] args) {
        // ArrayList created
        ArrayList<Integer> randomArraylist = new ArrayList<>();
        Random randNum = new Random();

        // Added random numers in the ArrayList.
        for (int i = 0; i <= 10; i++) {
            randomArraylist.add(randNum.nextInt(100));
        }

        // Prints arrayList with random numbers.
        System.out.println("ArrayList with random numbers.");
        System.out.println(randomArraylist);
        System.out.println();

        // Sorts ArrayList in reverse order.
        System.out.println("ArrayList with random numbers in reverse order.");
        randomArraylist.sort(Comparator.reverseOrder());
        System.out.println(randomArraylist);
    }
}
