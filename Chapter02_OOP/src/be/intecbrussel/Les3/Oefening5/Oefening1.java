// Maak een applicatie die 5 verschillende willekeurige integers opvraagt en deze afdrukt op het scherm.

package be.intecbrussel.Les3.Oefening5;

import java.util.Random;

public class Oefening1 {
    public static void main(String[] args) {

        System.out.println("The five random integers generated are: ");
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int rand = random.nextInt();
            System.out.println(rand);
        }
    }
}
