/* Schrijf een programma om deze string arrays te wisselen van waarden.
   String[] firstArray = {"Intec", "is", "the", "best!"};
   String[] secondArray = {"C#", "is", "the", "worst!"};
   Extra: Zorg voor een validatie dat de arrays gelijk zijn van lengte. */

package be.intecbrussel.Oefeningen.Oefening3;

public class Oefening2 {
    public static void main(String[] args) {
        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst"};

        String[] tempArray = firstArray.clone();     // Made a temporary array that clones the elements of first array.

        firstArray = secondArray.clone();            // First array clones tha elements of second array.
        secondArray = tempArray.clone();             // Second array clones the elements of tempArray.

        System.out.print("First array after being swapped: ");

        for (String s : firstArray) {                // Swapped first array is printed
            System.out.print(s);
        }

        System.out.println(" ");

        System.out.print("Second array after being swapped: ");

        for (String s : secondArray) {               // Swapped second array is printed.
            System.out.print(s);
        }
    }
}
