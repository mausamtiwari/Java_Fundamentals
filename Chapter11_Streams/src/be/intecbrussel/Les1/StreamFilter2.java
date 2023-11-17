package be.intecbrussel.Les1;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter2 {
    public static void main(String[] args) {
        List<String> myPlaces = new ArrayList<>();
        myPlaces.add( "Nepal, Kathmandu");
        myPlaces.add( "Nepal, Pokhara");
        myPlaces.add( "India, Delhi");
        myPlaces.add( "USA, New York");
        myPlaces.add( "Zimbabwe, Harare ");

        System.out.println("Places from Nepal: ");

        // Filter places from Nepal
        myPlaces.stream()
                .filter((p)->p.startsWith("Nepal"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
