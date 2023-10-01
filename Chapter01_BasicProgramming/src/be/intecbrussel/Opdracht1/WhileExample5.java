package be.intecbrussel.Opdracht1;
import java.util.Scanner;

public class WhileExample5 {
    public static void main(String[] args) {
            Scanner myNum = new Scanner(System.in);
            boolean a = true;
            while (a) {
                System.out.print("Please enter a number between 0 and 10: ");
                if (myNum.hasNextInt()) {
                    int num = myNum.nextInt();
                    if (num >= 0 && num <= 10) {
                        System.out.print("The entered number is: " + num);
                        System.out.println("\nDo you want to enter another number? (yes/no): ");
                        myNum.nextLine();
                        String choice = myNum.nextLine();
                        if (choice.equalsIgnoreCase("no")) {
                            a = false;
                        }
                    } else {
                        System.out.println("The number is invalid. ");
                    }
                } else {
                    System.out.println("Please enter a valid number.");
                    a = false;
                }
            }
        }
    }


