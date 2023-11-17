package be.intecbrussel.Les1;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jai");
        names.add("Vivek");
        names.add("Mahesh");
        names.add("Vishal");
        names.add("Naren");
        names.add("Hemant");
        names.add("Vikas");
        names.add("Ajay");

        /*int counter =0;
        for (String str: names){
            if(str.length()<5)
                counter++;
        }
        System.out.println(counter + " Strings with length less than 6"); */

        // Using Stream and lambda expression
        long count = names.stream().filter(str-> str.length()<6).count();
        System.out.println(count + " strings with lenght less than 5");

    }
}
