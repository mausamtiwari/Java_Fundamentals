// Zet deze waardes om naar de vergelijkbare wrapper klas.

package be.intecbrussel.Les5.Oefening8;

public class Oefening1 {
    public static void main(String[] args) {
        int numberInInt = 25;
        double numberInDouble = 2.99;
        char notANumber = 'j';

        Integer numberInInteger = numberInInt; // Autoboxing
        String stringINT = numberInInteger.toString();// converting wrapper object to string
        System.out.println(stringINT.length());
        System.out.println(numberInInteger);

        Double numInDOUBLE = numberInDouble; // Autoboxing
        String stringDOUBLE = numInDOUBLE.toString();// converting wrapper object to string
        System.out.println(stringDOUBLE.length());
        System.out.println(numInDOUBLE);

        Character isCharacter = notANumber; // Autoboxing
        String stringCHAR = isCharacter.toString();// converting wrapper object to string
        System.out.println(stringCHAR.length());
        System.out.println(isCharacter);

    }
}
