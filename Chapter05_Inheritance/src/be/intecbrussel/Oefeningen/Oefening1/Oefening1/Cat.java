package be.intecbrussel.Oefeningen.Oefening1.Oefening1;

public class Cat extends Animal {
    public Cat(String name, int age, String food, String sound) {      // Super constructor
        super(name, age, food, sound);
    }

    public void chaseMouse() {
        System.out.println(getName() + " is chasing a mouse.");
    }
}
