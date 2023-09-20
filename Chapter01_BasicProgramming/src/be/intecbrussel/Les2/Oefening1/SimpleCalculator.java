package be.intecbrussel.Les2.Oefening1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("1st number = ");
        int val1 = myObj.nextInt();
        System.out.println("2nd number = ");
        int val2 = myObj.nextInt();


        System.out.println(val1+" + " +val2+ " = " +(val1 + val2));
        System.out.println(val1+ " - " +val2+ " = " +(val1 - val2));
        System.out.println(val1+ " * " +val2+ " = " +(val1 * val2));
        System.out.println(val1+ " / " +val2+ " = " +(val1 / val2));
        System.out.println(val1+ " mod " +val2+ " = " +(val1 % val2));

        /*System.out.println("Addition of two numbers is: " +(val1 + val2));
        System.out.println("Subtraction of of two numbers is: " +(val1 - val2));
        System.out.println("Multiplication of two numbers is: " +(val1 * val2));
        System.out.println("Division  of two numbers is: " +(val1 / val2));
        System.out.println("Modulus  of two numbers is: " +(val1 % val2));*/


    }
}
