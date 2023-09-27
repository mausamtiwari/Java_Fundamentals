// ForExample4: Maak een programma dat de letters ‘z’ tot en met ‘a’ op het scherm afdrukt.

package be.intecbrussel.Opdracht1;
public class ForExample4 {
    public static void main(String[] args) {
        char letter;
        for (letter = 'z'; letter >= 'a'; letter--) { //prints z to a
            System.out.println(letter);
        }
    }
}
