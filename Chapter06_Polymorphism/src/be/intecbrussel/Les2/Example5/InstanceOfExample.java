package be.intecbrussel.Les2.Example5;

public class InstanceOfExample {
    public static void main(String[] args) {
        // Checking if the name is an instance of String
        String name = "Intec Brussel";
        System.out.println("Is name a instance of String: " +(name instanceof String));

        // impornant: Obkject is the superclass of all classes in Java.
        System.out.println("Is name a instance of object class: " + (name instanceof Object));



    }


}
