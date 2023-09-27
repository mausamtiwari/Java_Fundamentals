/* Schrijf een Java programma om de som optellen vermenigvuldigen aftrekken delen en rest van twee getallen af te
   drukken Noem de broncode als SimpleCalculator */

package be.intecbrussel.Les2.Oefening1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("1st number = ");
        int val1 = myObj.nextInt();
        System.out.println("2nd number = ");
        int val2 = myObj.nextInt();

        System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
        System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
        System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
        System.out.println(val1 + " / " + val2 + " = " + (val1 / val2));
        System.out.println(val1 + " mod " + val2 + " = " + (val1 % val2));

    }
}
