package be.intecbrussel.Oefeningen.Oefening1;

public class Oefening3 {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder newStr = new StringBuilder(); //java class to create a mutable string.
        int strLen = str.length(); // gets the length of the string.
        for (int i = 0; i < strLen; i++) { // runs a loop from index 0 to the final index of the given string
            if (i % 2 != 0) { // it checks for the odd or even indexes
                newStr.append(Character.toLowerCase(str.charAt(i))); //If odd indexes, it changes the letters to lower case and appends it to the newly initialized StringBuilder in the respective index.
            } else { // if even indexes, changes the letters to upper case and appends to the StringBuilder.
                newStr.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(newStr); //prints the earlier appended characters in newStr StringBuilder.
    }
}
