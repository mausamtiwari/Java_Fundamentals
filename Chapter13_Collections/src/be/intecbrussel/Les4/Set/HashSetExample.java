package be.intecbrussel.Les4.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Een HashSet maken en elementen toevoegen.
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");   // Duplicate element word gegeneered
        set.add(null);
        set.add(null);      // Duplicate element word gegeneered

        System.out.println("HashSet: " + set);

        // Controleren of een element in de HashSet zit.
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple ? " + containsApple);

        // Een element uit de HashSet verwijderen.
        boolean removed = set.remove("Orange");
        System.out.println("Removed orange? "+ removed);

        // De gotte van de HashSet opvragen.
        int size = set.size();
        System.out.println("Size of HAshSet: " +size);

        // De HashSet leegmaken.
        set.clear();
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}
