package be.intecbrussel.Les1;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String userName = myScanner.nextLine();
        System.out.println("Username is : " + userName);

    }
}
