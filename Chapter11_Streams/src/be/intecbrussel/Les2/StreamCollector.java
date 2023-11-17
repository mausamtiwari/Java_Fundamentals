package be.intecbrussel.Les2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamCollector {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("italy");

        System.out.println(list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList()));
    }

}
