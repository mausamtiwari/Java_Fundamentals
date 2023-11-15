/* Schrijf een applicatie die vraagt dat je 5 nummers invoert . Print deze nummers uit met het gemiddelde van deze
   nummers*/

package be.intecbrussel.Oefeningen.Oefening1;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Enter first number : " );
        int val1 = myObj.nextInt( );
        System.out.println(" Enter second number : " );
        int val2 = myObj.nextInt( );
        System.out.println(" Enter third number : " );
        int val3 = myObj.nextInt( );
        System.out.println(" Enter fourth number : " );
        int val4 = myObj.nextInt( );
        System.out.println(" Enter fifth number : " );
        int val5 = myObj.nextInt( );

        int avg = ((val1 + val2 + val3 + val4 + val5 )/5);
        System.out.println("Average of five number is: " + avg);
    }
}
