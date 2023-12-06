package be.intecbrussel.Les2;

import java.util.Scanner;

public class NumberFormatExceptionsExample2 {
    public static void main(String[] args) {
        String sLeeftijd;
        int iLeeftijd;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef je leeftijd in : ");
        sLeeftijd = scanner.nextLine();

        // Controle of Leeftijd een geheel getal bevat of niet
        try {
            iLeeftijd = Integer.parseInt(sLeeftijd);
            System.out.println("Jouw leeftijd is : " + iLeeftijd);

        } catch (NumberFormatException e) {
            // De numerieke waarde (numberFormat) klopt niet
            System.out.println("Err: Leftijd bevat geen numerieke waarde");
        }
    }
}
