/* ForExample5: Maak een programma dat alle getallen afdrukt tussen –10 en +10. Voe bij de positieve getallen het
   +teken toe bij het afdrukken van het getal. Het getal 0 heeft geen teken. */

package be.intecbrussel.Opdracht1;

public class ForExample5 {
    public static void main(String[] args) {
        int i;
        for (i = -10; i <= 10; i++) {
            if (i > 0) {
                System.out.println("+ " + i);
            }
             else{
                System.out.println(i);
            }

        }
    }
}