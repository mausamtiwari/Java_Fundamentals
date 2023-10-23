/* • Een abstracte klas heeft een constructor die als print statement heeft: " This is constructor of abstract class".
   • Deze klas heeft ook een abstracte methode met de naam aMethod en een non abstracte methode die als print statement
     heeft: "This is a normal method of abstract class"
   • Dan heb je een sub klas SubClass die erft van de abstracte klas
   • Dezeklas heeft de methode aMethod dat als print statement heeft: "This is abstract method".
   • Daarna creeer je een object van sub klas en roep de methodes op. */

package be.intecburssel.Oefening2;

public class MainApp {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();      // Object of subclass created.
        subClass.aMethod();                      // Abstract method called.
        subClass.cmethod();                      // Normal method from abstract class called.
    }
}
