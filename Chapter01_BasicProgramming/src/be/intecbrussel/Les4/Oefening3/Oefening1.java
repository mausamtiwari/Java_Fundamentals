package be.intecbrussel.Les4.Oefening3;

import java.util.Scanner;

public class Oefening1 {
    public static void main (String[] args){
        //int number1 = 7;
        //int number2= 16;

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Please enter the first Number: ");
        int number1 = myNumber.nextInt();

        System.out.println("Please enter the second Number: ");
        int number2 = myNumber.nextInt();


        if(number1 > number2){
            System.out.println("number1 is great.");
        }else{
            System.out.println("number2 is great.");
        }

    }
}
