package be.intecbrussel.Les2;

public class InsertExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("walter, mike");
        str.insert(6,", edwin");
        System.out.println(str);

        StringBuilder strToString = new StringBuilder("hello world!");
        String txt = strToString.toString();
        System.out.println(txt);

        System.out.println(strToString.reverse());
    }
}
