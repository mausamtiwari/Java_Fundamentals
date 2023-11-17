package be.intecbrussel.Les1;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add(0, "Jai");
        names.add(1, "mahesh");
        names.add(2, "Vishal");

        //ForEach to iterate and display each key and balue pair.
        names.forEach((name) -> System.out.println(name + "-"));
    }
}
