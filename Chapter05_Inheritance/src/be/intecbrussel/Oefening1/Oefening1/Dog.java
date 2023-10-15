package be.intecbrussel.Oefening1.Oefening1;


public class Dog extends Animal {
    public Dog(String name, int age, String food, String sound) {             // All args super constructor.
        super(name, age, food, sound);
    }

    public Dog(String name, int age, String food) {
        super(name, age, food);
    }

    @Override
    public void makeSound() {                                                   // Method overriding.
        System.out.println(getName() + " vouws.");
    }

    public void wagsTail() {
        System.out.println(getName() + " wags its tail.");
    }


}
