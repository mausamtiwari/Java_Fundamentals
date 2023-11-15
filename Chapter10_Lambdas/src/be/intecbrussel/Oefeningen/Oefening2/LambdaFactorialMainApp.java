// Maak een lambda expressie die de factorial van een nummer vindt en afdrukt.

package be.intecbrussel.Oefeningen.Oefening2;

import java.util.Scanner;

public class LambdaFactorialMainApp {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter a non- negative integer: ");

        if (myScan.hasNextInt()) {
            int myNum = myScan.nextInt();

            if (myNum >= 0) {                                 // Only gets factorial of positive integers
                LambdaFactorial lambdaFactorial = n -> {      // Created an object of Interface and wrote methods using lambda expression.
                    if (n == 0 || n == 1) {                   // If the input is 0 or 1 returns the factorial as 1.
                        return 1;
                    }

                    long factorial = 1;                        // Initialised factorial as 1.
                    for (int i = 2; i <= n; i++) {             // Method to find factorial of numbers greater than 2.
                        factorial *= i;
                    }
                    return factorial;                         // Returned the value of factorial
                };

                long fact = lambdaFactorial.factorial(myNum);            // Passed the input taken from user as parameter in factorial method from the interface and assigned it to fact variable.
                System.out.println("The factorial of " + myNum + " is : " + fact);
            } else {
                System.out.println("Enter valid non-negative integer");
            }
        } else {
            System.out.println("Invalid input. Enter a valid integer.");
        }
    }
}
