package be.intecbrussel.Oefening1.Oefening1;

public class Bird extends Animal {
    public Bird(String name, int age, String food, String sound) {     // All args super constructor. Gets arguments from super class
        super(name, age, food, sound);
    }

    public Bird(String name, int age, String food) {
        super(name, age, food);
    }

    @Override
    public void makeSound() {                                    // Method overriding
        System.out.println(getName() + " tweets");
    }

    public void layEggs() {
        System.out.println(getName() + " is laying eggs.");
    }

    public void buildsNest() {
        System.out.println(getName() + " is building a nest.");
    }
}
