// WhileExample2: Maak een programma dat alle veelvouden van 3 afdrukt die kleiner zijn dan 50.

package be.intecbrussel.Opdracht1;

public class WhileExample2 {
    public static void main(String[] args) {
        int num = 0;
        while (num < 50) { //prints numbers smaller than 50
            if (num % 3 == 0) { // checks the multiples of 3
                System.out.println(num);// prints result
            }
            num++; // increments

        }
    }
}
