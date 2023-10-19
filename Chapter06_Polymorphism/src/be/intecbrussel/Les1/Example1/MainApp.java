package be.intecbrussel.Les1.Example1;

public class MainApp {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        Animal myCat = new Cat();
        //Cat myCat2 = new Cat();
        myCat.animalSound();
        //myCat2.animalSound();

        Animal myDuck= new Duck();
        myDuck.animalSound();
    }
}
