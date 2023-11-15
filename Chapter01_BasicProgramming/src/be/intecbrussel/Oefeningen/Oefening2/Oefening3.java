/* Gebruik de Relational operators op de variabelen hieronder. Bekijk alle mogelijkheden om deze te
   gebruiken*/

package be.intecbrussel.Oefeningen.Oefening2;
public class Oefening3 {
    public static void main( String[] args){
        byte aNum = 10;
        int bNum = 5;
        long cNum = 5;

        System.out.println("aNum is equal to bNum: " + (aNum == bNum));
        System.out.println("bNum is smaller than aNum: " + (bNum < aNum));
        System.out.println("aNum is greater than cNum: " + (aNum > cNum));
        System.out.println("cNum is greater than or equal to aNum: " + (cNum >= aNum));
        System.out.println("bNum is smaller than or equal to cNum: " + (bNum <= cNum));
        System.out.println("cNum is not equal to bNum: " + (cNum != bNum ));

    }
}
