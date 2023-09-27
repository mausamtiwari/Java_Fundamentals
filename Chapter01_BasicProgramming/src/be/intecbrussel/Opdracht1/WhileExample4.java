// WhileExample4: Maak een programma dat de letters ‘A’ tot en met ‘Z’ op het scherm afdrukt.

package be.intecbrussel.Opdracht1;
public class WhileExample4 {
    public static void main(String[] args) {
        char letters = 'A';
        while (letters <= 'Z') {
            System.out.println(letters++);
        }
    }
}
