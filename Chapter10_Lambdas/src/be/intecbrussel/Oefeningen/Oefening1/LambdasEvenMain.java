/* Maak een lambda expressie die een reeks getallen zal overlopen en enkel de even getallen afdrukt.
   • Zorg dat de lambda expressie een tweede parameter kan ontvangen van het datatype string.
   • Zorg dat je nu enkel de even of oneven getallen zal afdrukken gebaseerd op de waarde van de string
 */

package be.intecbrussel.Oefeningen.Oefening1;

public class LambdasEvenMain {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 9, 10, 11, 12, 34, 55};
        LambdasEven resultEven = (int[] numArrays, String str) -> {
            System.out.println("Even numbers: ");

            for (int number : numbers) {
                if ((number % 2 == 0)) {
                    System.out.println(number);
                }
            }
        };
        LambdasEven resultOdd = (int[] numArrays, String str) -> {
            System.out.println("Odd numbers: ");

            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            }
        };

        resultEven.even(numbers, "even");
        resultOdd.even(numbers, "odd");
    }
}

