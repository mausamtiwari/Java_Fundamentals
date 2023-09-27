package be.intecbrussel.Les4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        // Hier kunnen wij de dagen instellen.
        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays.getDays());

        // 2 datums creeren om de volgende bewerking te doen.
        LocalDate oldDate = LocalDate.of(1985, Month.NOVEMBER, 23);
        LocalDate newDate = LocalDate.of(2022, Month.AUGUST,22);

        // Check period between dates
        Period period = Period.between(oldDate,newDate);

        System.out.println(period.getYears()+ "years,");
        System.out.println(period.getMonths()+ "months,");
        System.out.println(period.getDays()+ "days");
    }
}
