package be.intecbrussel.Les2;

import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args){

        Scanner myObj = new Scanner( System.in);
        System.out.println(" Please enter two values : ");
        int a = myObj.nextInt();
        int b = myObj.nextInt();

        /*int a = 10;
        int b = 20;*/

        int sum = a+b;
        int sub =  a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Sum of A and B = " + sum);
        System.out.println("Subtraction of A and B = " + sub);
        System.out.println("Multiplication of A and B = " + mul);
        System.out.println("Division of A and B = " + div);
        System.out.println("Modulus of A and B = " + mod);

        // verhoogt met 1
        int inc  = ++b;
        System.out.println("Incrementing B: " +inc);

        //verlaagd met 1 terug naar de startwaarde
        int dec = --b;
        System.out.println("Decrementing B: " +dec);
    }
}
