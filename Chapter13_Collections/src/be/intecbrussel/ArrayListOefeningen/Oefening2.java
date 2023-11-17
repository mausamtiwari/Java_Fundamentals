/* Maak een Arraylist van 10 random numbers. Gebruik hiervoor de random class.
   Druk daarna de lijst af System.out.println(numbers);de getallen moeten van
   groot naar klein worden afgedrukt.
 */


package be.intecbrussel.ArrayListOefeningen;

import java.util.*;

public class Oefening2 {
    public static void main(String[] args) {
        ArrayList<Integer> randomArraylist = new ArrayList<>();
        Random randNum = new Random();

        for (int i = 0; i <= 10; i++) {
            randomArraylist.add(randNum.nextInt(100));
        }

        randomArraylist.sort(Comparator.reverseOrder());
        System.out.println(randomArraylist);
    }
}
