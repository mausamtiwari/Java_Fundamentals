package be.intecbrussel.Les4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate justTheDate = LocalDate.now();
        LocalTime justTheTime = LocalTime.now();
        LocalDateTime dateAndtimeNow = LocalDateTime.now();

        System.out.println(justTheDate);
        System.out.println(justTheTime);
        System.out.println(dateAndtimeNow);
    }
}
