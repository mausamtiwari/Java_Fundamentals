// Gebruik de Relational operators op de variabelen hieronder . Bekijk alle mogelijkheden om deze te gebruiken.

package be.intecbrussel.Oefeningen.Oefening2;
public class Oefening4 {
    public static void main(String[] args){
        short shortNum = 101;
        float floatNum = 10.99F;

        System.out.println("floatNum = " + (floatNum += shortNum));
        System.out.println("shortNum = " + (shortNum += floatNum));
        System.out.println("floatNum = " + (floatNum -= shortNum));
        System.out.println("shortNUm = " + (shortNum *= floatNum));
        System.out.println("floatNum = " + (floatNum /= shortNum));
        System.out.println("shortNum = " + (shortNum %= floatNum));
        System.out.println("booVar = " + (shortNum < floatNum));
        System.out.println("booVar = " + (floatNum == shortNum));

    }
}
