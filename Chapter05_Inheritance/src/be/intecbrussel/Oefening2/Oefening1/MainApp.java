/* Schijf een programma waar je de methodes toString (), equals() en hashCode () implementeert en toont hoe runtime
   Polymorphism werkt */

package be.intecbrussel.Oefening2.Oefening1;


public class MainApp {
    public static void main(String[] args) {


        Person person = new Person("Harry", 55);                          // Initialize a person class
        Student student = new Student("Mausam", 28, "2akc357", "Software Engineering");
        Parent parent = new Parent("Tirtha", 57, "Mausam", "Johan");
        Teacher teacher = new Teacher("Johan", 44, "a320018", "Java", "Mausam", "Tirtha");


    }
}
