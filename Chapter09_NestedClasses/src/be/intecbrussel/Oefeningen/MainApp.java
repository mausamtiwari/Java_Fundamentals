/* Maak een class die twee propertiesvan het type int heeft, zorg ervoor dat je deze kan aanpassen met een set methode.
   Maak een InnerClassgenaamd MathFunctions. Voorzie de volgende methodes in de InnerClass:
   ● public int sum() -> tel beide getallen van de OuterClassop
   ● public int min() -> retourneer het kleinste getal van de OuterClass
   ● public int max() -> retourneer het grootste getal van de OuterClass

   En dan, maak een interface aan MathFunctionsmet de methodes:
   ● double product(); -> retourneer het product van beide getallen uit de OuterClass
   ● double division(); -> retourneer de deling van beide getallen uit de OuterClass
*/

package be.intecbrussel.Oefeningen;

public class MainApp {
    public static void main(String[] args) {
        MathClass mathClass = new MathClass(50, 0);

        MathClass.MathFunctions mathFunctions = mathClass.new MathFunctions();
        System.out.println("Sum: " + mathFunctions.sum());
        System.out.println("product: " + mathFunctions.product());
        System.out.println("Division: " + mathFunctions.division());
        System.out.println("Min: " + mathFunctions.min());
        System.out.println("max: " + mathFunctions.max());


    }


}
