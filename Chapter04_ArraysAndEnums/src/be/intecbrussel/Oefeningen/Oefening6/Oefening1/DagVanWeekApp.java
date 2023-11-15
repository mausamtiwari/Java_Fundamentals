/* Schrijf een enum class van de dagen van de week en print deze uit met de index erbij. */

package be.intecbrussel.Oefeningen.Oefening6.Oefening1;

public class DagVanWeekApp {
    public static void main(String[] args) {
        DagVanWeek[] dagen = DagVanWeek.values();
        for (int index = 0; index < DagVanWeek.values().length; index++) {
            System.out.println(dagen[index] + " at index " + index);

        }
    }
}
