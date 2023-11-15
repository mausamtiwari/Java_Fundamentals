/* Cast de volgende variabelen naar een double:
   int number01 = 253;
   long number02 = 2365L; */

package be.intecbrussel.Oefeningen.Oefening5;

public class Oefening1 {
    public static void main(String[] args) {

        int number01 = 253;
        long number02 = 2365L;

        double castedNum1 = number01; // wide casting automatically castes smaller data types to bigger data type.
        double castedNum2 = number02;

        System.out.println(castedNum1);
        System.out.println(castedNum2);
    }
}
