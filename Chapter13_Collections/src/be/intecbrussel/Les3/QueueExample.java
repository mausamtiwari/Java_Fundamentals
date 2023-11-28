package be.intecbrussel.Les3;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Een Queue maken en elementen toevoegen.
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        // Het element aan de voorkant van de Queue opvragen zonder het te verwijderen.
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Het element aan de voorkant van de Queue opvragen en verwijderen.
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated Queue: " + queue);

        // Controleren of de Queue leeg is.
        boolean isEmpty = queue.isEmpty();
        System.out.println("is Queue empty? " + isEmpty);

        // De grotte van de Queue aanvragen.
        int size = queue.size();
        System.out.println("Size of Queue: " + size);

    }
}
