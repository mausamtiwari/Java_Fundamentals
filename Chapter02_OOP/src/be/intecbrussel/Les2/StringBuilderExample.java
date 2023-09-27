package be.intecbrussel.Les2;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(); // declaratie
        StringBuilder newStr = new StringBuilder();// declaratie

        str.append("Hello World!"); // initialisatie
        newStr.append("walter, mike.");// initialisatie
        System.out.println(str);
        System.out.println(newStr);

        newStr.insert(6,", edwin"); // inserts "edwin to newStr.
        System.out.println(newStr);

        String txt = str.toString(); // Returns the String representation of StringBuilder object.
        System.out.println(txt);

        System.out.println(str.reverse());// Reverses the characters in StringBuilder object called str.
    }
}

