package be.intecbrussel.Les3;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args){
        /*int number = 110;
        if( number < 100){
            System.out.println("The value of number is smaller than 100.");
        }else{
            System.out.println("The value of number is bigger than 100. ");
        }*/
         Scanner myTime = new Scanner(System.in);
         System.out.println("Please enter the time: ");
         int time = myTime.nextInt();

        //int time = 22;

        if( time > 23 || time < 0){
            System.out.println("Please enter the correct time.");
        }else if( time < 10 ){
            System.out.println("Good morning.");
        }else if( time < 20){
            System.out.println("Good Day.");
        } else{
            System.out.println("Good evening.");
        }
    }
}
