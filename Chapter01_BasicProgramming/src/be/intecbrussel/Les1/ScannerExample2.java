package be.intecbrussel.Les1;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Username, age and salary: ");
        String userName = myScanner.nextLine();
        int Age = myScanner.nextInt();
        double Salary = myScanner.nextDouble();
        System.out.println("Username is : " + userName);
        System.out.println("Age is : " + Age);
        System.out.println("Salary is : " + Salary);

        }

    }
