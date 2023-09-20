package be.intecbrussel.Les4.Oefening3;

import java.util.Scanner;

public class EvenOdda {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("...Welcome to EvenOdda...Please enter the number: ");
        String input = myNum.nextLine(); // user inputs any string. But only integers can be odd or even .

        try { // to check if the input is a number.
            int x = Integer.parseInt(input); // parsing input to Integer.
            {
                if (x % 2 == 0) { // checking if the input is even
                    System.out.println("Even...Thank you for using our application");
                } else {
                    System.out.println("Odd...Thank you for using our application");
                }
            }

        } catch (NumberFormatException e) { // it runs when it is not possible to convert a string to an integer.
            System.out.println(" Error!! Please enter a valid number...Thank you for using our application.");
        }
    }


        /*if (isNumeric(input)) {
            int number = Integer.parseInt(input);

            // checks if the number is odd or even
            if (number % 2 == 0) {
                System.out.println("Even...Thank you for using our application");
            } else {
                System.out.println("Odd...Thank you for using our application");
            }
        } else {
            System.out.println(" Error!! You have not entered any number..Thank you for using our application.");
        }
    }

    // this function checks is the string is a valid number.
    private static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }*/

}
