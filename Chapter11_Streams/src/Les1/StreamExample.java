package Les1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.of("Jai", "Mahesh","Naren", "Hemant")
                .limit(3)
                .sorted()
                .forEach(System.out::println);

        /*List <String> names = Arrays.asList("Jai", "Mahesh","Naren", "Hemant");
        names.stream().map(String::toUpperCase).forEach(System.out::println);*/
    }


}
