package be.intecbrussel.Oefening1.Oefening1;

public class Elephant extends Animal {
    public Elephant(String name, int age, String food, String sound) {    // All args constructor.
        this.name = name;
        this.age = age;
        this.food = food;
        this.sound = sound;
    }

    public Elephant(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;

    }

    @Override
    public void makeSound() {                                            // Method overriding. Sound Argument from super class
        System.out.println(getName() + " trumpets loudly.");
    }

    public void spraysWater() {
        System.out.println(getName() + " sprays water with its trunk.");
    }
}
