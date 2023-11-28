/* Maak een nieuwe list met de naam "list", datatype Integer en schrijf deze methoden printList, printSum,
   printAverage. En roep alle methoden op in de main methode.*/

package be.intecbrussel.Oefeningen.LinkedListOefeningen;

import java.util.LinkedList;

public class Oefening3 {

    // Global LinkedList of type Integer created.
    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        // Elements added to the LinkedList.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Methods called.
        printlist();
        System.out.println("The sum is: " + printSum());
        printAverage();
    }

    // Prints the LinkedList.
    public static void printlist() {
        list.forEach(s -> System.out.print(" " + s + " "));
        System.out.println();
    }

    // Prints the sum of elements of the LinkedList.
    public static double printSum() {
        return list.stream()
                .reduce(0, (Integer::sum));
        //.mapToInt(Integer::intValue)
        //.sum();
    }

    // Prints the average of elemenmts of the LinkedList.
    public static void printAverage() {
        double average = printSum() / list.size();
        System.out.println("The average is: " + average);
    }
}
