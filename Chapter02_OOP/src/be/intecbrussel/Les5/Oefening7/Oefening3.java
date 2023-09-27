//Schrijf een programma om je leeftijd te berekenen in dagen maanden en jaren

package be.intecbrussel.Les5.Oefening7;

import java.time.LocalDate;
import java.time.Period;


public class Oefening3 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1995, 9, 1);
        LocalDate dateToday = LocalDate.now();

        Period period = Period.between(birthDate, dateToday);
        long years = period.getYears();
        long months = period.getMonths();
        long days = period.getDays();

        System.out.println("Your age is: " + years + " years, " + months + " months and  " + days + " days.");

    }
}
