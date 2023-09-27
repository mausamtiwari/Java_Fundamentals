// WhileExample1: Maak een programma dat de getallen van 100 tot en met 120 afdrukt in omgekeerde volgorde.

package be.intecbrussel.Opdracht1;

public class WhileExample1 {
    public static void main(String[] args) {
        int num = 120;
        while (num >= 100) { // afdrukt 100 tot en met 120 in omgekeerde volgorde.
            System.out.println(num);
            num--;
        }

    }
}
