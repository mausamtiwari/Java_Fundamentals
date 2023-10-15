package be.intecbrussel.Oefening1.Oefening1;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike", 5, "dog food");             // Dog object creatd with name, age and food as arguments. It gets sound argument from super class.
        Cat cat = new Cat("Tom", 2, "mouse", " meows");
        Bird bird = new Bird("Tweety", 4, "grains");           // Bird object creatd with name, age and food as arguments. It gets sound argument from super class.
        Elephant elephant = new Elephant("Zunesha", 1000, "plants"); // Elephant object creatd with name, age and food as arguments. It gets sound argument from super class.

        dog.animalInfo();
        dog.eats();
        dog.makeSound();
        dog.wagsTail();
        dog.performsTrick(" shakes hands.");
        System.out.println();

        cat.animalInfo();
        cat.eats();
        cat.makeSound();
        cat.chaseMouse();
        cat.performsTrick(" spins");
        System.out.println();

        bird.animalInfo();
        bird.eats();
        bird.makeSound();
        bird.layEggs();
        bird.buildsNest();
        bird.performsTrick(" sings");
        System.out.println();

        elephant.animalInfo();
        elephant.eats();
        elephant.makeSound();
        elephant.spraysWater();
        elephant.performsTrick(" plays football.");
    }


}
