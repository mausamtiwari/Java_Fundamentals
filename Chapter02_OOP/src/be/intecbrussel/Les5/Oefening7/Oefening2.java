/* Schrijf een programma om de tijd en datum te formatteren naar :
   ma, 22 aug. 2022 14:54:24 */

package be.intecbrussel.Les5.Oefening7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oefening2 {
    public static void main(String[] args) {
        LocalDateTime beforeformat = LocalDateTime.of(2022, 8, 22, 14, 54, 24);
        DateTimeFormatter formating = DateTimeFormatter.ofPattern("E, dd MMM. yyyy HH:mm:ss");
        String afterFormat = beforeformat.format(formating);

        System.out.println("After Formating: " + afterFormat);

    }
}
