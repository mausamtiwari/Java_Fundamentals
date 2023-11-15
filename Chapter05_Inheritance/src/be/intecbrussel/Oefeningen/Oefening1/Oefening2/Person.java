/* Maak een super-klas Person en maak verschillende personen aan bv Student. Laat bij deze klassen zien hoe constructor
  chaining werkt. */

package be.intecbrussel.Oefeningen.Oefening1.Oefening2;

public class Person {
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void introduction() {
        System.out.println("Hello! My name is " + name + " And I am " + age + " years old.");
    }
}
