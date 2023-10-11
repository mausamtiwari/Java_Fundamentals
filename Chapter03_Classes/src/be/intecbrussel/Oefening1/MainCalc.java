package be.intecbrussel.Oefening1;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanNum = new Scanner(System.in);
        System.out.print("Please enter num1: ");
        int num1 = scanNum.nextInt();
        System.out.print("Please enter num2: ");
        int num2 = scanNum.nextInt();
        System.out.print("Please enter num3: ");
        int num3 = scanNum.nextInt();

        System.out.println("The smallest number is: " + calculator.kleinsteNummer(num1, num2, num3));

        System.out.println(num1 + " -> " + calculator.evenOdd(num1));

        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.subtract(num1, num2));
        System.out.println(calculator.multiply(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        System.out.println(calculator.mod(num1, num2));
    }
}
