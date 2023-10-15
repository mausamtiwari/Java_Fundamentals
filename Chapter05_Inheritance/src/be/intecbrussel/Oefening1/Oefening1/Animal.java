/* Maak een Animal klas en 3 verschillende dier klassen. Laat zien hoe je een properties, methode en constructor
   over erft van klas Animal.*/

package be.intecbrussel.Oefening1.Oefening1;

public class Animal {
    protected String name;                                // Variable declaration.
    protected int age;
    protected String food;
    protected String sound;

    public Animal() {                                   // No args constructor.

    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public Animal(String name, int age, String food, String sound) {        // All args constructor.
        this.name = name;
        this.age = age;
        this.food = food;
        this.sound = sound;
    }

    public Animal(Animal animal) {                                           // Copy Constructor.
        this.name = animal.name;
        this.age = animal.age;
        this.food = animal.food;
        this.sound = animal.sound;
    }

    public String getName() {                                              // Getters.
        return name;
    }

    public void animalInfo() {                                             // Method to display info
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void makeSound() {                                             // Method to display sound
        System.out.println(name + " " + sound);
    }

    public void eats() {                                                  // Method to display food
        System.out.println(name + " eats " + food);
    }

    public void performsTrick(String trick) {                            // Method to display trick.
        System.out.println(name + trick);
    }


}
