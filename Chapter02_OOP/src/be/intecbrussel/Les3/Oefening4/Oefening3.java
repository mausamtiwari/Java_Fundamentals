/* Maak een applicatie die een random getal genereert tussen 0 en 60 met de math class, rond deze naar boven af en
   controleer of dit getal even of oneven is. Voor deze oefening heb je een operator nodig uit hoofdstuk basis
   programmeren operators. */

package be.intecbrussel.Les3.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {
        double result = Math.random() * 61; //generates pseudorandom numbers from 0.0 to 60.0
        System.out.println(result);
        double result2 = Math.ceil(result); // Gives the biggest integer value near to the given double
        System.out.println(result2);

        if (result2 % 2 == 0) {
            System.out.println("The generated number is even");
        } else {
            System.out.println("The generated number is odd");
        }

    }
}
