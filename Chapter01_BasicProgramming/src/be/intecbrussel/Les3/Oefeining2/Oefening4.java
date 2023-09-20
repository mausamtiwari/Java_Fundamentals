package be.intecbrussel.Les3.Oefeining2;

public class Oefening4 {
    public static void main(String[] args){
        short shortNum = 101;
        float floatNum = 10.99F;
        boolean booVar = true;

        System.out.println("floatNum = " + (floatNum += shortNum));
        System.out.println("shortNum = " + (shortNum += floatNum));
        System.out.println("floatNum = " + (floatNum -= shortNum));
        System.out.println("shortNUm = " + (shortNum *= floatNum));
        System.out.println("floatNum = " + (floatNum /= shortNum));
        System.out.println("shortNum = " + (shortNum %= floatNum));
        System.out.println("booVar = " + (shortNum < shortNum));
        System.out.println("booVar = " + (floatNum >= shortNum));

    }
}
