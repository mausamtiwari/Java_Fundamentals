package be.intecbrussel.Opdracht1;

public class WhileExample3 {
    public static void main(String[] args) {
        int machten5 = 1; // initialized the power of 5 as 1. 5^0=1
        int base = 5; // The base is 5
        while (machten5 < 10000) { //checks if the number is greater than 10000
            System.out.println(machten5); // Prints the first power of 5 which we initialised at first.
            machten5 *= base; //multiply by 5 with each iteration
        }

    }
}
