/* Schrijf een generieke klasse genaamd Pair, die twee waarden van hetzelfde type kan bevatten.
   De klasse Pair moet de volgende functionaliteit bieden:
   Een constructor die twee waarden accepteert en deze toewijst aan de interne variabelen.
   Getter-methoden om de waarden van het paar op te halen.
   Een toString-methode om een representatie van het paar als een string terug te geven.

   Schrijf een klasse genaamd MainApp en print alles uit met de hulp van deze klas.*/

package be.intecbrussel.Oefeningen;

public class MainApp {
    public static void main(String[] args) throws ArithmeticException {
        Pair<Double, Double> pairs = new Pair<>(2.0, 3.0);

        System.out.println("Two values are:" + pairs);
        System.out.println();

        System.out.println("Sum of two values is: " + (pairs.getValue1() + pairs.getValue2()));
        System.out.println("Multipication of two values is: " + (pairs.getValue1() * pairs.getValue2()));
        System.out.println("Subtraction of two pairs is: " + (pairs.getValue1() - pairs.getValue2()));
        try {
            System.out.println("Division of two values is: " + (pairs.getValue1() / pairs.getValue2()));

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Modulus of two values is: " + (pairs.getValue1() % pairs.getValue2()));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
