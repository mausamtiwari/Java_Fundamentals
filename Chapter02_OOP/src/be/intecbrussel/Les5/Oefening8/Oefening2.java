//Maak een primitieve float variabele aan en converteer deze naar een String. Tot slot print de lengte van deze string af.

package be.intecbrussel.Les5.Oefening8;

public class Oefening2 {
    public static void main(String[] args) {
        float num = 2.5f;
        Float numfloat = num;
        String numString = numfloat.toString();
        //String numString = numfloat.toString();

        System.out.println("The length of the string is: " + numString.length());
    }
}
