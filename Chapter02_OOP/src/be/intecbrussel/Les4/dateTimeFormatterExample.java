package be.intecbrussel.Les4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime1 = now.format(format1);
        System.out.println("After Formatting:" +formatDateTime1);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formatDateTime2 = now.format(format2);
        System.out.println("After Formatting:"  + formatDateTime2);

    }
}
