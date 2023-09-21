package be.intecbrussel.Les6;

import java.util.Scanner;

public class ternaryExample {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please enter the first number: ");

        int num1 = myNum.nextInt();
        String message = num1 > 10 ? "Number is greater than 10" : "Number is smaller than 10";
        System.out.println(message);

    }
}
