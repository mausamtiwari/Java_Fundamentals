// ForExample6: Maak ForExample5 oefening gebruik van de ? : operator in plaats van het if else statement.

package be.intecbrussel.Opdracht1;

public class ForExample6 {
    public static void main(String[] args) {

        for (int i = -10; i <= 10; i++) {
            System.out.println((i > 0) ? "+" + i : +i);// adds '+' sign before positive numbers

        }
    }

}
