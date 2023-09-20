package be.intecbrussel.Les4.Oefening3;

import java.util.Scanner;

public class EvenOdda {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        System.out.println("...Welcome to EvenOdda...Please enter the number: ");
        String input = myNum.nextLine(); // user inputs any string. But only integers can be odd or even .

        try { // try block to check if any exception occurs
            int x = Integer.parseInt(input); // parsing input to Integer.
            {
                if (x % 2 == 0) { // checking if the input is even
                    System.out.println("Even...Thank you for using our application");
                } else {
                    System.out.println("Odd...Thank you for using our application");
                }
            }

        }catch(NumberFormatException e) {
            System.out.println(" Error!! You have not entered any number..Thank you for using our application.");

        }




    }

}
