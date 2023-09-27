// Maak een applicatie die 6 willekeurige getallen afdrukt tussen de 0 en 45. Net als een Lotto.

package be.intecbrussel.Les3.Oefening5;

import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        System.out.println("The six random integers generated between 0 and 45 are: ");
        Random random = new Random();

        for (int i = 1; i <= 6; i++) {
            int rand = random.nextInt(46);
            System.out.println(rand);
        }
    }
}
