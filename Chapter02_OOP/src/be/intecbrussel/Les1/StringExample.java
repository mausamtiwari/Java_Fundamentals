package be.intecbrussel.Les1;

import java.nio.charset.StandardCharsets;

public class StringExample {
    public static void main(String[] args){
        String name = "  Mausam Tiwari  ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.isBlank());
        /*System.out.println(name.replace('a','o'));
        //System.out.println(name.getBytes(StandardCharsets.UTF_8));
        //System.out.println(name.hashCode());*/
        System.out.println(name.strip()); //Space before and after the string is erased.
        System.out.println(name.stripLeading());//Space before the string is erased.
        System.out.println(name.stripTrailing());//Space after the string is erased.
        System.out.println(name.indexOf("m")); // returns the index of given character in a string.
        System.out.println(name.contains("iWari"));
        System.out.println(name.substring(1,9)); //takes the portion of the string ranging from the given index.

    }
}
