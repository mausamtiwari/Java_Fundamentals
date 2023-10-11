/* Schrijf een programma om de dubbele stadsnamen eruit te filteren en uit te printen.
   String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"}; */

package be.intecbrussel.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {
        String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};

        System.out.print("The duplicate city names are: ");

        for (int index = 0; index < myArray.length; index++) {     // Creates a boolean variable dubbleStaden for each element.
            boolean dubbleStaden = false;

            for (int i = 0; i < index; i++) {                      // Creates another loop which iterates from index 0 to index "index" of outer loop.
                if (myArray[index].equals(myArray[i])) {           // Inner loop compares the current element at index "index" with elements at index "i" to check the duplicates.
                    dubbleStaden = true;                           // If the two city names are equal dubbleStaden is set to true.
                    break;
                }
            }

            if (dubbleStaden) {                                   // If true, prints the city names at index "index".

                System.out.print(myArray[index] + " ");
            }
        }


    }
}
