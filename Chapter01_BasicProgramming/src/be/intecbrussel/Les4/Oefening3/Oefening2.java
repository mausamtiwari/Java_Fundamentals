package be.intecbrussel.Les4.Oefening3;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        if (myNum.hasNextInt()) {
            int input = myNum.nextInt();
            if (input > 0) {
                System.out.println("The input is positive.");
            } else if (input < 0) {
                System.out.println("The input is negative.");
            } else {
                System.out.println("The input is zero.");
            }
        } else {
            System.out.println("Please enter a valid number");
        }
    }
}
