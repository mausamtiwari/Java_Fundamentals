/* Maak een applicatie die vraagt naar je naam, adres en telefoonnummer en zorg ervoor dat het netjes onder elkaar
   uitprint */

package be.intecbrussel.Oefeningen.Oefening1;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter you name, address and Telephone number: ");
        String UserName = myObj.nextLine();
        String Address = myObj.nextLine();
        int TelephoneNumber = myObj.nextInt();

        System.out.println(" Your name is : " + UserName);
        System.out.println(" Your address is : " + Address);
        System.out.println(" Your Telephone number is : " + TelephoneNumber);

    }
}
