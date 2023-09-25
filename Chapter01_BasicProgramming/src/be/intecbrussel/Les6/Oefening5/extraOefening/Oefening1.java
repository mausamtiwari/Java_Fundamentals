package be.intecbrussel.Les6.Oefening5.extraOefening;

import java.math.BigInteger;
import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer: ");

        if (myNum.hasNextInt()) {

            int number = myNum.nextInt();

            if (number < 0) {
                System.out.println("The factorial of negative integer is invalid. ");
            } else { // if the number entered is 0 or 1. The program returns the value 1.
                BigInteger factorial = BigInteger.valueOf(1); // long or short data types can't hold very large data. Hence, BigInteger Class in Java comes in very handy
                if (number > 1) {
                    for (int i = 1; i <= number; i++)
                        factorial = factorial.multiply(BigInteger.valueOf(i));//Using multiply method of bigInteger class to handle large values.
                }
                System.out.println("The factorial of " + number + " is " + factorial);
            }
        }else{
            System.out.println("Please enter a valid input.");
            myNum.next(); // clears the invalid input

        }
    }
}