package be.intecbrussel.Les5.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Een Map maken en elementen toevoegen.
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Een element opzoeken en de waarde afdrukken.
        int ageOfAlice = map.get("Alice");
        System.out.println("Leeftijd van Alice: " + ageOfAlice);

        // Controleren of een sleutel aanwezig is in de Map.
        boolean containsBob = map.containsKey("Bob");
        System.out.println("Bevat Bob? " + containsBob);

        // De grotte van de Map opvragen.
        int size = map.size();
        System.out.println("Grotte van de Map: " + size);

        // Alle sleutels van de Map afdrukken.
        for (String key : map.keySet()) {
            System.out.println("Sleutel: " + key);
        }

        // Alle waarden van de Map afdrukken.
        for (int value : map.values()) {
            System.out.println("Waarde: " + value);
        }

        // De Map leegmaken.
        map.clear();
        boolean isEmpty = map.isEmpty();
        System.out.println("Is de Map leeg? " + isEmpty);


    }
}
