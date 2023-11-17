package be.intecbrussel.Les1;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList maken
        ArrayList<String> list = new ArrayList<>();

        // Object toevoegen aan arrayList
        list.add("Nina");
        list.add("Janan");
        list.add("Maxim");
        list.add("Haytam");
        list.add("Abdessamad");
        list.add("Raphael");

        // List doorlopen via Iterator

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
